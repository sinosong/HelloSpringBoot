package com.hns.learn.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 功能：交易流水表
 */
@TableName("BIZ_TRN")
@SuppressWarnings("serial")
public class BizTRN extends BaseModel implements Serializable {
	/**
	 * 存盘时间
	 */
	@TableField("INIDATTIM")
	private Date inidattim;
	/**
	 * 交易代码(流水号)自定义
	 */
	@TableField("INIFRM")
	private String inifrm;
	/**
	 * 交易名称(业务名称)
	 */
	@TableField("ININAM")
	private String ininam;
	/**
	 * 登录柜员
	 */
	@TableField("INIUSR")
	private Long iniusr;
	/**
	 * 业务编号
	 */
	@TableField("OWNREF")
	private String ownref;
	/**
	 * 业务表名称（XXD）
	 */
	@TableField("OBJTYP")
	private String objtyp;
	/**
	 * 业务表INR(XXD的ID)
	 */
	//将Long类型系列化成String避免精度丢失
    @JsonSerialize(using = ToStringSerializer.class)
	@TableField("OBJINR")
	private Long objinr;
	/**
	 * 交易对象描述
	 */
	@TableField("OBJNAM")
	private String objnam;
	/**
	 * 交易对象描述
	 */
	@TableField("BUSINESS_TYPES")
	private String businessTypes;
	/**
	 * 产品种类名称
	 */
	@TableField(exist=false)
	private String businessTypeName;
	/**
	 * 可用货币
	 */
	@TableField("XRECURBLK")
	private String xrecurblk;
	/**
	 * 授权币种
	 */
	@TableField("RELCUR")
	private String relcur;
	/**
	 * 授权金额
	 */
	@TableField("RELAMT")
	private BigDecimal relamt;
	/**
	 * 币种
	 */
	@TableField("RELORICUR")
	private String reloricur;
	/**
	 * 金额
	 */
	@TableField("RELORIAMT")
	private BigDecimal reloriamt;
	/**
	 * 执行日期
	 */
	@TableField("EXEDAT")
	private Date exedat;
	/**
	 * 实体
	 */
	@TableField("ETYEXTKEY")
	private String etyextkey;
	/**
	 * 为Y时代表业务中最新审批通过的数据
	 */
	@TableField("RELRES")
	private String relres;
	/**
	 * 经办机构
	 */
	@TableField("BCHKEYINR")
	private String bchkeyinr;

    /**
     * 流程状态
     */
    @TableField("PROCESS_STATUS")
	private Integer processStatus;

	/**
	 * 方案状态或发放状态
	 */
	@TableField("BIZ_STATUS")
	private Integer bizStatus;


	/**
	 * 为Y时代表最新的流水
	 */
	@TableField("RELFLG")
	private String relflg;

    /**
     * 修订版本号
     */
    @TableField("VERNUM_")
	private Integer verNum;

    /**
     * 没有使用，暂时作为发放条件废弃时存中间状态的字段
     */
    @TableField("RELREQ")
    private String relreq;

	public BizTRN() {
	}

	public Date getInidattim() {
		return inidattim;
	}

	public void setInidattim(Date inidattim) {
		this.inidattim = inidattim;
	}

	public String getInifrm() {
		return inifrm == "" ? null : inifrm;
	}

	public void setInifrm(String inifrm) {
		this.inifrm = inifrm;
	}

	public String getIninam() {
		return ininam == "" ? null : ininam;
	}

	public void setIninam(String ininam) {
		this.ininam = ininam;
	}

	public Long getIniusr() {
		return iniusr;
	}

	public void setIniusr(Long iniusr) {
		this.iniusr = iniusr;
	}

	public String getOwnref() {
		return ownref == "" ? null : ownref;
	}

	public void setOwnref(String ownref) {
		this.ownref = ownref;
	}

	public String getObjtyp() {
		return objtyp == "" ? null : objtyp;
	}

	public void setObjtyp(String objtyp) {
		this.objtyp = objtyp;
	}

	public Long getObjinr() {
		return objinr;
	}

	public void setObjinr(Long objinr) {
		this.objinr = objinr;
	}

	public String getObjnam() {
		return objnam == "" ? null : objnam;
	}

	public void setObjnam(String objnam) {
		this.objnam = objnam;
	}

	public String getBusinessTypes() {
		return businessTypes == "" ? null : businessTypes;
	}

	public void setBusinessTypes(String businessTypes) {
		this.businessTypes = businessTypes;
	}

	public String getBusinessTypeName() {
		return businessTypeName == "" ? null : businessTypeName;
	}

	public void setBusinessTypeName(String businessTypeName) {
		this.businessTypeName = businessTypeName;
	}

	public String getXrecurblk() {
		return xrecurblk == "" ? null : xrecurblk;
	}

	public void setXrecurblk(String xrecurblk) {
		this.xrecurblk = xrecurblk;
	}

	public String getRelcur() {
		return relcur == "" ? null : relcur;
	}

	public void setRelcur(String relcur) {
		this.relcur = relcur;
	}

