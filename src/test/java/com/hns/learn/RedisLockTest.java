package com.hns.learn;

import com.hns.learn.dao.BizFileService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class RedisLockTest {

    @Autowired
    private BizFileService bizFileService;

    private CyclicBarrier cyclicBarrier = new CyclicBarrier(100,new Runnable() {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " :all is end!");
        }

    });



    @Test
    public void contextLoads() {
        for (int i = 0; i < 110; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName()+"begin...");
                try {
                    bizFileService.subtract(1120936852971950081L);
                    System.out.println(Thread.currentThread().getName() + "  end...");
                    cyclicBarrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
            ).start();
        }

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
