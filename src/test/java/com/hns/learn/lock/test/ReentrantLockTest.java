package com.hns.learn.lock.test;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.hns.learn.lock.pojo.MyCallableNC;
import com.hns.learn.lock.pojo.NUM;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author : hannasong
 * @version : v1.0
 * @date : Created in 10:58 上午 2019/10/25
 * @description : 测试ReentrantLock
 */
public class ReentrantLockTest {

    private static final NUM num = new NUM();

    @Test
    public void Test01() throws ExecutionException, InterruptedException {

        final ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("song-pool-%d").build();
        final ExecutorService executorService = Executors.newFixedThreadPool(32, threadFactory);
        ReentrantLock lock = new ReentrantLock();

        List<Future<Integer>> futures = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();

        int count = NUM.count;

        for (int i = 0; i < 20; i++) {
            futures.add(executorService.submit(new MyCallableNC<Integer>(num,lock)));
//            executorService.submit(() -> {
//
//
//
//            });
        }

        for (int i = 0; i < futures.size(); i++) {
            counts.add(futures.get(i).get());
        }

        System.out.println("count " + NUM.count);
        System.out.println(counts);
    }

}

