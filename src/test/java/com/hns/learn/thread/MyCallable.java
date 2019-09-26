package com.hns.learn.thread;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/**
 * @author : hannasong
 * @version : 1.0
 * @date : Created in 09:39 2019-09-24
 * @description : 多线程任务类
 */
public class MyCallable implements Callable {

    private String key;

    private String value;

    CountDownLatch countDownLatch;

    public MyCallable(String key, String value, CountDownLatch countDownLatch) {
        this.key = key;
        this.value = value;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public Map call() throws Exception {
        Map returnMap = null;
        try {
            System.out.println(Thread.currentThread().getName() + " key " + key + " val " + value);
            Thread.sleep(3000);
//            returnMap = OkHttpUtil.invokeInfExecute2("khztsxxxcx", "khztsxxxcx", new String[]{"136090000060746"});
            returnMap.put("Name",Thread.currentThread().getName());
            returnMap.put("key",key);
            returnMap.put("value",value);
//            Thread.sleep(3000);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            countDownLatch.countDown();
        }
        return returnMap;
    }
}
