package com.hns.learn;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.hns.learn.entity.InfAfwkpln;
import com.hns.learn.mapper.InfAfwkplnMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class testsql03 {

    @Autowired
    private InfAfwkplnMapper infAfwkplnMapper;

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
}
