package com.hns.learn.lock.pojo;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author : hannasong
 * @version : 1.0
 * @date : Created in 11:04 上午 2019/10/25
 * @description : 自定义MyCallable
 */
public class MyCallableNC<Integer> implements Callable {

    private int count;
    private ReentrantLock lock;
    private NUM num;

    public void setCount(int count) {
        this.count = count;
    }

    public void setLock(ReentrantLock lock) {
        this.lock = lock;
    }

    public MyCallableNC(NUM num, ReentrantLock lock) {
        this.lock = lock;
        this.num = num;
    }

    public MyCallableNC(int count) {
        this.count = count;
    }

    @Override
    public Object call() throws Exception {
        if(lock != null){
            final String threadName = Thread.currentThread().getName();
            lock.lock();
            System.out.println(threadName + " lock...");
            int i = NUM.count;
            NUM.count = i + 1;
            lock.unlock();
            System.out.println(threadName + " unlock...");
        }else {
            count ++;
        }
        return count;
    }

}