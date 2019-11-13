package com.hns.learn.common;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : hannasong
 * @version : v1.0
 * @date : Created in 4:25 下午 2019/10/22
 * @description : 测试hashmap
 */
public class HashMapTest {


    public static void main(String[] args) {

        Map<EntityDemo,String> map = new HashMap<>(16);

        EntityDemo entity01 = new EntityDemo("NameA");
        EntityDemo entity02 = new EntityDemo("NameB");
        EntityDemo entity03 = new EntityDemo("NameC");
        EntityDemo entity04 = new EntityDemo("NameD");
        EntityDemo entity05 = new EntityDemo("NameE");

        map.put(entity01,"A");
        map.put(entity02,"B");
        map.put(entity03,"C");
        map.put(entity04,"D");
        map.put(entity05,"E");

        System.out.println("asas".hashCode());

    }


}
