package com.hns.learn;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.hns.learn.common.Context;
import com.hns.learn.entity.InfAflnrat;
import com.hns.learn.entity.enums.FetchOccurredEnum;
import org.apache.commons.collections.ListUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class commTest {

    @Test
    public void test() {
    }

    @Test
    public void testIndex() {
        String noteType = "012";
        if("-012-013-997-".indexOf(noteType)>0){
            System.out.println(noteType);
            System.out.println("-012-013-997-".contains(noteType));
        }
    }

    @Test
    public void begdecimal() {
        /*BigDecimal updbalB = new BigDecimal("-1255");
        updbalB = updbalB.multiply(new BigDecimal(-1));
        System.out.println(updbalB);*/

        List list1 = FetchOccurredEnum.getNameList();
        List list2 = new ArrayList<String>();
//        list1.add("aaa");
//        list1.add("bbb");
//        list1.add("ccc");
        list2.add("aaa");
        list2.add("OFCURBAL");
        ListUtils.subtract(list1,list2);
        System.out.println(ListUtils.subtract(list1,list2));




    }

    @Test
    public void testLong() {

//        Context c = new Context();
//        System.out.println(c);

        Date date = new Date();
        System.out.println(date);
        date = DateUtils.setHours(date,23);
        date = DateUtils.setMinutes(date,59);
        date = DateUtils.setSeconds(date,59);

        System.out.println(date);
    }

    @Test
    public void testChar() {

        String col = "USER_NAME";
        col = col.toLowerCase();
        boolean mark = false;
        StringBuffer b = new StringBuffer();
        for(char c : col.toCharArray()){
            if(c==95){
                mark = true;
                continue;
            }
            if(mark){
                c-=32;
                mark = false;
                System.out.println(c);
            }
            b.append(c);
        }
        System.out.println(b);

    }

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

    @Test
    public void pasreJSON() {

        String results = "[{\"SvcSeqNo\":\"20190621180449296\",\"ErrorInfo\":\"交易成功\",\"ErrorNo\":\"000000\"}]";

        try {
            JSONObject resJN = null;
            try {
                resJN = JSONObject.parseObject(results);
            } catch (JSONException e) {
                JSONArray jsArr = JSON.parseArray(results);
                resJN = jsArr.getJSONObject(0);
                System.out.println("e0="+e.getMessage());
            }
            System.out.println("------------------------");
            System.out.println(resJN.getString("ErrorInfo"));

        } catch (JSONException e1) {
            System.out.println("e1="+e1.getMessage());
        }


    }
}
