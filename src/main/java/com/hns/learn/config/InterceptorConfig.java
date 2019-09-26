package com.hns.learn.config;

import com.hns.learn.interceptor.AuthorityInterceptor;
import com.hns.learn.interceptor.MyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author : hannasong
 * @version : v1.0
 * @date : Created in 2:57 下午 2019/9/26
 * @description : 拦截器配置类；
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 拦截所有请求，通过判断是否有 @LoginRequired 注解 决定是否需要登录
        registry.addInterceptor(AuthorityInterceptor()).addPathPatterns("/**");

        registry.addInterceptor(MyInterceptor()).addPathPatterns("/**");
    }

    @Bean
    public AuthorityInterceptor AuthorityInterceptor() {
        return new AuthorityInterceptor();
    }

    @Bean
    public MyInterceptor MyInterceptor() {
        return new MyInterceptor();
    }

}
