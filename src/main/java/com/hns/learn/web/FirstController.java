package com.hns.learn.web;

import com.hns.learn.dao.WebSocketServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class FirstController {

    //http://localhost:10336/index
    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value={"/hello","/hi"})
    public String say(){
        //http://localhost:10336/hi
        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date());
        return "当前时间是=="+date;
    }

//    @RequestMapping(value="/myWebSocket",method=RequestMethod.POST,consumes = "application/json")
    @RequestMapping(value="/myWebSocket")
    public @ResponseBody Map<String,Object> myWebSocket(@RequestBody Map<String,Object> param) {
        //ws://localhost:10336/myWebSocket
        Map<String,Object> result =new HashMap<String,Object>();
        try {
            System.out.println("******************************************************");
            WebSocketServer.sendInfo("有新客户呼入");
            result.put("operationResult", true);
        }catch (IOException e) {
            result.put("operationResult", true);
        }
        return result;
    }


}
