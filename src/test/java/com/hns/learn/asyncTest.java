package com.hns.learn;

import com.hns.learn.config.ThreadConfig;
import com.hns.learn.dao.impl.AsynTaskServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class asyncTest {

    @Autowired
    private AsynTaskServiceImpl service;

    @Test
    public void testAsync() throws InterruptedException {

        List<Future<String>> futureList = new ArrayList<>();

        long startTime = System.currentTimeMillis();

        List <String> resList = new ArrayList<>();

        int ri = 10;

        for (int i = 0; i < ri; i++) {
            futureList.add(service.f1(i+"")); // 执行异步任务

//            service.f2(i+"");
        }

        for (int i = 0; i < futureList.size(); i++) {

            try {
                Future<String> future = futureList.get(i);
                System.out.println(future.get());
                resList.add(future.get());
                if(future.isDone()){
                    ri --;
//                    System.out.println("----------------------------------"+future.get());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

        }


        System.out.println("end time--------------------------- " + (System.currentTimeMillis() - startTime) +"ms");


    }
}
