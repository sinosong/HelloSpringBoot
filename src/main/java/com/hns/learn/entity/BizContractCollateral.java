package com.hns.learn.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 描述：担保合同与抵质押物表
 */

@TableName("BIZ_CONTRACT_COLLATERAL")
@SuppressWarnings("serial")
public class BizContractCollateral extends BaseModel implements Serializable {


    /**
     * 债项方案id
     */
    @TableField("DEBT_CODE")
    private String debtCode;
    /**
     * 担保合同编号
     */
    @TableField("GUAR_NO")
    private String guarNo;
    /**
     * 押品编号
     */
    @TableField("CLTNO")
    private String cltNO;
    /**
     * 押品信息描述
     */
    @TableField("PRODUCT_INFORMATION")
    private String productInformation;
    /**
     * 担保id
     */
    @TableField("GUAR_ID")
    private String guarId;
    /**
     * 担保合同id
     */
    @TableField("GUAR_CONTRACT_ID")
    private String guarContractId;
    /**
     * 押品概要信息id
     */
    @TableField("COLLATERAL_ID")
    private String collateralID;
    /**
     * 原押品占用可担保金额（变更时使用）
     */
    @TableField(exist = false)
    private BigDecimal oldUseAmount;
    /**
     * 变动方式（变更时使用，1-增额 2-减额 ）
     */
    @TableField("CHANGE_TYPE")
    private String changeType;
    /**
     * 变动金额
     */
    @TableField("CHANGE_AMOUNT")
    private BigDecimal changeAmount;
    /**
     * 本次可担保价值/变更后本次可担保金额
     */
    @TableField("USE_AMOUNT")
    private BigDecimal useAmount;
    /**
     * 是否错币
     */
    @TableField("ISCCYCD")
    private Long isCcyCd;
    /** 审批抵质押率(0-1) */
    @TableField("APPROVALLTVRT")
    private BigDecimal approvalLtvRt;
    /**
     * 是否先放款后入库
     */
    @TableField("ISLOANFIRST")
    private Long isLoanFirst;
    /**
     * 押品信息
     */
    @TableField(exist = false)
    @JSONField(serialzeFeatures = SerializerFeature.DisableCircularReferenceDetect)
    private GmsColcollBaseinfo gmsColcollBaseinfo;
    /**
     * 押品价值信息
     */
    @TableField(exist = false)
    private GmsColValueinfo gmsColValueinfo;

    public GmsColValueinfo getGmsColValueinfo() {
        return gmsColValueinfo;
    }

    public void setGmsColValueinfo(GmsColValueinfo gmsColValueinfo) {
        this.gmsColValueinfo = gmsColValueinfo;
    }

    public Long getIsLoanFirst() {
        return isLoanFirst;
    }

    public void setIsLoanFirst(Long isLoanFirst) {
        this.isLoanFirst = isLoanFirst;
    }

    public Long getIsCcyCd() {
        return isCcyCd;
    }

    public void setIsCcyCd(Long isCcyCd) {
        this.isCcyCd = isCcyCd;
    }

    public BigDecimal getApprovalLtvRt() {
        return approvalLtvRt;
    }

    public void setApprovalLtvRt(BigDecimal approvalLtvRt) {
        this.approvalLtvRt = approvalLtvRt;
    }

    public String getCltNO() {
        return cltNO;
    }

    public void setCltNO(String cltNO) {
        this.cltNO = cltNO;
    }

    public String getGuarId() {
        return guarId;
    }

    public void setGuarId(String guarId) {
        this.guarId = guarId;
    }

    public String getDebtCode() {
        return debtCode == "" ? null : debtCode;
    }

    public void setDebtCode(String debtCode) {
        this.debtCode = debtCode;
    }

    public String getGuarNo() {
        return guarNo == "" ? null : guarNo;
    }

    public void setGuarNo(String guarNo) {
        this.guarNo = guarNo;
    }

    public String getProductInformation() {
        return productInformation == "" ? null : productInformation;
    }

    public void setProductInformation(String productInformation) {
        this.productInformation = productInformation;
    }

    public String getGuarContractId() {
        return guarContractId;
    }

    public void setGuarContractId(String guarContractId) {
        this.guarContractId = guarContractId;
    }

    public String getCollateralID() {
        return collateralID;
    }

    public void setCollateralID(String collateralID) {
        this.collateralID = collateralID;
    }

    public BigDecimal getOldUseAmount() {
        return oldUseAmount;
    }

    public void setOldUseAmount(BigDecimal oldUseAmount) {
        this.oldUseAmount = oldUseAmount;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public BigDecimal getChangeAmount() {
        return changeAmount;
    }

    public void setChangeAmount(BigDecimal changeAmount) {
        this.changeAmount = changeAmount;
    }

    public BigDecimal getUseAmount() {
        return useAmount;
    }

    public void setUseAmount(BigDecimal useAmount) {
        this.useAmount = useAmount;
    }

    public GmsColcollBaseinfo getGmsColcollBaseinfo() {
        return gmsColcollBaseinfo;
    }

    public void setGmsColcollBaseinfo(GmsColcollBaseinfo gmsColcollBaseinfo) {
        this.gmsColcollBaseinfo = gmsColcollBaseinfo;
    }

    public BizContractCollateral() {
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("debtCode", debtCode)
                .add("guarNo", guarNo)
                .add("cltNO", cltNO)
                .add("productInformation", productInformation)
                .add("guarId", guarId)
                .add("guarContractId", guarContractId)
                .add("collateralID", collateralID)
                .add("oldUseAmount", oldUseAmount)
                .add("changeType", changeType)
                .add("isLoanFirst", isLoanFirst)
                .add("changeAmount", changeAmount)
                .add("useAmount", useAmount)
                .add("isCcyCd", isCcyCd)
                .add("approvalLtvRt", approvalLtvRt)
                .add("gmsColcollBaseinfo", gmsColcollBaseinfo)
                .add("gmsColValueinfo", gmsColValueinfo)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BizContractCollateral)) return false;
        BizContractCollateral that = (BizContractCollateral) o;
        return Objects.equal(getDebtCode(), that.getDebtCode()) &&
                Objects.equal(getGuarNo(), that.getGuarNo()) &&
                Objects.equal(getCltNO(), that.getCltNO()) &&
                Objects.equal(getProductInformation(), that.getProductInformation())&&
                Objects.equal(getGuarId(), that.getGuarId())&&
                Objects.equal(getGuarContractId(), that.getGuarContractId())&&
                Objects.equal(getCollateralID(), that.getCollateralID())&&
                Objects.equal(getChangeType(), that.getChangeType())&&
                Objects.equal(getChangeAmount(), that.getChangeAmount())&&
                Objects.equal(getIsCcyCd(), that.getIsCcyCd())&&
                Objects.equal(getIsLoanFirst(), that.getIsLoanFirst())&&
                Objects.equal(getApprovalLtvRt(), that.getApprovalLtvRt())&&
                Objects.equal(getUseAmount(), that.getUseAmount());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getDebtCode(), getGuarNo(), getCltNO(), getProductInformation(), getGuarId(), getGuarContractId(), getCollateralID(), getChangeType(), getChangeAmount(),getIsCcyCd(),getIsLoanFirst(),getApprovalLtvRt(), getUseAmount());
    }
}
