package com.hns.learn;

import com.hns.learn.util.ExcelUtils;
import org.junit.Test;

public class testPOI {


    @Test
    public void importExcel() {

        ExcelUtils.readExcel("/Users/sinosong/Documents/Excel/押品分类码表.xlsx");


    }
}
