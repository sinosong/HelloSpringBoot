package com.hns.learn;

import org.apache.commons.io.FileUtils;
import org.apache.commons.collections.CollectionUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.Test;

public class ApacheCommons {

    @Test
    public void testFileUtils() {

        String basePath = "G:/temp/test/";

        try {
            FileUtils.copyFile(new File(basePath+"test.xlsx"),new File(basePath+"test.bak.xlsx"));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void testCollections() {

        List<String> list1 = new ArrayList<String>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        List<String> list2 = new ArrayList<String>();
        list2.add("2");
        list2.add("3");
        list2.add("5");
        Collection c = CollectionUtils.retainAll(list1, list2);
        System.out.println(c);

    }

    @Test
    public void testParseLong() {
        Long granttrnid = Long.parseLong("1112603738508587009");
        System.out.println(granttrnid);
    }
}
