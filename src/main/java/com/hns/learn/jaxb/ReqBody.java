package com.hns.learn.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "ReqBody")
public class ReqBody {

    List<QuotaData> reqBodyList = new ArrayList();

    @XmlElement(name = "item")
    @XmlElementWrapper(name = "QuotaList")
    public List<QuotaData> getReqBodyList() {
        return reqBodyList;
    }

    public void setReqBodyList(List<QuotaData> reqBodyList) {
        this.reqBodyList = reqBodyList;
    }

    @Override
    public String toString() {
        return "ReqBody{" +
                "quotaData=" + reqBodyList +
                '}';
    }
}


