package com.hns.learn.temp;

import org.junit.Test;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author : hannasong
 * @version : 1.0
 * @date : Created in 3:08 下午 2019/10/9
 * @description : 测试
 */
public class Temp {

    public static void main1(String[] args) {

        String bathPath = "/Users/sinosong/share/temp/";
        long sTime = System.currentTimeMillis();
        long fileSize = 0;
        try(
                FileChannel inChannel = FileChannel.open(Paths.get(bathPath + "tmp1.big"),
                        StandardOpenOption.READ);
                FileChannel outChannel = FileChannel.open(Paths.get(bathPath + "tmp2-copy.big"),
                        StandardOpenOption.READ,StandardOpenOption.WRITE,StandardOpenOption.CREATE_NEW);
        ) {
            fileSize = inChannel.size() / 1024 / 1024;
            inChannel.transferTo(0,inChannel.size(),outChannel);
//            outChannel.transferFrom(inChannel,0,inChannel.size());
        } catch (IOException e) {
            e.printStackTrace();
        }

        long ms = System.currentTimeMillis() - sTime;
        System.out.println("exec  " + ms + " ms");
        System.out.println("speed " + fileSize/(ms/1000) + " M/S");


    }

    public static void main(String[] args)  {

        JFrame jf = new JFrame("这是一个JFrame窗体");        // 实例化一个JFrame对象
        jf.setVisible(true);        // 设置窗体可视
        jf.setSize(500, 350);        // 设置窗体大小
//        jf.setBackground(Color.DARK_GRAY);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);        // 设置窗体关闭方式

    }

    @Test
    public void readtxt() {

        String path = "/Users/sinosong/tempForder/方案编号.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String tempString = null;
            while ((tempString = br.readLine()) != null){
                String [] strs1 = tempString.split(" ");
                String [] strs2 = strs1[0].split("\\.");
                //select count(*) count from (select distinct DEBT_CODE from BIZ_DEBT_GRANT) t union all
                System.out.println("select count(*) count from (select distinct "+strs2[1]+" from "+strs2[0]+") t union all");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
