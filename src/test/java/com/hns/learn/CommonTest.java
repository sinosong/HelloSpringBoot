package com.hns.learn;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.hns.learn.entity.BizFile;
import com.hns.learn.util.ExcelUtils;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CommonTest {

    @Test
    public void BeanTest() {

        BizFile bf = new BizFile("1","a","A");
        try {
            BeanUtils.cloneBean(bf);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void charTest() {
        char a = '1';
        System.out.println(String.valueOf(a));

        String padEndResult = Strings.padStart("123", 20, '0');
        System.out.println(padEndResult);
    }

    @Test
    public void preconditionsTest() {
        String name="Jim";
        name = null;
        int age=19;
        String desc = "hello world, hello java";
        Preconditions.checkNotNull(name, "name may not be null");
        Preconditions.checkArgument(age >= 18 && age < 99, "age must in range (18,99)","aaaaaaaaa");
        Preconditions.checkArgument(desc !=null && desc.length() < 10, "desc too long, max length is ", 10);

    }

    @Test
    public void multimaps() {
        Multimap<String, String> myMultimap = ArrayListMultimap.create();

        // 添加键值对
        myMultimap.put("Fruits", "Bannana");
        //给Fruits元素添加另一个元素
        myMultimap.put("Fruits", "Apple");
        myMultimap.put("Fruits", "Pear");
        myMultimap.put("Vegetables", "Carrot");

        // 获得multimap的size
        int size = myMultimap.size();
        System.out.println(size);  // 4

        // 获得Fruits对应的所有的值
        Collection<String> fruits = myMultimap.get("Fruits");
        System.out.println(fruits); // [Bannana, Apple, Pear]

        Collection<String> vegetables = myMultimap.get("Vegetables");
        System.out.println(vegetables); // [Carrot]

        //遍历Mutlimap
        for(String value : myMultimap.values()) {
            System.out.println(value);
        }

        // Removing a single value
        myMultimap.remove("Fruits","Pear");
        System.out.println(myMultimap.get("Fruits")); // [Bannana, Pear]

        // Remove all values for a key
        myMultimap.removeAll("Fruits");
        System.out.println(myMultimap.get("Fruits")); // [] (Empty Collection!)

    }

    @Test
    public void dealWithStrs() {

        String [] noteTypeKeys = {"0","1","10","11","12","13","14","15","16","17","18","19","2","20","21","22","23","24","25","26","27",
                "28","29","3","30","32","33","34","35","36","37","38","39","4","40","41","42","43","44","5","6","7","8","9","997","998","999"};

        for(String str : noteTypeKeys){

            System.out.println(String.format("%03d", Integer.parseInt(str)));
        }


    }

    @Test
    public void temp() {
        System.out.println(String.format("%0123d",10));
    }

    @Test
    public void getNextDate(){

        SimpleDateFormat dft = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date temp = dft.parse("2019-02-28");
            Calendar cld = Calendar.getInstance();
            cld.setTime(temp);
            cld.add(Calendar.DATE, 1);
            temp = cld.getTime();
            //获得下一天日期字符串
            String nextDay = dft.format(temp);
            System.out.println(nextDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testPoi(){

        /*String[] titles = {"序号","债项方案编号"};
        String[][] centerVal = new String[2][2];
        centerVal[0][0] = "1";
        centerVal[0][1] = "no.1";
        centerVal[1][0] = "2";
        centerVal[1][1] = "no.2";
        ExcelUtils.exportExcel(false,titles,centerVal,null,"测试01");*/
        ExcelUtils.importExcel("G:/temp/test/test.xlsx");
    }

    @Test
    public void distinctStrs() {

        String[] strs = {"id_",
                "zoneno",
                "protseno",
                "subserno",
                "workdate",
                "listno",
                "prinflag",
                "cmprflag",
                "lglockno",
                "trxdate",
                "trxtime",
                "timestmp",
                "postndat",
                "postsdat",
                "posttime",
                "trxsqnb",
                "ptrxsqnb",
                "trxsqns",
                "trxcode",
                "valuedat",
                "currtype",
                "cashexf",
                "catrflag",
                "drcrf",
                "amount",
                "updbal",
                "notetype",
                "notes",
                "revtranf",
                "updtranf",
                "posttype",
                "listtype",
                "recipbkn",
                "recipbka",
                "recipact",
                "recipacs",
                "recipacn",
                "exchrat",
                "forecurr",
                "foreamt",
                "vouhtype",
                "vouhno",
                "mediumid",
                "mediumno",
                "medseno",
                "chnltype",
                "chnlno",
                "prodcode",
                "prodno",
                "prodgpno",
                "trxzno",
                "tphybrno",
                "phybrno",
                "tellerno",
                "authtlno",
                "authno",
                "termid",
                "trxplcs",
                "statcode",
                "create_time",
                "update_time",
                "create_by",
                "update_by",
                "enable_",
                "id_",
                "zoneno",
                "protseno",
                "subserno",
                "workdate",
                "listno",
                "lglockno",
                "currtype",
                "cashexf",
                "termnum",
                "intrate",
                "rlvrate",
                "ovrrate",
                "incirate",
                "ofcirate",
                "taxrate",
                "currint",
                "rlvint",
                "rlvibal",
                "ovramt",
                "ovrbal",
                "ovramtit",
                "inamt",
                "incurbal",
                "inamtit",
                "ofamt",
                "ofcurbal",
                "ofamtit",
                "taxsum",
                "taxamt",
                "taxbal",
                "ntaxamt",
                "ntaxbal",
                "drdoactn",
                "drdoacsn",
                "drdoacta",
                "payactn",
                "payacsn",
                "payacta",
                "create_time",
                "update_time",
                "create_by",
                "update_by",
                "enable_",
                "remark_"};
        Set<String> set = new LinkedHashSet<>();
        for(String str : strs){
                set.add(str);
        }
        List<String> list = new ArrayList<>(set);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
