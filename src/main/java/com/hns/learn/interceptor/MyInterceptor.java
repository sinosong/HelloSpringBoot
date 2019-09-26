package com.hns.learn.interceptor;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.hns.learn.entity.runnable.PrintRunnable;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.*;

/**
 * @author : hannasong
 * @version : v1.0
 * @date : Created in 2:20 下午 2019/9/26
 * @description : 自定义过滤器
 */
public class MyInterceptor  extends HandlerInterceptorAdapter {

    private ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("sinosong-pool-%d").build();



    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(8, 16, 5, TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>(),namedThreadFactory);

        String clientIp = (String) request.getRemoteAddr();
        System.out.println("clientIp --> "+clientIp);
        CountDownLatch latch = new CountDownLatch(clientIp.length());
        for (int i = 0; i < clientIp.length(); i++) {
            executor.submit(new PrintRunnable(clientIp,i, latch));
        }
        latch.await();
        System.out.println("分析结束,关闭线程池...");
        executor.shutdown();
        return super.preHandle(request, response, handler);
    }


}
