package com.hns.learn.thread;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author : hannasong
 * @version : v1.0
 * @date : Created in 10:59 上午 2019/9/29
 * @description : 测试另一种多线程实现方式
 */
public class invokeAllTest {

    private List<String> listMark = Lists.newArrayList("one","two","three");

    /**
     * 关键的差异在于CountDownLatch超时后不再阻塞主线程，而是会继续执行，对于没有完成的子任务，它不知道也不会处理，
     * 也就是说没有完成的子任务还是会继续执行。而ExecutorService.invokeAll超时后，会取消所有在线程池任务队列中等待运行的子任务，说白了就是超时的子任务会被取消。
     * 对于我举的微信这个例子来说，主线程等待超时后，子任务再返回数据是没有意义的，继续执行超时的子任务只会浪费CPU而已，
     * 尤其是对于QPS较大的业务来说，影响更明显。这种情况下选择ExecutorService.invokeAll可能更好些，
     * 当然如果你提供额外的状态标识如定义个AtomicBoolean来辅助实现超时不执行子任务的功能也是可以的。当然有些场景，即便主线程超时了，
     * 子任务也必须执行（例如子任务中涉及数据存储，否则数据可能丢失），这种情况下，应该是使用CountDownLatch。
     */
    @Test
    public void test01() throws InterruptedException, ExecutionException {
        ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("PoolPro-%d").build();
//        ThreadPoolExecutor nThreads = new ThreadPoolExecutor(5, 5,0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
        int nThreads = 3;
        int missionCount = 15;

        AtomicInteger count = new AtomicInteger();
//        List<Future<String>> futureList = new ArrayList<>();
        List<Callable<String>> tasks = new ArrayList<Callable<String>>();

        ExecutorService executorService = Executors.newFixedThreadPool(nThreads, threadFactory);
        for (int i = 0; i < missionCount; i++) {
            /*executorService.submit(() -> {
                Thread thread = Thread.currentThread();
                String currName = Thread.currentThread().getName();
                System.out.println(thread.getName() + " " + list.get(Character.getNumericValue(currName.charAt(currName.lastIndexOf("-")+1))));
                count.getAndIncrement();
            });*/
            /*executorService.submit(() -> {
                Thread thread = Thread.currentThread();
                String currName = Thread.currentThread().getName();
                return thread.getName() + " " + list.get(Character.getNumericValue(currName.charAt(currName.lastIndexOf("-")+1)));
            });*/
            tasks.add(() -> {
                Thread thread = Thread.currentThread();
                String currName = Thread.currentThread().getName();
                return thread.getName() + " " + listMark.get(Character.getNumericValue(currName.charAt(currName.lastIndexOf("-")+1)));
            });
        }

        // 调用该方法的线程会阻塞,直到tasks全部执行完成(正常完成/异常退出)
        List<Future<String>> results = executorService.invokeAll(tasks);
        // 任务列表中所有任务执行完毕,才能执行该语句
        System.out.println("wait for the result." + results.size());

        executorService.shutdown();

        for (Future<String> f : results) {
//            System.out.println("isCanceled=" + f.isCancelled() + ",isDone=" + f.isDone());
            // ExceptionCallable任务会报ExecutionException
            System.out.println("task result = " + f.get());
        }

        //        Thread.sleep(1000);
//        executorService.shutdown();

        System.out.println("end...");
//        System.out.println(count);

    }

    @Test
    public void testInvokeAnyTimeout() throws InterruptedException {
        ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("PoolPro-%d").build();
        ExecutorService executorService = Executors.newFixedThreadPool(3,threadFactory);

        List<Callable<String>> tasks = new ArrayList<Callable<String>>();
        List<String> l = Lists.newArrayList("one","two","three");
        for (int i = 0; i < 6; i++) {
            int finalI = i;
            tasks.add(() -> {
                Thread thread = Thread.currentThread();
                String currName = Thread.currentThread().getName();
                if(finalI ==5){
                    throw new RuntimeException("手动抛出异常...");
                }
                return thread.getName() + " " + l.get(Character.getNumericValue(currName.charAt(currName.lastIndexOf("-")+1)));
            });
        }
        List<Future<String>> result = executorService.invokeAll(tasks, 1, TimeUnit.SECONDS);
//        String result = executorService.invokeAny(tasks, 2, TimeUnit.SECONDS);
//        System.out.println("result = " + result);
        executorService.shutdown();

        Iterator<Callable<String>> taskIter = tasks.iterator();

        for (Future<String> f : result) {
            Callable<String> task = taskIter.next();
            try {
                System.out.println("task result = " + f.get());
            } catch (CancellationException e) {
                System.err.println("CancellationException: Time Out,Mission Cancel...");
//                e.printStackTrace();
            } catch (ExecutionException e) {
                System.err.println("ExecutionException: Message= "+e.getMessage());
//                e.printStackTrace();
            }
        }

    }


}
