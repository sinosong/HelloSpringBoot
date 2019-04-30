package com.hns.learn.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.io.Serializable;
import java.util.Date;

/**
 * 贷款费用处理登记簿
 * @author hannasong
 * @version 1.0
 */
@TableName("INF_AFWKLFE")
public class InfAfwklfe extends BaseModel implements Serializable {

    /** 地区号 */
    @TableField("ZONENO")
    private String zoneno;
    /** 协议编号 */
    @TableField("PROTSENO")
    private String protseno;
    /** 借据序号 */
    @TableField("SUBSERNO")
    private String subserno;
    /** 贷款账号 */
    @TableField("ACCNO")
    private String accno;
    /** 贷款账号序号 */
    @TableField("ACCNOSEQ")
    private String accnoseq;
    /** 顺序号 */
    @TableField("TERMNUM")
    private String termnum;
    /** 贷款费用序号 */
    @TableField("LNFEENO")
    private String lnfeeno;
    /** 费用币种 */
    @TableField("CURRTYPE")
    private String currtype;
    /** 费用类型 */
    @TableField("FEECLASS")
    private String feeclass;
    /** 收费日期 */
    @TableField("FEEDATE")
    private String feedate;
    /** 费用状态 */
    @TableField("STATUS")
    private String status;
    /** 费用总额 */
    @TableField("FEEAMT")
    private String feeamt;
    /** 费用余额 */
    @TableField("FEEBAL")
    private String feebal;
    /** 滞纳金总额 */
    @TableField("LATEAMT")
    private String lateamt;
    /** 滞纳金余额 */
    @TableField("LATEBAL")
    private String latebal;
    /** 上次扣款日期 */
    @TableField("LSGBDATE")
    private String lsgbdate;
    /** 最后修改日期 */
    @TableField("LSTMDATE")
    private String lstmdate;
    /** 最后修改柜员 */
    @TableField("LSTMTELR")
    private String lstmtelr;
    /** 记录产生时间 */
    @TableField("RECCRDAT")
    private String reccrdat;
    /** 是否已转表外 */
    @TableField("OFTRNFLG")
    private String oftrnflg;
    /** 我行余额 */
    @TableField("ICBCAMT")
    private String icbcamt;
    /** 他行余额 */
    @TableField("OTHERAMT")
    private String otheramt;
    /** 交易发生日期 */
    @TableField("WORKDATE")
    private Date workdate;

    public InfAfwklfe() {
    }

    public String getZoneno() {
        return zoneno == "" ? null : zoneno;
    }

