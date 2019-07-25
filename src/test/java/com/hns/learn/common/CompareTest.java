package com.hns.learn.common;

import com.google.common.collect.Ordering;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompareTest {


    @Test
    public void compareTest() {

        List<String> strList = new ArrayList<>();
        strList.add("c");
        strList.add("b");
        strList.add("a");
        strList.add("d");


        Comparator<String> byCode = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        List<String> sortedCopy = Ordering.from(byCode).sortedCopy(strList);

        System.out.println(sortedCopy);

    }
}
