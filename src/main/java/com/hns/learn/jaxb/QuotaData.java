package com.hns.learn.jaxb;

import javax.xml.bind.annotation.XmlElement;

public class QuotaData {

    /**
     * 额度变更类型（占用、过期、释放）
     */
    private String QuotaStatusType;
    /**
     * 额度申领编号
     */
    private String QuotaApplyCode;
    /**
     * 业务编号
     */
    private String BusinessCode;
    /**
     * 占用额度金额
     */
    private String PreoccupancyTotalAmt;
    /**
     * 未释放额度余额
     */
    private String UnreleasedBalance;

    public QuotaData() {
    }

    public QuotaData(String quotaStatusType, String quotaApplyCode, String businessCode, String preoccupancyTotalAmt, String unreleasedBalance) {
        QuotaStatusType = quotaStatusType;
        QuotaApplyCode = quotaApplyCode;
        BusinessCode = businessCode;
        PreoccupancyTotalAmt = preoccupancyTotalAmt;
        UnreleasedBalance = unreleasedBalance;
    }

    @XmlElement(name = "QuotaStatusType")
    public String getQuotaStatusType() {
        return QuotaStatusType;
    }

    public void setQuotaStatusType(String quotaStatusType) {
        QuotaStatusType = quotaStatusType;
    }

    @XmlElement(name = "QuotaApplyCode")
    public String getQuotaApplyCode() {
        return QuotaApplyCode;
    }

    public void setQuotaApplyCode(String quotaApplyCode) {
        QuotaApplyCode = quotaApplyCode;
    }

    @XmlElement(name = "BusinessCode")
    public String getBusinessCode() {
        return BusinessCode;
    }

    public void setBusinessCode(String businessCode) {
        BusinessCode = businessCode;
    }

    @XmlElement(name = "PreoccupancyTotalAmt")
    public String getPreoccupancyTotalAmt() {
        return PreoccupancyTotalAmt;
    }

    public void setPreoccupancyTotalAmt(String preoccupancyTotalAmt) {
        PreoccupancyTotalAmt = preoccupancyTotalAmt;
    }

    @XmlElement(name = "UnreleasedBalance")
    public String getUnreleasedBalance() {
        return UnreleasedBalance;
    }

    public void setUnreleasedBalance(String unreleasedBalance) {
        UnreleasedBalance = unreleasedBalance;
    }

    @Override
    public String toString() {
        return "ReqBody{" +
                "QuotaStatusType='" + QuotaStatusType + '\'' +
                ", QuotaApplyCode='" + QuotaApplyCode + '\'' +
                ", BusinessCode='" + BusinessCode + '\'' +
                ", PreoccupancyTotalAmt='" + PreoccupancyTotalAmt + '\'' +
                ", UnreleasedBalance='" + UnreleasedBalance + '\'' +
                '}';
    }
}


