package com.hns.learn;

import com.baomidou.mybatisplus.plugins.Page;
import com.hns.learn.mapper.InfAfrlndtlMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
@WebAppConfiguration
public class SqlTest02 {

    @Autowired
    private InfAfrlndtlMapper infAfrlndtlMapper;

    @Test
    public void sqlTest01() {


        Map<String, Object> param = new HashMap<>(1);
//        param.put("dueDate","2019-05-06");

        List<Map> protsenosList = infAfrlndtlMapper.getComprehensiveProtsenos(new Page(1,9999),param);
        System.out.println(protsenosList);

    }
}
