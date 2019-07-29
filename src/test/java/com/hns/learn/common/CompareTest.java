package com.hns.learn.common;

import com.google.common.collect.Ordering;
import org.junit.Test;

import java.util.*;

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

    @Test
    public void testSort() {

        List<String> list = new ArrayList<>();
        list.add("b");
        list.add("a");
        list.add("d");
        list.add("c");
        list.add(null);

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(null==s1 || null==s2){
                    return -1;
                }
                return s1.compareTo(s2);
            }
        });

        Collections.sort(list);

        System.out.println(list);


    }
}
