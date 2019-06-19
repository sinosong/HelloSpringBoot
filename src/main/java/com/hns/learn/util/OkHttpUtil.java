package com.hns.learn.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import okhttp3.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class OkHttpUtil{

    private static final Logger logger = LoggerFactory.getLogger(OkHttpUtil.class);
    private static final MediaType CONTENT_TYPE_FORM = MediaType.parse("application/x-www-form-urlencoded;charset=UTF-8");
    private static final String DEFAULT_USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36";
    private static final String PINTERFACE_URL = "http://192.168.202.81:8085/eximbank";
    private static final int CONNECT_TIME_OUT = 10;
    private static final int READ_TIME_OUT = 120;

    public static final Map invokeInfExecute2(String actionSet, String action, String[] args){

        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(CONNECT_TIME_OUT, TimeUnit.SECONDS)
                .readTimeout(READ_TIME_OUT, TimeUnit.SECONDS)
                .build();
        String results = null;
        Map resultMap = new HashMap();
        String code = "200";
        String msg = "";

        StringBuilder argsBuilder = new StringBuilder();
        argsBuilder.append("[");
        argsBuilder.append(StringUtils.join(args, ","));
        argsBuilder.append("]");
        try {
            RequestBody formBody = new FormBody.Builder()
                    .add("actionSet", actionSet)
                    .add("action", action)
                    .add("args", argsBuilder.toString())
                    .build();
            System.out.println(argsBuilder.toString());
            final Request[] request = {new Request.Builder()
                    .url(PINTERFACE_URL)
                    .addHeader("content-type", "application/json")
                    .post(formBody)
                    .build()};

            Call call = client.newCall(request[0]);

            String json = call.execute().body().string();
//            System.out.println("res=" + json);
            JSONObject object = JSON.parseObject(json.replaceAll("0\\(", "").replaceAll("\\)", "").replaceAll("\n", ""));
            System.out.println("-----------------------------------------------------------------------");
            System.out.println(object.getString("errorcode"));
            System.out.println("-----------------------------------------------------------------------");
            results = object.getString("data");
        } catch (Exception ex) {
            logger.error(ex.getMessage());
//            ex.printStackTrace();
            msg = ex.getMessage();
            code = "500";
        }
        resultMap.put("code",code);
        resultMap.put("msg",msg);
        resultMap.put("results",results);
        return resultMap;
    }

    public static String joinInterfaceParams(List list) {
        StringBuilder params = new StringBuilder();
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                String str="";
                Object lobj = list.get(i);
                if(null!=lobj){
                    str=lobj.toString();
                }
                if (i != list.size() - 1) {
                    params.append("'").append(str).append("',");
                } else {
                    params.append("'").append(str).append("'");
                }
            }
        } else {
            return "";
        }
        return params.toString();
    }
}