package com.hns.learn.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.io.Serializable;
import java.util.Date;

/**
 * 核销类账户明细表
 *
 * @author hannasong
 * @version 1.0
 */
@TableName("INF_AFRCDTL")
public class InfAfrcdtl extends BaseModel implements Serializable {

    /** 帐户所属地区号 */
    @TableField("ZONENO")
    private String zoneno;
    /** 协议编号 */
    @TableField("PROTSENO")
    private String protseno;
    /** 子协议序号 */
    @TableField("SUBSERNO")
    private String subserno;
    /** 交易发生日期（系统工作日期）*/
    @TableField("WORKDATE")
    private Date workdate;
    /** 明细序号 */
    @TableField("LISTNO")
    private String listno;
    /** 是否内部明细 */
    @TableField("PRINFLAG")
    private String prinflag;
    /** 明细压缩标志 */
    @TableField("CMPRFLAG")
    private String cmprflag;
    /** 逻辑锁记录序号 */
    @TableField("LGLOCKNO")
    private String lglockno;
    /** 交易发生日期（自然日）*/
    @TableField("TRXDATE")
    private String trxdate;
    /** 交易发生时间 */
    @TableField("TRXTIME")
    private String trxtime;
    /** 入账时间戳 */
    @TableField("TIMESTMP")
    private String timestmp;
    /** 入帐日期（自然日）*/
    @TableField("POSTNDAT")
    private String postndat;
    /** 入帐日期（系统工作日）*/
    @TableField("POSTSDAT")
    private String postsdat;
    /** 入帐时间 */
    @TableField("POSTTIME")
    private String posttime;
    /** 大交易序号 */
    @TableField("TRXSQNB")
    private String trxsqnb;
    /** 原大交易序号 */
    @TableField("PTRXSQNB")
    private String ptrxsqnb;
    /** 小交易序号 */
    @TableField("TRXSQNS")
    private String trxsqns;
    /** 交易代码 */
    @TableField("TRXCODE")
    private String trxcode;
    /** 起息日期 */
    @TableField("VALUEDAT")
    private String valuedat;
    /** 币种 */
    @TableField("CURRTYPE")
    private String currtype;
    /** 钞汇标志 */
    @TableField("CASHEXF")
    private String cashexf;
    /** 现转标志 */
    @TableField("CATRFLAG")
    private String catrflag;
    /** 借贷标志 */
    @TableField("DRCRF")
    private String drcrf;
    /** 发生额 */
    @TableField("AMOUNT")
    private String amount;
    /** 更新后余额 */
    @TableField("UPDBAL")
    private String updbal;
    /** 简要注释 */
    @TableField("NOTETYPE")
    private String notetype;
    /** 附言 */
    @TableField("NOTES")
    private String notes;
    /** 反交易标志 */
    @TableField("REVTRANF")
    private String revtranf;
    /** 冲正交易标识 */
    @TableField("UPDTRANF")
    private String updtranf;
    /** 记帐类型 */
    @TableField("POSTTYPE")
    private String posttype;
    /** 明细性质 */
    @TableField("LISTTYPE")
    private String listtype;
    /** 对方行号 */
    @TableField("RECIPBKN")
    private String recipbkn;
    /** 对方行名 */
    @TableField("RECIPBKA")
    private String recipbka;
    /** 对方帐号 */
    @TableField("RECIPACT")
    private String recipact;
    /** 对方帐号序号 */
    @TableField("RECIPACS")
    private String recipacs;
    /** 对方户名 */
    @TableField("RECIPACN")
    private String recipacn;
    /** 货币兑换汇率 */
    @TableField("EXCHRAT")
    private String exchrat;
    /** 外币币种 */
    @TableField("FORECURR")
    private String forecurr;
    /** 外币金额 */
    @TableField("FOREAMT")
    private String foreamt;
    /** 凭证种类 */
    @TableField("VOUHTYPE")
    private String vouhtype;
    /** 凭证号 */
    @TableField("VOUHNO")
    private String vouhno;
    /** 介质识别号 */
    @TableField("MEDIUMID")
    private String mediumid;
    /** 介质编号 */
    @TableField("MEDIUMNO")
    private String mediumno;
    /** 介质下挂协议序号 */
    @TableField("MEDSENO")
    private String medseno;
    /** 渠道种类 */
    @TableField("CHNLTYPE")
    private String chnltype;
    /** 渠道编号 */
    @TableField("CHNLNO")
    private String chnlno;
    /** 产品种类代码 */
    @TableField("PRODCODE")
    private String prodcode;
    /** 产品序号 */
    @TableField("PRODNO")
    private String prodno;
    /** 产品组编号 */
    @TableField("PRODGPNO")
    private String prodgpno;
    /** 交易地区号 */
    @TableField("TRXZNO")
    private String trxzno;
    /** 交易（物理）网点号 */
    @TableField("TPHYBRNO")
    private String tphybrno;
    /** 帐户物理网点号 */
    @TableField("PHYBRNO")
    private String phybrno;
    /** 操作柜员号 */
    @TableField("TELLERNO")
    private String tellerno;
    /** 授权柜员号 */
    @TableField("AUTHTLNO")
    private String authtlno;
    /** 授权号 */
    @TableField("AUTHNO")
    private String authno;
    /** 终端号 */
    @TableField("TERMID")
    private String termid;
    /** 交易场所简称 */
    @TableField("TRXPLCS")
    private String trxplcs;
    /** 外汇统计代码 */
    @TableField("STATCODE")
    private String statcode;

