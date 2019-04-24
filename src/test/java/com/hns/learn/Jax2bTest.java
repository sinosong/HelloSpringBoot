package com.hns.learn;

import com.hns.learn.entity.BizCanvas;
import com.hns.learn.util.Jax2bUtil;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.Test;

import java.io.*;
import java.util.Date;

public class Jax2bTest {

    @Test
    public void toXmlTest() {

        String encode = "GB18030";
        BizCanvas canvas = new BizCanvas("aaa","bbb","ccc",new Date());
        String xmlStr = Jax2bUtil.toXml(canvas,encode);
        System.out.println(xmlStr);
        try {
            FileUtils.writeStringToFile(new File("G:/temp/test/"+DateFormatUtils.format(new Date(),"yyyyMMddHHmmssSSS") +".xml"),xmlStr,encode);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
