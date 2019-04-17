package com.hns.learn.config;

import com.alibaba.fastjson.support.spring.GenericFastJsonRedisSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author hannasong
 */
@Configuration
public class RedisConfig {

    //还是使用springboot默认配置的RedisConnectionFactory
    @Autowired
    private RedisConnectionFactory redisConnectionFactory;

    // 默认用的是用JdkSerializationRedisSerializer进行序列化的
    @Bean
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public RedisTemplate<String, Object> getRedisTemplate() {

        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<String, Object>();
        // 注入数据源
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        // GenericFastJsonRedisSerializer 替换默认序列化
        StringRedisSerializer keySerializer = new StringRedisSerializer();
        GenericFastJsonRedisSerializer valueSerializer = new GenericFastJsonRedisSerializer();

        // key-value结构序列化数据结构
        redisTemplate.setKeySerializer(keySerializer);
        redisTemplate.setValueSerializer(valueSerializer);
        // hash数据结构序列化方式,必须这样否则存hash 就是基于jdk序列化的
        redisTemplate.setHashKeySerializer(keySerializer);
        redisTemplate.setHashValueSerializer(valueSerializer);
        // 启用默认序列化方式
        redisTemplate.setEnableDefaultSerializer(true);
        redisTemplate.setDefaultSerializer(valueSerializer);

        /// redisTemplate.afterPropertiesSet();//初始化bean的时候执行，可以针对某个具体的bean进行配置
        return redisTemplate;
    }

}
