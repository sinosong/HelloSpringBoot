package com.hns.learn.thread;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

/**
 * @author : hannasong
 * @version : 1.0
 * @date : Created in 10:43 2019-09-23
 * @description : 压力测试;
 */
public class PressureTest {

    // 线程数
    private static final int threads = 3;
    //任务数
    private static final int count = 3;
    // 用于计数线程是否执行完成
    final CountDownLatch countDownLatch = new CountDownLatch(count);

    @Test
    public void requestInterface() throws InterruptedException, ExecutionException {

        System.out.println("---- start ----");
        ExecutorService executorService = Executors.newFixedThreadPool(threads);
        List<Future<Map>> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Future<Map> submit = executorService.submit(new Callable<Map>() {
                @Override
                public Map call() throws Exception {
                    Map returnMap = null;
                    try {
                        System.out.println(Thread.currentThread().getName());
//                        returnMap = OkHttpUtil.invokeInfExecute2("khztsxxxcx", "khztsxxxcx", new String[]{"136090000060746"});

                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    } finally {
                        countDownLatch.countDown();
                    }
                    return returnMap;
                }
            });
            list.add(submit);
        }
        countDownLatch.await();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).get());
        }
        System.out.println("---- end ----");
    }

    @Test
    public void requestInterface2() throws InterruptedException, ExecutionException {

        System.out.println("----requestInterface2 start ----");
        ExecutorService executorService = Executors.newFixedThreadPool(threads);
        List<Future<Map>> list = new ArrayList<>();
        List<Runnable> droppedTasks = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Future submit = executorService.submit(new MyCallable(i+"",count+"",countDownLatch));
            list.add(submit);
        }
        executorService.shutdown();
        if(!executorService.awaitTermination(30, TimeUnit.SECONDS)) {
            System.out.println("executors did not terminate in the specified time.");
            droppedTasks = executorService.shutdownNow();
            System.out.println("executors was abruptly shut down. " + droppedTasks.size() + " tasks will not be executed.");
            if(droppedTasks.size() == 0){
                countDownLatch.await(30,TimeUnit.SECONDS);
                for (int i = 0; i < list.size(); i++) {
                    System.out.println("res drop : "+list.get(i).get());
                }
            }else {
                for (int i = 0; i < droppedTasks.size(); i++) {
                    System.out.println("droppedTasks : "+droppedTasks.get(i));
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("res : "+list.get(i).get());
        }
//        countDownLatch.await();
        System.out.println("---- end ----");
    }

    @Test
    public void CountDownLatchTest() {
        final CountDownLatch latch = new CountDownLatch(2);
        new Thread() {
            public void run() {
                try {
                    System.out.println("子线程" + Thread.currentThread().getName() + "正在执行");
                    Thread.sleep(3000);
                    System.out.println("子线程" + Thread.currentThread().getName() + "执行完毕");
                    latch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
        }.start();
        new Thread() {
            public void run() {
                try {
                    System.out.println("子线程" + Thread.currentThread().getName() + "正在执行");
                    Thread.sleep(10000);
                    System.out.println("子线程" + Thread.currentThread().getName() + "执行完毕");
                    latch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
        }.start();
        try {
            latch.await(3,TimeUnit.SECONDS);
            System.out.println("继续执行主线程");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
