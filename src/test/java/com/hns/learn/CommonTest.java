package com.hns.learn;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.hns.learn.entity.BizFile;
import com.hns.learn.util.ExcelUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class CommonTest {

    @Test
    public void testIp() {

        try {
            InetAddress addr = InetAddress.getLocalHost();
            System.out.println("Local HostAddress:"+addr.getHostAddress());
            String hostname = addr.getHostName();
            System.out.println("Local host name: "+hostname);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testExp() {

        try {
            System.out.println(this.chu());
        } catch (Exception e) {
            System.out.println("Exception****");
            e.printStackTrace();
        }
    }
    public int chu(){
        try {
            int a = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException***");
            e.printStackTrace();
        }
        return 0;
    }

    @Test
    public void testDateU() {

        Date curr = new Date();

        DateUtils.setHours(curr,23);
        DateUtils.setMinutes(curr,59);
        DateUtils.setSeconds(curr,59);

        String dateStr = DateFormatUtils.format(curr,"yyyy-MM-dd HH:mm:ss SSS");

        System.out.println(dateStr);
    }

    @Test
    public void testPoi(){

        String[] titles = {"序号","债项方案编号","hh"};
        String[][] centerVal = new String[3][2];
        centerVal[0][0] = "1";
        centerVal[0][1] = "no.1";
        centerVal[1][0] = "2";
        centerVal[1][1] = "no.2";
        centerVal[2][0] = "3";
        centerVal[2][1] = "no.3";
        ExcelUtils.exportExcel(false,titles,centerVal,null,"测试01");
        ExcelUtils.importExcel("G:/temp/test/test1.xlsx");
    }

    @Test
    public void testBigdecimal() {

        BigDecimal a = new BigDecimal("159512.52552");
        System.out.println(a.multiply(new BigDecimal(-1)).setScale(2,BigDecimal.ROUND_HALF_UP).toString());
        System.out.println(a.multiply(new BigDecimal(-1)));
        System.out.println(a.toString());

    }

    @Test
    public void testdvi() {
        BigDecimal repaymentAmt = new BigDecimal(15);
        BigDecimal sumLimit = new BigDecimal(30);
        BigDecimal xrfAmt = new BigDecimal(5);
        BigDecimal resGrant = new BigDecimal(10);
        repaymentAmt = sumLimit.multiply(xrfAmt).divide(resGrant);

        System.out.println(repaymentAmt);

    }

    @Test
    public void testtrim() {
        String a = "";
        System.out.println(a.trim());
    }

    @Test
    public void tesyIssuDate() {

        Wrapper wrapper = new EntityWrapper<BizFile>().eq("aa","val").in("BIZ_CODE",new String[]{"\'CRP2019060269\'","\'SOV2019060269\'"})
                .orderBy("CREATE_TIME",true);


        System.out.println(wrapper.getSqlSegment());


    }

    @Test
    public void testListToarr() {
        List<Long> rolIdList = new ArrayList<>();
        rolIdList.add(451117558506979333L);
        rolIdList.add(1137970775441092609L);

        Long [] ids = rolIdList.toArray(new Long[rolIdList.size()]);
        System.out.println(ids);

        List<Long> list = new ArrayList<Long>(Arrays.asList(ids));

        System.out.println(list);
    }
}
