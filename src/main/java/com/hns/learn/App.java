package com.hns.learn;

import com.hns.learn.dao.IExecuteService;
import com.hns.learn.dao.impl.ExecuteServiceImpl;
import com.hns.learn.util.SpringContextUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement
@SpringBootApplication(scanBasePackages = "com.hns.learn")
@MapperScan("com.hns.learn.mapper")
public class App 
{
    protected final static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {
        SpringApplication app = new SpringApplication(App.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);

        IExecuteService executeService = (IExecuteService) SpringContextUtils.getBean("defaultExecuteService", ExecuteServiceImpl.class);
        executeService.execute();
    }
}
