/**
 * 
 */
package com.hns.learn.entity.vo;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.io.Serializable;

/**
 * 描述：产品种类详情
 * 
 * @author czm
 * @version 1.0
 * @date 2018/7/13
 */
public class ProductVo implements Serializable {
	private String objType;//产品类型表名
	private String businessType;//产品编码
	private String businessName;//产品名称
	private String debtCode;//业务编号
	private Long properInfo;//产品专有信息外键
	private Integer numLimit;//办理笔数限制（1不限制；2限制）
	private Integer totalNum;//限制笔数
	private Integer usedNum;//发放的次数
	
	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getObjType() {
		return objType;
	}

	public void setObjType(String objType) {
		this.objType = objType;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getDebtCode() {
		return debtCode;
	}

	public void setDebtCode(String debtCode) {
		this.debtCode = debtCode;
	}

	public Long getProperInfo() {
		return properInfo;
	}

	public void setProperInfo(Long properInfo) {
		this.properInfo = properInfo;
	}
	
	public Integer getUsedNum() {
		return usedNum;
	}

	public void setUsedNum(Integer usedNum) {
		this.usedNum = usedNum;
	}
	
	public Integer getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}
	
	public Integer getNumLimit() {
		return numLimit;
	}

	public void setNumLimit(Integer numLimit) {
		this.numLimit = numLimit;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof ProductVo)) return false;
		ProductVo productVo = (ProductVo) o;
		return Objects.equal(getObjType(), productVo.getObjType()) &&
				Objects.equal(getBusinessType(), productVo.getBusinessType()) &&
				Objects.equal(getBusinessName(), productVo.getBusinessName()) &&
				Objects.equal(getDebtCode(), productVo.getDebtCode()) &&
				Objects.equal(getProperInfo(), productVo.getProperInfo()) &&
				Objects.equal(getNumLimit(), productVo.getNumLimit()) &&
				Objects.equal(getTotalNum(), productVo.getTotalNum()) &&
				Objects.equal(getUsedNum(), productVo.getUsedNum());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getObjType(), getBusinessType(), getBusinessName(), getDebtCode(), getProperInfo(), getNumLimit(), getTotalNum(), getUsedNum());
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
				.add("objType", objType)
				.add("businessType", businessType)
				.add("businessName", businessName)
				.add("debtCode", debtCode)
				.add("properInfo", properInfo)
				.add("numLimit", numLimit)
				.add("totalNum", totalNum)
				.add("usedNum", usedNum)
				.toString();
	}
}
