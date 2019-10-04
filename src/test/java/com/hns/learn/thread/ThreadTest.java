package com.hns.learn.thread;

import org.junit.Test;

/**
 * @author : hannasong
 * @version :
 * @date : Created in 8:21 下午 2019/10/3
 * @description : 多线程测试;
 */
public class ThreadTest {

    public static void main(String[] args) {
        Object lock = new Object();
        MyThreadOrder a = new MyThreadOrder(lock,"A",1);
        MyThreadOrder b = new MyThreadOrder(lock,"B",2);
        MyThreadOrder c = new MyThreadOrder(lock,"C",0);
        a.start();
        b.start();
        c.start();
    }

    @Test
    public void CaughtTest() {

        Thread thread = new Thread(() -> {
            throw new NullPointerException("我的空指针...");
        });
        Thread.setDefaultUncaughtExceptionHandler((t, e) -> {
            System.out.println("线程: "+t.getName()+" 出现了异常");
            System.err.println(e.getMessage());
            e.printStackTrace();
        });

        //设置异常处理器;
        /*thread.setUncaughtExceptionHandler((t, e) -> {
            System.out.println("线程: "+t.getName()+" 出现了异常");
            System.err.println(e.getMessage());
        });*/

        /*thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("线程: "+t.getName()+" 出现了异常");
                System.err.println(e.getMessage());
                e.printStackTrace();
            }
        });*/

        thread.start();

    }
}
