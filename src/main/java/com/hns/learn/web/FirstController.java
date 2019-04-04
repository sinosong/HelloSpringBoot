package com.hns.learn.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class FirstController {

    @RequestMapping(value={"/hello","/hi"})
    public String say(){
        //http://localhost:10336/hi
        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date());
        return "当前时间是=="+date;
    }

}
