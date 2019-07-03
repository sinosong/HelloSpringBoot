package com.hns.learn;

import com.hns.learn.config.ThreadConfig;
import com.hns.learn.dao.impl.AsynTaskServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Objects;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class asyncTest {

    @Autowired
    private AsynTaskServiceImpl service;

    @Test
    public void testAsync() {

        for (int i = 0; i < 10; i++) {
            service.f1(i+""); // 执行异步任务
//            service.f2(i+"");
        }

//        Math.max()

//        Objects.requireNonNull();

    }
}
