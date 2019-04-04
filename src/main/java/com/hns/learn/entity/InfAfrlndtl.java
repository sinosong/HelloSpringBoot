package com.hns.learn.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.io.Serializable;
import java.util.Date;

/**
 * 贷款附表明细文件表
 * @author hannasong
 * @version 1.0
 */
@TableName("INF_AFRLNDTL_TEST")
public class InfAfrlndtl extends BaseModel implements Serializable {

    @TableField("ZONENO")
    private String zoneno;

    @TableField("PROTSENO")
    private String protseno;

    @TableField("SUBSERNO")
    private String subserno;

    @TableField("WORKDATE")
    private Date workdate;

    @TableField("LISTNO")
    private String listno;

    @TableField("LGLOCKNO")
    private String lglockno;

    @TableField("CURRTYPE")
    private String currtype;

    @TableField("CASHEXF")
    private String cashexf;

    @TableField("TERMNUM")
    private String termnum;

    @TableField("INTRATE")
    private String intrate;

    @TableField("RLVRATE")
    private String rlvrate;

    @TableField("OVRRATE")
    private String ovrrate;

    @TableField("INCIRATE")
    private String incirate;

    @TableField("OFCIRATE")
    private String ofcirate;

    @TableField("TAXRATE")
    private String taxrate;

    @TableField("CURRINT")
    private String currint;

    @TableField("RLVINT")
    private String rlvint;

    @TableField("RLVIBAL")
    private String rlvibal;

    @TableField("OVRAMT")
    private String ovramt;

    @TableField("OVRBAL")
    private String ovrbal;

    @TableField("OVRAMTIT")
    private String ovramtit;

    @TableField("INAMT")
    private String inamt;

    @TableField("INCURBAL")
    private String incurbal;

    @TableField("INAMTIT")
    private String inamtit;

    @TableField("OFAMT")
    private String ofamt;

    @TableField("OFCURBAL")
    private String ofcurbal;

    @TableField("OFAMTIT")
    private String ofamtit;

    @TableField("TAXSUM")
    private String taxsum;

    @TableField("TAXAMT")
    private String taxamt;

    @TableField("TAXBAL")
    private String taxbal;

    @TableField("NTAXAMT")
    private String ntaxamt;

    @TableField("NTAXBAL")
    private String ntaxbal;

    @TableField("DRDOACTN")
    private String drdoactn;

    @TableField("DRDOACSN")
    private String drdoacsn;

    @TableField("DRDOACTA")
    private String drdoacta;

    @TableField("PAYACTN")
    private String payactn;

    @TableField("PAYACSN")
    private String payacsn;

    @TableField("PAYACTA")
    private String payacta;

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

    public Date getWorkdate() {
        return workdate;
    }

    public void setWorkdate(Date workdate) {
        this.workdate = workdate;
    }

    public String getListno() {
        return listno == "" ? null : listno;
    }

    public void setListno(String listno) {
        this.listno = listno;
    }

    public String getLglockno() {
        return lglockno == "" ? null : lglockno;
    }

    public void setLglockno(String lglockno) {
        this.lglockno = lglockno;
    }

    public String getCurrtype() {
        return currtype == "" ? null : currtype;
    }

    public void setCurrtype(String currtype) {
        this.currtype = currtype;
    }

    public String getCashexf() {
        return cashexf == "" ? null : cashexf;
    }

    public void setCashexf(String cashexf) {
        this.cashexf = cashexf;
    }

    public String getTermnum() {
        return termnum == "" ? null : termnum;
    }

    public void setTermnum(String termnum) {
        this.termnum = termnum;
    }

    public String getIntrate() {
        return intrate == "" ? null : intrate;
    }

    public void setIntrate(String intrate) {
        this.intrate = intrate;
    }

    public String getRlvrate() {
        return rlvrate == "" ? null : rlvrate;
    }

    public void setRlvrate(String rlvrate) {
        this.rlvrate = rlvrate;
    }

    public String getOvrrate() {
        return ovrrate == "" ? null : ovrrate;
    }

    public void setOvrrate(String ovrrate) {
        this.ovrrate = ovrrate;
    }

    public String getIncirate() {
        return incirate == "" ? null : incirate;
    }

    public void setIncirate(String incirate) {
        this.incirate = incirate;
    }

    public String getOfcirate() {
        return ofcirate == "" ? null : ofcirate;
    }

    public void setOfcirate(String ofcirate) {
        this.ofcirate = ofcirate;
    }

    public String getTaxrate() {
        return taxrate == "" ? null : taxrate;
    }

