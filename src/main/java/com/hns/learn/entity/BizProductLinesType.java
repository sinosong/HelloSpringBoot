package com.hns.learn.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.io.Serializable;

/**
 * 描述:业务品种与额度类型关系表
 * 
 * @author xiaoshuiquan
 * @date 2018/06/19
 */

@TableName("BIZ_PRODUCT_LINESTYPE")
public class BizProductLinesType extends BaseModel implements Serializable {

	/**
	 * 债项方案id
	 */
	@TableField("DEBT_CODE")
	private String debtCode;
	/**
	 * 业务品种编号（细类）
	 */
	@TableField("BUSINESS_TYPE")
	private String businessType;
	/**
	 * 客户编号(核心系统用户编码)
	 */
	@TableField("CUST_NO")
	private String custNo;
	/**
	 * 授信额度信息外键
	 */
	@TableField("BIZ_CREDIT_LINES_ID")
	private String creditLinesId;
	/**
	 * 产品用信比例
	 */
	@TableField("CREDIT_RATIO")
	private String creditRatio;

	/**
	 * 业务表名称 单一产品规则表 表名
	 *
	 */
	@TableField("OBJTYP")
	private String objtyp;
	/**
	 * 业务表INR  单一产品规则表主键
	 */
	@TableField("OBJINR")
	private String objinr;


	public String getDebtCode() {
		return debtCode == "" ? null : debtCode;
	}

	public void setDebtCode(String debtCode) {
		this.debtCode = debtCode;
	}

	public String getBusinessType() {
		return businessType == "" ? null : businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getCustNo() {
		return custNo == "" ? null : custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public String getCreditLinesId() {
		return creditLinesId == "" ? null : creditLinesId;
	}

	public void setCreditLinesId(String creditLinesId) {
		this.creditLinesId = creditLinesId;
	}

	public String getCreditRatio() {
		return creditRatio == "" ? null : creditRatio;
	}

	public void setCreditRatio(String creditRatio) {
		this.creditRatio = creditRatio;
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

	public BizProductLinesType() {
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof BizProductLinesType)) return false;
		BizProductLinesType that = (BizProductLinesType) o;
		return Objects.equal(getDebtCode(), that.getDebtCode()) &&
				Objects.equal(getBusinessType(), that.getBusinessType()) &&
				Objects.equal(getCustNo(), that.getCustNo()) &&
				Objects.equal(getCreditLinesId(), that.getCreditLinesId()) &&
				Objects.equal(getCreditRatio(), that.getCreditRatio()) &&
				Objects.equal(getObjtyp(), that.getObjtyp()) &&
				Objects.equal(getObjinr(), that.getObjinr());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getDebtCode(), getBusinessType(), getCustNo(), getCreditLinesId(), getCreditRatio(), getObjtyp(), getObjinr());
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
				.add("debtCode", debtCode)
				.add("businessType", businessType)
				.add("custNo", custNo)
				.add("creditLinesId", creditLinesId)
				.add("creditRatio", creditRatio)
				.add("objtyp", objtyp)
				.add("objinr", objinr)
				.toString();
	}
}