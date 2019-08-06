package com.hns.learn.debtmain;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.toolkit.IdWorker;
import com.hns.learn.App;
import com.hns.learn.entity.*;
import com.hns.learn.mapper.*;
import com.hns.learn.util.ExcelUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
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
public class DebtMainTest {

    @Autowired
    private BizDebtMainMapper bizDebtMainMapper;
    @Autowired
    private BizDebtGrantMapper bizDebtGrantMapper;
    @Autowired
    private BizApprSummaryInfoMapper bizApprSummaryInfoMapper;

    @Autowired
    private BizTRNMapper bizTRNMapper;
    @Autowired
    private BizCommonMapper bizCommonMapper;
    @Autowired
    private BizCustTeMapper bizCustTeMapper;
    @Autowired
    private BizCustMapper bizCustMapper;
    @Autowired
    private PlatformTransactionManager txManager;


    //order 1.1  调整方案
    @Test
    public void updateMain() {
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        def.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);
        TransactionStatus status = txManager.getTransaction(def);
        try {
            List<BizDebtSummary> bizDebtSummaryList = bizDebtMainMapper.selectList(new EntityWrapper<BizDebtSummary>().isNull("VERNUM_"));

            System.out.println(bizDebtSummaryList.size());
            for(BizDebtSummary bizDebtSummary : bizDebtSummaryList){

                if(bizDebtSummary.getDebtCode().length()==16){
                    String debtcode = bizDebtSummary.getDebtCode();
                    bizDebtSummary.setDebtCode(StringUtils.substring(debtcode,0,13));
                    bizDebtSummary.setVerNum(Integer.parseInt(StringUtils.substring(debtcode,13)));
                    int umain = bizDebtMainMapper.updateById(bizDebtSummary);
                    if(umain!=1){
                        throw new RuntimeException("update err! table= bizDebtMain,bizDebtMain="+bizDebtSummary.toString());
                    }
//                    System.out.println(JSON.toJSON(bizDebtSummary));
                }
            }

            txManager.commit(status);
        } catch (Exception e) {
            txManager.rollback(status);
            e.printStackTrace();
        }
    }

    //order 1.2  新增方案trn
    @Test
    public void createMainTrnTest() {
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        def.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);
        TransactionStatus status = txManager.getTransaction(def);

        try {
            List<BizDebtSummary> bizDebtSummaryList = bizDebtMainMapper.selectList(new EntityWrapper<BizDebtSummary>());

            List<BizTRN> trnList = new ArrayList<>();

            for(BizDebtSummary bizDebtSummary : bizDebtSummaryList){

                //            System.out.println(bizDebtSummary.toString());
                Date date = new Date();
                BizTRN bizTRN = new BizTRN();
                bizTRN.setId(IdWorker.getId());
                bizTRN.setObjtyp("BIZ_DEBT_MAIN");
                bizTRN.setRelflg("Y");
                bizTRN.setRelres("Y");
                bizTRN.setInifrm("DEBOPN");
                bizTRN.setIninam("方案补录");
                bizTRN.setObjinr(bizDebtSummary.getId());
                bizTRN.setOwnref(StringUtils.substring(bizDebtSummary.getDebtCode(),0,13));
                if(bizDebtSummary.getVerNum()!=null){
                    bizTRN.setVerNum(bizDebtSummary.getVerNum());
                }else{
                    if(bizDebtSummary.getDebtCode().length()==16){
                        bizTRN.setVerNum(Integer.parseInt(StringUtils.substring(bizDebtSummary.getDebtCode(),13)));
                    }else {
                        throw new RuntimeException("vernum err");
                    }
                }
                bizTRN.setIniusr(bizDebtSummary.getCreateBy());
                bizTRN.setBchkeyinr(bizDebtSummary.getInstitutionCode());
                bizTRN.setObjnam(bizDebtSummary.getProjectName());
                bizTRN.setReloricur(bizDebtSummary.getMpc());
                bizTRN.setReloriamt(bizDebtSummary.getSolutionAmount());
                bizTRN.setInidattim(date);
                bizTRN.setCreateTime(date);
                bizTRN.setUpdateTime(date);
                bizTRN.setCreateBy(bizDebtSummary.getBankTellerId());
                bizTRN.setUpdateBy(bizDebtSummary.getBankTellerId());
                bizTRN.setEnable(1);
                bizTRN.setBizStatus(6);
                bizTRN.setProcessStatus(2);
                bizTRN.setVerNum(1);
                bizTRN.setRemark("sinosong");

                int itrn = bizTRNMapper.insert(bizTRN);
                if(itrn!=1){
                    throw new RuntimeException("insert err! table= biz_trn,trn="+bizTRN.toString());
                }
                trnList.add(bizTRN);
            }
            System.out.println(JSON.toJSON(trnList));

            txManager.commit(status);

        } catch (Exception e) {
            txManager.rollback(status);
            e.printStackTrace();
        }

    }

    //order 1.3  新增方案流水附表
    @Test
    public void createApprTest() {
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        def.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);
        TransactionStatus status = txManager.getTransaction(def);

        try {
            List<BizDebtSummary> bizDebtSummaryList = bizDebtMainMapper.selectList(new EntityWrapper<BizDebtSummary>().isNull("IMAGE_DATE"));

            //List<BizApprSummaryInfo> bizApprSummaryInfoList = bizApprSummaryInfoMapper.selectList(new EntityWrapper<BizApprSummaryInfo>());
            List<BizApprSummaryInfo> apprList = new ArrayList<>();

            for(BizDebtSummary bizDebtSummary : bizDebtSummaryList){

                //            System.out.println(bizDebtSummary.toString());
                Date date = new Date();

                List<BizTRN> bizTRNList = bizTRNMapper.selectList(new EntityWrapper<BizTRN>().eq("REMARK_","sinosong").eq("OBJINR",bizDebtSummary.getId()));
                if(bizTRNList.size()!=1){
                    throw new RuntimeException("sel err! table= biz_trn,bizTRNList="+bizTRNList);
                }
                BizTRN bizTRN = bizTRNList.get(0);

                BizApprSummaryInfo bizApprSummaryInfo = new BizApprSummaryInfo();

                bizApprSummaryInfo.setId(IdWorker.getId());
                //项目名称
                bizApprSummaryInfo.setProjectName(bizDebtSummary.getProjectName());
                //申请人名称
                bizApprSummaryInfo.setProposer(bizDebtSummary.getProposer());
                //币种
                bizApprSummaryInfo.setMpc(bizDebtSummary.getMpc());
                //金额
                bizApprSummaryInfo.setSolutionAmount(bizDebtSummary.getSolutionAmount());
                //失效日期
                bizApprSummaryInfo.setPgExpiDate(bizDebtSummary.getPgExpiDate());
                //关联流水
                bizApprSummaryInfo.setTrnInr(bizTRN.getId());
                bizApprSummaryInfo.setDebtCode(bizDebtSummary.getDebtCode());
                bizApprSummaryInfo.setVerNum(bizDebtSummary.getVerNum());

                bizApprSummaryInfo.setaCurrrency(bizDebtSummary.getaCurrrency());
                bizApprSummaryInfo.setApprove(bizDebtSummary.getApprove());
                bizApprSummaryInfo.setBankTellerId(bizDebtSummary.getBankTellerId());
                bizApprSummaryInfo.setBrifBackground(bizDebtSummary.getBrifBackground());
                bizApprSummaryInfo.setBusinessBackgroundBrief(bizDebtSummary.getBusinessBackgroundBrief());
                bizApprSummaryInfo.setDeptName(bizDebtSummary.getDeptName());
                bizApprSummaryInfo.setDescriptionProgramQuoqate(bizDebtSummary.getDescriptionProgramQuoqate());
                bizApprSummaryInfo.setDopo(bizDebtSummary.getDopo());
                bizApprSummaryInfo.setErrNo(bizDebtSummary.getErrNo());
                bizApprSummaryInfo.setGoodsSketch(bizDebtSummary.getGoodsSketch());
                bizApprSummaryInfo.setIdentNumber(bizDebtSummary.getIdentNumber());
                bizApprSummaryInfo.setLs(bizDebtSummary.getLs());
                bizApprSummaryInfo.setLtnopa(bizDebtSummary.getLtnopa());
                bizApprSummaryInfo.setOc(bizDebtSummary.getOc());
                bizApprSummaryInfo.setDeptName(bizDebtSummary.getDeptName());
                bizApprSummaryInfo.setInstitutionCode(bizDebtSummary.getInstitutionCode());
                bizApprSummaryInfo.setPgEffectivDate(bizDebtSummary.getPgEffectivDate());
                bizApprSummaryInfo.setRaaa(bizDebtSummary.getRaaa());
                bizApprSummaryInfo.setSingleBtch(bizDebtSummary.getSingleBtch());
                bizApprSummaryInfo.setCreateTime(bizDebtSummary.getCreateTime());
                bizApprSummaryInfo.setUpdateTime(bizDebtSummary.getUpdateTime());
                bizApprSummaryInfo.setCreateBy(bizDebtSummary.getCreateBy());
                bizApprSummaryInfo.setUpdateBy(bizDebtSummary.getUpdateBy());

                bizApprSummaryInfo.setTransok(bizDebtSummary.getTransok());
                bizApprSummaryInfo.setPolicy(bizDebtSummary.getPolicy());
                bizApprSummaryInfo.setPolicyDescription(bizDebtSummary.getPolicyDescription());
                bizApprSummaryInfo.setPackageRate(bizDebtSummary.getPackageRate());
                bizApprSummaryInfo.setRateRangeMix(bizDebtSummary.getRateRangeMix());
                bizApprSummaryInfo.setRateRangeMax(bizDebtSummary.getRateRangeMax());
                bizApprSummaryInfo.setDescriptionRateRules(bizDebtSummary.getDescriptionRateRules());
                bizApprSummaryInfo.setCreateTime(date);
                bizApprSummaryInfo.setUpdateTime(date);
                bizApprSummaryInfo.setCreateBy(bizDebtSummary.getBankTellerId());
                bizApprSummaryInfo.setUpdateBy(bizDebtSummary.getBankTellerId());
                bizApprSummaryInfo.setEnable(1);
                bizApprSummaryInfo.setRemark("sinosong");

                int iappr = bizApprSummaryInfoMapper.insert(bizApprSummaryInfo);


                //            System.out.println("-------------------------------");
                //            System.out.println(bizTRN.toString());
                //            System.out.println("-------------------------------");

                if(iappr!=1){
                    throw new RuntimeException("insert err! table= BIZ_APPRSUMMARY_INFO,bizApprSummaryInfo="+bizApprSummaryInfo.toString());
                }
            }

            txManager.commit(status);

        } catch (Exception e) {
            txManager.rollback(status);
            e.printStackTrace();
        }

    }

    //order 2.1  调整发放条件
    @Test
    public void updateGrant() {
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        def.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);
        TransactionStatus status = txManager.getTransaction(def);
        try {
            List<BizDebtGrant> bizDebtGrantList = bizDebtGrantMapper.selectList(new EntityWrapper<BizDebtGrant>().isNull("VERNUM_"));

            System.out.println(bizDebtGrantList.size());
            for(BizDebtGrant bizDebtGrant : bizDebtGrantList){

                if(bizDebtGrant.getGrantCode().length()==19){
                    String debtcode = bizDebtGrant.getDebtCode();
                    String grantcode = bizDebtGrant.getGrantCode();
                    bizDebtGrant.setDebtCode(StringUtils.substring(debtcode,0,13));
                    bizDebtGrant.setGrantCode(StringUtils.substring(grantcode,0,16));
                    bizDebtGrant.setVerNum(Integer.parseInt(StringUtils.substring(grantcode,16)));
                    bizDebtGrant.setChangeNum(0);
                    bizDebtGrant.setSettleStatus(1);
                    int umain = bizDebtGrantMapper.updateById(bizDebtGrant);
                    if(umain!=1){
                        throw new RuntimeException("update err! table= bizDebtGrant,bizDebtGrant="+bizDebtGrant.toString());
                    }
                    System.out.println(JSON.toJSON(bizDebtGrant));
                }
            }

            txManager.commit(status);
        } catch (Exception e) {
            txManager.rollback(status);
            e.printStackTrace();
        }
    }

    //order 2.2  调整发放条件流水以及概要
    @Test
    public void createGrantTrnTest() {
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        def.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);
        TransactionStatus status = txManager.getTransaction(def);

        try {
            List<BizDebtGrant> bizDebtGrantList = bizDebtGrantMapper.selectList(new EntityWrapper<BizDebtGrant>().isNull("IMAGE_DATE"));

            List<BizTRN> trnList = new ArrayList<>();
            List<BizApprSummaryInfo> apprList = new ArrayList<>();

            for(BizDebtGrant bizDebtGrant : bizDebtGrantList){

                Date date = new Date();
                BizTRN bizTRN = new BizTRN();
                long trnId = IdWorker.getId();
                bizTRN.setId(trnId);
                bizTRN.setObjtyp("BIZ_DEBT_GRANT");
                bizTRN.setRelflg("Y");
                bizTRN.setRelres("Y");
                bizTRN.setInifrm("GRAOPN");
                bizTRN.setIninam("条件审批新增");
                bizTRN.setObjinr(bizDebtGrant.getId());
                bizTRN.setOwnref(bizDebtGrant.getGrantCode());
                bizTRN.setVerNum(bizDebtGrant.getVerNum());
                bizTRN.setIniusr(bizDebtGrant.getCreateBy());
                bizTRN.setBchkeyinr(bizDebtGrant.getInstitutionCode());
                bizTRN.setObjnam(bizDebtGrant.getBusinessName()+"进行发放");
                bizTRN.setReloricur(bizDebtGrant.getCurrency());
                bizTRN.setReloriamt(bizDebtGrant.getGrantAmt());
                bizTRN.setInidattim(date);
                bizTRN.setCreateTime(date);
                bizTRN.setUpdateTime(date);
                bizTRN.setCreateBy(bizDebtGrant.getCreateBy());
                bizTRN.setUpdateBy(bizDebtGrant.getUpdateBy());
                bizTRN.setEnable(1);
                bizTRN.setBizStatus(5);
                bizTRN.setProcessStatus(2);
                bizTRN.setVerNum(1);
                bizTRN.setRemark("sinosong");

                List<BizDebtSummary> bizDebtSummaryList = bizDebtMainMapper.selectList(new EntityWrapper<BizDebtSummary>().eq("DEBT_CODE",bizDebtGrant.getDebtCode()));

                if(bizDebtSummaryList.size()!=1){
                    throw new RuntimeException("sel debtMain error!");
                }
                BizDebtSummary bizDebtSummary = bizDebtSummaryList.get(0);

                BizApprSummaryInfo bizApprSummaryInfo = new BizApprSummaryInfo();
                bizApprSummaryInfo.setId(IdWorker.getId());
                //项目名称
                bizApprSummaryInfo.setProjectName(bizDebtSummary.getProjectName());
                //申请人名称
                bizApprSummaryInfo.setProposer(bizDebtSummary.getProposer());
                //方案金额
                bizApprSummaryInfo.setSolutionAmount(bizDebtSummary.getSolutionAmount());
                //失效日期
                bizApprSummaryInfo.setPgExpiDate(bizDebtSummary.getPgExpiDate());
                //关联流水
                bizApprSummaryInfo.setTrnInr(trnId);
                //发放变更号
                bizApprSummaryInfo.setVerNum(bizDebtGrant.getVerNum());
                //发放编号
                bizApprSummaryInfo.setGrantCode(bizDebtGrant.getGrantCode());
                //方案业务期限范围
                bizApprSummaryInfo.setDopo(bizDebtSummary.getDopo());
                //经办人
                bizApprSummaryInfo.setCreateBy(bizDebtGrant.getCreateBy());
                bizApprSummaryInfo.setGrantCurrency(bizDebtGrant.getCurrency());
                bizApprSummaryInfo.setGrantAmt(bizDebtGrant.getGrantAmt());
                bizApprSummaryInfo.setGrantScopeBPeriod(Long.parseLong(bizDebtGrant.getScopeBusinPeriod()));
                bizApprSummaryInfo.setBusinessName(bizDebtGrant.getBusinessName());
                bizApprSummaryInfo.setBankTellerId(bizDebtSummary.getBankTellerId());
                bizApprSummaryInfo.setBusiness_Types(bizDebtGrant.getBusinessTypes());
                bizApprSummaryInfo.setInstitutionCode(bizDebtGrant.getInstitutionCode());
                bizApprSummaryInfo.setDebtCodeVernum(bizDebtSummary.getDebtCode()+bizDebtSummary.getVerNumStr());
                bizApprSummaryInfo.setIdentNumber(bizDebtSummary.getIdentNumber());
                bizApprSummaryInfo.setUpdateTime(date);
                bizApprSummaryInfo.setCreateTime(bizDebtGrant.getCreateTime());
                bizApprSummaryInfo.setRemark("sinosong");

                int itrn = bizTRNMapper.insert(bizTRN);
                if(itrn!=1){
                    throw new RuntimeException("insert err! table= biz_trn,trn="+bizTRN.toString());
                }
                int iappr = bizApprSummaryInfoMapper.insert(bizApprSummaryInfo);
                if(iappr!=1){
                    throw new RuntimeException("insert err! table= iappr,bizApprSummaryInfo="+bizApprSummaryInfo.toString());
                }

                trnList.add(bizTRN);
                apprList.add(bizApprSummaryInfo);
            }
            System.out.println(trnList);
            System.out.println(apprList);

            txManager.commit(status);

        } catch (Exception e) {
            txManager.rollback(status);
            e.printStackTrace();
        }

    }

    @Test
    public void fetchErrorCust() {

        List<LinkedHashMap> customerList = bizCommonMapper.selBizCustomer(new HashMap<>());
        String[] titles = {"CUST_NO","CUST_NAME_CN","CREDIT_RATING"};
        String dateStr = DateFormatUtils.format(new Date(),"yyyyMMdd-HHmmSS-SSS");

        List<String> okList = new ArrayList<>();
        List<String> errList = new ArrayList<>();
        List<Map> errMapList = new ArrayList<>();
        Map<String,Object> keyMap = new HashMap<>();

        for (int i = 0; i < customerList.size(); i++) {

            LinkedHashMap map = customerList.get(i);
//            System.out.println(JSON.toJSON(map).toString());
            String key = (String) map.get("CUST_NO");
            String name = (String) map.get("CUST_NAME_CN");

            if("无".equals(key)||key==null||name==null || null != keyMap.get(key)){
                errList.add(key);
                okList.remove(key);
                errMapList.add(map);
            }else {
                okList.add(key);
            }
            keyMap.putIfAbsent(key, map);
        }

        for (int i = 0; i < errList.size(); i++){
            errMapList.add((Map)keyMap.get(errList.get(i)));
        }

        errMapList.sort(new Comparator<Map>() {
            @Override
            public int compare(Map s1, Map s2) {
                if(null==s1 || null==s2){
                    return -1;
                }
                return ((String)s1.get("CUST_NO")).compareTo((String)s2.get("CUST_NO"));
            }
        });

        System.out.println(JSON.toJSON(errMapList));

        String[][] centerVal = new String[errMapList.size()][titles.length];
        for (int i = 0; i < errMapList.size(); i++) {
            Map map = errMapList.get(i);
            centerVal[i][0] = (String)map.get("CUST_NO");
            centerVal[i][1] = (String)map.get("CUST_NAME_CN");
            centerVal[i][2] = (String)map.get("CREDIT_RATING");

        }

        ExcelUtils.exportExcel(false,titles,centerVal,null,dateStr);

//        System.out.println(JSON.toJSON(customerList));


    }

    @Test
    public void getCustMessage() {

        List<LinkedHashMap> customerList = bizCommonMapper.selBizCustomer(new HashMap<>());
        Set<String> custNoSet = new HashSet<>();
        Set<String> custNoErrSet = new HashSet<>();
        List<BizCustTe> bizCustTeList = new ArrayList<>();
        for (Map<String,Object> map  : customerList){
            String no = (String)map.get("CUST_NO");
            custNoSet.add(no==null?null:no.trim());
        }
        System.out.println(custNoSet);
        for (String custNo : custNoSet) {
            if(StringUtils.isBlank(custNo)){
                throw new RuntimeException("custNo error=="+custNo);
            }
            BizCustTe selTe = bizCustTeMapper.selectOne(new BizCustTe(custNo.trim()));
            if(selTe==null){
                custNoErrSet.add(custNo);
//                continue;
            }else{
//                System.out.println(JSON.toJSON(selTe));
                BizCust cust = JSON.parseObject(JSON.toJSON(selTe).toString(),BizCust.class);
                cust.setId(Long.parseLong(cust.getCustNo()));
                bizCustMapper.insert(cust);
            }

//            System.out.println(cust.toString());
//            System.out.println("---------------");
//            System.out.println(cust.toString());
//            System.exit(0);
//            bizCustTeList.add(bizCustTeMapper.selectOne(new BizCustTe(custNo)));
        }
//        System.out.println(JSON.toJSON(bizCustTeList));

        System.out.println("error set ---------->");
        StringBuffer bf = new StringBuffer("(");
        for(String str:custNoErrSet){
            bf.append("'"+str+"',");
        }
        String str = bf.substring(0,bf.length()-1)+")";
        System.out.println(str);

    }
}
