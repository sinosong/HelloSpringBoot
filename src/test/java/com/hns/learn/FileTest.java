package com.hns.learn;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Ordering;
import com.hns.learn.entity.InfAccrual;
import com.hns.learn.entity.enums.AccrualExportEnum;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FileTest {



    @Test
    public void readLinse() {

        File file = new File("G:/temp/test/rea.txt");
        try {
            List<String> list = FileUtils.readLines(file,"UTF-8");
            List<String> strList = new ArrayList();
            f:
            for(String str : list){
               boolean a = false;
                for(char c : str.toCharArray()){
//                    if(Character.isUpperCase(c)){
                    if(Character.isLowerCase(c)){
//                        continue f;
                        a = true;
                    }
                }

                if(!a){
                    str  = str.toLowerCase();
                }

                strList.add(str);
            }

            Comparator<String> byCode = new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            };
            List<String> sortedCopy = Ordering.from(byCode).sortedCopy(strList);

            for(String str : sortedCopy){

                String t = "@TableField(\""+str.toUpperCase()+"\")";
                System.out.println(t);
                System.out.println("private String "+str+";");

//                System.out.println(str + " VARCHAR2(500),");

                //comment on column INF_ACCRUAL.BIZ_ID is '业务主表主键';
               /* System.out.print("comment on column INF_COMPREHENSIVE."+str.toUpperCase()+" ");
                System.out.print(" is '");
                AccrualExportEnum en = AccrualExportEnum.fetchEnumByKey(str);
                System.out.print(en==null?null:en.getName());
                System.out.print("';");
                System.out.println();*/
//                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
