package com.hns.learn.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonConfig {

    @Value("${redisson.host}")
    private String host;

    @Value("${redisson.port}")
    private String port;

    @Value("${redisson.password}")
    private String password;

    @Bean
    public RedissonClient getRedissonClient() {
        Config config = new Config();
        config.useSingleServer()
                .setAddress("redis://" + host + ":" + port)
                .setPassword(password)
                .setConnectTimeout(100)
                .setTimeout(200)
                .setConnectionPoolSize(8)
                .setConnectionMinimumIdleSize(5)
                .setTcpNoDelay(true)
                .setPingConnectionInterval(30000)
                .setPingTimeout(100)
                .setKeepAlive(true)
                .setRetryInterval(50);
        RedissonClient redissonClient =  Redisson.create(config);
        return redissonClient;
    }

}
