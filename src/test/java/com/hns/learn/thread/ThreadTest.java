package com.hns.learn.thread;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.junit.Test;

import java.util.concurrent.*;

/**
 * @author : hannasong
 * @version :
 * @date : Created in 8:21 下午 2019/10/3
 * @description : 多线程测试;
 */
public class ThreadTest {

    final ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("sinosong-pool-%d").build();
    final CountDownLatch countDownLatch = new CountDownLatch(100);

    /**
     * publicstatic enum Thread.State
     * NEW 使用构造函数后，start之前。
     * RUNNABLE 正在java虚拟机中执行。
     * BLOCKED 受阻塞并等待某个监视器的锁。
     * WAITING 调用wait等函数，无限期等待其他线程执行完。
     * TIMED WAITING 调用sleep(long)等函数，在指定时间内等待。
     * TERMINATED 已退出。
     * 注意isALive();start()前是false，start()后至线程TERMINATED都是存活
     */

    /**
     *    线程执行分析：
     *        当三个线程启动后，如果是b和c线程拿到锁，则会进入到else中线程等待
     *        printCount为每个线程私有的变量,也就是每个线程都会执行三次后不再循环
     *        addNumber为线程共享变量，三个线程分别运行结束之后addNumber累加
     *    运行结果如下：
     *        ThreadName = Thread-0 runCount1 A
     *        ThreadName = Thread-1 runCount2 B
     *        ThreadName = Thread-2 runCount3 C
     *        ThreadName = Thread-0 runCount4 A
     *        ThreadName = Thread-1 runCount5 B
     *        ThreadName = Thread-2 runCount6 C
     *        ThreadName = Thread-0 runCount7 A
     *        ThreadName = Thread-1 runCount8 B
     *        ThreadName = Thread-2 runCount9 C
     *
     *        可以看到第一个运行的是a线程，因为a线程构造参数showNumPosition正好就是初始的addNumber%3的值
     *        此时运行代码后输出：ThreadName = Thread-0 runCount1 A
     *        全局addNumber修改为2，a线程中的printCount变成1，当A线程再次执行循环时，进入else代码块，线程等待
     *
     *        此时如果时线程c拿到锁，则线程c会进入else块，线程等待，然后线程b拿到锁，由于当前线程a修改了全局addNumber，
     *        所有线程b在进入循环判断时，构造参数showNumPosition正好就是初始的addNumber%3的值
     *        此时运行代码后输出：ThreadName = Thread-1 runCount2 B
     *        并唤醒其他线程，此时a和c线程被唤醒，争抢锁
     *        全局addNumber修改为3，b线程中的printCount变成1，当c线程再次执行循环时，进入else代码块，线程等待
     *
     *        此时如果是a线程获得锁，则会进入else块，线程等待，然后c线程拿到锁，由于当前线程b修改了全局addNumber，
     *        所有线程c在进入循环判断时，构造参数showNumPosition正好就是初始的addNumber%3的值
     *        此时运行代码后输出：ThreadName = Thread-2 runCount3 C
     *        并唤醒其他线程，此时a和b线程被唤醒，争抢锁
     *        全局addNumber修改为4，c线程中的printCount变成1，当c线程再次执行循环时，进入else代码块，线程等待
     *
     *        以此类推，当线程中的私有变量printCount为3后，线程退出循环。
     */
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

    @Test
    public void TestPool() {


        /**
         * return new ThreadPoolExecutor(0, Integer.MAX_VALUE,
         *                                       60L, TimeUnit.SECONDS,
         *                                       new SynchronousQueue<Runnable>(),
         *                                       threadFactory);
         */
//        final ExecutorService executorService = Executors.newCachedThreadPool(threadFactory);
        ExecutorService executorService = new ThreadPoolExecutor(0,100,60L,
                TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>(),
//                new LinkedBlockingQueue<>(1),
                threadFactory);

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10; i++) {
            executorService.submit(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
                countDownLatch.countDown();
            });
        }

        try {
            countDownLatch.await();
            executorService.shutdown();
            System.out.println("Total: " + (System.currentTimeMillis() - start) +" ms");
            System.out.println("end...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void TestQueue() {

        long start = System.currentTimeMillis();

        try {
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(100);
            ConcurrentLinkedQueue<Integer> concurrentlinkedQueue = new ConcurrentLinkedQueue<>();
            concurrentlinkedQueue.add(0);
            for (int i = 0; i < 100; i++) {

                try {
                    int finalI = i;
                    new Thread(() -> {
                        try {
                            linkedBlockingQueue.put(finalI);
                            concurrentlinkedQueue.add(concurrentlinkedQueue.peek()+1);

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }).start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            Thread.sleep(2000);

//            linkedBlockingQueue.put("1");
//            linkedBlockingQueue.put("2");
//            linkedBlockingQueue.put("3");
//            linkedBlockingQueue.put("4");
//            linkedBlockingQueue.put("5");
//            linkedBlockingQueue.put("6");
//            linkedBlockingQueue.put("7");
//            linkedBlockingQueue.put("8");
//            linkedBlockingQueue.put("9");
//            linkedBlockingQueue.put("10");

            /*for (int i = 0; i < 10; i++) {
                System.out.println(linkedBlockingQueue.take());
            }*/

            ExecutorService executorService = Executors.newFixedThreadPool(100);
            for (int i = 0; i < 100; i++) {
                executorService.submit(() -> {
//                    try {
//                        System.out.println("linkedBlockingQueue== "+linkedBlockingQueue.take());
//                        System.out.println(concurrentlinkedQueue.poll());
//                        countDownLatch.countDown();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    System.out.println(concurrentlinkedQueue.poll());
                        countDownLatch.countDown();
                });
            }
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Total: " + (System.currentTimeMillis() - start) +" ms");
        System.out.println("end...");

    }

    @Test
    public void testThreadCall() throws Exception {

        ExecutorService executorService = new ThreadPoolExecutor(0,100,60L,
                TimeUnit.SECONDS,
                    new ArrayBlockingQueue<Runnable>(1),
//                new SynchronousQueue<Runnable>(),//容量为0的阻塞队列
//                new LinkedBlockingQueue<Runnable>(1),//阻塞队列
                threadFactory);
        Executors.newFixedThreadPool(1);
        Executors.newCachedThreadPool();
        Executors.newSingleThreadExecutor();
        Executors.newScheduledThreadPool(1);
        Executors.newWorkStealingPool();


    }
}
