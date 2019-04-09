package com.hns.learn;

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

}
