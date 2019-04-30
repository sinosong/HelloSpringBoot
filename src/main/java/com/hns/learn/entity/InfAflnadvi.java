package com.hns.learn.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.io.Serializable;
import java.util.Date;

/**
 * 付款通知书文件接口表
 *
 * @author hannasong
 * @version 1.0
 * @date 2019/03/08
 */
@TableName("INF_AFLNADVI")
public class InfAflnadvi extends BaseModel implements Serializable {

    /** 地区号 */
    @TableField("ZONENO")
    private String zoneno;
    /** 工作日期 */
    @TableField("WORKDATE")
    private Date workdate;
    /** 核算网点号 */
    @TableField("ACTBRNO")
    private String actbrno;
    /** 物理网点号 */
    @TableField("PHYBRNO")
    private String phybrno;
    /** 协议编号 */
    @TableField("PROTSENO")
    private String protseno;
    /** 子协议序号 */
    @TableField("SUBSERNO")
    private String subserno;
    /** 下次还款日期 */
    @TableField("NXGBDATE")
    private String nxgbdate;
    /** 贷款到期日期 */
    @TableField("MATUDATE")
    private String matudate;
    /** 币种 */
    @TableField("CURRTYPE")
    private String currtype;
    /** 客户号 */
    @TableField("PCUSTNO")
    private String pcustno;
    /** 客户名称 */
    @TableField("PCUSTNAM")
    private String pcustnam;
    /** 地址 */
    @TableField("ADDRESS")
    private String address;
    /** 介质识别号 */
    @TableField("MEDIUMID")
    private String mediumid;
    /** 介质下挂协议序号 */
    @TableField("MEDSENO")
    private String medseno;
    /** 贷款产品名称 */
    @TableField("PRODNAME")
    private String prodname;
    /** 本金 */
    @TableField("PRIAMT")
    private String priamt;
    /** 利息 */
    @TableField("INT1")
    private String int1;
    /** 利率 */
    @TableField("RATE")
    private String rate;
    /** 費用 */
    @TableField("FEE")
    private String fee;
    /** 逾期費用/利息 */
    @TableField("INT2")
    private String int2;
    /** 贷款余额 */
    @TableField("CALBAL")
    private String calbal;
    /** 还款帐号 */
    @TableField("PAYACTN")
    private String payactn;
    /** 纳税号 */
    @TableField("TAXNO")
    private String taxno;

    public InfAflnadvi() {
    }

    public String getZoneno() {
        return zoneno == "" ? null : zoneno;
    }

    public void setZoneno(String zoneno) {
        this.zoneno = zoneno;
    }

    public Date getWorkdate() {
        return workdate;
    }

    public void setWorkdate(Date workdate) {
        this.workdate = workdate;
    }

    public String getActbrno() {
        return actbrno == "" ? null : actbrno;
    }

    public void setActbrno(String actbrno) {
        this.actbrno = actbrno;
    }

    public String getPhybrno() {
        return phybrno == "" ? null : phybrno;
    }

    public void setPhybrno(String phybrno) {
        this.phybrno = phybrno;
    }

    public String getProtseno() {
        return protseno == "" ? null : protseno;
    }

    public void setProtseno(String protseno) {
        this.protseno = protseno;
    }

    public String getSubserno() {
        return subserno == "" ? null : subserno;
    }

    public void setSubserno(String subserno) {
        this.subserno = subserno;
    }

    public String getNxgbdate() {
        return nxgbdate == "" ? null : nxgbdate;
    }

    public void setNxgbdate(String nxgbdate) {
        this.nxgbdate = nxgbdate;
    }

    public String getMatudate() {
        return matudate == "" ? null : matudate;
    }

    public void setMatudate(String matudate) {
        this.matudate = matudate;
    }

    public String getCurrtype() {
        return currtype == "" ? null : currtype;
    }

    public void setCurrtype(String currtype) {
        this.currtype = currtype;
    }

    public String getPcustno() {
        return pcustno == "" ? null : pcustno;
    }

    public void setPcustno(String pcustno) {
        this.pcustno = pcustno;
    }

    public String getPcustnam() {
        return pcustnam == "" ? null : pcustnam;
    }

    public void setPcustnam(String pcustnam) {
        this.pcustnam = pcustnam;
    }

