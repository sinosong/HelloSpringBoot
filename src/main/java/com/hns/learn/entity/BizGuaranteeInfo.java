package com.hns.learn.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 描述：担保信息表
 *
 * @author xiaoshuiquan
 * @date 2018/07/17
 */

@TableName("BIZ_GUARANTEE_INFO")
@SuppressWarnings("serial")
public class BizGuaranteeInfo extends BaseModel implements Serializable {

    /**
     * 债项方案id
     */
    @TableField("DEBT_CODE")
    private String debtCode;
    /**
     * 基础担保类型（分）
     */
    @TableField("TYPE_POINT")
    private String typePoint;
    /**
     * 担保合同类型/占用额度类型
     */
    @TableField("GUARANTEE_CONTRACT_TYPE")
    private String guaranteeContractType;
    /**
     * 担保合同编号
     */
    @TableField("WARRANTY_CONTRACT_NUMBER")
    private String warrantyContractNumber;
    /**
     * 担保人
     */
    @TableField("GUARANTOR")
    private String guarantor;
    /**
     * 担保人客户编号
     */
    @TableField("GUARANTOR_CUST_ID")
    private String guarantorCustId;
    /**
     * 被担保人
     */
    @TableField("WARRANTEE")
    private String warrantee;
    /**
     * 被担保人客户编号
     */
    @TableField("WARRANTEE_CUST_ID")
    private String warranteeCustId;
    /**
     * 担保币种
     */
    @TableField("CURRENCY_GUARANTEE")
    private String currencyGuarantee;
    /**
     * 担保金额
     */
    @TableField("GUARANTEE_AMOUNT")
    private BigDecimal guaranteeAmount;
    /**
     * 担保使用产品
     */
    @TableField("GUARANTEED_USE_PRODUCT")
    private String guaranteedUseProduct;
    /**
     * 担保方式类型
     */
    @TableField("GUAR_MART_TYPE")
    private String guarmartType;
    /**
     * 备注
     */
    @TableField("NOTE_")
    private String note;
    /**
     * 是否先放款后入库
     */
    @TableField("ISLOANFIRST")
    private Long isLoanFirst;
    /**
     * 风险分析中的押品信息
     */
    @TableField(exist = false)
    private List<BizContractCollateral> betInformationList;

    public Long getIsLoanFirst() {
        return isLoanFirst;
    }

    public void setIsLoanFirst(Long isLoanFirst) {
        this.isLoanFirst = isLoanFirst;
    }

    public String getDebtCode() {
        return debtCode == null ? "" : debtCode;
    }

    public void setDebtCode(String debtCode) {
        this.debtCode = debtCode;
    }

    public String getTypePoint() {
        return typePoint == null ? "" : typePoint;
    }

    public void setTypePoint(String typePoint) {
        this.typePoint = typePoint;
    }

    public String getGuaranteeContractType() {
        return guaranteeContractType == null ? "" : guaranteeContractType;
    }

    public void setGuaranteeContractType(String guaranteeContractType) {
        this.guaranteeContractType = guaranteeContractType;
    }

    public String getWarrantyContractNumber() {
        return warrantyContractNumber == null ? "" : warrantyContractNumber;
    }

    public void setWarrantyContractNumber(String warrantyContractNumber) {
        this.warrantyContractNumber = warrantyContractNumber;
    }

    public String getGuarantor() {
        return guarantor == null ? "" : guarantor;
    }

    public void setGuarantor(String guarantor) {
        this.guarantor = guarantor;
    }

    public String getGuarantorCustId() {
        return guarantorCustId == null ? "" : guarantorCustId;
    }

    public void setGuarantorCustId(String guarantorCustId) {
        this.guarantorCustId = guarantorCustId;
    }

    public String getWarrantee() {
        return warrantee == null ? "" : warrantee;
    }

    public void setWarrantee(String warrantee) {
        this.warrantee = warrantee;
    }

