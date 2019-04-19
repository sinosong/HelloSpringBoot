package com.hns.learn.web;

import com.hns.learn.exception.InputParamsException;
import com.hns.learn.result.CheckParamsUtil;
import com.hns.learn.util.CacheUtils;
import com.hns.learn.util.ExcelUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class FirstController {

    @Autowired
    private CacheUtils cacheUtil;
    @Autowired
    private CheckParamsUtil checkUtil;

    @RequestMapping(value={"/hello","/hi"})
    public String say(){
        //http://localhost:10336/hi
        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date());
//        String cache = cacheUtil.getCodeLabel("demo","key0");
//        return "当前时间是=="+date +",cache="+cache;
        return "当前时间是=="+date;
    }

    @RequestMapping(value={"/e"})
    public String testException(@ModelAttribute("str") String str){
        //http://localhost:10336/e?str=哈哈哈
        String msg = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date());
        try {
            if(checkUtil.checkParams(str)){
                msg = "正确的参数=="+str;
            }
        } catch (InputParamsException e) {
            msg = "错误的参数=="+e.getMessage();
            e.printStackTrace();
        }
        return "Result=="+msg;
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
