/**
 * 
 */
package com.hns.learn.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.io.Serializable;
import java.util.Date;

/**
 * 功能：放款
 * 
 * @author czm 
 * 日期：2018/7/6
 */
@TableName("BIZ_MAKE_LOANS")
@SuppressWarnings("serial")
public class BizMakeLoans extends BaseModel implements Serializable {
	/**
	 * 债项方案编码
	 */
	@TableField("DEBT_CODE")
	private String debtCode;
	/**
	 * 产品种类（二级分类）
	 */
	@TableField("BUSINESS_TYPES")
	private String businessTypes;
	/**
	 * 发放债项申请编号
	 */
	@TableField("GRANT_CODE")
	private String grantCode;
	/**
	 * 项目名称
	 */
	@TableField("PROJECT_NAME")
	private String projectName;
	/**
	 * 产品名称
	 */
	@TableField("PRODUCT_NAME")
	private String productName;

	/**
	 * 申请人
	 */
	@TableField("PROPOSER")
	private String proposer;
	/**
	 * 申请人客户号
	 */
	@TableField("PROPOSER_NUM")
	private Long proposerNum;

	/**
	 * 信贷员/客户经理id
	 */
	@TableField("BANKTELL_ID")
	private Long bankTellId;
	/**
	 * 信贷员/客户经理名称
	 */
	@TableField("BANKTELL_NAME")
	private String bankTellName;

	/**
	 * 信贷员/客户经理部门id
	 */
	@TableField("DEPT_CODE")
	private String deptCode;
	/**
	 * 信贷员/客户经理部门名称
	 */
	@TableField("DEPT_NAME")
	private String deptName;
	/**
	 * 信贷员/客户经理部门名称
	 */
	@TableField("SCOPE_BUSIN_PERIOD")
	private Integer scopeBusinPeriod;

	/**
	 * 国结业务编号
	 */
	@TableField("ISS_NO")
	private String issNo;
	/**
	 * 租金保理核心业务编号
	 */
	@TableField("FRS_NO")
	private String frsNo;
	/**
	 * 放款日期
	 */
	@TableField("DATE_OF_LOAN")
	private Date dateOfLoan;
	/**
	 * 起息日
	 */
	@TableField("VALUE_DATE")
	private Date valueDate;
	/**
	 * 到期日
	 */
	@TableField("DUE_DATE")
	private Date dueDate;
	/**
	 * 宽限期
	 */
	@TableField("GRACE_PERIOD")
	private Long gracePeriod;
	/**
	 * 容忍期
	 */
	@TableField("TOIERANCE_PERIOD")
	private Long toierancePeriod;
	/**
	 * 经办机构编码
	 */
	@TableField("INSTITUTION_CODE")
	private String institutionCode;
	/**
	 * 介质识别号
	 */
	@TableField("IDENT_NUMBER")
	private String identNumber;
	/**
	 * 协议编号
	 */
	@TableField("PROTSENO")
	private String protseNo;
	/**
	 * 协议子序号
	 */
	@TableField("SUBSERNO")
	private String subserNo;
	/**
	 * 明细序号
	 */
	@TableField("LISTNO")
	private String listNo;


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

	public String getGrantCode() {
		return grantCode == "" ? null : grantCode;
	}

	public void setGrantCode(String grantCode) {
		this.grantCode = grantCode;
	}

