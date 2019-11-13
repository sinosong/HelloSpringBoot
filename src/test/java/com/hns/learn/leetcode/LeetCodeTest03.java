package com.hns.learn.leetcode;

/**
 * @author : hannasong
 * @date : Created in 1:39 下午 2019/10/29
 */
public class LeetCodeTest03 {

    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for(int num: nums) {
            if(sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }

    /**
     * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
     * 输入: "babad"
     * 输出: "bab" 注意: "aba" 也是一个有效答案。
     */
    public String longestPalindrome(String s) {
        int length = s.length();
        if(length==0 || length==1){
            return s;
        }else if(length==2){
            return String.valueOf(s.charAt(0));
        }
        int maxL = 0;
        int maxR = 0;
        int maxLength = 1;
        int mid = 1;
        int left,right;
        final char[] chars = s.toCharArray();
        int t = (int) (0.5 * maxLength + 1);
        while (mid + t <= length-1){
            left = mid - t;
            right = mid + t;
            while (left >= 0 && right <= length && chars[left] == chars[right]){
                maxL = left;
                maxR = right;
                left --;
                right ++;
                maxLength += 2;
            }
            mid ++;
        }
//        System.out.println(chars[maxL] +"-maxL-"+ maxL);
//        System.out.println(chars[maxR] +"-maxR-"+ maxR);
        return s.substring(maxL,maxR+1);
    }

    public static void main(String[] args) {

        final LeetCodeTest03 leetCodeTest03 = new LeetCodeTest03();

        final int[] ints = {-2,1, 2, -1, 2};

//        System.out.println(leetCodeTest03.maxSubArray(ints));
//        System.out.println(leetCodeTest03.longestPalindrome("cbbd"));
        int a = 1;
        int b = 1;
        int c = 1;
        a += b = c+1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

}