    public InfAfrcdtl() {
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

    public String getPrinflag() {
        return prinflag == "" ? null : prinflag;
    }

    public void setPrinflag(String prinflag) {
        this.prinflag = prinflag;
    }

    public String getCmprflag() {
        return cmprflag == "" ? null : cmprflag;
    }

    public void setCmprflag(String cmprflag) {
        this.cmprflag = cmprflag;
    }

    public String getLglockno() {
        return lglockno == "" ? null : lglockno;
    }

    public void setLglockno(String lglockno) {
        this.lglockno = lglockno;
    }

    public String getTrxdate() {
        return trxdate == "" ? null : trxdate;
    }

    public void setTrxdate(String trxdate) {
        this.trxdate = trxdate;
    }

    public String getTrxtime() {
        return trxtime == "" ? null : trxtime;
    }

    public void setTrxtime(String trxtime) {
        this.trxtime = trxtime;
    }

    public String getTimestmp() {
        return timestmp == "" ? null : timestmp;
    }

    public void setTimestmp(String timestmp) {
        this.timestmp = timestmp;
    }

    public String getPostndat() {
        return postndat == "" ? null : postndat;
    }

    public void setPostndat(String postndat) {
        this.postndat = postndat;
    }

    public String getPostsdat() {
        return postsdat == "" ? null : postsdat;
    }

    public void setPostsdat(String postsdat) {
        this.postsdat = postsdat;
    }

    public String getPosttime() {
        return posttime == "" ? null : posttime;
    }

    public void setPosttime(String posttime) {
        this.posttime = posttime;
    }

    public String getTrxsqnb() {
        return trxsqnb == "" ? null : trxsqnb;
    }

    public void setTrxsqnb(String trxsqnb) {
        this.trxsqnb = trxsqnb;
    }

    public String getPtrxsqnb() {
        return ptrxsqnb == "" ? null : ptrxsqnb;
    }

    public void setPtrxsqnb(String ptrxsqnb) {
        this.ptrxsqnb = ptrxsqnb;
    }

    public String getTrxsqns() {
        return trxsqns == "" ? null : trxsqns;
    }

    public void setTrxsqns(String trxsqns) {
        this.trxsqns = trxsqns;
    }

    public String getTrxcode() {
        return trxcode == "" ? null : trxcode;
    }

    public void setTrxcode(String trxcode) {
        this.trxcode = trxcode;
    }

    public String getValuedat() {
        return valuedat == "" ? null : valuedat;
    }

    public void setValuedat(String valuedat) {
        this.valuedat = valuedat;
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

    public String getCatrflag() {
        return catrflag == "" ? null : catrflag;
    }

    public void setCatrflag(String catrflag) {
        this.catrflag = catrflag;
    }

    public String getDrcrf() {
        return drcrf == "" ? null : drcrf;
    }

    public void setDrcrf(String drcrf) {
        this.drcrf = drcrf;
    }

    public String getAmount() {
        return amount == "" ? null : amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getUpdbal() {
        return updbal == "" ? null : updbal;
    }

    public void setUpdbal(String updbal) {
        this.updbal = updbal;
    }

    public String getNotetype() {
        return notetype == "" ? null : notetype;
    }

    public void setNotetype(String notetype) {
        this.notetype = notetype;
    }

    public String getNotes() {
        return notes == "" ? null : notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getRevtranf() {
        return revtranf == "" ? null : revtranf;
    }

    public void setRevtranf(String revtranf) {
        this.revtranf = revtranf;
    }

    public String getUpdtranf() {
        return updtranf == "" ? null : updtranf;
    }

    public void setUpdtranf(String updtranf) {
        this.updtranf = updtranf;
    }

    public String getPosttype() {
        return posttype == "" ? null : posttype;
    }

    public void setPosttype(String posttype) {
        this.posttype = posttype;
    }

    public String getListtype() {
        return listtype == "" ? null : listtype;
    }

    public void setListtype(String listtype) {
        this.listtype = listtype;
    }

    public String getRecipbkn() {
        return recipbkn == "" ? null : recipbkn;
    }

    public void setRecipbkn(String recipbkn) {
        this.recipbkn = recipbkn;
    }

    public String getRecipbka() {
        return recipbka == "" ? null : recipbka;
    }

    public void setRecipbka(String recipbka) {
        this.recipbka = recipbka;
    }

    public String getRecipact() {
        return recipact == "" ? null : recipact;
    }

    public void setRecipact(String recipact) {
        this.recipact = recipact;
    }

    public String getRecipacs() {
        return recipacs == "" ? null : recipacs;
    }

    public void setRecipacs(String recipacs) {
        this.recipacs = recipacs;
    }

    public String getRecipacn() {
        return recipacn == "" ? null : recipacn;
    }

    public void setRecipacn(String recipacn) {
        this.recipacn = recipacn;
    }

    public String getExchrat() {
        return exchrat == "" ? null : exchrat;
    }

    public void setExchrat(String exchrat) {
        this.exchrat = exchrat;
    }

    public String getForecurr() {
        return forecurr == "" ? null : forecurr;
    }

    public void setForecurr(String forecurr) {
        this.forecurr = forecurr;
    }

    public String getForeamt() {
        return foreamt == "" ? null : foreamt;
    }

    public void setForeamt(String foreamt) {
        this.foreamt = foreamt;
    }

    public String getVouhtype() {
        return vouhtype == "" ? null : vouhtype;
    }

    public void setVouhtype(String vouhtype) {
        this.vouhtype = vouhtype;
    }

    public String getVouhno() {
        return vouhno == "" ? null : vouhno;
    }

    public void setVouhno(String vouhno) {
        this.vouhno = vouhno;
    }

    public String getMediumid() {
        return mediumid == "" ? null : mediumid;
    }

    public void setMediumid(String mediumid) {
        this.mediumid = mediumid;
    }

    public String getMediumno() {
        return mediumno == "" ? null : mediumno;
    }

    public void setMediumno(String mediumno) {
        this.mediumno = mediumno;
    }

    public String getMedseno() {
        return medseno == "" ? null : medseno;
    }

    public void setMedseno(String medseno) {
        this.medseno = medseno;
    }

    public String getChnltype() {
        return chnltype == "" ? null : chnltype;
    }

    public void setChnltype(String chnltype) {
        this.chnltype = chnltype;
    }

    public String getChnlno() {
        return chnlno == "" ? null : chnlno;
    }

    public void setChnlno(String chnlno) {
        this.chnlno = chnlno;
    }

    public String getProdcode() {
        return prodcode == "" ? null : prodcode;
    }

    public void setProdcode(String prodcode) {
        this.prodcode = prodcode;
    }

    public String getProdno() {
        return prodno == "" ? null : prodno;
    }

    public void setProdno(String prodno) {
        this.prodno = prodno;
    }

    public String getProdgpno() {
        return prodgpno == "" ? null : prodgpno;
    }

    public void setProdgpno(String prodgpno) {
        this.prodgpno = prodgpno;
    }

    public String getTrxzno() {
        return trxzno == "" ? null : trxzno;
    }

    public void setTrxzno(String trxzno) {
        this.trxzno = trxzno;
    }

    public String getTphybrno() {
        return tphybrno == "" ? null : tphybrno;
    }

    public void setTphybrno(String tphybrno) {
        this.tphybrno = tphybrno;
    }

    public String getPhybrno() {
        return phybrno == "" ? null : phybrno;
    }

    public void setPhybrno(String phybrno) {
        this.phybrno = phybrno;
    }

    public String getTellerno() {
        return tellerno == "" ? null : tellerno;
    }

    public void setTellerno(String tellerno) {
        this.tellerno = tellerno;
    }

    public String getAuthtlno() {
        return authtlno == "" ? null : authtlno;
    }

    public void setAuthtlno(String authtlno) {
        this.authtlno = authtlno;
    }

    public String getAuthno() {
        return authno == "" ? null : authno;
    }

    public void setAuthno(String authno) {
        this.authno = authno;
    }

    public String getTermid() {
        return termid == "" ? null : termid;
    }

    public void setTermid(String termid) {
        this.termid = termid;
    }

    public String getTrxplcs() {
        return trxplcs == "" ? null : trxplcs;
    }

    public void setTrxplcs(String trxplcs) {
        this.trxplcs = trxplcs;
    }

    public String getStatcode() {
        return statcode == "" ? null : statcode;
    }

    public void setStatcode(String statcode) {
        this.statcode = statcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InfAfrcdtl)) return false;
        InfAfrcdtl that = (InfAfrcdtl) o;
        return Objects.equal(getZoneno(), that.getZoneno()) &&
                Objects.equal(getProtseno(), that.getProtseno()) &&
                Objects.equal(getSubserno(), that.getSubserno()) &&
                Objects.equal(getWorkdate(), that.getWorkdate()) &&
                Objects.equal(getListno(), that.getListno()) &&
                Objects.equal(getPrinflag(), that.getPrinflag()) &&
                Objects.equal(getCmprflag(), that.getCmprflag()) &&
                Objects.equal(getLglockno(), that.getLglockno()) &&
                Objects.equal(getTrxdate(), that.getTrxdate()) &&
                Objects.equal(getTrxtime(), that.getTrxtime()) &&
                Objects.equal(getTimestmp(), that.getTimestmp()) &&
                Objects.equal(getPostndat(), that.getPostndat()) &&
                Objects.equal(getPostsdat(), that.getPostsdat()) &&
                Objects.equal(getPosttime(), that.getPosttime()) &&
                Objects.equal(getTrxsqnb(), that.getTrxsqnb()) &&
                Objects.equal(getPtrxsqnb(), that.getPtrxsqnb()) &&
                Objects.equal(getTrxsqns(), that.getTrxsqns()) &&
                Objects.equal(getTrxcode(), that.getTrxcode()) &&
                Objects.equal(getValuedat(), that.getValuedat()) &&
                Objects.equal(getCurrtype(), that.getCurrtype()) &&
                Objects.equal(getCashexf(), that.getCashexf()) &&
                Objects.equal(getCatrflag(), that.getCatrflag()) &&
                Objects.equal(getDrcrf(), that.getDrcrf()) &&
                Objects.equal(getAmount(), that.getAmount()) &&
                Objects.equal(getUpdbal(), that.getUpdbal()) &&
                Objects.equal(getNotetype(), that.getNotetype()) &&
                Objects.equal(getNotes(), that.getNotes()) &&
                Objects.equal(getRevtranf(), that.getRevtranf()) &&
                Objects.equal(getUpdtranf(), that.getUpdtranf()) &&
                Objects.equal(getPosttype(), that.getPosttype()) &&
                Objects.equal(getListtype(), that.getListtype()) &&
                Objects.equal(getRecipbkn(), that.getRecipbkn()) &&
                Objects.equal(getRecipbka(), that.getRecipbka()) &&
                Objects.equal(getRecipact(), that.getRecipact()) &&
                Objects.equal(getRecipacs(), that.getRecipacs()) &&
                Objects.equal(getRecipacn(), that.getRecipacn()) &&
                Objects.equal(getExchrat(), that.getExchrat()) &&
                Objects.equal(getForecurr(), that.getForecurr()) &&
                Objects.equal(getForeamt(), that.getForeamt()) &&
                Objects.equal(getVouhtype(), that.getVouhtype()) &&
                Objects.equal(getVouhno(), that.getVouhno()) &&
                Objects.equal(getMediumid(), that.getMediumid()) &&
                Objects.equal(getMediumno(), that.getMediumno()) &&
                Objects.equal(getMedseno(), that.getMedseno()) &&
                Objects.equal(getChnltype(), that.getChnltype()) &&
                Objects.equal(getChnlno(), that.getChnlno()) &&
                Objects.equal(getProdcode(), that.getProdcode()) &&
                Objects.equal(getProdno(), that.getProdno()) &&
                Objects.equal(getProdgpno(), that.getProdgpno()) &&
                Objects.equal(getTrxzno(), that.getTrxzno()) &&
                Objects.equal(getTphybrno(), that.getTphybrno()) &&
                Objects.equal(getPhybrno(), that.getPhybrno()) &&
                Objects.equal(getTellerno(), that.getTellerno()) &&
                Objects.equal(getAuthtlno(), that.getAuthtlno()) &&
                Objects.equal(getAuthno(), that.getAuthno()) &&
                Objects.equal(getTermid(), that.getTermid()) &&
                Objects.equal(getTrxplcs(), that.getTrxplcs()) &&
                Objects.equal(getStatcode(), that.getStatcode());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getZoneno(), getProtseno(), getSubserno(), getWorkdate(), getListno(), getPrinflag(), getCmprflag(), getLglockno(), getTrxdate(), getTrxtime(), getTimestmp(), getPostndat(), getPostsdat(), getPosttime(), getTrxsqnb(), getPtrxsqnb(), getTrxsqns(), getTrxcode(), getValuedat(), getCurrtype(), getCashexf(), getCatrflag(), getDrcrf(), getAmount(), getUpdbal(), getNotetype(), getNotes(), getRevtranf(), getUpdtranf(), getPosttype(), getListtype(), getRecipbkn(), getRecipbka(), getRecipact(), getRecipacs(), getRecipacn(), getExchrat(), getForecurr(), getForeamt(), getVouhtype(), getVouhno(), getMediumid(), getMediumno(), getMedseno(), getChnltype(), getChnlno(), getProdcode(), getProdno(), getProdgpno(), getTrxzno(), getTphybrno(), getPhybrno(), getTellerno(), getAuthtlno(), getAuthno(), getTermid(), getTrxplcs(), getStatcode());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("zoneno", zoneno)
                .add("protseno", protseno)
                .add("subserno", subserno)
                .add("workdate", workdate)
                .add("listno", listno)
                .add("prinflag", prinflag)
                .add("cmprflag", cmprflag)
                .add("lglockno", lglockno)
                .add("trxdate", trxdate)
                .add("trxtime", trxtime)
                .add("timestmp", timestmp)
                .add("postndat", postndat)
                .add("postsdat", postsdat)
                .add("posttime", posttime)
                .add("trxsqnb", trxsqnb)
                .add("ptrxsqnb", ptrxsqnb)
                .add("trxsqns", trxsqns)
                .add("trxcode", trxcode)
                .add("valuedat", valuedat)
                .add("currtype", currtype)
                .add("cashexf", cashexf)
                .add("catrflag", catrflag)
                .add("drcrf", drcrf)
                .add("amount", amount)
                .add("updbal", updbal)
                .add("notetype", notetype)
                .add("notes", notes)
                .add("revtranf", revtranf)
                .add("updtranf", updtranf)
                .add("posttype", posttype)
                .add("listtype", listtype)
                .add("recipbkn", recipbkn)
                .add("recipbka", recipbka)
                .add("recipact", recipact)
                .add("recipacs", recipacs)
                .add("recipacn", recipacn)
                .add("exchrat", exchrat)
                .add("forecurr", forecurr)
                .add("foreamt", foreamt)
                .add("vouhtype", vouhtype)
                .add("vouhno", vouhno)
                .add("mediumid", mediumid)
                .add("mediumno", mediumno)
                .add("medseno", medseno)
                .add("chnltype", chnltype)
                .add("chnlno", chnlno)
                .add("prodcode", prodcode)
                .add("prodno", prodno)
                .add("prodgpno", prodgpno)
                .add("trxzno", trxzno)
                .add("tphybrno", tphybrno)
                .add("phybrno", phybrno)
                .add("tellerno", tellerno)
                .add("authtlno", authtlno)
                .add("authno", authno)
                .add("termid", termid)
                .add("trxplcs", trxplcs)
                .add("statcode", statcode)
                .toString();
    }
}
