package com.hns.learn.entity;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;

import java.io.IOException;
import java.lang.reflect.Type;

public class SimpleVauleSerializer implements ObjectSerializer, ObjectDeserializer {
    @Override
    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features) throws IOException {

    }

    @Override
    public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {
        Object value = parser.parse();
        System.out.println(value);
        System.out.println(type);
        System.out.println(fieldName);
        return value == null ? null : (T) value;
    }

    @Override
    public int getFastMatchToken() {
        return 0;
    }
}
