package com.hns.learn;

import com.alibaba.fastjson.JSONObject;
import com.hns.learn.util.RedisUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Resource
    private RedisUtils redisUtils;

    @Test
    public void set() {
        redisUtils.set("redis_key:demo", "hello world");
        JSONObject testJO = new JSONObject();
        testJO.put("jo","按周期按周期按周期按周期按周期按周期按周期按周期按周期");
        testJO.put("j1","红红火火恍恍惚惚或或或或或");
        redisUtils.set("redis_key:testJO", testJO);
//        redisUtils.set("redis_key_ttl", "hello ttl",5L, TimeUnit.SECONDS);
    }

    @Test
    public void get() {
        String value = (String)redisUtils.get("redis_key");
        System.out.println(value);
    }

    @Test
    public void del() {
        boolean res = redisUtils.delete("redis_key");
        System.out.println(res);
    }


}
