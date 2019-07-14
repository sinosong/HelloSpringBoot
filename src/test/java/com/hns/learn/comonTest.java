package com.hns.learn;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.LinkedList;
import java.util.List;

public class comonTest {


    @Test
    public void testMock() {

        //test for Mock
        List mockList = Mockito.mock(List.class);
        mockList.add("1");
        System.out.println(mockList.get(0));//返回null，说明并没有调用真正的方法
        Mockito.when(mockList.size()).thenReturn(100);//stub
        System.out.println(mockList.size());//size() method was stubbed，返回100

        //test for Spy
        List list = new LinkedList();
        List spy = Mockito.spy(list);

        //optionally, you can stub out some methods:
        Mockito.when(spy.size()).thenReturn(100);

        //using the spy calls real methods
        spy.add("one");
        spy.add("two");

        //prints "one" - the first element of a list
        System.out.println(spy.get(0));

        //size() method was stubbed - 100 is printed
        System.out.println(spy.size());



    }
}
