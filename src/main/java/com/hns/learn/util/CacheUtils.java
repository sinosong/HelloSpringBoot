package com.hns.learn.util;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class CacheUtils {


    public JSONObject initCodeList(){
        JSONObject jo = new JSONObject();
        JSONObject demo = new JSONObject();

        demo.put("key0","NO.1");
        demo.put("key1","NO.2");

        jo.put("demo",demo);
        System.out.println("initCodeList sleep init..."+ DateFormatUtils.format(new Date(),"yyyy-MM-dd hh:mm:ss"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("initCodeList wake init..."+ DateFormatUtils.format(new Date(),"yyyy-MM-dd hh:mm:ss"));
        return jo;
    }

    /*@Cacheable("chaChe")
    public String getCodeLabel(String tableName,String key){
        System.out.println("...........getCodeLabel sleep init..."+ DateFormatUtils.format(new Date(),"yyyy-MM-dd hh:mm:ss"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("getCodeLabel wake init..."+ DateFormatUtils.format(new Date(),"yyyy-MM-dd hh:mm:ss"));
        return this.initCodeList().getJSONObject(tableName).getString(key);
    }*/



}
