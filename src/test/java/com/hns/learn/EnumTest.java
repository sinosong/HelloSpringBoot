package com.hns.learn;

import com.hns.learn.entity.enums.AccrualEnum;
import com.hns.learn.util.ExcelUtils;
import org.junit.Test;

import java.util.*;

public class EnumTest {

    @Test
    public void AccrualTest() {

        String [] strs = {"红色","绿色","白色"};

        List<Map<String,String>> list = new ArrayList();
        Map map1 = new HashMap();
        map1.put("red_","hong");
        map1.put("green_","lv");
        map1.put("white_","bai");
        map1.put("yello_","huang");
        map1.put("black_","hei");
        Map map2 = new HashMap();
        map2.put("red_","hong1");
        map2.put("green_","lv1");
        map2.put("white_","bai1");
        map2.put("yello_","huang1");
        map2.put("black_","hei1");
        list.add(map1);
        list.add(map2);

        String[][] centerVal = new String[list.size()][strs.length];

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < strs.length; j++) {
                centerVal[i][j] = list.get(i).get(AccrualEnum.getFetchKey(strs[j]));
            }
        }
//        System.out.println(Arrays.asList(centerVal));

        ExcelUtils.exportExcel(false,strs,centerVal,null,"枚举导出");

    }
}