    public void setTaxrate(String taxrate) {
        this.taxrate = taxrate;
    }

    public String getCurrint() {
        return currint == "" ? null : currint;
    }

    public void setCurrint(String currint) {
        this.currint = currint;
    }

    public String getRlvint() {
        return rlvint == "" ? null : rlvint;
    }

    public void setRlvint(String rlvint) {
        this.rlvint = rlvint;
    }

    public String getRlvibal() {
        return rlvibal == "" ? null : rlvibal;
    }

    public void setRlvibal(String rlvibal) {
        this.rlvibal = rlvibal;
    }

    public String getOvramt() {
        return ovramt == "" ? null : ovramt;
    }

    public void setOvramt(String ovramt) {
        this.ovramt = ovramt;
    }

    public String getOvrbal() {
        return ovrbal == "" ? null : ovrbal;
    }

    public void setOvrbal(String ovrbal) {
        this.ovrbal = ovrbal;
    }

    public String getOvramtit() {
        return ovramtit == "" ? null : ovramtit;
    }

    public void setOvramtit(String ovramtit) {
        this.ovramtit = ovramtit;
    }

    public String getInamt() {
        return inamt == "" ? null : inamt;
    }

    public void setInamt(String inamt) {
        this.inamt = inamt;
    }

    public String getIncurbal() {
        return incurbal == "" ? null : incurbal;
    }

    public void setIncurbal(String incurbal) {
        this.incurbal = incurbal;
    }

    public String getInamtit() {
        return inamtit == "" ? null : inamtit;
    }

    public void setInamtit(String inamtit) {
        this.inamtit = inamtit;
    }

    public String getOfamt() {
        return ofamt == "" ? null : ofamt;
    }

    public void setOfamt(String ofamt) {
        this.ofamt = ofamt;
    }

    public String getOfcurbal() {
        return ofcurbal == "" ? null : ofcurbal;
    }

    public void setOfcurbal(String ofcurbal) {
        this.ofcurbal = ofcurbal;
    }

    public String getOfamtit() {
        return ofamtit == "" ? null : ofamtit;
    }

    public void setOfamtit(String ofamtit) {
        this.ofamtit = ofamtit;
    }

    public String getTaxsum() {
        return taxsum == "" ? null : taxsum;
    }

    public void setTaxsum(String taxsum) {
        this.taxsum = taxsum;
    }

    public String getTaxamt() {
        return taxamt == "" ? null : taxamt;
    }

    public void setTaxamt(String taxamt) {
        this.taxamt = taxamt;
    }

    public String getTaxbal() {
        return taxbal == "" ? null : taxbal;
    }

    public void setTaxbal(String taxbal) {
        this.taxbal = taxbal;
    }

    public String getNtaxamt() {
        return ntaxamt == "" ? null : ntaxamt;
    }

    public void setNtaxamt(String ntaxamt) {
        this.ntaxamt = ntaxamt;
    }

    public String getNtaxbal() {
        return ntaxbal == "" ? null : ntaxbal;
    }

    public void setNtaxbal(String ntaxbal) {
        this.ntaxbal = ntaxbal;
    }

    public String getDrdoactn() {
        return drdoactn == "" ? null : drdoactn;
    }

    public void setDrdoactn(String drdoactn) {
        this.drdoactn = drdoactn;
    }

    public String getDrdoacsn() {
        return drdoacsn == "" ? null : drdoacsn;
    }

    public void setDrdoacsn(String drdoacsn) {
        this.drdoacsn = drdoacsn;
    }

    public String getDrdoacta() {
        return drdoacta == "" ? null : drdoacta;
    }

    public void setDrdoacta(String drdoacta) {
        this.drdoacta = drdoacta;
    }

    public String getPayactn() {
        return payactn == "" ? null : payactn;
    }

    public void setPayactn(String payactn) {
        this.payactn = payactn;
    }

    public String getPayacsn() {
        return payacsn == "" ? null : payacsn;
    }

    public void setPayacsn(String payacsn) {
        this.payacsn = payacsn;
    }

    public String getPayacta() {
        return payacta == "" ? null : payacta;
    }

