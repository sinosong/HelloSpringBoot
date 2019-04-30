package com.hns.learn;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.hns.learn.entity.InfAflnrat;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

import java.text.ParseException;
import java.util.Date;

public class commTest {


    @Test
    public void testSec() {

        Date lastCurrDate = null;
        try {
            lastCurrDate = DateUtils.parseDate("2015-04-01","yyyy-MM-dd");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //自然日加一，若今天不存在跑批，则停滞等待
        Date currDate = DateUtils.addDays(lastCurrDate,2);
        currDate = DateUtils.addSeconds(currDate,-1);

        System.out.println(currDate);

    }


    @Test
    public void testTSQL11() {
        /*
         * 实体带查询使用方法  输出看结果
         */
        EntityWrapper<InfAflnrat> ew = new EntityWrapper<InfAflnrat>();
        ew.setEntity(new InfAflnrat());
        ew.where("user_name={0}", "'zhangsan'").and("id=1")
                .andNew().like("GRANT_CODE", "ddd").or().like("IOUCODE", "ddd").or().like("MEDIUMID", "ddd")
                .orNew("user_status={0}", "0").or("status=1")
                .notLike("user_nickname", "notvalue")
                .andNew("new=xx").like("hhh", "ddd")
                .andNew("pwd=11").isNotNull("n1,n2").isNull("n3")
                .groupBy("x1").groupBy("x2,x3")
                .having("x1=11").having("x3=433")
                .orderBy("dd").orderBy("d1,d2");
        System.out.println(ew.getSqlSegment());
    }

    @Test
    public void testSql02() {

        String beginDateStr = "beginDate";
        String endDateStr = "beginDate";
        String coneNo = "beginDate";
        String grantCode = "beginDate";
        String deptCode = "beginDate";
        EntityWrapper<InfAflnrat> wrapper = new EntityWrapper<InfAflnrat>();

        if(StringUtils.isNotBlank(coneNo)){
            wrapper.like("CONENO",coneNo);
        }

        if(StringUtils.isNotBlank(deptCode)){
            wrapper.eq("DEPTCODE",deptCode);
        }

        wrapper.between("WORKDATE",beginDateStr,endDateStr);
        if(StringUtils.isNotBlank(grantCode)){
            wrapper.andNew().like("GRANT_CODE", grantCode).or().like("IOUCODE", grantCode).or().like("MEDIUMID", grantCode);
        }
        System.out.println(wrapper.getSqlSegment());
    }
}
