package com.hns.learn.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.io.Serializable;
import java.util.Date;

/**
 * 贷款综合帐户逾期贷款清单接口文件
 *
 * @author hannasong
 * @version 1.0
 */
@TableName("INF_AFRPOLT1")
public class InfAfrpolt1 extends BaseModel implements Serializable {

    /** 工作日期 */
    @TableField("WORKDATE")
    private String workdate;
    /** 地区号 */
    @TableField("ZONENO")
    private String zoneno;
    /** 核算网点号 */
    @TableField("PHYBRNO")
    private String phybrno;
    /** 逾期日期 */
    @TableField("MATUDATE")
    private String matudate;
    /** 介质识别号 */
    @TableField("MEDIUMID")
    private String mediumid;
    /** 介质下挂协议序号 */
    @TableField("MEDSENO")
    private String medseno;
    /** 借据序号 */
    @TableField("SUBSERNO")
    private String subserno;
    /** 期数 */
    @TableField("TERMNUM")
    private String termnum;
    /** 客户信息 */
    @TableField("PCUSTNO")
    private String pcustno;
    /** 客户名称 */
    @TableField("PCUSTNAM")
    private String pcustnam;
    /** 币种 */
    @TableField("CURRTYPE")
    private String currtype;
    /** 产品名称 */
    @TableField("PRODCNAM")
    private String prodcnam;
    /** 逾期本金发生额 */
    @TableField("OVRAMT")
    private String ovramt;
    /** 逾期本金利息发生额 */
    @TableField("OVRAMTIT")
    private String ovramtit;
    /** 本金逾期天数 */
    @TableField("PRIDAYS")
    private String pridays;
    /** 利息逾期天数 */
    @TableField("INTDAYS")
    private String intdays;

    public InfAfrpolt1() {
    }

    public String getZoneno() {
        return zoneno == "" ? null : zoneno;
    }

    public void setZoneno(String zoneno) {
        this.zoneno = zoneno;
    }

    public String getPhybrno() {
        return phybrno == "" ? null : phybrno;
    }

    public void setPhybrno(String phybrno) {
        this.phybrno = phybrno;
    }

    public String getWorkdate() {
        return workdate;
    }

    public void setWorkdate(String workdate) {
        this.workdate = workdate;
    }

    public String getMatudate() {
        return matudate == "" ? null : matudate;
    }

    public void setMatudate(String matudate) {
        this.matudate = matudate;
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

    public String getSubserno() {
        return subserno == "" ? null : subserno;
    }

    public void setSubserno(String subserno) {
        this.subserno = subserno;
    }

    public String getTermnum() {
        return termnum == "" ? null : termnum;
    }

    public void setTermnum(String termnum) {
        this.termnum = termnum;
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

    public String getCurrtype() {
        return currtype == "" ? null : currtype;
    }

    public void setCurrtype(String currtype) {
        this.currtype = currtype;
    }

    public String getProdcnam() {
        return prodcnam == "" ? null : prodcnam;
    }

    public void setProdcnam(String prodcnam) {
        this.prodcnam = prodcnam;
    }

    public String getOvramt() {
        return ovramt == "" ? null : ovramt;
    }

    public void setOvramt(String ovramt) {
        this.ovramt = ovramt;
    }

    public String getOvramtit() {
        return ovramtit == "" ? null : ovramtit;
    }

    public void setOvramtit(String ovramtit) {
        this.ovramtit = ovramtit;
    }

    public String getPridays() {
        return pridays == "" ? null : pridays;
    }

    public void setPridays(String pridays) {
        this.pridays = pridays;
    }

    public String getIntdays() {
        return intdays == "" ? null : intdays;
    }

    public void setIntdays(String intdays) {
        this.intdays = intdays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InfAfrpolt1)) return false;
        InfAfrpolt1 that = (InfAfrpolt1) o;
        return Objects.equal(getZoneno(), that.getZoneno()) &&
                Objects.equal(getPhybrno(), that.getPhybrno()) &&
                Objects.equal(getWorkdate(), that.getWorkdate()) &&
                Objects.equal(getMatudate(), that.getMatudate()) &&
                Objects.equal(getMediumid(), that.getMediumid()) &&
                Objects.equal(getMedseno(), that.getMedseno()) &&
                Objects.equal(getSubserno(), that.getSubserno()) &&
                Objects.equal(getTermnum(), that.getTermnum()) &&
                Objects.equal(getPcustno(), that.getPcustno()) &&
                Objects.equal(getPcustnam(), that.getPcustnam()) &&
                Objects.equal(getCurrtype(), that.getCurrtype()) &&
                Objects.equal(getProdcnam(), that.getProdcnam()) &&
                Objects.equal(getOvramt(), that.getOvramt()) &&
                Objects.equal(getOvramtit(), that.getOvramtit()) &&
                Objects.equal(getPridays(), that.getPridays()) &&
                Objects.equal(getIntdays(), that.getIntdays());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getZoneno(), getPhybrno(), getWorkdate(), getMatudate(), getMediumid(), getMedseno(), getSubserno(), getTermnum(), getPcustno(), getPcustnam(), getCurrtype(), getProdcnam(), getOvramt(), getOvramtit(), getPridays(), getIntdays());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("zoneno", zoneno)
                .add("phybrno", phybrno)
                .add("workdate", workdate)
                .add("matudate", matudate)
                .add("mediumid", mediumid)
                .add("medseno", medseno)
                .add("subserno", subserno)
                .add("termnum", termnum)
                .add("pcustno", pcustno)
                .add("pcustnam", pcustnam)
                .add("currtype", currtype)
                .add("prodcnam", prodcnam)
                .add("ovramt", ovramt)
                .add("ovramtit", ovramtit)
                .add("pridays", pridays)
                .add("intdays", intdays)
                .toString();
    }
}
