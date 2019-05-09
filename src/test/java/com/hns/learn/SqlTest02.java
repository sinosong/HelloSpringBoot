package com.hns.learn;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.hns.learn.entity.*;
import com.hns.learn.mapper.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
@WebAppConfiguration
public class SqlTest02 {

    @Autowired
    private PlatformTransactionManager txManager;
    @Autowired
    private InfAfrlndtlMapper infAfrlndtlMapper;
    @Autowired
    private InfAflnratMapper infAflnratMapper;
    @Autowired
    private InfAfpcmemMapper infAfpcmemMapper;
    @Autowired
    private InfAfwklfeMapper infAfwklfeMapper;
    @Autowired
    private InfAccrualMapper infAccrualMapper;

    @Test
    public void testRat() {

        Date currDate = null;
        String mediumid = "1360000100001228092";
        String protseno = "136000011020200000600125";
        try {
            Date date = DateUtils.parseDate("2019-05-05","yyyy-MM-dd");
            currDate = DateUtils.addDays(date,2);
            currDate = DateUtils.addSeconds(currDate,-1);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        List<InfAflnrat> ratList = infAflnratMapper.selectPage(new Page<InfAflnrat>(1,1),new EntityWrapper<InfAflnrat>().le("WORKDATE",currDate).eq("PROTSENO",protseno).eq("MEDIUMID",mediumid).orderBy("WORKDATE",false));
        if(ratList.size() !=1 ){
            System.err.print("查询利率异常...");
            System.err.print("INTERFACE ERROR:required One:table=InfAflnrat:ratList ="+ratList+" protseno="+protseno);
        }else{
            System.out.println(ratList.get(0).getNrate());
        }

    }

    @Test
    public void sqlTest01() {


        Map<String, Object> param = new HashMap<>(1);
        param.put("dueDate","2019-04-24");

        List<Map> protsenosList = infAfrlndtlMapper.getComprehensiveProtsenos(new Page(1,9999),param);
        System.out.println(protsenosList.size());
        for(Map map : protsenosList){
            System.out.println(map);
        }

       /* String mediumid = "1360000100001212925";
        String protseno = "136000011020200000584923";
        Date currDate = null;
        try {
            currDate = DateUtils.parseDate("20190419235959","yyyyMMddHHmmss");
        } catch (ParseException e) {
            e.printStackTrace();
        }


        List<InfAflnrat> ratList = infAflnratMapper.selectPage(new Page<InfAflnrat>(1,1),new EntityWrapper<InfAflnrat>().le("WORKDATE",currDate).eq("PROTSENO",protseno).eq("MEDIUMID",mediumid).orderBy("WORKDATE",false));
        System.out.println(ratList);*/

    }

    @Test
    public void fetchComprehensive() {

        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        def.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);
        TransactionStatus status = txManager.getTransaction(def);
        try {



        } catch (Exception es) {
            txManager.rollback(status);
            es.printStackTrace();
        }
    }

    @Test
    public void testPoint() {
        Map baseMessageInfo = infAfrlndtlMapper.getBaseMessageInfo("CRP2019050316001");
        BigDecimal solutionAmt = (BigDecimal) baseMessageInfo.get("solutionAmt");
        String mCurrency = (String) baseMessageInfo.get("mCurrency");
        if(StringUtils.isNotBlank(mCurrency) && "JPY".equals(mCurrency.toUpperCase())){
            baseMessageInfo.put("solutionAmt",solutionAmt.setScale(0,BigDecimal.ROUND_HALF_UP));
        }else{
            baseMessageInfo.put("solutionAmt",solutionAmt.setScale(2,BigDecimal.ROUND_HALF_UP));
        }
        System.out.println(baseMessageInfo);
    }

    @Test
    public void selIdent() {


        List<Map> identList = infAfrlndtlMapper.selectIdentList();
        if(identList != null){
            for(Map identMap : identList){
                Long granttrnid = (Long) identMap.get("granttrnid");
                Long debtid = (Long) identMap.get("debtid");
                Long grantid = (Long) identMap.get("grantid");
                String debtCode = (String)identMap.get("debtCode");
                String grantCode = (String)identMap.get("grantCode");
                String businessName = (String)identMap.get("businessName");
                String businessTypes = (String)identMap.get("businessTypes");
                String identNumber = (String)identMap.get("identNumber");
                String singleBtch = (String)identMap.get("singleBtch");//TODO
                String institutionCode = (String)identMap.get("institutionCode");
                String liceDate = (String)identMap.get("liceDate");
                String iouCode = (String)identMap.get("iouCode");
                String seqNo = (String)identMap.get("seqNo");
                Long updateBy = (Long)identMap.get("updateBy");

                System.out.println(identMap);

            }

        }
    }

    @Test
    public void selDAOQI() {

       Date currDate = null;
        try {
            currDate = DateUtils.parseDate("2019-04-20","yyyy-MM-dd");
            currDate = DateUtils.addDays(currDate,1);
            currDate = DateUtils.addSeconds(currDate,-1);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        /* Wrapper infAfpcmemWrapper = new EntityWrapper<InfAfpcmem>();
        infAfpcmemWrapper.eq("PROTSENO","136000011020200000585160").le("WORKDATE",currDate).orderBy("WORKDATE",false);

        List<InfAfpcmem> memList = infAfpcmemMapper.selectPage(new Page<InfAfpcmem>(1,1),infAfpcmemWrapper);

        System.out.println(memList);*/


        /*Wrapper lfeWrapper = new EntityWrapper<InfAfwklfe>();
        lfeWrapper.le("WORKDATE",currDate).eq("PROTSENO","136000011020200000582644");
        List<InfAfwklfe> lfeList = infAfwklfeMapper.selectList(lfeWrapper);
        BigDecimal fee = new BigDecimal(0);
        for(InfAfwklfe dvi : lfeList){
            fee = fee.add(new BigDecimal(dvi.getFeeamt()));
        }
        System.out.println(fee.toString());
        System.out.println("*******************************************************");*/


        Map<String, Object> param = new HashMap<>(2);
        param.put("beginDate","2019-05-07");
        param.put("endDate","2019-05-07");

        List<Map> accrualList = infAccrualMapper.getAccrualList(new Page(1,9999),param);

        for(Map<String, Object> resMap : accrualList){

            if(resMap.get("MEDIUMID").equals("1360000100001230011")){
                System.out.println(resMap);
            }



        }

    }
}
