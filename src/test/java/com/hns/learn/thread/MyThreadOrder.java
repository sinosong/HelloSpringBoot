package com.hns.learn.thread;

/**
 * @author : hannasong
 * @version : v1.0
 * @date : Created in 8:12 下午 2019/10/3
 * @description : 有序打印
 */
public class MyThreadOrder extends Thread {

    private Object lock;
    private String showChar;
    private int showNumPosition;
    //统计打印了几个
    private int printCount=0;
    volatile private static int addNumber=1;

    public MyThreadOrder(Object lock, String showChar, int showNumPosition) {
        super();
        this.lock = lock;
        this.showChar = showChar;
        this.showNumPosition = showNumPosition;
    }

    @Override
    public void run() {
        try {
            synchronized (lock){
                while (true){
                    if(addNumber % 3 == showNumPosition){
                        System.out.println(Thread.currentThread().getName() +" "+ addNumber +" "+ showChar);
                        lock.notifyAll();
                        addNumber ++;
                        printCount ++;
                        if(printCount == 3){
                            break;
                        }
                    }else {
                        lock.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
