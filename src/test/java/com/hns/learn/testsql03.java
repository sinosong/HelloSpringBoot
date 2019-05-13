package com.hns.learn;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.hns.learn.entity.BizFile;
import com.hns.learn.entity.InfAfwklfe;
import com.hns.learn.entity.InfAfwkpln;
import com.hns.learn.entity.InfComprehensive;
import com.hns.learn.mapper.BizFileMapper;
import com.hns.learn.mapper.InfAfwklfeMapper;
import com.hns.learn.mapper.InfAfwkplnMapper;
import com.hns.learn.mapper.InfComprehensiveMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.text.Bidi;
import java.text.ParseException;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class testsql03 {

    @Autowired
    private InfAfwkplnMapper infAfwkplnMapper;
    @Autowired
    private InfAfwklfeMapper infAfwklfeMapper;
    @Autowired
    private BizFileMapper bizFileMapper;
    @Autowired
    private InfComprehensiveMapper infComprehensiveMapper;

    @Test
    public void getAll() {

        System.out.println("getAll***********************************************");

        String beginDate = "";
        String endDate = "";
        String coneNo = "";
        String grantCode = "";
        String deptCode = "";
        String dueDate = "2019-05-16";
        Map<String, Object> param = new HashMap<>();
        param.put("beginDate",beginDate);
        param.put("endDate",endDate);
        param.put("coneNo",coneNo);
        param.put("grantCode",grantCode);
        param.put("deptCode",deptCode);
        param.put("dueDate",dueDate);

        Page page = new Page<>(1,100);
        page.setOrderByField("WORKDATE,PROTSENO,LISTNO");
        List list = infComprehensiveMapper.getAll(page,param);
        System.out.println(list);
        page.setRecords(list);
        System.out.println("getTotal=="+page.getTotal());

    }

    @Test
    public void tesyIssuDate() {
        BizFile bizFile = new BizFile();
        bizFile.setFieldName("Meetingupload");
        bizFile.setBizType("A");
        List<BizFile> bizFileList = bizFileMapper.selectPage(new Page<BizFile>(1,1), new EntityWrapper<>(bizFile).like("BIZ_CODE","CRP2019060269").orderBy("CREATE_TIME",true));
        System.out.println(bizFileList);
    }

    @Test
    public void daoqiri() {

        //到期日matudate（还款计划的最后还款日）
        List<InfAfwkpln> afwkList = infAfwkplnMapper.selectPage(new Page<InfAfwkpln>(1,1000),
                new EntityWrapper<InfAfwkpln>().eq("PROTSENO","136000011020200000243094")
                        .orderBy("GBAMOUNT DESC,GBDATE DESC"));
        /*List<String> list = new ArrayList<String>();
        list.add("GBAMOUNT");
        list.add("GBDATE");
        List<InfAfwkpln> afwkList = infAfwkplnMapper.selectPage(new Page<InfAfwkpln>(1,1000),
                new EntityWrapper<InfAfwkpln>().eq("PROTSENO","136000011020200000243094")
                        .orderAsc(list));*/

        for(InfAfwkpln af : afwkList){
            System.out.println(af.getGbamount()+"--"+af.getGbdate());
        }
    }

    @Test
    public void testFee() {

        /*Wrapper lfeWrapper = new EntityWrapper<InfAfwklfe>();
        lfeWrapper.le("WORKDATE",new Date()).in("STATUS",new Integer[]{1, 3});
        List<InfAfwklfe> lfeList = infAfwklfeMapper.selectList(lfeWrapper);
        BigDecimal fee = new BigDecimal(0);
        for(InfAfwklfe dvi : lfeList){
            fee = fee.add(new BigDecimal(dvi.getFeeamt()));
        }
        System.out.println(fee);*/
//        String dateStr = "2019-04-19 23:59:59";
        String lastCurrDateStr = "2019-05-07";
        Date lastCurrDate = null;
        Date currDate = null;
        String currDateStr = null;
        try {
            lastCurrDate = DateUtils.parseDate(lastCurrDateStr,"yyyy-MM-dd");
            //自然日加一，若今天不存在跑批，则停滞等待
            currDate = DateUtils.addDays(lastCurrDate,2);
            currDate = DateUtils.addSeconds(currDate,-1);
            currDateStr = DateFormatUtils.format(currDate,"yyyy-MM-dd");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
//            Date dat = DateUtils.parseDate(dateStr,"yyyy-MM-dd HH:mm:ss");
//            List<String> list = infAfwklfeMapper.getLnFeeNOList("136000011020200000582929",dat);
//            System.out.println(list);
            String protseno = "136000011020200000608293";

            BigDecimal fee = new BigDecimal(0);
            List<String> feeNoList = infAfwklfeMapper.getLnFeeNOList(protseno,currDate);
            System.out.println("--------------------------------------------------------");

            for(String feeNo : feeNoList){
                List<String> feeNumList = infAfwklfeMapper.getTermnumList(protseno,feeNo,currDate);
                for(String termNum : feeNumList){
                    Wrapper lfeWrapper = new EntityWrapper<InfAfwklfe>();
                    lfeWrapper.le("WORKDATE",currDate).eq("PROTSENO",protseno).eq("LNFEENO",feeNo).eq("TERMNUM",termNum).orderBy("WORKDATE DESC,RECCRDAT DESC");
                    List<InfAfwklfe> tempFeeList = infAfwklfeMapper.selectPage(new Page<InfAfwklfe>(1,1),lfeWrapper);
                    if(tempFeeList.size()>0){
                        InfAfwklfe lfe = tempFeeList.get(0);
                        if("-1-2-3-4-".contains(lfe.getStatus())){
                            BigDecimal temp = new BigDecimal(tempFeeList.get(0).getFeeamt()).subtract(new BigDecimal(tempFeeList.get(0).getFeebal()));
                            System.out.println(temp.toString());
                            fee = fee.add(temp);
                        }
                    }
                }
            }
            System.out.println(fee);
            System.out.println("--------------------------------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
