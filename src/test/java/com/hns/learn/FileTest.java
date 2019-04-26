package com.hns.learn;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Ordering;
import com.hns.learn.entity.InfAccrual;
import com.hns.learn.entity.InfComprehensive;
import com.hns.learn.entity.enums.AccrualExportEnum;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FileTest {

    @Test
    public void getEntityInfo() {

        List<Field> fields = Arrays.asList(InfComprehensive.class.getDeclaredFields());
        f:
        for(Field f : fields){
            String name = f.getName();
            boolean a =false;
            for(char c : name.toCharArray()){
                    if(Character.isUpperCase(c)){
//                if(Character.isLowerCase(c)){
//                        continue f;
                    a = true;
                }
            }
            if(a)
                System.out.println(name);
        }
    }

    @Test
    public void fetchLines() {

        try {
            List<Object[]> list = new ArrayList<>();
            for(AccrualExportEnum en :AccrualExportEnum.values()){
                Object obj[] = new Object[2];
                obj[0] = en.getIndex();
                obj[1] = en.getKey();
                list.add(obj);
            }
            List<String> strList = new ArrayList<>();
            f:
            for(Object[] obj : list){
                boolean a = false;
                int index = (int)obj[0];
                String key = (String)obj[1];

                for(char c : key.toCharArray()){
//                    if(Character.isUpperCase(c)){
                    if(Character.isLowerCase(c)){
//                        continue f;
                        a = true;
                    }
                }

                if(!a){
//                    str  = str.toLowerCase();
//                    AFRLNDTL_ID_(1, "主键", "ID_","STRING")
                    AccrualExportEnum e = AccrualExportEnum.fetchEnum(index);
//                    strList.add(e.name()+"--"+e.getKey());
                    strList.add(e.name()+"("+e.getIndex()+",\""+e.getName()+"\",\""+e.getKey().toLowerCase()+"\",\""+e.getType()+"\"),");
                }else{
                    AccrualExportEnum e = AccrualExportEnum.fetchEnum(index);
                    strList.add(e.name()+"("+e.getIndex()+",\""+e.getName()+"\",\""+e.getKey()+"\",\""+e.getType()+"\"),");
                }
//                strList.add(str);
            }

            Comparator<String> byCode = new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    o1 = StringUtils.substringBetween(o1,"(",",");
                    o2 = StringUtils.substringBetween(o2,"(",",");
                    return Integer.parseInt(o1)-Integer.parseInt(o2);
                }
            };
            List<String> sortedCopy = Ordering.from(byCode).sortedCopy(strList);

            for(String str : sortedCopy){

                System.out.println(str);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void readLines() {

        File file = new File("G:/temp/test/rea2.txt");
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

    @Test
    public void readLines2() {

        File file = new File("G:/temp/test/rea2.txt");
        try {
            List<String> list = FileUtils.readLines(file,"UTF-8");

            List<String> namList = new ArrayList();

            for(String str : list){
                try {
                    namList.add(AccrualExportEnum.fetchEnum(str).getKey());
                } catch (Exception e) {
                    System.err.println(str);
                }
            }

            Comparator<String> byCode = new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            };

            List<String> sortedCopy = Ordering.from(byCode).sortedCopy(namList);

            for(String str : sortedCopy){

                System.out.println(str.toUpperCase());


            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
