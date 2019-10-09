package com.hns.learn.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.Cursor;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ScanOptions;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : hannasong
 * @version : 1.0
 * @date : Created in 10:16 上午 2019/10/8
 * @description : 测试redis
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class redisTest {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Test
    public void get() {

      /*  Set<Object> execute = redisTemplate.execute(new RedisCallback<Set<Object>>() {

            @Override
            public Set<Object> doInRedis(RedisConnection connection) throws DataAccessException {

                Set<Object> binaryKeys = new HashSet<>();

                Cursor<byte[]> cursor = connection.scan( new ScanOptions.ScanOptionsBuilder().match("test*").count(1000).build());
                while (cursor.hasNext()) {
                    binaryKeys.add(new String(cursor.next()));
                }
                return binaryKeys;
            }
        });*/

        List<String> execute = redisTemplate.execute(new RedisCallback<List<String>>() {
            @Override
            public List<String> doInRedis(RedisConnection connection) throws DataAccessException {
                List<String> list = new ArrayList<>();
                Cursor<byte[]> cursor = connection.scan(new ScanOptions.ScanOptionsBuilder().match("IBASE4J:CACHE:*").count(2).build());
                while (cursor.hasNext()) {
                    list.add(new String(cursor.next()));
                }
                return list;
            }
        });
        System.out.println(execute);


//        redisTemplate.
//
//        System.out.println(execute);

    }
}
