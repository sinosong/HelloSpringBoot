package com.hns.learn;

import com.hns.learn.util.ExcelUtils;
import org.junit.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CommonTest {


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

}
