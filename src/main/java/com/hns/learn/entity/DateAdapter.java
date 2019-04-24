package com.hns.learn.entity;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.Date;

/**
 * 日期转换
 * @author hannasong
 */
public class DateAdapter extends XmlAdapter<String, Date> {

    protected DateAdapter() {}

    private String pattern = "yyyy-MM-dd HH:mm:ss";

    @Override
    public Date unmarshal(String dateStr) throws Exception {
        return DateUtils.parseDate(pattern,dateStr);
    }

    @Override
    public String marshal(Date date) throws Exception {
        return DateFormatUtils.format(new Date(),pattern);
    }
}
