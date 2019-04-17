package com.hns.learn;

import com.hns.learn.util.ExcelUtils;
import org.junit.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CommonTest {

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