    public String getAddress() {
        return address == "" ? null : address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMediumid() {
        return mediumid == "" ? null : mediumid;
    }

    public void setMediumid(String mediumid) {
        this.mediumid = mediumid;
    }

    public String getMedseno() {
        return medseno == "" ? null : medseno;
    }

    public void setMedseno(String medseno) {
        this.medseno = medseno;
    }

    public String getProdname() {
        return prodname == "" ? null : prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname;
    }

    public String getPriamt() {
        return priamt == "" ? null : priamt;
    }

    public void setPriamt(String priamt) {
        this.priamt = priamt;
    }

    public String getInt1() {
        return int1 == "" ? null : int1;
    }

    public void setInt1(String int1) {
        this.int1 = int1;
    }

    public String getRate() {
        return rate == "" ? null : rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getFee() {
        return fee == "" ? null : fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getInt2() {
        return int2 == "" ? null : int2;
    }

    public void setInt2(String int2) {
        this.int2 = int2;
    }

    public String getCalbal() {
        return calbal == "" ? null : calbal;
    }

    public void setCalbal(String calbal) {
        this.calbal = calbal;
    }

    public String getPayactn() {
        return payactn == "" ? null : payactn;
    }

    public void setPayactn(String payactn) {
        this.payactn = payactn;
    }

    public String getTaxno() {
        return taxno == "" ? null : taxno;
    }

    public void setTaxno(String taxno) {
        this.taxno = taxno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InfAflnadvi)) return false;
        InfAflnadvi that = (InfAflnadvi) o;
        return Objects.equal(getZoneno(), that.getZoneno()) &&
                Objects.equal(getWorkdate(), that.getWorkdate()) &&
                Objects.equal(getActbrno(), that.getActbrno()) &&
                Objects.equal(getPhybrno(), that.getPhybrno()) &&
                Objects.equal(getProtseno(), that.getProtseno()) &&
                Objects.equal(getSubserno(), that.getSubserno()) &&
                Objects.equal(getNxgbdate(), that.getNxgbdate()) &&
                Objects.equal(getMatudate(), that.getMatudate()) &&
                Objects.equal(getCurrtype(), that.getCurrtype()) &&
                Objects.equal(getPcustno(), that.getPcustno()) &&
                Objects.equal(getPcustnam(), that.getPcustnam()) &&
                Objects.equal(getAddress(), that.getAddress()) &&
                Objects.equal(getMediumid(), that.getMediumid()) &&
                Objects.equal(getMedseno(), that.getMedseno()) &&
                Objects.equal(getProdname(), that.getProdname()) &&
                Objects.equal(getPriamt(), that.getPriamt()) &&
                Objects.equal(getInt1(), that.getInt1()) &&
                Objects.equal(getRate(), that.getRate()) &&
                Objects.equal(getFee(), that.getFee()) &&
                Objects.equal(getInt2(), that.getInt2()) &&
                Objects.equal(getCalbal(), that.getCalbal()) &&
                Objects.equal(getPayactn(), that.getPayactn()) &&
                Objects.equal(getTaxno(), that.getTaxno());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getZoneno(), getWorkdate(), getActbrno(), getPhybrno(), getProtseno(), getSubserno(), getNxgbdate(), getMatudate(), getCurrtype(), getPcustno(), getPcustnam(), getAddress(), getMediumid(), getMedseno(), getProdname(), getPriamt(), getInt1(), getRate(), getFee(), getInt2(), getCalbal(), getPayactn(), getTaxno());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("zoneno", zoneno)
                .add("workdate", workdate)
                .add("actbrno", actbrno)
                .add("phybrno", phybrno)
                .add("protseno", protseno)
                .add("subserno", subserno)
                .add("nxgbdate", nxgbdate)
                .add("matudate", matudate)
                .add("currtype", currtype)
                .add("pcustno", pcustno)
                .add("pcustnam", pcustnam)
                .add("address", address)
                .add("mediumid", mediumid)
                .add("medseno", medseno)
                .add("prodname", prodname)
                .add("priamt", priamt)
                .add("int1", int1)
                .add("rate", rate)
                .add("fee", fee)
                .add("int2", int2)
                .add("calbal", calbal)
                .add("payactn", payactn)
                .add("taxno", taxno)
                .toString();
    }
}
