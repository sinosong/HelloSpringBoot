package com.hns.learn.jaxb;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class Item {

    List<QuotaData> quotaData = new ArrayList();

    @XmlElement(name = "item")
    public List<QuotaData> getQuotaData() {
        return quotaData;
    }

    public void setQuotaData(List<QuotaData> quotaData) {
        this.quotaData = quotaData;
    }

    @Override
    public String toString() {
        return "Item{" +
                "quotaData=" + quotaData +
                '}';
    }
}


