package com.hns.learn;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.hns.learn.entity.InfAfwklfe;
import com.hns.learn.entity.InfAfwkpln;
import com.hns.learn.mapper.InfAfwklfeMapper;
import com.hns.learn.mapper.InfAfwkplnMapper;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class testsql03 {

    @Autowired
    private InfAfwkplnMapper infAfwkplnMapper;
    @Autowired
    private InfAfwklfeMapper infAfwklfeMapper;

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
        String dateStr = "2019-04-19 23:59:59";
        try {
            Date dat = DateUtils.parseDate(dateStr,"yyyy-MM-dd HH:mm:ss");
            List<String> list = infAfwklfeMapper.getLnFeeNOList("136000011020200000582929",dat);
            System.out.println(list);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
