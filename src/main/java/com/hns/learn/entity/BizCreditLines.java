package com.hns.learn.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@TableName("BIZ_CREDIT_LINES")
public class BizCreditLines extends BaseModel implements Serializable {

	/**
	 * 债项方案id
	 */
	@TableField("DEBT_CODE")
	private String debtCode;
	/**
	 * 客户信息表ID
	 */
	@TableField("BIZ_CUSTOMER_ID")
	private Long customerId;
	/**
	 * 业务表名称（XXD）
	 */
	@TableField("OBJTYP")
	private String objtyp;
	/**
	 * 业务表INR(XXD的ID)
	 */
	@TableField("OBJINR")
	private String objinr;
	/**
	 * 客户编号
	 */
	@TableField("CUST_NO")
	private String 	custNo;
	/**
	 * 额度类型
	 */
	@TableField("AMOUNT_TYPE")
	private String amountType;
	/**
	 * 授信号码
	 */
	@TableField("CREDIT_NO")
	private String 	creditNo;
	/**
	 * 授信额度名称
	 */
	@TableField("CREDIT_LINE_NAME")
	private String creditLineName;
	/**
	 * 额度总金额
	 */
	@TableField("TOTAL_AMOUNT")
	private BigDecimal totalAmount;
	/**
	 * 已用金额
	 */
	@TableField("USED_AMOUNT")
	private BigDecimal usedAmount;
	/**
	 * 可用余额
	 */
	@TableField("AVAILABLE_BALANCE")
	private BigDecimal availableBalance;
	/**
	 * 起始日期
	 */
	@TableField("START_DATE")
	private Date startDate;
	/**
	 * 到期日期
	 */
	@TableField("MATURITY_DATE")
	private Date maturityDate;

	public String getDebtCode() {
		return debtCode == "" ? null : debtCode;
	}

	public void setDebtCode(String debtCode) {
		this.debtCode = debtCode;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getObjtyp() {
		return objtyp == "" ? null : objtyp;
	}

	public void setObjtyp(String objtyp) {
		this.objtyp = objtyp;
	}

	public String getObjinr() {
		return objinr == "" ? null : objinr;
	}

	public void setObjinr(String objinr) {
		this.objinr = objinr;
	}

	public String getCustNo() {
		return custNo == "" ? null : custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public String getAmountType() {
		return amountType == "" ? null : amountType;
	}

	public void setAmountType(String amountType) {
		this.amountType = amountType;
	}

	public String getCreditNo() {
		return creditNo == "" ? null : creditNo;
	}

	public void setCreditNo(String creditNo) {
		this.creditNo = creditNo;
	}

	public String getCreditLineName() {
		return creditLineName == "" ? null : creditLineName;
	}

	public void setCreditLineName(String creditLineName) {
		this.creditLineName = creditLineName;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public BigDecimal getUsedAmount() {
		return usedAmount;
	}

	public void setUsedAmount(BigDecimal usedAmount) {
		this.usedAmount = usedAmount;
	}

	public BigDecimal getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(BigDecimal availableBalance) {
		this.availableBalance = availableBalance;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}

	public BizCreditLines() {
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
				.add("debtCode", debtCode)
				.add("customerId", customerId)
				.add("objtyp", objtyp)
				.add("objinr", objinr)
				.add("custNo", custNo)
				.add("amountType", amountType)
				.add("creditNo", creditNo)
				.add("creditLineName", creditLineName)
				.add("totalAmount", totalAmount)
				.add("usedAmount", usedAmount)
				.add("availableBalance", availableBalance)
				.add("startDate", startDate)
				.add("maturityDate", maturityDate)
				.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof BizCreditLines)) return false;
		BizCreditLines that = (BizCreditLines) o;
		return Objects.equal(getDebtCode(), that.getDebtCode()) &&
				Objects.equal(getCustomerId(), that.getCustomerId()) &&
				Objects.equal(getObjtyp(), that.getObjtyp()) &&
				Objects.equal(getObjinr(), that.getObjinr()) &&
				Objects.equal(getCustNo(), that.getCustNo()) &&
				Objects.equal(getAmountType(), that.getAmountType()) &&
				Objects.equal(getCreditNo(), that.getCreditNo()) &&
				Objects.equal(getCreditLineName(), that.getCreditLineName()) &&
				Objects.equal(getTotalAmount(), that.getTotalAmount()) &&
				Objects.equal(getUsedAmount(), that.getUsedAmount()) &&
				Objects.equal(getAvailableBalance(), that.getAvailableBalance()) &&
				Objects.equal(getStartDate(), that.getStartDate()) &&
				Objects.equal(getMaturityDate(), that.getMaturityDate());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getDebtCode(), getCustomerId(), getObjtyp(), getObjinr(), getCustNo(), getAmountType(), getCreditNo(), getCreditLineName(), getTotalAmount(), getUsedAmount(), getAvailableBalance(), getStartDate(), getMaturityDate());
	}
}
