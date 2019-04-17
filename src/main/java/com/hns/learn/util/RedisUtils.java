package com.hns.learn.util;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.Cursor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ScanOptions;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@Component
public class RedisUtils {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public Object get(final String key) {
        return redisTemplate.boundValueOps(key).get();
    }

    public boolean set(final String key, Object value) {
        boolean result = false;
        try {
            redisTemplate.boundValueOps(key).set(value);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean set(final String key, Object value, Long ttl, TimeUnit unit) {
        boolean result = false;
        try {
            redisTemplate.boundValueOps(key).set(value,ttl,unit);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean getAndSet(final String key, Object value) {
        boolean result = false;
        try {
            redisTemplate.boundValueOps(key).getAndSet(value);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean delete(final String key) {
        boolean result = false;
        try {
            redisTemplate.delete(key);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public final Long zadd(final String key, Set<ZSetOperations.TypedTuple<Object>> tuples) {
        return redisTemplate.opsForZSet().add(key,tuples);
    }

    public final Boolean zadd(final String key, final String value, double score) {
        return redisTemplate.opsForZSet().add(key,value,score);
    }

    public final Set<Object> zget(final String key,Long Smin,Long Smax,int offset,int count) {
        return redisTemplate.opsForZSet().rangeByScore(key,Smin,Smax,offset,count);
    }
    public final Set<Object> zgetDesc(final String key,Long Smin,Long Smax,int offset,int count) {
        return redisTemplate.opsForZSet().reverseRangeByScore(key,Smin,Smax,offset,count);
    }

    public final List zgetAll(final String key) {
        Cursor<ZSetOperations.TypedTuple<Object>> cursor = redisTemplate.opsForZSet().scan(key, ScanOptions.NONE);
        Long size = redisTemplate.opsForZSet().size("key");
        List entityList = null;
        if(null != size && size > 0){
            entityList = new ArrayList(size.intValue());
            while (cursor.hasNext()){
                ZSetOperations.TypedTuple<Object> item = cursor.next();
                entityList.add(item.getValue());
            }
        }
        return entityList;
    }

}
