package com.hns.learn.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.io.Serializable;
import java.util.Date;

/**
 * 贷款利率信息文件
 * @author hannasong
 * @version 1.0
 */
@TableName("INF_AFLNRAT")
public class InfAflnrat extends BaseModel implements Serializable {

    @TableField("WORKDATE")
    private Date workdate;
    @TableField("ZONENO")
    private String zoneno;
    @TableField("MEDIUMID")
    private String mediumid;
    @TableField("PROTSENO")
    private String protseno;
    @TableField("SUBSERNO")
    private String subserno;
    @TableField("CURRTYPE")
    private String currtype;
    @TableField("CALINTF")
    private String calintf;
    @TableField("NINTTYPE")
    private String ninttype;
    @TableField("NISERNO")
    private String niserno;
    @TableField("NINTSELMO")
    private String nintselmo;
    @TableField("NFLTYPE")
    private String nfltype;
    @TableField("NINFLRAT")
    private String ninflrat;
    @TableField("NAGTRATE")
    private String nagtrate;
    @TableField("NRATCOD")
    private String nratcod;
    @TableField("NUPPLMT")
    private String nupplmt;
    @TableField("NLOWLMT")
    private String nlowlmt;
    @TableField("NRATEXD")
    private String nratexd;
    @TableField("NINTDAY")
    private String nintday;
    @TableField("NUPERIOD")
    private String nuperiod;
    @TableField("NPENUM")
    private String npenum;
    @TableField("NPREDAY")
    private String npreday;
    @TableField("NLCRDDAT")
    private String nlcrddat;
    @TableField("NRATE")
    private String nrate;
    @TableField("OVCALINF")
    private String ovcalinf;
    @TableField("OVITYPE")
    private String ovitype;
    @TableField("OVISERNO")
    private String oviserno;
    @TableField("OINTSELMO")
    private String ointselmo;
    @TableField("OFLTYPE")
    private String ofltype;
    @TableField("OINFLRAT")
    private String oinflrat;
    @TableField("OAGTRATE")
    private String oagtrate;
    @TableField("ORATCOD")
    private String oratcod;
    @TableField("OUPPLMT")
    private String oupplmt;
    @TableField("OLOWLMT")
    private String olowlmt;
    @TableField("ORATEXD")
    private String oratexd;
    @TableField("OINTDAY")
    private String ointday;
    @TableField("OUPERIOD")
    private String ouperiod;
    @TableField("OPENUM")
    private String openum;
    @TableField("OPREDAY")
    private String opreday;
    @TableField("OLCRDDAT")
    private String olcrddat;
    @TableField("ORATE")
    private String orate;

    public InfAflnrat() {
    }

    public Date getWorkdate() {
        return workdate;
    }

    public void setWorkdate(Date workdate) {
        this.workdate = workdate;
    }

    public String getZoneno() {
        return zoneno == "" ? null : zoneno;
    }

    public void setZoneno(String zoneno) {
        this.zoneno = zoneno;
    }

    public String getMediumid() {
        return mediumid == "" ? null : mediumid;
    }

