package com.hns.learn;

/**
 * 给定一个整数数组  nums，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，包含 i,  j 两点
 */
public class NumArray {

    private int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
        for (int k = 1; k < nums.length; k++) {
            nums[k] = nums[k-1] + nums[k];
        }
    }

    public int sumRange(int i, int j) {
        if(i==0){
            return nums[j];
        }else{
            return nums[j] - nums[i-1];
        }
    }

    /*  Demo

    private int[] sums;
    private int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
        this.sums = new int[nums.length + 1];
        sums[0] = 0;
        for (int i = 0; i < nums.length; i ++){
            sums[i + 1] = sums[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        int start = Math.min(i,j);
        int end = Math.max(i,j);
        start = Math.max(0,start);
        end = Math.min(end, nums.length-1);
        return sums[end + 1] - sums[start];
    }

    */

}