	public BigDecimal getRelamt() {
		return relamt;
	}

	public void setRelamt(BigDecimal relamt) {
		this.relamt = relamt;
	}

	public String getReloricur() {
		return reloricur == "" ? null : reloricur;
	}

	public void setReloricur(String reloricur) {
		this.reloricur = reloricur;
	}

	public BigDecimal getReloriamt() {
		return reloriamt;
	}

	public void setReloriamt(BigDecimal reloriamt) {
		this.reloriamt = reloriamt;
	}

	public Date getExedat() {
		return exedat;
	}

	public void setExedat(Date exedat) {
		this.exedat = exedat;
	}

	public String getEtyextkey() {
		return etyextkey == "" ? null : etyextkey;
	}

	public void setEtyextkey(String etyextkey) {
		this.etyextkey = etyextkey;
	}

	public String getRelres() {
		return relres == "" ? null : relres;
	}

	public void setRelres(String relres) {
		this.relres = relres;
	}

    public String getRelreq() {
        return relreq == "" ? null : relreq;
    }

    public void setRelreq(String relreq) {
        this.relreq = relreq;
    }

	public String getBchkeyinr() {
		return bchkeyinr == "" ? null : bchkeyinr;
	}

	public void setBchkeyinr(String bchkeyinr) {
		this.bchkeyinr = bchkeyinr;
	}

	public Integer getProcessStatus() {
		return processStatus;
	}

	public void setProcessStatus(Integer processStatus) {
		this.processStatus = processStatus;
	}

	public Integer getBizStatus() {
		return bizStatus;
	}

	public void setBizStatus(Integer bizStatus) {
		this.bizStatus = bizStatus;
	}

	public String getRelflg() {
		return relflg == "" ? null : relflg;
	}

	public void setRelflg(String relflg) {
		this.relflg = relflg;
	}

	public Integer getVerNum() {
		return verNum;
	}

	public String getVerNumStr() {
		return String.format("%0" + 3 + "d", verNum);
	}

	public void setVerNum(Integer verNum) {
		this.verNum = verNum;
	}



	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		BizTRN bizTRN = (BizTRN) o;
		return Objects.equal(inidattim, bizTRN.inidattim) &&
				Objects.equal(inifrm, bizTRN.inifrm) &&
				Objects.equal(ininam, bizTRN.ininam) &&
				Objects.equal(iniusr, bizTRN.iniusr) &&
				Objects.equal(ownref, bizTRN.ownref) &&
				Objects.equal(objtyp, bizTRN.objtyp) &&
				Objects.equal(objinr, bizTRN.objinr) &&
				Objects.equal(objnam, bizTRN.objnam) &&
				Objects.equal(businessTypes, bizTRN.businessTypes) &&
				Objects.equal(businessTypeName, bizTRN.businessTypeName) &&
				Objects.equal(xrecurblk, bizTRN.xrecurblk) &&
				Objects.equal(relcur, bizTRN.relcur) &&
				Objects.equal(relamt, bizTRN.relamt) &&
				Objects.equal(reloricur, bizTRN.reloricur) &&
				Objects.equal(reloriamt, bizTRN.reloriamt) &&
				Objects.equal(exedat, bizTRN.exedat) &&
				Objects.equal(etyextkey, bizTRN.etyextkey) &&
				Objects.equal(relres, bizTRN.relres) &&
				Objects.equal(bchkeyinr, bizTRN.bchkeyinr) &&
				Objects.equal(processStatus, bizTRN.processStatus) &&
				Objects.equal(bizStatus, bizTRN.bizStatus) &&
				Objects.equal(relflg, bizTRN.relflg) &&
				Objects.equal(verNum, bizTRN.verNum) &&
				Objects.equal(relreq, bizTRN.relreq);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(inidattim, inifrm, ininam, iniusr, ownref, objtyp, objinr, objnam, businessTypes, businessTypeName, xrecurblk, relcur, relamt, reloricur, reloriamt, exedat, etyextkey, relres, bchkeyinr, processStatus, bizStatus,  relflg, verNum, relreq);
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
				.add("super",super.toString())
				.add("inidattim", inidattim)
				.add("inifrm", inifrm)
				.add("ininam", ininam)
				.add("iniusr", iniusr)
				.add("ownref", ownref)
				.add("objtyp", objtyp)
				.add("objinr", objinr)
				.add("objnam", objnam)
				.add("businessTypes", businessTypes)
				.add("businessTypeName", businessTypeName)
				.add("xrecurblk", xrecurblk)
				.add("relcur", relcur)
				.add("relamt", relamt)
				.add("reloricur", reloricur)
				.add("reloriamt", reloriamt)
				.add("exedat", exedat)
				.add("etyextkey", etyextkey)
				.add("relres", relres)
				.add("bchkeyinr", bchkeyinr)
				.add("processStatus", processStatus)
				.add("bizStatus", bizStatus)
				.add("relflg", relflg)
				.add("verNum", verNum)
				.add("relreq", relreq)
				.toString();
	}
}
