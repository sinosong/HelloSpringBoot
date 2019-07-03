package com.hns.learn.dao.impl;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import java.util.Random;
import java.util.UUID;

@Service
public class AsynTaskServiceImpl {

    @Async
    public void f1(String name) {
//        System.out.println("f1 : " + Thread.currentThread().getName() + "   " + UUID.randomUUID().toString());
        System.out.println("f1=name"+name+Thread.currentThread().getName() );
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
