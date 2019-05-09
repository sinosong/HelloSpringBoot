package com.hns.learn;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.toolkit.IdWorker;
import com.hns.learn.entity.BizDebtGrant;
import com.hns.learn.entity.BizMakeLoans;
import com.hns.learn.entity.InfAfrcdtl;
import com.hns.learn.entity.InfAfrlndtl;
import com.hns.learn.mapper.BizDebtGrantMapper;
import com.hns.learn.mapper.BizMakeLoansMapper;
import com.hns.learn.mapper.InfAfrcdtlMapper;
import com.hns.learn.mapper.InfAfrlndtlMapper;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class testRep {

    @Autowired
    private PlatformTransactionManager txManager;
    @Autowired
    private BizDebtGrantMapper bizDebtGrantMapper;
    @Autowired
    private BizMakeLoansMapper bizMakeLoansMapper;
    @Autowired
    private InfAfrlndtlMapper infAfrlndtlMapper;
    @Autowired
    private InfAfrcdtlMapper infAfrcdtlMapper;

    @Test
    public void fetchComprehensive() {

        int eRows = 0;
        List<String> errMeidList = new ArrayList<>();

        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        def.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);
        TransactionStatus status = txManager.getTransaction(def);
        try {
            String lastCurrDateStr = "2019-05-06";
            Date lastCurrDate = null;
            Date currDateS = null;
            Date currDateE = null;
            String currDateStr = null;
            try {
                lastCurrDate = DateUtils.parseDate(lastCurrDateStr,"yyyy-MM-dd");
                //自然日加一，若今天不存在跑批，则停滞等待
                currDateS = DateUtils.addDays(lastCurrDate,1);
                currDateE = DateUtils.addDays(lastCurrDate,2);
                currDateE = DateUtils.addSeconds(currDateE,-1);
                currDateStr = DateFormatUtils.format(currDateS,"yyyy-MM-dd");
            } catch (ParseException e) {
                e.printStackTrace();
            }

            //查询放款记录 还款账号发生额不为零
            Wrapper<InfAfrlndtl> wrapper = new EntityWrapper<>();
            wrapper.eq("ENABLE_","1").gt("PAYACTA",0).between("WORKDATE",currDateS,currDateE);
            List<InfAfrlndtl> afrlndtlList = infAfrlndtlMapper.selectList(wrapper);
            int rows = 0;
            for(InfAfrlndtl ln : afrlndtlList){

                //根据ln获取对应核销里的发生额
                //查询还本发生本金额
                Wrapper<InfAfrcdtl> rcdtlWrapper = new EntityWrapper<>();
                rcdtlWrapper.eq("ENABLE_","1").eq("PROTSENO",ln.getProtseno()).eq("WORKDATE",ln.getWorkdate()).eq("SUBSERNO",ln.getSubserno()).eq("LISTNO",ln.getListno());
                List<InfAfrcdtl> rcdtlList = infAfrcdtlMapper.selectPage(new Page<InfAfrcdtl>(1,1),rcdtlWrapper);
                if(rcdtlList.size() != 1){
                    throw new RuntimeException("INTERFACE ERROR:fetch InfAfrcdtl error:table=InfAfrlndtl:PROTSENO="+ln.getProtseno()+"WORKDATE"+ln.getWorkdate()+"LISTNO"+ln.getListno());
                }else{
                    InfAfrcdtl rcdtl = rcdtlList.get(0);
                    String cur = rcdtl.getCurrtype();
                    BigDecimal amt = new BigDecimal(rcdtl.getAmount());
                    //跳过还本金额为0 的记录
                    if(amt.compareTo(BigDecimal.ZERO)==0){
                        continue;
                    }
                    //获取对应的方案和条件
                    String mediumid = rcdtl.getMediumid();
                    Wrapper<BizDebtGrant> grantWrapper = new EntityWrapper<>();
                    grantWrapper.eq("IDENT_NUMBER",mediumid).eq("ENABLE_","1");
                    List<Map> grantMapList =  bizDebtGrantMapper.selEffectGrant(mediumid);

                    if(grantMapList.size()==1){
                        BizDebtGrant grant = new JSONObject(grantMapList.get(0)).toJavaObject(BizDebtGrant.class);
                        Wrapper<BizMakeLoans> loanWrapper = new EntityWrapper<>();
                        loanWrapper.eq("DEBT_CODE",grant.getDebtCode()).eq("GRANT_CODE",grant.getGrantCode()).eq("ENABLE_","1").orderBy("UPDATE_TIME",false);
                        List<BizMakeLoans> loanList =  bizMakeLoansMapper.selectList(loanWrapper);
                        if(loanList.size()==0){
                            throw new RuntimeException("INTERFACE ERROR:fetch BizMakeLoans error:table=BizMakeLoans:grant="+grant.toString());
                        }

                        System.out.println("BizRepaymentRec............................"+new Date());

                    }else{
                        errMeidList.add(mediumid);
                        eRows++;
                        System.err.println("INTERFACE ERROR:fetch BizDebtGrant error:table=BizDebtGrant:grantMapList="+grantMapList+",PROTSENO=" + ln.getProtseno() + " WORKDATE " + ln.getWorkdate() + " LISTNO " + ln.getListno() + " mediumid=" + mediumid);
                        continue;
                    }
                }
                rows++;
            }
            System.out.println("rows=="+rows);
            System.out.println("eRows=="+eRows);
            txManager.rollback(status);
            for(String mediumid : errMeidList){
                System.out.print("'"+mediumid+"',");

            }
        } catch (Exception es) {
            txManager.rollback(status);
            es.printStackTrace();
        }
    }

}