    public void setPayacta(String payacta) {
        this.payacta = payacta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InfAfrlndtl)) return false;
        InfAfrlndtl that = (InfAfrlndtl) o;
        return Objects.equal(getZoneno(), that.getZoneno()) &&
                Objects.equal(getProtseno(), that.getProtseno()) &&
                Objects.equal(getSubserno(), that.getSubserno()) &&
                Objects.equal(getWorkdate(), that.getWorkdate()) &&
                Objects.equal(getListno(), that.getListno()) &&
                Objects.equal(getLglockno(), that.getLglockno()) &&
                Objects.equal(getCurrtype(), that.getCurrtype()) &&
                Objects.equal(getCashexf(), that.getCashexf()) &&
                Objects.equal(getTermnum(), that.getTermnum()) &&
                Objects.equal(getIntrate(), that.getIntrate()) &&
                Objects.equal(getRlvrate(), that.getRlvrate()) &&
                Objects.equal(getOvrrate(), that.getOvrrate()) &&
                Objects.equal(getIncirate(), that.getIncirate()) &&
                Objects.equal(getOfcirate(), that.getOfcirate()) &&
                Objects.equal(getTaxrate(), that.getTaxrate()) &&
                Objects.equal(getCurrint(), that.getCurrint()) &&
                Objects.equal(getRlvint(), that.getRlvint()) &&
                Objects.equal(getRlvibal(), that.getRlvibal()) &&
                Objects.equal(getOvramt(), that.getOvramt()) &&
                Objects.equal(getOvrbal(), that.getOvrbal()) &&
                Objects.equal(getOvramtit(), that.getOvramtit()) &&
                Objects.equal(getInamt(), that.getInamt()) &&
                Objects.equal(getIncurbal(), that.getIncurbal()) &&
                Objects.equal(getInamtit(), that.getInamtit()) &&
                Objects.equal(getOfamt(), that.getOfamt()) &&
                Objects.equal(getOfcurbal(), that.getOfcurbal()) &&
                Objects.equal(getOfamtit(), that.getOfamtit()) &&
                Objects.equal(getTaxsum(), that.getTaxsum()) &&
                Objects.equal(getTaxamt(), that.getTaxamt()) &&
                Objects.equal(getTaxbal(), that.getTaxbal()) &&
                Objects.equal(getNtaxamt(), that.getNtaxamt()) &&
                Objects.equal(getNtaxbal(), that.getNtaxbal()) &&
                Objects.equal(getDrdoactn(), that.getDrdoactn()) &&
                Objects.equal(getDrdoacsn(), that.getDrdoacsn()) &&
                Objects.equal(getDrdoacta(), that.getDrdoacta()) &&
                Objects.equal(getPayactn(), that.getPayactn()) &&
                Objects.equal(getPayacsn(), that.getPayacsn()) &&
                Objects.equal(getPayacta(), that.getPayacta());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getZoneno(), getProtseno(), getSubserno(), getWorkdate(), getListno(), getLglockno(), getCurrtype(), getCashexf(), getTermnum(), getIntrate(), getRlvrate(), getOvrrate(), getIncirate(), getOfcirate(), getTaxrate(), getCurrint(), getRlvint(), getRlvibal(), getOvramt(), getOvrbal(), getOvramtit(), getInamt(), getIncurbal(), getInamtit(), getOfamt(), getOfcurbal(), getOfamtit(), getTaxsum(), getTaxamt(), getTaxbal(), getNtaxamt(), getNtaxbal(), getDrdoactn(), getDrdoacsn(), getDrdoacta(), getPayactn(), getPayacsn(), getPayacta());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("zoneno", zoneno)
                .add("protseno", protseno)
                .add("subserno", subserno)
                .add("workdate", workdate)
                .add("listno", listno)
                .add("lglockno", lglockno)
                .add("currtype", currtype)
                .add("cashexf", cashexf)
                .add("termnum", termnum)
                .add("intrate", intrate)
                .add("rlvrate", rlvrate)
                .add("ovrrate", ovrrate)
                .add("incirate", incirate)
                .add("ofcirate", ofcirate)
                .add("taxrate", taxrate)
                .add("currint", currint)
                .add("rlvint", rlvint)
                .add("rlvibal", rlvibal)
                .add("ovramt", ovramt)
                .add("ovrbal", ovrbal)
                .add("ovramtit", ovramtit)
                .add("inamt", inamt)
                .add("incurbal", incurbal)
                .add("inamtit", inamtit)
                .add("ofamt", ofamt)
                .add("ofcurbal", ofcurbal)
                .add("ofamtit", ofamtit)
                .add("taxsum", taxsum)
                .add("taxamt", taxamt)
                .add("taxbal", taxbal)
                .add("ntaxamt", ntaxamt)
                .add("ntaxbal", ntaxbal)
                .add("drdoactn", drdoactn)
                .add("drdoacsn", drdoacsn)
                .add("drdoacta", drdoacta)
                .add("payactn", payactn)
                .add("payacsn", payacsn)
                .add("payacta", payacta)
                .toString();
    }
}
