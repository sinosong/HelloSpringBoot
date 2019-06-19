package com.hns.learn;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.toolkit.IdWorker;
import com.hns.learn.entity.BizInterfaceResult;
import com.hns.learn.entity.SysUser;
import com.hns.learn.mapper.BizInterfaceResultMapper;
import com.hns.learn.mapper.SysUserMapper;
import com.hns.learn.util.OkHttpUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import java.util.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class SysInfTest {

    protected final Logger logger = LogManager.getLogger(this.getClass());

    @Autowired
    private PlatformTransactionManager txManager;
    @Autowired
    private SysUserMapper sysUserMapper;
    @Autowired
    private BizInterfaceResultMapper bizInterfaceResultMapper;

    @Test
    public void run() {
        Map<String, String> reqMap = new HashMap<String, String>(5);
        reqMap.put("deptCode","2120002");
        reqMap.put("account","beijing01");
        reqMap.put("userName","北京经办");
        System.out.println(this.requestGmsPushUser(reqMap));
    }

    public Map<String, String> requestGmsPushUser(Map params) {
        logger.info("===requestIntefacePushUser=====================");

        Map<String, String> resMap = new HashMap<String, String>(5);
        boolean success = false;
        String infMsg = "";
        String results = "";
        Long infRecId = null;
        String deptCode = (String)params.get("deptCode");
        String account = (String)params.get("account");
        String userName = (String)params.get("userName");

        if (StringUtils.isBlank(deptCode) || StringUtils.isBlank(account) || StringUtils.isBlank(userName)) {
            logger.error("INTERFACE ERROR(requestGmsPushUser):params error:deptCode=" + deptCode + " account=" + account + " userName=" + userName);
            infMsg = "用户信息不完整，请完善后重新推送！[机构号:" + deptCode + "]" + " [柜员账号:" + account + "]" + " [柜员姓名:" + userName + "]";
        }
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        //总是要开启一个新事务。如果当前已经有事务，则将已有事务挂起
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
        def.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);
        TransactionStatus status = txManager.getTransaction(def);

        //1.根据参数查询已经添加的用户，并更新接口调用状态字段；
        Wrapper<SysUser> userWrapper = new EntityWrapper<>();
        userWrapper.eq("ACCOUNT_", account).eq("DEPT_CODE", deptCode);
        List<SysUser> userList = sysUserMapper.selectList(userWrapper);
        if (userList.size() != 1) {
            logger.error("INTERFACE ERROR(requestGmsPushUser):fetch SysUser error:table=SYS_USER:require one,userList=" + userList);
            String tmpStr = userList.size() == 0 ? "未从数据库中查询到此柜员信息！" : "此柜员的账户重复！";
            infMsg = "此柜员的账户异常！" + tmpStr + " [机构号:" + deptCode + "]" + " [柜员账号:" + account + "]" + " [柜员姓名:" + userName + "]";
        } else {
            SysUser user = userList.get(0);
            if (user.getGmsState()!=null && user.getGmsState()==1) {
                logger.error("用户的\"担保推送状态\"已更新。无需再次触发接口。");
                infMsg = "用户的\"担保推送状态\"已更新。无需再次触发接口。";
            } else {
                String actionSet = "ywydbhtgx";
                String action = "ywydbhtgx";
                Date reqDate = new Date();
                user.setGmsState(1);
                user.setUpdateTime(reqDate);
                int upres = sysUserMapper.updateById(user);
                if (upres == 1) {
                    infRecId = IdWorker.getId();
                    //2.调用接口,判断接口返回的状态：若成功，提交事务。若失败，事务回滚，下次经由管理员手动调用接口。
                    List<String> paramList = new ArrayList<String>();
                    paramList.add(deptCode);
                    paramList.add(account);
                    paramList.add(userName);
                    //数据来源 贸金为04
                    paramList.add("04");
                    String args = OkHttpUtil.joinInterfaceParams(paramList);

                    //存接口调用记录
                    BizInterfaceResult infRec = new BizInterfaceResult(infRecId, account, null, "interfaceName", reqDate, args);
                    Map returnMap = OkHttpUtil.invokeInfExecute2(actionSet, action, new String[]{"" + args + ""});

                    String code = (String)returnMap.get("code");
                    resMap.put("code", code);
                    if ("500".equals(code)) {
                        infMsg = (String)returnMap.get("msg");
                        infRec.setResponseErrorMsg(infMsg);
                        infRec.setResponseStatus("0");
                    } else {
                        results = (String)returnMap.get("results");
                        infRec.setResponseTime(new Date());
                        infRec.setResponseStatus("1");
                        infRec.setResponseInfo(results);
                    }
                    try {
                        int insRes = this.saveInterfaceResult(infRec);
                        if (insRes != 1) {
                            logger.error("INTERFACE ERROR(requestGmsPushUser):insert BizInterfaceResult error:table=BizInterfaceResult:infRec Res=" + infRec.toString());
                            infMsg = "保存接口日志记录失败！insert rows:"+insRes;
                        } else {
                            if ("200".equals(code)) {
                                success = true;
                            }
                        }
                    } catch (Exception infResE) {
                        logger.error("INTERFACE ERROR(requestGmsPushUser):insert BizInterfaceResult error:table=BizInterfaceResult:infRec Res=" + infRec.toString());
                        infMsg = "保存接口日志记录失败！Error Msg ["+infResE.getMessage()+"]";
                    }
                } else {
                    logger.error("INTERFACE ERROR(requestGmsPushUser):update SysUser error:table=SYS_USER:update one,update Res=" + upres);
                    infMsg = "更新用户推送担保状态失败！";
                }
            }
        }
        if (success) {
            txManager.commit(status);
        } else {
            txManager.rollback(status);
            logger.error("INTERFACE ERROR(requestGmsPushUser):update user error:table=SYS_USER:update one,update interface error message=" + infMsg);
        }
        resMap.put("msg", infMsg);
        resMap.put("results", results);
        resMap.put("objInr", String.valueOf(infRecId));
        return resMap;
    }


    /**
     * 保存接口调用记录；
     *
     * @param infRec
     * @return
     */
    private int saveInterfaceResult(BizInterfaceResult infRec) throws Exception{
        return bizInterfaceResultMapper.insert(infRec);
    }

}
