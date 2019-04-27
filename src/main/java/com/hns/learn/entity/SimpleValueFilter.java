package com.hns.learn.entity;

import com.alibaba.fastjson.serializer.ValueFilter;

public class SimpleValueFilter implements ValueFilter {
    @Override
    public Object process(Object object, String name, Object value) {

        System.out.println("-----------------------------");
        System.out.println(name);
        System.out.println(object);
        System.out.println(value);
        System.out.println("-----------------------------");

        return value;
    }
}
