package com.hns.learn.common;

import org.junit.Test;

public class ThreadTest {

    public static int count = 0;

    @Test
    public void test01() {

        for (int i = 0; i < 8; i++) {
            new Thread(
                    new Runnable() {
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(100000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            for (int j = 0; j < 100; j++) {
                                synchronized (ThreadTest.class){
                                    count ++;
                                }
                            }
                        }
                    }
            ).start();
        }

        try {
            Thread.sleep(300000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("count="+count);
    }

    synchronized int cou(int num){
        num ++;
        return num;
    }
}
