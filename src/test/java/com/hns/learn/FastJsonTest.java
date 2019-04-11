package com.hns.learn;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.hns.learn.entity.BizFile;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class FastJsonTest {

    @Test
    public void parseObj() {


        BizFile file = new BizFile();
        file.setId(IdWorker.getId());
        file.setExt("转换");
        file.setIssueDate(new Date());
        String str = "{\"key\":\"value\",\"ext\":\"转换\",\"id\":1115513331769356289,\"id_\":\"1115513331769356289\",\"issueDate\":\"2019-04-09 15:14:38\"}";
        String str2 = JSON.toJSONString(file);

        System.out.println(JSON.parseObject(str,BizFile.class).toString());
        System.out.println(JSON.parseObject(str2,BizFile.class).toString());

    }
}
