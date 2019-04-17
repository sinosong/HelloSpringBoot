package com.hns.learn.util;

import com.alibaba.fastjson.JSONObject;
import com.hns.learn.annotation.CodeLabel;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author hannasong
 */
@Component
public class DataUtils {


    /*@Cacheable(value="codeKey")//, keyGenerator = "keyGenerator"  key="#tableName"
    public JSONObject initCodeLabel(Object obj,String tableName){
        System.out.println("...........initCodeLabel...........");
        try {
            Class clazz  = obj.getClass();
            JSONObject jo = null;
            Method[] methods = clazz.getDeclaredMethods();
            for(Method method : methods){
                if(method.isAnnotationPresent(CodeLabel.class)){
                    CodeLabel label = method.getAnnotation(CodeLabel.class);
                    System.out.println(label.value());
                    if(label.value().equals(tableName)){
                        return (JSONObject)method.invoke(obj);
                    }
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }*/



}