    public void setZoneno(String zoneno) {
        this.zoneno = zoneno;
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

    public String getAccno() {
        return accno == "" ? null : accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public String getAccnoseq() {
        return accnoseq == "" ? null : accnoseq;
    }

    public void setAccnoseq(String accnoseq) {
        this.accnoseq = accnoseq;
    }

    public String getTermnum() {
        return termnum == "" ? null : termnum;
    }

    public void setTermnum(String termnum) {
        this.termnum = termnum;
    }

    public String getLnfeeno() {
        return lnfeeno == "" ? null : lnfeeno;
    }

    public void setLnfeeno(String lnfeeno) {
        this.lnfeeno = lnfeeno;
    }

    public String getCurrtype() {
        return currtype == "" ? null : currtype;
    }

    public void setCurrtype(String currtype) {
        this.currtype = currtype;
    }

    public String getFeeclass() {
        return feeclass == "" ? null : feeclass;
    }

    public void setFeeclass(String feeclass) {
        this.feeclass = feeclass;
    }

    public String getFeedate() {
        return feedate == "" ? null : feedate;
    }

    public void setFeedate(String feedate) {
        this.feedate = feedate;
    }

    public String getStatus() {
        return status == "" ? null : status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFeeamt() {
        return feeamt == "" ? null : feeamt;
    }

    public void setFeeamt(String feeamt) {
        this.feeamt = feeamt;
    }

    public String getFeebal() {
        return feebal == "" ? null : feebal;
    }

    public void setFeebal(String feebal) {
        this.feebal = feebal;
    }

    public String getLateamt() {
        return lateamt == "" ? null : lateamt;
    }

    public void setLateamt(String lateamt) {
        this.lateamt = lateamt;
    }

    public String getLatebal() {
        return latebal == "" ? null : latebal;
    }

    public void setLatebal(String latebal) {
        this.latebal = latebal;
    }

    public String getLsgbdate() {
        return lsgbdate == "" ? null : lsgbdate;
    }

    public void setLsgbdate(String lsgbdate) {
        this.lsgbdate = lsgbdate;
    }

    public String getLstmdate() {
        return lstmdate == "" ? null : lstmdate;
    }

    public void setLstmdate(String lstmdate) {
        this.lstmdate = lstmdate;
    }

    public String getLstmtelr() {
        return lstmtelr == "" ? null : lstmtelr;
    }

    public void setLstmtelr(String lstmtelr) {
        this.lstmtelr = lstmtelr;
    }

    public String getReccrdat() {
        return reccrdat == "" ? null : reccrdat;
    }

    public void setReccrdat(String reccrdat) {
        this.reccrdat = reccrdat;
    }

    public String getOftrnflg() {
        return oftrnflg == "" ? null : oftrnflg;
    }

    public void setOftrnflg(String oftrnflg) {
        this.oftrnflg = oftrnflg;
    }

    public String getIcbcamt() {
        return icbcamt == "" ? null : icbcamt;
    }

    public void setIcbcamt(String icbcamt) {
        this.icbcamt = icbcamt;
    }

    public String getOtheramt() {
        return otheramt == "" ? null : otheramt;
    }

    public void setOtheramt(String otheramt) {
        this.otheramt = otheramt;
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
        if (!(o instanceof InfAfwklfe)) return false;
        InfAfwklfe that = (InfAfwklfe) o;
        return Objects.equal(getZoneno(), that.getZoneno()) &&
                Objects.equal(getProtseno(), that.getProtseno()) &&
                Objects.equal(getSubserno(), that.getSubserno()) &&
                Objects.equal(getAccno(), that.getAccno()) &&
                Objects.equal(getAccnoseq(), that.getAccnoseq()) &&
                Objects.equal(getTermnum(), that.getTermnum()) &&
                Objects.equal(getLnfeeno(), that.getLnfeeno()) &&
                Objects.equal(getCurrtype(), that.getCurrtype()) &&
                Objects.equal(getFeeclass(), that.getFeeclass()) &&
                Objects.equal(getFeedate(), that.getFeedate()) &&
                Objects.equal(getStatus(), that.getStatus()) &&
                Objects.equal(getFeeamt(), that.getFeeamt()) &&
                Objects.equal(getFeebal(), that.getFeebal()) &&
                Objects.equal(getLateamt(), that.getLateamt()) &&
                Objects.equal(getLatebal(), that.getLatebal()) &&
                Objects.equal(getLsgbdate(), that.getLsgbdate()) &&
                Objects.equal(getLstmdate(), that.getLstmdate()) &&
                Objects.equal(getLstmtelr(), that.getLstmtelr()) &&
                Objects.equal(getReccrdat(), that.getReccrdat()) &&
                Objects.equal(getOftrnflg(), that.getOftrnflg()) &&
                Objects.equal(getIcbcamt(), that.getIcbcamt()) &&
                Objects.equal(getOtheramt(), that.getOtheramt()) &&
                Objects.equal(getWorkdate(), that.getWorkdate());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getZoneno(), getProtseno(), getSubserno(), getAccno(), getAccnoseq(), getTermnum(), getLnfeeno(), getCurrtype(), getFeeclass(), getFeedate(), getStatus(), getFeeamt(), getFeebal(), getLateamt(), getLatebal(), getLsgbdate(), getLstmdate(), getLstmtelr(), getReccrdat(), getOftrnflg(), getIcbcamt(), getOtheramt(), getWorkdate());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("zoneno", zoneno)
                .add("protseno", protseno)
                .add("subserno", subserno)
                .add("accno", accno)
                .add("accnoseq", accnoseq)
                .add("termnum", termnum)
                .add("lnfeeno", lnfeeno)
                .add("currtype", currtype)
                .add("feeclass", feeclass)
                .add("feedate", feedate)
                .add("status", status)
                .add("feeamt", feeamt)
                .add("feebal", feebal)
                .add("lateamt", lateamt)
                .add("latebal", latebal)
                .add("lsgbdate", lsgbdate)
                .add("lstmdate", lstmdate)
                .add("lstmtelr", lstmtelr)
                .add("reccrdat", reccrdat)
                .add("oftrnflg", oftrnflg)
                .add("icbcamt", icbcamt)
                .add("otheramt", otheramt)
                .add("workdate", workdate)
                .toString();
    }
}
