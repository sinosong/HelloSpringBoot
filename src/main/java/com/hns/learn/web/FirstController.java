package com.hns.learn.web;

import com.hns.learn.util.ExcelUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
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

    @RequestMapping(value={"/exp"})
    public void exp(HttpServletResponse response){
        //http://localhost:10336/exp
        String[] titles = {"序号","债项方案编号"};
        String[][] centerVal = new String[2][2];
        centerVal[0][0] = "1";
        centerVal[0][1] = "no.1";
        centerVal[1][0] = "2";
        centerVal[1][1] = "no.2";
        ExcelUtils.exportExcel(true,titles,centerVal,response,"下载01");

    }

}
