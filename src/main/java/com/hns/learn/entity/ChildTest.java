package com.hns.learn.entity;

import com.google.common.base.MoreObjects;

public class ChildTest
{

    int age = 10;
    int weight = 30;
    public static ChildTest newChild(int age, int weight) {
        ChildTest childTest = new ChildTest();
        childTest.weight = weight;
        childTest.age = age;
        return childTest;
    }
    public static ChildTest newChildWithWeight(int weight) {
        ChildTest childTest = new ChildTest();
        childTest.weight = weight;
        return childTest;
    }
    public static ChildTest newChildWithAge(int age) {
        ChildTest childTest = new ChildTest();
        childTest.age = age;
        return childTest;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("age", age)
                .add("weight", weight)
                .toString();
    }
}
