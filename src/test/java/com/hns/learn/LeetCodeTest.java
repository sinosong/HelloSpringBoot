package com.hns.learn;

import org.junit.Test;

import java.math.BigDecimal;
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

    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     * 你可以假设数组中无重复元素。
     */
    public int searchInsertOld(int[] nums, int target) {
        int len = nums.length;
        if(len==0 || len>0 && nums[0]>target){
            return 0;
        }
        for (int i = 0; i < len; i++) {
            if(nums[i] == target){
                return i;
            }else if((nums[i] < target) && (len == i+1 || target < nums[i+1])){
                return i + 1;
            }
        }
        return -1;
    }

    public int searchInsert(int[] nums, int target) {
        nums = new int[]{1,3,5,6};
        int len = nums.length;
        if(len==0 || len>0 && nums[0]>target){
            return 0;
        }
        int start = 0;
        int end = len;
        int mid = len/2;
        while (start <= end){
            if(nums[mid] == target){
                return mid;
            }else if((nums[mid] < target) && (len == mid+1 || target < nums[mid+1])){
                return mid + 1;
            }else{
                if(nums[mid] < target){
                    start=mid + 1;
                }else if(nums[mid] > target){
                    end=mid - 1;
                }
                mid = (start+end)/2;
            }
        }
        return -1;
    }

    public int searchInsertDemo(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;
        return findIndex(left, right, mid, target, nums);
    }

    public int findIndex(int left, int right, int mid, int target, int[] nums) {
        // if(left == right){//数组中没有 target 返回它要插入的位置
        //     return left;
        // }

        //>用于 处理 索引位置为0 的情况  left一定都是为正的
        if (left >= right) {//数组中没有 target 返回它要插入的位置
            if (nums[left] < target) {//覆盖的条件是：目标值一定要小于  原位置对应的值(把它理解成排队)
                return left + 1;
            }
            return left;//= 或者 nums[left]>target
        }
        if (nums[mid] == target) {//数组中有 target 返回它要索引
            return mid;
        } else if (nums[mid] > target) {//目标值位置在 左边
            right = mid - 1;
            return findIndex(left, right, (left + right) / 2, target, nums);
        } else {//目标值位置在 右边
            left = mid + 1;
            return findIndex(left, right, (left + right) / 2, target, nums);
        }
    }

    /**
     * 报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下
     * 1.     1
     * 2.     11
     * 3.     21
     * 4.     1211
     * 5.     111221
     * 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
     * 注意：整数顺序将表示为一个字符串。
     */
    public String countAndSay(int n) {
        String say = "1";
        for (int i = 1; i < n; i++) {
            int count = 0;
            char tmp = '\0';
            int len = say.length();
            StringBuffer buffer = new StringBuffer();
            for (int j = 0; j < len; j++) {
                if (tmp == '\0') {
                    tmp = say.charAt(j);
                    count++;
                } else if (tmp == say.charAt(j)) {
                    count++;
                } else if (tmp != say.charAt(j)) {
                    buffer.append(count + String.valueOf(tmp));
                    tmp = say.charAt(j);
                    count = 1;
                }
                if (j == len - 1) {
                    buffer.append(count + String.valueOf(tmp));
                    say = buffer.toString();
                }
            }
        }
        return say;
    }
    public static String countAndSayDemo(int n) {
        if (n == 1)
            return "1";
        String s = countAndSayDemo(n-1);
        StringBuilder builder = new StringBuilder();
        char[] cha = s.toCharArray();
        int count = 1;
        for (int i = 0; i < cha.length; i++) {
            if (i == cha.length-1){ //边界情况
                builder.append(count).append(cha[i]);
                break;
            }
            if (cha[i] == cha[i+1]){
                count++;
                continue;
            }else {
                builder.append(count).append(cha[i]);
                count = 1;
            }
        }
        return builder.toString();
    }

    /**
     * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
     * new int[]{-2,1,-3,4,-1,2,1,-5,4};
     * 输出: 6
     * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
     */
    public int maxSubArray(int[] nums) {
        nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        if(nums.length==0){
            return 0;
        }
        int maxL = nums[0];
        int sum = nums[0];
        int head = 0;
        for (int i = 1; i < nums.length; i++) {
            int tmp = sum;
            sum = Math.max(sum + nums[i],nums[i]);
            if(tmp<sum){
                head = i;
            }
            if(sum > maxL){
                maxL = sum;
            }
        }
        return maxL;
    }

    public int maxSubArrayDemo(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(sum + nums[i] < nums[i]){
                sum = nums[i];
            }else{
                sum += nums[i];
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }

    /**
     * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
     * 如果不存在最后一个单词，请返回 0 。
     * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
     */
    public int lengthOfLastWord(String s) {
        s = s.trim();
        if(s==null || s.length()==0){
            return 0;
        }
        int len = s.length();
        for (int i = len - 1; i > 0; i--) {
            if(s.charAt(i)==' '){
                return len - i - 1;
            }
        }
        return len;
    }

    public int lengthOfLastWordDemo(String s) {
        if (s == null || s.length() == 0){
            return 0;
        }
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i -= 1;
        }
        int res = 0;
        for (; i >= 0; i--) {
            if (s.charAt(i) != ' '){
                res += 1;
            }else{
                return res;
            }
        }
        return res;
    }

    /**
     * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
     * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
     * 你可以假设除了整数 0 之外，这个整数不会以零开头。
     */
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        boolean up = false;
        for (int i = len - 1,j=0; i >= 0; i--,j++) {
            int temp = digits[i];
            if(up){
                temp ++;
            }else{
                if(j==0){
                    temp ++;
                }
            }
            if(temp>9){
                up = true;
                digits[i]=0;
            }else{
                up = false;
                digits[i]=temp;
            }
            if(i==0 && up){
                int[] news = new int [len+1];
                news[0]=1;
                System.arraycopy(digits, 0, news, 1, len);
                return news;
            }
        }
        return digits;
    }
    public int[] plusOneDemo(int[] digits) {
        int up=1;
        for(int i=digits.length-1;i>=0;--i){
            int temp=digits[i];
            digits[i]=(digits[i]+up)%10;
            up=(temp+up)/10;
        }
        if(up==1){
            int[] arr=new int[digits.length+1];
            arr[0]=1;
            for(int i=1;i<arr.length;++i){
                arr[i]=digits[i-1];
            }
            return arr;
        }
        else return  digits;
    }

    /**
     * 给定两个二进制字符串，返回他们的和（用二进制表示）。
     * 输入为非空字符串且只包含数字 1 和 0。
     */
    public String addBinary(String a, String b) {

        StringBuffer res = new StringBuffer();
        int lena = a.length();
        int lenb = b.length();
        int lenMax = 0;
        int lenMin = 0;
        String minS = null;
        String maxS = null;

        if(lena>lenb){
            lenMax = lena;
            lenMin = lenb;
            minS = b;
            maxS = a;
        }else{
            lenMax = lenb;
            lenMin = lena;
            minS = a;
            maxS = b;
        }
        int lenD = lenMax - lenMin;
        int up = 0;
        for (int i=lenMax-1;i>=0;--i) {
            int t1 = 0;
            if(i-lenD>=0){
                t1 = minS.charAt(i-lenD) - '0';
            }
            int t0 = maxS.charAt(i) - '0';
            int sum = t0 + t1 + up;
            t0 = sum%2;
            up=sum/2;
            res.append(t0);
        }
        if(up==1){
            res.append(up);
        }
        return res.reverse().toString();
    }

    public String addBinaryDemo(String a, String b) {
        if (a.length() == b.length()) {

        } else if (a.length() > b.length()) {
            while (a.length() > b.length()) {
                b = "0" + b;
            }
        } else {
            while (a.length() < b.length()) {
                a = "0" + a;
            }
        }
        boolean shouldPlus = false;
        char[] chars = a.toCharArray();
        for (int i = a.length() - 1; i >= 0; i--) {
            if (chars[i] == '1' && b.charAt(i) == '1') {
                chars[i] = shouldPlus ? '1' : '0';
                shouldPlus = true;
            } else if (chars[i] == '0' && b.charAt(i) == '0') {
                chars[i] = shouldPlus ? '1' : '0';
                shouldPlus = false;
            } else {
                chars[i] = shouldPlus ? '0' : '1';
                shouldPlus = shouldPlus ? true : false;
            }
        }
        return (shouldPlus ? "1" : "") + new String(chars);
    }

    /**
     * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
     * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
     * 注意：给定 n 是一个正整数。
     * 输入： 3
     * 输出： 3
     * 解释： 有三种方法可以爬到楼顶。
     * 1.  1 阶 + 1 阶 + 1 阶
     * 2.  1 阶 + 2 阶
     * 3.  2 阶 + 1 阶
     * f(1)=1;f(2)=2;f(3)=2;f(4)=5;f(5)=8;
     * f(n) = f(n-1)+f(n-2)
     */
    public int climbStairs(int n) {

        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        /*int[] f = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        f[2] = 2;

        for (int i = 3; i <= n; i++) {
            f[i]=f[i-1]+f[i-2];
        }*/
        int x = 2;
        int y = 1;
        for (int i = 3; i <= n; i++) {
            x += y;
            y = x - y;
        }

        return x;
    }
    public int climbStairsDemo(int n) {
        if(n == 1){
            return 1;
        }
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2; i <= n; i++){
            arr[i] = arr[i-1] + arr[i-2];
            if( i == n){
                return arr[i];
            }
        }
        return 0;
    }

    /**
     * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
     * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
     * 注意你不能在买入股票前卖出股票。
     * 输入: [7,1,5,3,6,4]
     * 输出: 5
     * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
     *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
     */
    public int maxProfit(int[] prices) {

        int idx0 = 0;
        int MaxV = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if(prices[idx0] > prices[i+1]){
                idx0 = i + 1;
            }
            if(prices[i+1] - prices[idx0] > MaxV){
                MaxV = prices[i+1] - prices[idx0];
            }
        }
        return MaxV;
    }
    public int maxProfitDemo(int[] prices) {
        // 每个数，记住左边最小的值
        if( prices == null || prices.length == 0){
            return 0;
        }
        int min = prices[0];
        int maxProfit = 0;
        for( int price : prices){
            if (min > price){
                min = price;
            }
            if( price - min > maxProfit){
                maxProfit =  price - min;
            }
        }
        return maxProfit;
    }

    /**
     * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
     * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
     */
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        int t1 = 0;
        int t2 = 0;
        for (int i = 0; i < nums.length; i++) {
            int tmp = t1;
            if(t2+nums[i] > t1){
                t1 = t2+nums[i];
            }
            t2 = tmp;
        }
        return t1;
    }
    public int robDemo(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        int[] dp = new int[nums.length];// dp[i]表示打劫至第i家时，所获得的最大钱财数
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (i - 2 >= 0) {
                dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
            } else {
                dp[i] = Math.max(dp[i - 1], nums[i]);
            }

        }
        return dp[nums.length-1];
    }

    /**
     * 数组的每个索引做为一个阶梯，第 i个阶梯对应着一个非负数的体力花费值 cost[i](索引从0开始)。
     * 每当你爬上一个阶梯你都要花费对应的体力花费值，然后你可以选择继续爬一个阶梯或者爬两个阶梯。
     * 您需要找到达到楼层顶部的最低花费。在开始时，你可以选择从索引为 0 或 1 的元素作为初始阶梯。
     */
    public int minCostClimbingStairs(int[] cost) {

    }


    @Test
    public void testMain() {
        long start = System.currentTimeMillis();
        int [] nums = new int[]{10, 15, 20};



        System.out.println("res="+minCostClimbingStairs(nums));
//        System.out.println("res="+robDemo(nums));
//        int [] nums = new int[]{-4,-5};
//        NumArray obj = new NumArray(nums);
//        System.out.println(obj.sumRange(0,0));
//        System.out.println(obj.sumRange(1,1));
//        System.out.println(addBinaryDemo("110010110","1000110"));
//        System.out.println(Arrays.toString(plusOneDemo(nums)));
//        System.out.println(lengthOfLastWord("hell    day"));
//        System.out.println(maxSubArray(null));
//        System.out.println(countAndSayDemo(5));
//        System.out.println(searchInsert(null,2));
//        System.out.println(strStr("aaa","aaa"));
//        System.out.println(removeElement(null,0));
//        System.out.println(removeDuplicatesDemo(null));
//        System.out.println(this.romanToInt("MCMXCIV"));
//        String [] strs = {"aasbg","aasa","aa"};
//        System.out.println(this.longestCommonPrefixDemo(strs));
//        String s = "([]){[]}";
//        System.out.println(isValidDemo(s));
//        System.out.println(mergeTwoLists(null,null));

        System.out.println("run as "+ (System.currentTimeMillis()-start) +" ms");

    }
}
