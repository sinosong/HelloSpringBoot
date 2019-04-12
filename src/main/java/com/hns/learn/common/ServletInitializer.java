package com.hns.learn.common;

import com.hns.learn.App;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(App.class);
    }

    /*@Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        servletContext.addListener(new HttpSessionEventPublisher());
    }*/

}
