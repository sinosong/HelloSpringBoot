package com.hns.learn.util;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CodeListUtils {

    @Autowired
    private CodeList codeList;

    public String getCodeLabel(String tableName,String columnName,String key){

        JSONObject jo = codeList.initCodeLabel(tableName);
        if(null != jo){
            return jo.getJSONObject(columnName).getString(key);
        }else{
            System.out.println("jo is null!");
            return key;
        }
    }
}
