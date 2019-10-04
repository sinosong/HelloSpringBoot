package com.hns.learn.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author : hannasong
 * @version : v1.0
 * @date : Created in 9:13 上午 2019/10/3
 * @description : 测试多线程延时
 */
public class ScheduleTest {

    private static Timer timer = new Timer();
    private static int runCount = 0;
    public final static long dat0 = System.currentTimeMillis();

    static public class MyTask extends TimerTask{
        @Override
        public void run() {
            try {
                System.out.println("begin..."+new Date());
                if(runCount==2){
                    Thread.sleep(5000);
                }else{
                    Thread.sleep(1000);
                }
                System.out.println("end..."+new Date());
                runCount ++;
                if(runCount == 5){
                    System.out.println(System.currentTimeMillis() - dat0);
                    timer.cancel();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            MyTask task = new MyTask();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HHmmss");
            String dateStr = "20191003 092530";
            Date date = sdf.parse(dateStr);
            System.out.println(date.toString() + "-----" + new Date().toString());
            timer.schedule(task,0,2000);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

}
