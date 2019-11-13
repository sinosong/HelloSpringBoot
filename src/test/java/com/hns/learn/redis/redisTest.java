package com.hns.learn.redis;

import com.alibaba.fastjson.JSON;
import com.hns.learn.mapper.BizCanvasMapper;
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

import javax.crypto.*;
import javax.crypto.spec.DESKeySpec;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author : hannasong
 * @version : 1.0
 * @date : Created in 10:16 上午 2019/10/8
 * @description : 测试redis
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class redisTest {

    private final String bathPath = "/Users/sinosong/tempForder/";

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Autowired
    private BizCanvasMapper bizCanvasMapper;

    @Test
    public void setBizCanvas() {

        List<Map> fileNameList = bizCanvasMapper.selEffectFileName();

        System.out.println(fileNameList.size());

//        redisTemplate.opsForList().leftPushAll("canvasFileName",fileNameList);

        for (int i = 0; i < fileNameList.size(); i++) {
            Map canvas = fileNameList.get(i);
            redisTemplate.opsForValue().set("canvas:fileName:"+ canvas.get("FILENAME_"), JSON.toJSONString(canvas));
            System.exit(0);
        }

//        Set<String> keys = redisTemplate.keys("canvas:fileName:*");
//        System.out.println("res size()="+keys.size());
    }

    @Test
    public void transCanvas() {

//        System.out.println(redisTemplate.hasKey("canvas:fileName:02756a9519f2461ca783f468a7c80a32"));


        try (
                // 根据指定文件创建文件输入流,并获取通道
                FileInputStream fis = new FileInputStream(bathPath + "00a2dffaa0da4f8f90cf4a99aab035d8.b64");
                FileChannel inChannel = fis.getChannel();
        )
        {
            long size = inChannel.size();
            ByteBuffer byteBuffer = ByteBuffer.allocate((int)size);
            inChannel.read(byteBuffer);
            long start = System.currentTimeMillis();
            System.out.println(new String(decrypt(byteBuffer.array())));
            System.out.println("Total = "+(System.currentTimeMillis() - start));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void oldVersion() {

        try {
            File file = new File(bathPath + "00a2dffaa0da4f8f90cf4a99aab035d8.b64");
            Long size = file.length();
            InputStream in = new FileInputStream(file);
            byte[] bytes = new byte[size.intValue()];
            in.read(bytes);
            long start = System.currentTimeMillis();
            System.out.println(new String(decrypt(bytes)));
            System.out.println("Total = "+(System.currentTimeMillis() - start));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    /**
     * 解密
     * @param src byte[]
     * @return byte[]
     * @throws Exception
     */
    public static byte[] decrypt(byte[] src) {
        try {
            // DES算法要求有一个可信任的随机数源
            SecureRandom random = new SecureRandom();
            // 创建一个DESKeySpec对象
            DESKeySpec desKey = new DESKeySpec("eximbank".getBytes());
            // 创建一个密匙工厂
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");//返回实现指定转换的 Cipher 对象
            // 将DESKeySpec对象转换成SecretKey对象
            SecretKey securekey = keyFactory.generateSecret(desKey);
            // Cipher对象实际完成解密操作
            Cipher cipher = Cipher.getInstance("DES");
            // 用密匙初始化Cipher对象
            cipher.init(Cipher.DECRYPT_MODE, securekey, random);
            // 真正开始解密操作
            return cipher.doFinal(src);
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
        return null;
    }

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
