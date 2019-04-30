package com.hns.learn.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.io.Serializable;
import java.util.Date;

/**
 * 贷款还款计划文件接口表
 *
 * @author hannasong
 * @version 1.0
 * @date 2019/02/22
 */
@TableName("INF_AFWKPLN")
public class InfAfwkpln extends BaseModel implements Serializable {

    /** 地区号 */
    @TableField("ZONENO1")
    private String zoneno1;
    /** 协议编号 */
    @TableField("PROTSENO")
    private String protseno;
    /** 借据序号 */
    @TableField("SUBSERNO")
    private String subserno;
    /** 状态 */
    @TableField("STATUS")
    private String status;
    /** 币种 */
    @TableField("CURRTYPE")
    private String currtype;
    /** 还款日期 */
    @TableField("GBDATE")
    private String gbdate;
    /** 应还本金 */
    @TableField("GBAMOUNT")
    private String gbamount;
    /** 应还利息 */
    @TableField("GBINT")
    private String gbint;
    /** 应还本利合计 */
    @TableField("GBTAMT")
    private String gbtamt;
    /** 创建日期 */
    @TableField("CRDATE")
    private String crdate;
    /** 地区号 */
    @TableField("ZONENO2")
    private String zoneno2;
    /** 网点号 */
    @TableField("BRNO")
    private String brno;
    /** 柜员号 */
    @TableField("TELLERNO")
    private String tellerno;
    /** 核心工作日期 */
    @TableField("WORKDATE")
    private Date workdate;

    public InfAfwkpln() {
    }

    public String getZoneno1() {
        return zoneno1 == "" ? null : zoneno1;
    }

    public void setZoneno1(String zoneno1) {
        this.zoneno1 = zoneno1;
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

    public String getStatus() {
        return status == "" ? null : status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCurrtype() {
        return currtype == "" ? null : currtype;
    }

    public void setCurrtype(String currtype) {
        this.currtype = currtype;
    }

    public String getGbdate() {
        return gbdate == "" ? null : gbdate;
    }

    public void setGbdate(String gbdate) {
        this.gbdate = gbdate;
    }

    public String getGbamount() {
        return gbamount == "" ? null : gbamount;
    }

    public void setGbamount(String gbamount) {
        this.gbamount = gbamount;
    }

    public String getGbint() {
        return gbint == "" ? null : gbint;
    }

    public void setGbint(String gbint) {
        this.gbint = gbint;
    }

    public String getGbtamt() {
        return gbtamt == "" ? null : gbtamt;
    }

    public void setGbtamt(String gbtamt) {
        this.gbtamt = gbtamt;
    }

    public String getCrdate() {
        return crdate == "" ? null : crdate;
    }

    public void setCrdate(String crdate) {
        this.crdate = crdate;
    }

    public String getZoneno2() {
        return zoneno2 == "" ? null : zoneno2;
    }

    public void setZoneno2(String zoneno2) {
        this.zoneno2 = zoneno2;
    }

    public String getBrno() {
        return brno == "" ? null : brno;
    }

    public void setBrno(String brno) {
        this.brno = brno;
    }

    public String getTellerno() {
        return tellerno == "" ? null : tellerno;
    }

    public void setTellerno(String tellerno) {
        this.tellerno = tellerno;
    }

    public Date getWorkdate() {
        return workdate;
    }

    public void setWorkdate(Date workdate) {
        this.workdate = workdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InfAfwkpln)) return false;
        InfAfwkpln afwkpln = (InfAfwkpln) o;
        return Objects.equal(getZoneno1(), afwkpln.getZoneno1()) &&
                Objects.equal(getProtseno(), afwkpln.getProtseno()) &&
                Objects.equal(getSubserno(), afwkpln.getSubserno()) &&
                Objects.equal(getStatus(), afwkpln.getStatus()) &&
                Objects.equal(getCurrtype(), afwkpln.getCurrtype()) &&
                Objects.equal(getGbdate(), afwkpln.getGbdate()) &&
                Objects.equal(getGbamount(), afwkpln.getGbamount()) &&
                Objects.equal(getGbint(), afwkpln.getGbint()) &&
                Objects.equal(getGbtamt(), afwkpln.getGbtamt()) &&
                Objects.equal(getCrdate(), afwkpln.getCrdate()) &&
                Objects.equal(getZoneno2(), afwkpln.getZoneno2()) &&
                Objects.equal(getBrno(), afwkpln.getBrno()) &&
                Objects.equal(getTellerno(), afwkpln.getTellerno()) &&
                Objects.equal(getWorkdate(), afwkpln.getWorkdate());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getZoneno1(), getProtseno(), getSubserno(), getStatus(), getCurrtype(), getGbdate(), getGbamount(), getGbint(), getGbtamt(), getCrdate(), getZoneno2(), getBrno(), getTellerno(), getWorkdate());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("zoneno1", zoneno1)
                .add("protseno", protseno)
                .add("subserno", subserno)
                .add("status", status)
                .add("currtype", currtype)
                .add("gbdate", gbdate)
                .add("gbamount", gbamount)
                .add("gbint", gbint)
                .add("gbtamt", gbtamt)
                .add("crdate", crdate)
                .add("zoneno2", zoneno2)
                .add("brno", brno)
                .add("tellerno", tellerno)
                .add("workdate", workdate)
                .toString();
    }
}
