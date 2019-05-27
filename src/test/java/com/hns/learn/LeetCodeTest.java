package com.hns.learn;

import org.junit.Test;

import java.util.*;

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

    /**
     * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
     */
    @Test
    public void isPalindrome() {

        int x = 313;
        int y = 313;
        if(x<0){
            System.out.println(false);
        }
        List<Integer> list = new ArrayList();

        int[] arr = new int[10];

        while (x>=1){
            list.add(x%10);
            x = x/10;
            System.out.println(x);
        }
        int size = list.size();
        for (int i = 0; i < size/2; i++) {
            if(list.get(i) - list.get(size-1-i) != 0){
                System.out.println(false);
            }
        }
        System.out.println(this.isPalindrome(y));
    }

    public boolean isPalindrome(int x) {

        if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while (x>rev){
            rev = rev*10 + x%10;
            x = x/10;
        }
        return (x==rev || x==rev/10);
    }

    /**
     * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
     *
     * 字符          数值
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
     *
     * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
     *
     * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
     * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
     * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
     *
     * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
     */
    public int romanToInt(String s) {

        String [][]r = {{"I","V","X","L","C","D","M"},{"1","5","10","50","100","500","1000"}};

        char [] chars = s.toCharArray();
        int maxIndex = 7;
        int res = 0;
        int sub = 0;
        cr:
        for (int i = 0; i < chars.length; i++) {
            for (int j = 6; j >= 0; j--) {
                if(r[0][j].equals(String.valueOf(chars[i]))){
                    int val = Integer.parseInt(r[1][j]);
                    res += val;
                    if(j<=maxIndex){
                        maxIndex = j;
                    }else{
                        sub += Integer.parseInt(r[1][maxIndex]) * 2;
                    }
                    continue cr;
                }
            }
        }
        return res - sub;
    }
    public int romanToIntDemo(String s) {
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == 'I') {
                if (res >= 5)//如果>=5, 说明之前肯定遍历过V了，所以这个I肯定在左边，减
                    res += -1;
                else
                    res += 1;
            } else if (c == 'V') {//遇见V,L,D,M,统统都加5，50，500，100
                res += 5;
            } else if (c == 'X') {
                if (res >= 50)//说明肯定之前有过L，这个X肯定在左边，减
                    res += -10;
                else
                    res += 10;
            } else if (c == 'L') {
                res += 50;
            } else if (c == 'C') {//说明之前有D，这个C肯定在左边，减。能被减的只有I X C
                if (res >= 500)
                    res += -100;
                else
                    res += 100;
            } else if (c == 'D') {
                res += 500;
            } else if (c == 'M') {
                res += 1000;
            }
        }
        return res;
    }

    /**
     * 编写一个函数来查找字符串数组中的最长公共前缀。
     *
     * 如果不存在公共前缀，返回空字符串 ""。
     *
     */
    public String longestCommonPrefix(String[] strs) {

        if(!(strs!=null&&strs.length>0)){
            return "";
        }
        int maxLength = 0;
        StringBuffer buf = new StringBuffer();
        res:
        while (true){
            char tmp = '\0';
            //字符
            for (int j = 0; j < strs.length; j++) {
                String str = strs[j];
                if(!(str!=null&&str.length()>0)){
                    return "";
                }
                if(str.length()<=maxLength){
                   return buf.substring(0,buf.length());
                }
                if(tmp == '\0' && maxLength < str.length()){
                    tmp = str.charAt(maxLength);
                }else if(tmp != '\0' && tmp == str.charAt(maxLength)){

                }else{
                    break res;
                }
            }
            buf.append(tmp);
            maxLength ++;
        }
        return String.valueOf(buf);

    }

    public String longestCommonPrefixDemo(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        StringBuilder sb = new StringBuilder(strs[0]);
        if (strs.length == 1)
            return sb.toString();
        int i = sb.length() - 1, j = 1;
        while (i>=0 && j<strs.length){
            if(strs[j].indexOf(sb.toString()) !=0){
                sb.deleteCharAt(i);
                i--;
            }else
                j++;
        }

        return sb.toString();
    }

    /**
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
     * 有效字符串需满足：
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     * 注意空字符串可被认为是有效字符串。
     */
    public boolean isValid(String s) {

        Stack<Character> leftS = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                leftS.push(ch);
            } else {
                if (leftS.empty()) {
                    return false;
                }
                char pop = leftS.pop();
                if (ch == ')' && pop != '(')
                    return false;
                if (ch == ']' && pop != '[')
                    return false;
                if (ch == '}' && pop != '{')
                    return false;
            }
        }
        return leftS.empty();
    }

    public boolean isValidDemo(String s) {
        char[] a = s.toCharArray();
        int f = 0, flag = 0;
        char[] b = new char[a.length];
        //只要多一个数组来存储左括号就行了
        for (int i = 0; i < a.length; i++) {

            if ((a[i] == '(') || (a[i] == '{') || (a[i] == '[')) {
                b[f] = a[i];
                f++;
            } else if (f == 0) {
                flag = 1;
                break;
            } else if ((a[i] - b[f - 1] == 1) || (a[i] - b[f - 1] == 2)) {
                f--;
            } else {
                flag = 1;
                break;
            }
        }
        if ((flag == 0) && (f == 0)) return (true);
        else return (false);
    }

    /**
     * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
     * 输入：1->2->4, 1->3->4
     * 输出：1->1->2->3->4->4
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        l1=new ListNode(1,new ListNode(2,new ListNode(4)));
        l2=new ListNode(1,new ListNode(3,new ListNode(4)));
        ListNode node = new ListNode(0);
        ListNode son = new ListNode(0);
        node.next=son;
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        while(l1!=null||l2!=null){

            if(l1==null){
                son.next=l2;
                break;
            }
            if(l2==null){
                son.next=l1;
                break;
            }
            if(l1.val<l2.val){
                son.val=l1.val;
                son.next=l2.next;
                l1=l1.next;
            }else{
                son.val=l2.val;
                son.next=l1.next;
                l2=l2.next;
            }
            son = son.next;
        }
        return son;

    }

    /**
     * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
     *
     * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
     */
    public int removeDuplicates(int[] nums) {
        nums = new int[]{1,1,2};
        if(nums.length==0){
            return 0;
        }
        int mark=0;
        for (int i = 1; i < nums.length-mark; i++) {
            while(nums.length>i+mark && nums[i-1] == nums[i+mark]){
                mark++;
            }
            if(nums.length>i+mark){
                nums[i] = nums[i+mark];
            }else{
                break;
            }
        }
        return nums.length-mark;
    }
    public int removeDuplicatesDemo(int[] nums) {
        nums = new int[]{1,1,2,2,2,2,3,4,5,5,6};
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[count] != nums[i]) {
                count++;
                nums[count] = nums[i];
            }
        }
        return count + 1;
    }

    /**
     * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
     * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
     * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
     */
    public int removeElement(int[] nums, int val) {
        nums = new int[]{1,2,3,3,2,2,3,4,5,6};
        val = 3;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
           if(nums[i]!=val){
               nums[count] = nums[i];
               count++;
           }
        }
        return count;
    }

    public int removeElementDemo(int[] nums, int val) {
        nums = new int[]{1,2,3,3,2,2,3,4,5,6};
        val = 3;
        int len=nums.length;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==val){
                nums[i]=Integer.MIN_VALUE;
                --len;
            }
        }
        int i=0,j=0;
        for(;j<nums.length;++j){
            if(nums[j]!=Integer.MIN_VALUE){
                nums[i++]=nums[j];
            }
        }
        return len;
    }

    /**
     * 实现 strStr() 函数。
     * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
     * haystack = "hello", needle = "ll" --> 2
     */
    public int strStr(String haystack, String needle) {
        int index = -1;
        int mark = 0;
        int hlen = haystack.length();
        int nlen = needle.length();
        if(nlen==0){
            return 0;
        }
        if(hlen==0 || hlen<nlen){
            return -1;
        }
        char cn = needle.charAt(0);
        for (int i = 0; i < hlen; i++) {
            char c = haystack.charAt(i);
            if((mark==0&&c==cn) || (mark!=0&&c==needle.charAt(mark))){
                mark++;
                if(nlen==mark){
                    return i-nlen+1;
                }
            }else{
                i=i-mark;
                mark=0;
            }
        }
        return index;
    }
    public int strStrDemo(String haystack, String needle) {
        //如果needle的长度为0或者needle为空,就直接返回0
        if(needle.length()==0||needle==null){
            return 0;
        }

        //如果haystack的长度小于needle,那也就不用找了,直接返回-1
        if(haystack.length()<needle.length()){
            return -1;
        }

        //needle的长度
        int len = needle.length();
        /**
         * 从haystack的首位置开始,以len长度截取字符串haystack的子串
         * 为什么是haystack.length()-needle.length()+1？
         * 把needle的尾部和haystack的尾部对齐就知道,如果错位了,没必要比较吧！
         * hello   ---  haystack
         *    ll   ---  needle
         *
         */
        for(int i = 0;i<haystack.length()-needle.length()+1;i++){

            String target = haystack.substring(i, i+len);

            //如果子串和needle相同,就返回i
            if(target.equals(needle)){
                return i;
            }
            System.out.println(i);
        }

        //循环结束没有找到,就返回-1
        return -1;
    }

    @Test
    public void testMain() {
        System.out.println(strStr("aaa","aaa"));
//        System.out.println(removeElement(null,0));
//        System.out.println(removeDuplicatesDemo(null));
//        System.out.println(this.romanToInt("MCMXCIV"));
//        String [] strs = {"aasbg","aasa","aa"};
//        System.out.println(this.longestCommonPrefixDemo(strs));
//        String s = "([]){[]}";
//        System.out.println(isValidDemo(s));
//        System.out.println(mergeTwoLists(null,null));

    }
}
