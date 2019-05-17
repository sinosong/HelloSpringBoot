package com.hns.learn;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.hns.learn.entity.BizCust;
import com.hns.learn.mapper.BizCustMapper;
import com.hns.learn.util.RedisUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    String pr = "iBase4J:bizCust:";

    @Resource
    private RedisUtils redisUtils;
    @Autowired
    private BizCustMapper bizCustMapper;

    @Test
    public void set() {
        /*redisUtils.set("redis_key:demo", "hello world");
        JSONObject testJO = new JSONObject();
        testJO.put("jo","按周期按周期按周期按周期按周期按周期按周期按周期按周期");
        testJO.put("j1","红红火火恍恍惚惚或或或或或");
        redisUtils.set("redis_key:testJO", testJO);
        redisUtils.set("redis_key_ttl", "hello ttl",5L, TimeUnit.SECONDS);*/

        redisUtils.set("redis_key:demo", "hello world1",5L, TimeUnit.SECONDS);





    }

    @Test
    public void get() {
//        String value = (String)redisUtils.get("redis_key:demo");
        List<BizCust> custList = bizCustMapper.selectList(new EntityWrapper<BizCust>());

        System.out.println(custList.size());

        for(BizCust cust : custList){
            String redisKey = pr+cust.getCustNo()+cust.getCustNameCN();
            boolean res = redisUtils.set(redisKey,JSON.toJSONString(cust),86400L,TimeUnit.SECONDS);
//            boolean res = redisUtils.delete(redisKey);
            System.out.println(res);
        }

        /*for(BizCust cust : custList){
//            System.out.println(cust);
            String redisKey = pr+cust.getCustNo()+cust.getCustNameCN();
//            String value = (String)redisUtils.get(redisKey);
//            System.out.println(value);
            boolean res = redisUtils.delete(redisKey);
            System.out.println(res);
        }*/

    }

    @Test
    public void del() {
        boolean res = redisUtils.delete(pr+"*");
        System.out.println(res);
    }


}