	public String getProjectName() {
		return projectName == "" ? null : projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProductName() {
		return productName == "" ? null : productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProposer() {
		return proposer == "" ? null : proposer;
	}

	public void setProposer(String proposer) {
		this.proposer = proposer;
	}

	public Long getProposerNum() {
		return proposerNum;
	}

	public void setProposerNum(Long proposerNum) {
		this.proposerNum = proposerNum;
	}

	public Long getBankTellId() {
		return bankTellId;
	}

	public void setBankTellId(Long bankTellId) {
		this.bankTellId = bankTellId;
	}

	public String getBankTellName() {
		return bankTellName == "" ? null : bankTellName;
	}

	public void setBankTellName(String bankTellName) {
		this.bankTellName = bankTellName;
	}

	public String getDeptCode() {
		return deptCode == "" ? null : deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getDeptName() {
		return deptName == "" ? null : deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Integer getScopeBusinPeriod() {
		return scopeBusinPeriod;
	}

	public void setScopeBusinPeriod(Integer scopeBusinPeriod) {
		this.scopeBusinPeriod = scopeBusinPeriod;
	}

	public String getIssNo() {
		return issNo == "" ? null : issNo;
	}

	public void setIssNo(String issNo) {
		this.issNo = issNo;
	}

	public String getFrsNo() {
		return frsNo == "" ? null : frsNo;
	}

	public void setFrsNo(String frsNo) {
		this.frsNo = frsNo;
	}

	public Date getDateOfLoan() {
		return dateOfLoan;
	}

	public void setDateOfLoan(Date dateOfLoan) {
		this.dateOfLoan = dateOfLoan;
	}

	public Date getValueDate() {
		return valueDate;
	}

	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Long getGracePeriod() {
		return gracePeriod;
	}

	public void setGracePeriod(Long gracePeriod) {
		this.gracePeriod = gracePeriod;
	}

	public Long getToierancePeriod() {
		return toierancePeriod;
	}

	public void setToierancePeriod(Long toierancePeriod) {
		this.toierancePeriod = toierancePeriod;
	}

	public String getInstitutionCode() {
		return institutionCode == "" ? null : institutionCode;
	}

	public void setInstitutionCode(String institutionCode) {
		this.institutionCode = institutionCode;
	}

	public String getIdentNumber() {
		return identNumber == "" ? null : identNumber;
	}

	public void setIdentNumber(String identNumber) {
		this.identNumber = identNumber;
	}

	public String getProtseNo() {
		return protseNo == "" ? null : protseNo;
	}

	public void setProtseNo(String protseNo) {
		this.protseNo = protseNo;
	}

	public String getSubserNo() {
		return subserNo == "" ? null : subserNo;
	}

	public void setSubserNo(String subserNo) {
		this.subserNo = subserNo;
	}

	public String getListNo() {
		return listNo == "" ? null : listNo;
	}

	public void setListNo(String listNo) {
		this.listNo = listNo;
	}

	public BizMakeLoans() {
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
				.add("debtCode", debtCode)
				.add("businessTypes", businessTypes)
				.add("grantCode", grantCode)
				.add("projectName", projectName)
				.add("productName", productName)
				.add("proposer", proposer)
				.add("proposerNum", proposerNum)
				.add("bankTellId", bankTellId)
				.add("bankTellName", bankTellName)
				.add("deptCode", deptCode)
				.add("deptName", deptName)
				.add("scopeBusinPeriod", scopeBusinPeriod)
				.add("issNo", issNo)
				.add("frsNo", frsNo)
				.add("dateOfLoan", dateOfLoan)
				.add("valueDate", valueDate)
				.add("dueDate", dueDate)
				.add("gracePeriod", gracePeriod)
				.add("toierancePeriod", toierancePeriod)
				.add("institutionCode", institutionCode)
				.add("identNumber", identNumber)
				.add("protseNo", protseNo)
				.add("subserNo", subserNo)
				.add("listNo", listNo)
				.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof BizMakeLoans)) return false;
		BizMakeLoans that = (BizMakeLoans) o;
		return Objects.equal(getDebtCode(), that.getDebtCode()) &&
				Objects.equal(getBusinessTypes(), that.getBusinessTypes()) &&
				Objects.equal(getGrantCode(), that.getGrantCode()) &&
				Objects.equal(getProjectName(), that.getProjectName()) &&
				Objects.equal(getProductName(), that.getProductName()) &&
				Objects.equal(getProposer(), that.getProposer()) &&
				Objects.equal(getProposerNum(), that.getProposerNum()) &&
				Objects.equal(getBankTellId(), that.getBankTellId()) &&
				Objects.equal(getBankTellName(), that.getBankTellName()) &&
				Objects.equal(getDeptCode(), that.getDeptCode()) &&
				Objects.equal(getDeptName(), that.getDeptName()) &&
				Objects.equal(getScopeBusinPeriod(), that.getScopeBusinPeriod()) &&
				Objects.equal(getIssNo(), that.getIssNo()) &&
				Objects.equal(getFrsNo(), that.getFrsNo()) &&
				Objects.equal(getDateOfLoan(), that.getDateOfLoan()) &&
				Objects.equal(getValueDate(), that.getValueDate()) &&
				Objects.equal(getDueDate(), that.getDueDate()) &&
				Objects.equal(getGracePeriod(), that.getGracePeriod()) &&
				Objects.equal(getToierancePeriod(), that.getToierancePeriod()) &&
				Objects.equal(getInstitutionCode(), that.getInstitutionCode()) &&
				Objects.equal(getIdentNumber(), that.getIdentNumber()) &&
				Objects.equal(getProtseNo(), that.getProtseNo()) &&
				Objects.equal(getSubserNo(), that.getSubserNo()) &&
				Objects.equal(getListNo(), that.getListNo());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getDebtCode(), getBusinessTypes(), getGrantCode(), getProjectName(), getProductName(), getProposer(), getProposerNum(), getBankTellId(), getBankTellName(), getDeptCode(), getDeptName(), getScopeBusinPeriod(), getIssNo(), getFrsNo(), getDateOfLoan(), getValueDate(), getDueDate(), getGracePeriod(), getToierancePeriod(), getInstitutionCode(), getIdentNumber(), getProtseNo(), getSubserNo(), getListNo());
	}
}
