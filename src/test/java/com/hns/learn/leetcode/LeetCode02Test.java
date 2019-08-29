package com.hns.learn.leetcode;

import org.junit.Test;

public class LeetCode02Test {

    /**
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     * 输出：7 -> 0 -> 8
     * 原因：342 + 465 = 807
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //要考虑数字0

        boolean l1mark = false;
        boolean l2mark = false;
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode res = new ListNode();

        for(;;){

            int val = 0;

            if(l1mark && l2mark){
                if(res.val>9){
                    res.val -= 10;
                    return new ListNode(1,res);
                }else{
                    return res;
                }
            }else{

                if(l1 == null && l2 == null){
                    return null;
                }else{
                    if(t1 == null){
                        l1mark = true;
                    }else{
                        val += t1.val;
                        t1 = t1.next;
                    }
                    if(t2 == null){
                        l2mark = true;
                    }else{
                        val += t2.val;
                        t2=t2.next;
                    }
                    if(val>9){
                        res.val = val - 10;
                        res = new ListNode(1,res);
                    }else{
                        res = new ListNode(val,res);
                    }
                }
            }
        }
    }

    @Test
    public void testMain() {
        long start = System.currentTimeMillis();
        int [] nums = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        ListNode s2 = new ListNode(1);
        ListNode s41 = new ListNode(1);
        ListNode s3 = new ListNode(1);

        ListNode s5 = new ListNode(9);
        ListNode s6 = new ListNode(9);
        ListNode s42 = new ListNode(9);
        ListNode l1 = s2.setNext(s41.setNext(s3));
        ListNode l2 = s5.setNext(s6.setNext(s42));

        ListNode listNode = addTwoNumbers(l1, l2);
        System.out.println("res="+listNode);
        System.out.println("run as "+ (System.currentTimeMillis()-start) +" ms");

    }

}
