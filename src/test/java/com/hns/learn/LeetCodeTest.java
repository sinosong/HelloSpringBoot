package com.hns.learn;

import org.junit.Test;

import java.util.Stack;

/**
 * 简单题
 */
public class LeetCodeTest {

    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     *
     * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     */
    @Test
    public void test01() {
        int[] nums = { 3,  4, -3, 15};
        int target = 0;
        int[][] index = new int[2][nums.length];
        for (int i = 0; i < nums.length; i++) {
            int res = nums[i];
            index[0][i]=i;
            index[1][i]=target - res;
            System.out.print(index[0][i]+"-");
            System.out.println(index[1][i]);
            for (int j = 0; j < i; j++) {
                if(index[1][j] == res){
                    System.out.print(index[0][j]);
                    System.out.println(","+i);
                }
            }
        }
    }

    /**
     * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
     * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
     */
    @Test
    public void test02() {

        int x = -455891300;
        Stack st = new Stack();

        boolean isF = x < 0;
        char[] chars = null;
        if(isF){
            chars = (x+"").substring(1).toCharArray();
        }else{
            chars = (x+"").toCharArray();
        }
        for (int i = 0; i < chars.length; i++) {
            st.push(chars[i]);
        }
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            str.append(st.pop());
        }
        long res = Long.parseLong(isF?"-"+str:str.toString());
        if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE){
            System.out.println(0);
        }else{
            System.out.println((int)res);
        }
    }
}
