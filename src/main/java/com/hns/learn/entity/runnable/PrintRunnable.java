package com.hns.learn.entity.runnable;

import java.util.concurrent.CountDownLatch;

/**
 * @author : hannasong
 * @version : v1.0
 * @date : Created in 3:46 下午 2019/9/26
 * @description : 打印字符
 */
public class PrintRunnable implements Runnable {

    private String str;

    private int count;

    private final CountDownLatch latch ;

    public PrintRunnable(String str, int count, CountDownLatch latch) {
        this.str = str;
        this.count = count;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            System.out.println("run--"+Thread.currentThread().getName()+"-"+str.charAt(count));
        } finally {
            latch.countDown();
        }
    }
}
