package com.hns.learn;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.hns.learn.entity.BizFile;
import org.junit.Test;

import javax.annotation.Nullable;
import java.util.*;

import static com.google.common.base.Predicates.equalTo;
import static com.google.common.base.Predicates.or;
import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Lists.newArrayList;


public class GuavaTest {

    @Test
    public void MapTest() {

        Map afpcmemJO = new HashMap<String,Map<String,String>>(16);

        Map<String,Map<String,String>> guaMap =  Maps.newHashMap();

    }


    @Test
    public void ListTest() {

        ImmutableList<String> of = ImmutableList.of("a", "b", "c", "d");

        System.out.println(of);

        ArrayList<String> list = newArrayList("1", "2", "3", "4","5");

        System.out.println(list);

        List intlist = Lists.transform(list,new Function(){
            @Nullable
            @Override
            public Integer apply(@Nullable Object input) {
                Preconditions.checkNotNull(input, "Element may not be null" , input);
                return Integer.parseInt((String) input) + 1;
            }
        });

        System.out.println(intlist);

        System.out.println("--------------------------------------------------------------------");

        List<String> names = newArrayList("Aleksander", "Jaran", "Integrasco", "Guava", "Java");

//        Iterable<String> filtered = filter(names, or(or(equalTo("Aleksander"),equalTo("Jaran")), lengthLessThan(5)));
        Iterable<String> filtered = filter(names, or(equalTo("Aleksander"),equalTo("Jaran"),lengthLessThan(5)));

        System.out.println(names);

        System.out.println(filtered);

    }

    private Predicate<String> lengthLessThan(int length) {

        return new LengthLessThanPredicate(length);
    }


    @Test
    public void sortList() {

        List<BizFile> fileList = newArrayList(new BizFile("2","b","B"),new BizFile("2","c","C"),new BizFile("1","a","A"),new BizFile("4","d","D"));

        Comparator<BizFile> byBizCode = new Comparator<BizFile>() {
            @Override
            public int compare(BizFile o1, BizFile o2) {
                return o1.getBizCode().compareTo(o2.getBizCode());
            }
        };
        Comparator<BizFile> byBizType = new Comparator<BizFile>() {
            @Override
            public int compare(BizFile o1, BizFile o2) {
                return o1.getBizType().compareTo(o2.getBizType());
            }
        };
        Comparator<BizFile> byProduct = new Comparator<BizFile>() {
            @Override
            public int compare(BizFile o1, BizFile o2) {
                return o1.getProduct().compareTo(o2.getProduct());
            }
        };

//        List<BizFile> sortedCopy = Ordering.from(byBizCode).compound(byBizType).reverse().sortedCopy(fileList);
        List<BizFile> sortedCopy = Ordering.from(byBizCode).compound(byBizType).sortedCopy(fileList);
        System.out.println(fileList);
        System.out.println("--------------------");
        System.out.println(sortedCopy);

    }
}

class LengthLessThanPredicate implements Predicate<String> {

    private final int length;

    LengthLessThanPredicate(int length) {
        this.length = length;
    }

    @Override
    public boolean apply(@Nullable String input) {
        return input.length() < length;
    }

    @Override
    public boolean test(@Nullable String input) {
        return false;
    }
}

