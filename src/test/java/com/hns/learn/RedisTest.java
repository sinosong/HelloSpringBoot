package com.hns.learn;

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







    }

    @Test
    public void get() {
//        String value = (String)redisUtils.get("redis_key:demo");
        List<BizCust> custList = bizCustMapper.selectList(new EntityWrapper<BizCust>().eq("ID_","20"));

        System.out.println(custList.size());
        for(BizCust cust : custList){
            String redisKey = pr+cust.getCustNo()+cust.getCustNameCN();
            String value = (String)redisUtils.get(redisKey);
            System.out.println(value);
        }

    }

    @Test
    public void del() {
        boolean res = redisUtils.delete("redis_key");
        System.out.println(res);
    }


}
