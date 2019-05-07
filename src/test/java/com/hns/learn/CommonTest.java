package com.hns.learn;

import com.hns.learn.util.ExcelUtils;
import org.junit.Test;

import java.math.BigDecimal;

public class CommonTest {

    @Test
    public void testPoi(){

        /*String[] titles = {"序号","债项方案编号"};
        String[][] centerVal = new String[2][2];
        centerVal[0][0] = "1";
        centerVal[0][1] = "no.1";
        centerVal[1][0] = "2";
        centerVal[1][1] = "no.2";
        ExcelUtils.exportExcel(false,titles,centerVal,null,"测试01");*/
        ExcelUtils.importExcel("G:/temp/test/test1.xlsx");
    }

    @Test
    public void testBigdecimal() {

        BigDecimal a = new BigDecimal("159512.52552");
        System.out.println(a.multiply(new BigDecimal(-1)).setScale(2,BigDecimal.ROUND_HALF_UP).toString());
        System.out.println(a.multiply(new BigDecimal(-1)));
        System.out.println(a.toString());

    }
}
