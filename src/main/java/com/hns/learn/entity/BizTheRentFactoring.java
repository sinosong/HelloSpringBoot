package com.hns.learn.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.io.Serializable;

/**
 * 描述：租金保理
 * @author sinosong
 */
@TableName("BIZ_RENTAL_FACTORING_KEY")
public class BizTheRentFactoring extends BaseModel implements Serializable {

	/**
	 * 业务编号
	 */
	@TableField("DEBT_CODE")
	private String debtCode;
	/**
	 * 产品种类
	 */
	@TableField("BUSINESS_TYPES")
	private String businessTypes;
	/**
	 * 客户编号
	 */
	@TableField("CUST_NO")
	private String custNo;
	/**
	 * 容忍期
	 */
	@TableField("TOLERANCE_PERIOD")
	private Long tolerancePertod;

	/**
	 * 承租人是否地方政府融资平台
	 */
	@TableField("FINANCE_PLATFORM")
	private String financePlatform;
	/**
	 * 客户名称
	 */
	@TableField("CUST_NAME")
	private String custName;

	/**
	 * 客户评级
	 */
	@TableField("CUST_TATING")
	private String custTating;

	public String getDebtCode() {
		return debtCode == "" ? null : debtCode;
	}

	public void setDebtCode(String debtCode) {
		this.debtCode = debtCode;
	}

	public String getBusinessTypes() {
		return businessTypes == "" ? null : businessTypes;
	}

	public void setBusinessTypes(String businessTypes) {
		this.businessTypes = businessTypes;
	}

	public String getCustNo() {
		return custNo == "" ? null : custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public Long getTolerancePertod() {
		return tolerancePertod;
	}

	public void setTolerancePertod(Long tolerancePertod) {
		this.tolerancePertod = tolerancePertod;
	}

	public String getFinancePlatform() {
		return financePlatform == "" ? null : financePlatform;
	}

	public void setFinancePlatform(String financePlatform) {
		this.financePlatform = financePlatform;
	}

	public String getCustName() {
		return custName == "" ? null : custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustTating() {
		return custTating == "" ? null : custTating;
	}

	public void setCustTating(String custTating) {
		this.custTating = custTating;
	}

	public BizTheRentFactoring() {
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
				.add("debtCode", debtCode)
				.add("businessTypes", businessTypes)
				.add("custNo", custNo)
				.add("tolerancePertod", tolerancePertod)
				.add("financePlatform", financePlatform)
				.add("custName", custName)
				.add("custTating", custTating)
				.toString();
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BizTheRentFactoring)) return false;
        BizTheRentFactoring that = (BizTheRentFactoring) o;
        return Objects.equal(getDebtCode(), that.getDebtCode()) &&
                Objects.equal(getBusinessTypes(), that.getBusinessTypes()) &&
                Objects.equal(getCustNo(), that.getCustNo()) &&
                Objects.equal(getTolerancePertod(), that.getTolerancePertod()) &&
                Objects.equal(getFinancePlatform(), that.getFinancePlatform()) &&
                Objects.equal(getCustName(), that.getCustName()) &&
                Objects.equal(getCustTating(), that.getCustTating());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getDebtCode(), getBusinessTypes(), getCustNo(), getTolerancePertod(), getFinancePlatform(), getCustName(), getCustTating());
    }
}