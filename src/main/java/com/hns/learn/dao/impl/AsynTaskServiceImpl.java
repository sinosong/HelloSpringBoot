package com.hns.learn.dao.impl;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Future;

@Service
public class AsynTaskServiceImpl {

    @Async
    public Future<String> f1(String name) throws InterruptedException {
//        System.out.println("f1 : " + Thread.currentThread().getName() + "   " + UUID.randomUUID().toString());
//        System.out.println("f1=name"+name+Thread.currentThread().getName() );
        System.out.println("开始做任务"+Thread.currentThread().getName());
        long start = System.currentTimeMillis();
        Thread.sleep(new Random().nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("完成任务"+Thread.currentThread().getName()+"，耗时：" + (end - start) + "毫秒");
        return new AsyncResult<String>("res===="+Thread.currentThread().getName());


        /*try {
            Thread.sleep(new Random().nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }

    @Async
    public void f2(String name) {
        System.out.println("f2 : " + Thread.currentThread().getName() + "   " + UUID.randomUUID().toString());
        System.out.println("f2=name"+name);
        /*try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }



}
