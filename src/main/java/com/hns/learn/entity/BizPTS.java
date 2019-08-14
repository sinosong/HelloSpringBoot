/**
 * 
 */
package com.hns.learn.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.io.Serializable;

/**
 * 功能：客户类型表
 * 
 * @author czm 
 * 日期：2018/7/6
 */
@TableName("BIZ_PTS")
public class BizPTS extends BaseModel implements Serializable {

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
	 * 角色种类
	 */
	@TableField("ROL")
	private String role;
    /**
     * 客户号
     */
	@TableField("CUST_NO")
	private String custNo;
	/**
	 * 客户名称（中文）
	 */
	@TableField("CUST_NAME_CN")
	private String custNameCN;
	/**
	 * 客户表主键
	 */
    @TableField("PTYINR")
	private String ptyinr;
    /**
	 * 业务主表主键
	 */
    @TableField("BIZ_ID")
	private String bizId;
    /**
     * 债项方案编号
     */
    @TableField("DEBT_CODE")
    private String debtCode;

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

    public String getRole() {
        return role == "" ? null : role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCustNo() {
        return custNo == "" ? null : custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getCustNameCN() {
        return custNameCN == "" ? null : custNameCN;
    }

    public void setCustNameCN(String custNameCN) {
        this.custNameCN = custNameCN;
    }

    public String getPtyinr() {
        return ptyinr == "" ? null : ptyinr;
    }

    public void setPtyinr(String ptyinr) {
        this.ptyinr = ptyinr;
    }

    public String getBizId() {
        return bizId == "" ? null : bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public String getDebtCode() {
        return debtCode;
    }

    public void setDebtCode(String debtCode) {
        this.debtCode = debtCode;

    }

    public BizPTS() {

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BizPTS)) return false;
        BizPTS bizPTS = (BizPTS) o;
        return Objects.equal(getObjtyp(), bizPTS.getObjtyp()) &&
                Objects.equal(getObjinr(), bizPTS.getObjinr()) &&
                Objects.equal(getRole(), bizPTS.getRole()) &&
                Objects.equal(getCustNo(), bizPTS.getCustNo()) &&
                Objects.equal(getCustNameCN(), bizPTS.getCustNameCN()) &&
                Objects.equal(getPtyinr(), bizPTS.getPtyinr()) &&
                Objects.equal(getDebtCode(), bizPTS.getDebtCode()) &&
                Objects.equal(getBizId(), bizPTS.getBizId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getObjtyp(), getObjinr(), getRole(), getCustNo(), getCustNameCN(), getPtyinr(), getBizId());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("super", super.toString())
                .add("objtyp", objtyp)
                .add("objinr", objinr)
                .add("role", role)
                .add("custNo", custNo)
                .add("custNameCN", custNameCN)
                .add("ptyinr", ptyinr)
                .add("bizId", bizId)
                .add("debtCode", debtCode)
                .toString();
    }

}
