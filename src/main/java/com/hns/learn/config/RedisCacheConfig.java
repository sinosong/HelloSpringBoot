package com.hns.learn.config;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.support.spring.GenericFastJsonRedisSerializer;
import org.apache.commons.lang3.ArrayUtils;
import org.redisson.api.RedissonClient;
import org.redisson.spring.cache.RedissonSpringCacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.*;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.lang.reflect.Method;
import java.time.Duration;

/**
 * @author hannasong
 */
@Configuration
@EnableCaching
public class RedisCacheConfig extends CachingConfigurerSupport {

    @Autowired
    private RedisConnectionFactory redisConnectionFactory;
    @Autowired
    private RedissonClient redissonClient;

    String prefix = "BC:";

    /*@Override
    @Bean
    public KeyGenerator keyGenerator() {
        return new KeyGenerator() {
            //重写生成key方法
            @Override
            public Object generate(Object o, Method method, Object... objects) {
                StringBuilder sb = new StringBuilder(prefix);
                CacheConfig cacheConfig = o.getClass().getAnnotation(CacheConfig.class);
                Cacheable cacheable = method.getAnnotation(Cacheable.class);
                CachePut cachePut = method.getAnnotation(CachePut.class);
                CacheEvict cacheEvict = method.getAnnotation(CacheEvict.class);
                if (cacheable != null) {
                    String[] cacheNames = cacheable.value();
                    if (ArrayUtils.isNotEmpty(cacheNames)) {
                        sb.append(cacheNames[0]);
                    }
                } else if (cachePut != null) {
                    String[] cacheNames = cachePut.value();
                    if (ArrayUtils.isNotEmpty(cacheNames)) {
                        sb.append(cacheNames[0]);
                    }
                } else if (cacheEvict != null) {
                    String[] cacheNames = cacheEvict.value();
                    if (ArrayUtils.isNotEmpty(cacheNames)) {
                        sb.append(cacheNames[0]);
                    }
                }
                if (cacheConfig != null && sb.toString().equals(prefix)) {
                    String[] cacheNames = cacheConfig.cacheNames();
                    if (ArrayUtils.isNotEmpty(cacheNames)) {
                        sb.append(cacheNames[0]);
                    }
                }
                if (sb.toString().equals(prefix)) {
                    sb.append(o.getClass().getName()).append(".").append(method.getName());
                }
                sb.append(":");
                if (objects != null) {
                    for (Object object : objects) {
                        sb.append(JSON.toJSONString(object));
                    }
                }
                return sb.toString();
            }
        };
    }*/


    @Bean
    @Override
    public CacheManager cacheManager() {

        //使用Redis作为CacheManager

      /*  //初始化一个RedisCacheWriter
        RedisCacheWriter redisCacheWriter = RedisCacheWriter.nonLockingRedisCacheWriter(redisConnectionFactory);
        //设置CacheManager的值序列化方式为json序列化
        // GenericFastJsonRedisSerializer 替换默认序列化
        GenericFastJsonRedisSerializer jsonSerializer = new GenericFastJsonRedisSerializer();
        RedisSerializationContext.SerializationPair<Object> pair = RedisSerializationContext.SerializationPair.fromSerializer(jsonSerializer);
        RedisCacheConfiguration defaultCacheConfig = RedisCacheConfiguration.defaultCacheConfig().serializeValuesWith(pair);
        //设置默认超过期时间是30秒
        defaultCacheConfig = defaultCacheConfig.entryTtl(Duration.ofMinutes(30));
        //初始化RedisCacheManager
        return new RedisCacheManager(redisCacheWriter, defaultCacheConfig);
*/

//      Map<String, CacheConfig> config = Maps.newHashMap();
//      创建一个名称为"testMap"的缓存，过期时间ttl为24分钟，同时最长空闲时maxIdleTime为12分钟。
//      config.put(CACHE_ENTERPRISE, new CacheConfig(24*60*60*1000, 12*60*1000));
        return new RedissonSpringCacheManager(redissonClient);


    }
}