    public String getWarranteeCustId() {
        return warranteeCustId == null ? "" : warranteeCustId;
    }

    public void setWarranteeCustId(String warranteeCustId) {
        this.warranteeCustId = warranteeCustId;
    }

    public String getCurrencyGuarantee() {
        return currencyGuarantee == null ? "" : currencyGuarantee;
    }

    public void setCurrencyGuarantee(String currencyGuarantee) {
        this.currencyGuarantee = currencyGuarantee;
    }

    public BigDecimal getGuaranteeAmount() {
        return guaranteeAmount;
    }

    public void setGuaranteeAmount(BigDecimal guaranteeAmount) {
        this.guaranteeAmount = guaranteeAmount;
    }

    public String getGuaranteedUseProduct() {
        return guaranteedUseProduct == null ? "" : guaranteedUseProduct;
    }

    public void setGuaranteedUseProduct(String guaranteedUseProduct) {
        this.guaranteedUseProduct = guaranteedUseProduct;
    }

    public String getGuarmartType() {
        return guarmartType == null ? "" : guarmartType;
    }

    public void setGuarmartType(String guarmartType) {
        this.guarmartType = guarmartType;
    }

    public String getNote() {
        return note == null ? "" : note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<BizContractCollateral> getBetInformationList() {
        return betInformationList;
    }

    public void setBetInformationList(List<BizContractCollateral> betInformationList) {
        this.betInformationList = betInformationList;
    }

    public BizGuaranteeInfo() {}

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("debtCode", debtCode)
                .add("typePoint", typePoint)
                .add("guaranteeContractType", guaranteeContractType)
                .add("warrantyContractNumber", warrantyContractNumber)
                .add("guarantor", guarantor)
                .add("guarantorCustId", guarantorCustId)
                .add("warrantee", warrantee)
                .add("warranteeCustId", warranteeCustId)
                .add("currencyGuarantee", currencyGuarantee)
                .add("guaranteeAmount", guaranteeAmount)
                .add("guaranteedUseProduct", guaranteedUseProduct)
                .add("guarmartType", guarmartType)
                .add("note", note)
                .add("isLoanFirst",isLoanFirst)
                .add("betInformationList", betInformationList)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BizGuaranteeInfo)) return false;
        BizGuaranteeInfo that = (BizGuaranteeInfo) o;
        return Objects.equal(getDebtCode(), that.getDebtCode()) &&
                Objects.equal(getTypePoint(), that.getTypePoint()) &&
                Objects.equal(getGuaranteeContractType(), that.getGuaranteeContractType()) &&
                Objects.equal(getWarrantyContractNumber(), that.getWarrantyContractNumber()) &&
                Objects.equal(getGuarantor(), that.getGuarantor()) &&
                Objects.equal(getGuarantorCustId(), that.getGuarantorCustId()) &&
                Objects.equal(getWarrantee(), that.getWarrantee()) &&
                Objects.equal(getWarranteeCustId(), that.getWarranteeCustId()) &&
                Objects.equal(getCurrencyGuarantee(), that.getCurrencyGuarantee()) &&
                Objects.equal(getGuaranteeAmount(), that.getGuaranteeAmount()) &&
                Objects.equal(getGuaranteedUseProduct(), that.getGuaranteedUseProduct()) &&
                Objects.equal(getGuarmartType(), that.getGuarmartType()) &&
                Objects.equal(getIsLoanFirst(), that.getIsLoanFirst()) &&
                Objects.equal(getNote(), that.getNote());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getDebtCode(), getTypePoint(), getGuaranteeContractType(), getWarrantyContractNumber(), getGuarantor(), getGuarantorCustId(), getWarrantee(), getWarranteeCustId(), getCurrencyGuarantee(), getGuaranteeAmount(), getGuaranteedUseProduct(),getIsLoanFirst(), getGuarmartType(), getNote());
    }
}