    public void setMediumid(String mediumid) {
        this.mediumid = mediumid;
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

    public String getCurrtype() {
        return currtype == "" ? null : currtype;
    }

    public void setCurrtype(String currtype) {
        this.currtype = currtype;
    }

    public String getCalintf() {
        return calintf == "" ? null : calintf;
    }

    public void setCalintf(String calintf) {
        this.calintf = calintf;
    }

    public String getNinttype() {
        return ninttype == "" ? null : ninttype;
    }

    public void setNinttype(String ninttype) {
        this.ninttype = ninttype;
    }

    public String getNiserno() {
        return niserno == "" ? null : niserno;
    }

    public void setNiserno(String niserno) {
        this.niserno = niserno;
    }

    public String getNintselmo() {
        return nintselmo == "" ? null : nintselmo;
    }

    public void setNintselmo(String nintselmo) {
        this.nintselmo = nintselmo;
    }

    public String getNfltype() {
        return nfltype == "" ? null : nfltype;
    }

    public void setNfltype(String nfltype) {
        this.nfltype = nfltype;
    }

    public String getNinflrat() {
        return ninflrat == "" ? null : ninflrat;
    }

    public void setNinflrat(String ninflrat) {
        this.ninflrat = ninflrat;
    }

    public String getNagtrate() {
        return nagtrate == "" ? null : nagtrate;
    }

    public void setNagtrate(String nagtrate) {
        this.nagtrate = nagtrate;
    }

    public String getNratcod() {
        return nratcod == "" ? null : nratcod;
    }

    public void setNratcod(String nratcod) {
        this.nratcod = nratcod;
    }

    public String getNupplmt() {
        return nupplmt == "" ? null : nupplmt;
    }

    public void setNupplmt(String nupplmt) {
        this.nupplmt = nupplmt;
    }

    public String getNlowlmt() {
        return nlowlmt == "" ? null : nlowlmt;
    }

    public void setNlowlmt(String nlowlmt) {
        this.nlowlmt = nlowlmt;
    }

    public String getNratexd() {
        return nratexd == "" ? null : nratexd;
    }

    public void setNratexd(String nratexd) {
        this.nratexd = nratexd;
    }

    public String getNintday() {
        return nintday == "" ? null : nintday;
    }

    public void setNintday(String nintday) {
        this.nintday = nintday;
    }

    public String getNuperiod() {
        return nuperiod == "" ? null : nuperiod;
    }

    public void setNuperiod(String nuperiod) {
        this.nuperiod = nuperiod;
    }

    public String getNpenum() {
        return npenum == "" ? null : npenum;
    }

    public void setNpenum(String npenum) {
        this.npenum = npenum;
    }

    public String getNpreday() {
        return npreday == "" ? null : npreday;
    }

    public void setNpreday(String npreday) {
        this.npreday = npreday;
    }

    public String getNlcrddat() {
        return nlcrddat == "" ? null : nlcrddat;
    }

    public void setNlcrddat(String nlcrddat) {
        this.nlcrddat = nlcrddat;
    }

    public String getNrate() {
        return nrate == "" ? null : nrate;
    }

    public void setNrate(String nrate) {
        this.nrate = nrate;
    }

    public String getOvcalinf() {
        return ovcalinf == "" ? null : ovcalinf;
    }

    public void setOvcalinf(String ovcalinf) {
        this.ovcalinf = ovcalinf;
    }

    public String getOvitype() {
        return ovitype == "" ? null : ovitype;
    }

    public void setOvitype(String ovitype) {
        this.ovitype = ovitype;
    }

    public String getOviserno() {
        return oviserno == "" ? null : oviserno;
    }

    public void setOviserno(String oviserno) {
        this.oviserno = oviserno;
    }

    public String getOintselmo() {
        return ointselmo == "" ? null : ointselmo;
    }

    public void setOintselmo(String ointselmo) {
        this.ointselmo = ointselmo;
    }

    public String getOfltype() {
        return ofltype == "" ? null : ofltype;
    }

    public void setOfltype(String ofltype) {
        this.ofltype = ofltype;
    }

    public String getOinflrat() {
        return oinflrat == "" ? null : oinflrat;
    }

    public void setOinflrat(String oinflrat) {
        this.oinflrat = oinflrat;
    }

    public String getOagtrate() {
        return oagtrate == "" ? null : oagtrate;
    }

    public void setOagtrate(String oagtrate) {
        this.oagtrate = oagtrate;
    }

    public String getOratcod() {
        return oratcod == "" ? null : oratcod;
    }

    public void setOratcod(String oratcod) {
        this.oratcod = oratcod;
    }

    public String getOupplmt() {
        return oupplmt == "" ? null : oupplmt;
    }

    public void setOupplmt(String oupplmt) {
        this.oupplmt = oupplmt;
    }

    public String getOlowlmt() {
        return olowlmt == "" ? null : olowlmt;
    }

    public void setOlowlmt(String olowlmt) {
        this.olowlmt = olowlmt;
    }

    public String getOratexd() {
        return oratexd == "" ? null : oratexd;
    }

    public void setOratexd(String oratexd) {
        this.oratexd = oratexd;
    }

    public String getOintday() {
        return ointday == "" ? null : ointday;
    }

    public void setOintday(String ointday) {
        this.ointday = ointday;
    }

    public String getOuperiod() {
        return ouperiod == "" ? null : ouperiod;
    }

    public void setOuperiod(String ouperiod) {
        this.ouperiod = ouperiod;
    }

    public String getOpenum() {
        return openum == "" ? null : openum;
    }

    public void setOpenum(String openum) {
        this.openum = openum;
    }

    public String getOpreday() {
        return opreday == "" ? null : opreday;
    }

    public void setOpreday(String opreday) {
        this.opreday = opreday;
    }

    public String getOlcrddat() {
        return olcrddat == "" ? null : olcrddat;
    }

    public void setOlcrddat(String olcrddat) {
        this.olcrddat = olcrddat;
    }

    public String getOrate() {
        return orate == "" ? null : orate;
    }

    public void setOrate(String orate) {
        this.orate = orate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InfAflnrat)) return false;
        InfAflnrat that = (InfAflnrat) o;
        return Objects.equal(getWorkdate(), that.getWorkdate()) &&
                Objects.equal(getZoneno(), that.getZoneno()) &&
                Objects.equal(getMediumid(), that.getMediumid()) &&
                Objects.equal(getProtseno(), that.getProtseno()) &&
                Objects.equal(getSubserno(), that.getSubserno()) &&
                Objects.equal(getCurrtype(), that.getCurrtype()) &&
                Objects.equal(getCalintf(), that.getCalintf()) &&
                Objects.equal(getNinttype(), that.getNinttype()) &&
                Objects.equal(getNiserno(), that.getNiserno()) &&
                Objects.equal(getNintselmo(), that.getNintselmo()) &&
                Objects.equal(getNfltype(), that.getNfltype()) &&
                Objects.equal(getNinflrat(), that.getNinflrat()) &&
                Objects.equal(getNagtrate(), that.getNagtrate()) &&
                Objects.equal(getNratcod(), that.getNratcod()) &&
                Objects.equal(getNupplmt(), that.getNupplmt()) &&
                Objects.equal(getNlowlmt(), that.getNlowlmt()) &&
                Objects.equal(getNratexd(), that.getNratexd()) &&
                Objects.equal(getNintday(), that.getNintday()) &&
                Objects.equal(getNuperiod(), that.getNuperiod()) &&
                Objects.equal(getNpenum(), that.getNpenum()) &&
                Objects.equal(getNpreday(), that.getNpreday()) &&
                Objects.equal(getNlcrddat(), that.getNlcrddat()) &&
                Objects.equal(getNrate(), that.getNrate()) &&
                Objects.equal(getOvcalinf(), that.getOvcalinf()) &&
                Objects.equal(getOvitype(), that.getOvitype()) &&
                Objects.equal(getOviserno(), that.getOviserno()) &&
                Objects.equal(getOintselmo(), that.getOintselmo()) &&
                Objects.equal(getOfltype(), that.getOfltype()) &&
                Objects.equal(getOinflrat(), that.getOinflrat()) &&
                Objects.equal(getOagtrate(), that.getOagtrate()) &&
                Objects.equal(getOratcod(), that.getOratcod()) &&
                Objects.equal(getOupplmt(), that.getOupplmt()) &&
                Objects.equal(getOlowlmt(), that.getOlowlmt()) &&
                Objects.equal(getOratexd(), that.getOratexd()) &&
                Objects.equal(getOintday(), that.getOintday()) &&
                Objects.equal(getOuperiod(), that.getOuperiod()) &&
                Objects.equal(getOpenum(), that.getOpenum()) &&
                Objects.equal(getOpreday(), that.getOpreday()) &&
                Objects.equal(getOlcrddat(), that.getOlcrddat()) &&
                Objects.equal(getOrate(), that.getOrate());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getWorkdate(), getZoneno(), getMediumid(), getProtseno(), getSubserno(), getCurrtype(), getCalintf(), getNinttype(), getNiserno(), getNintselmo(), getNfltype(), getNinflrat(), getNagtrate(), getNratcod(), getNupplmt(), getNlowlmt(), getNratexd(), getNintday(), getNuperiod(), getNpenum(), getNpreday(), getNlcrddat(), getNrate(), getOvcalinf(), getOvitype(), getOviserno(), getOintselmo(), getOfltype(), getOinflrat(), getOagtrate(), getOratcod(), getOupplmt(), getOlowlmt(), getOratexd(), getOintday(), getOuperiod(), getOpenum(), getOpreday(), getOlcrddat(), getOrate());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("workdate", workdate)
                .add("zoneno", zoneno)
                .add("mediumid", mediumid)
                .add("protseno", protseno)
                .add("subserno", subserno)
                .add("currtype", currtype)
                .add("calintf", calintf)
                .add("ninttype", ninttype)
                .add("niserno", niserno)
                .add("nintselmo", nintselmo)
                .add("nfltype", nfltype)
                .add("ninflrat", ninflrat)
                .add("nagtrate", nagtrate)
                .add("nratcod", nratcod)
                .add("nupplmt", nupplmt)
                .add("nlowlmt", nlowlmt)
                .add("nratexd", nratexd)
                .add("nintday", nintday)
                .add("nuperiod", nuperiod)
                .add("npenum", npenum)
                .add("npreday", npreday)
                .add("nlcrddat", nlcrddat)
                .add("nrate", nrate)
                .add("ovcalinf", ovcalinf)
                .add("ovitype", ovitype)
                .add("oviserno", oviserno)
                .add("ointselmo", ointselmo)
                .add("ofltype", ofltype)
                .add("oinflrat", oinflrat)
                .add("oagtrate", oagtrate)
                .add("oratcod", oratcod)
                .add("oupplmt", oupplmt)
                .add("olowlmt", olowlmt)
                .add("oratexd", oratexd)
                .add("ointday", ointday)
                .add("ouperiod", ouperiod)
                .add("openum", openum)
                .add("opreday", opreday)
                .add("olcrddat", olcrddat)
                .add("orate", orate)
                .toString();
    }
}
