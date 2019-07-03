package com.hns.learn;

import com.hns.learn.util.OkHttpUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.Assert;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class InterfaceTest {

    public static void main(String[] args) {

        List list = new ArrayList();
        /*for (int i = 0; i < 5; i++) {

            list.add((i+Math.random()+"").substring(0,10));
        }*/
        list.add("1");
        list.add("1");
        list.add("04");
        list.add("1360040");
        list.add("1360040");

        String str = OkHttpUtil.joinInterfaceParams(list);

        Map resMap = OkHttpUtil.invokeInfExecute2("ywydbhtgx","ywydbhtgx",new String[]{"" + str + ""});

        System.out.println(resMap);


    }






}
