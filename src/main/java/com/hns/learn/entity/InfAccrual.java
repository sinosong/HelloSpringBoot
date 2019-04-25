package com.hns.learn.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.io.Serializable;
import java.util.Date;

/**
 * @author hannasong
 */
@TableName("INF_ACCRUAL")
public class InfAccrual extends BaseModel implements Serializable{

    @TableField("DEPTNAME")
    private String deptName;
    @TableField("TRADE_FINANCE_BUSINESS")
    private String traneFinanceBusiness;
    @TableField("LISTNO")
    private String listno;
    @TableField("DRDOACSN")
    private String drdoacsn;
    @TableField("MEDIUMNO")
    private String mediumno;
    @TableField("PTRXSQNB")
    private String ptrxsqnb;
    @TableField("POSTTYPE")
    private String posttype;
    @TableField("SYNDICATEDSTATUS")
    private String syndicatedStatus;
    @TableField("FOREAMT")
    private String foreamt;
    @TableField("OFAMT")
    private String ofamt;
    @TableField("PRODCODE")
    private String prodcode;
    @TableField("CMPRFLAG")
    private String cmprflag;
    @TableField("PRODUCTNAME")
    private String productName;
    @TableField("OVRAMTIT")
    private String ovramtit;
    @TableField("AMOUNT")
    private String amount;
    @TableField("SCOPEBUSINPERIOD")
    private String scopeBusinPeriod;
    @TableField("CONENO")
    private String coneno;
    @TableField("UPDBALCNY")
    private String updbalcny;
    @TableField("GRANTCODE")
    private String grantCode;
    @TableField("VALUEDAT")
    private String valuedat;
    @TableField("TRXTIME")
    private String trxtime;
    @TableField("SUBSERNO")
    private String subserno;
    @TableField("DRDOACTN")
    private String drdoactn;
    @TableField("PHYBRNO")
    private String phybrno;
    @TableField("AFWKLFE_FEEAMT")
    private String afwklfeFeeamt;
    @TableField("AFWKLFE_CURRTYPE")
    private String afwklfeCurrtype;
    @TableField("AFWKLFE_FEECLASS")
    private String afwklfeFeeclass;
    @TableField("TAXAMT")
    private String taxamt;
    @TableField("OFCIRATE")
    private String ofcirate;
    @TableField("RLVIBAL")
    private String rlvibal;
    @TableField("FINANCEPLATFORM")
    private String financePlatform;
    @TableField("LISTTYPE")
    private String listtype;
    @TableField("NTAXAMT")
    private String ntaxamt;
    @TableField("UPDBALUSD")
    private String updbalusd;
    @TableField("POSTSDAT")
    private String postsdat;
    @TableField("TRXDATE")
    private String trxdate;
    @TableField("DRDOACTA")
    private String drdoacta;
    @TableField("CASHEXF")
    private String cashexf;
    @TableField("PAYACTN")
    private String payactn;
    @TableField("TRXSQNS")
    private String trxsqns;
    @TableField("INAMT")
    private String inamt;
    @TableField("ACCOUNT_")
    private String account;
    @TableField("RECOURSE")
    private String recourse;
    @TableField("CURRENCY")
    private String currency;
    @TableField("TRXSQNB")
    private String trxsqnb;
    @TableField("POLICYATTRIBUTRECLASSIFY")
    private String policyAttributreClassify;
    @TableField("BIZRENTALFACTORINGCODE")
    private String bizRentalFactoringCode;
    @TableField("PAYACSN")
    private String payacsn;
    @TableField("NTAXBAL")
    private String ntaxbal;
    @TableField("OFAMTIT")
    private String ofamtit;
    @TableField("PROPSCALE")
    private String propscale;
    @TableField("BUSINESSTYPES")
    private String businessTypes;
    @TableField("REVTRANF")
    private String revtranf;
    @TableField("RLVRATE")
    private String rlvrate;
    @TableField("TRXPLCS")
    private String trxplcs;
    @TableField("INCIRATE")
    private String incirate;
    @TableField("PROPRAT")
    private String proprat;
    @TableField("OVRBAL")
    private String ovrbal;
    @TableField("PRODNO")
    private String prodno;
    @TableField("PAYACTA")
    private String payacta;
    @TableField("STATCODE")
    private String statcode;
    @TableField("ZONENO")
    private String zoneno;
    @TableField("CHNLTYPE")
    private String chnltype;
    @TableField("RECIPBKN")
    private String recipbkn;
    @TableField("PRINFLAG")
    private String prinflag;
    @TableField("PRODGPNO")
    private String prodgpno;
    @TableField("CHNLNO")
    private String chnlno;
    @TableField("TERMNUM")
    private String termnum;
    @TableField("RECIPBKA")
    private String recipbka;
    @TableField("VOUHNO")
    private String vouhno;
    @TableField("DRCRF")
    private String drcrf;
    @TableField("CONEORGNUM")
    private String coneorgnum;
    @TableField("CONERAT")
    private String conerat;
    @TableField("CURRTYPE")
    private String currtype;
    @TableField("FORECURR")
    private String forecurr;
    @TableField("TAXBAL")
    private String taxbal;
    @TableField("CATRFLAG")
    private String catrflag;
    @TableField("UPDTRANF")
    private String updtranf;
    @TableField("PROPCN")
    private String propcn;
    @TableField("VOUHTYPE")
    private String vouhtype;
    @TableField("PROPORGNUM")
    private String proporgnum;
    @TableField("TAXRATE")
    private String taxrate;
    @TableField("SOLUTIONAMT")
    private String solutionAmt;
    @TableField("EXCHRAT")
    private String exchrat;
    @TableField("DEBTCODE")
    private String debtCode;
    @TableField("TPHYBRNO")
    private String tphybrno;
    @TableField("AUTHNO")
    private String authno;
    @TableField("INTRATE")
    private String intrate;
    @TableField("CURRINT")
    private String currint;
    @TableField("MEDIUMID")
    private String mediumid;
    @TableField("TELLERNO")
    private String tellerno;
    @TableField("INCURBAL")
    private String incurbal;
    @TableField("RLVINT")
    private String rlvint;
    @TableField("INAMTIT")
    private String inamtit;
    @TableField("LGLOCKNO")
    private String lglockno;
    @TableField("PROJECTNAME")
    private String projectName;
    @TableField("POSTTIME")
    private String posttime;
    @TableField("DEPTCODE")
    private String deptCode;
    @TableField("TRXZNO")
    private String trxzno;
    @TableField("PROTSENO")
    private String protseno;
    @TableField("OVRAMT")
    private String ovramt;
    @TableField("TERMID")
    private String termid;
    @TableField("NOTES")
    private String notes;
    @TableField("TAXSUM")
    private String taxsum;
    @TableField("BANKTELLNAME")
    private String bankTellName;
    @TableField("RECIPACT")
    private String recipact;
    @TableField("UPDBAL")
    private String updbal;
    @TableField("RECIPACS")
    private String recipacs;
    @TableField("MCURRENCY")
    private String mCurrency;
    @TableField("RECIPACN")
    private String recipacn;
    @TableField("POSTNDAT")
    private String postndat;
    @TableField("MEDSENO")
    private String medseno;
    @TableField("OVRRATE")
    private String ovrrate;
    @TableField("NOTETYPE")
    private String notetype;
    @TableField("GRANTID")
    private String grantId;
    @TableField("CONESCALE")
    private String conescale;
    @TableField("CONECN")
    private String conecn;
    @TableField("AUTHTLNO")
    private String authtlno;
    @TableField("TIMESTMP")
    private String timestmp;
    @TableField("IOUCODE")
    private String iouCode;
    @TableField("LEASEHOLD")
    private String leasehold;
    @TableField("TRXCODE")
    private String trxcode;
    @TableField("SYNDICATELOAN")
    private String syndicateLoan;
    @TableField("OFCURBAL")
    private String ofcurbal;
    @TableField("PROPNO")
    private String propno;
    @TableField("WORKDATE")
    private Date workdate;

    public InfAccrual() {
    }

    public String getDeptName() {
        return deptName == "" ? null : deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getTraneFinanceBusiness() {
        return traneFinanceBusiness == "" ? null : traneFinanceBusiness;
    }

    public void setTraneFinanceBusiness(String traneFinanceBusiness) {
        this.traneFinanceBusiness = traneFinanceBusiness;
    }

    public String getListno() {
        return listno == "" ? null : listno;
    }

    public void setListno(String listno) {
        this.listno = listno;
    }

    public String getDrdoacsn() {
        return drdoacsn == "" ? null : drdoacsn;
    }

    public void setDrdoacsn(String drdoacsn) {
        this.drdoacsn = drdoacsn;
    }

    public String getMediumno() {
        return mediumno == "" ? null : mediumno;
    }

    public void setMediumno(String mediumno) {
        this.mediumno = mediumno;
    }

    public String getPtrxsqnb() {
        return ptrxsqnb == "" ? null : ptrxsqnb;
    }

    public void setPtrxsqnb(String ptrxsqnb) {
        this.ptrxsqnb = ptrxsqnb;
    }

    public String getPosttype() {
        return posttype == "" ? null : posttype;
    }

    public void setPosttype(String posttype) {
        this.posttype = posttype;
    }

    public String getSyndicatedStatus() {
        return syndicatedStatus == "" ? null : syndicatedStatus;
    }

    public void setSyndicatedStatus(String syndicatedStatus) {
        this.syndicatedStatus = syndicatedStatus;
    }

    public String getForeamt() {
        return foreamt == "" ? null : foreamt;
    }

    public void setForeamt(String foreamt) {
        this.foreamt = foreamt;
    }

    public String getOfamt() {
        return ofamt == "" ? null : ofamt;
    }

    public void setOfamt(String ofamt) {
        this.ofamt = ofamt;
    }

    public String getProdcode() {
        return prodcode == "" ? null : prodcode;
    }

    public void setProdcode(String prodcode) {
        this.prodcode = prodcode;
    }

    public String getCmprflag() {
        return cmprflag == "" ? null : cmprflag;
    }

    public void setCmprflag(String cmprflag) {
        this.cmprflag = cmprflag;
    }

    public String getProductName() {
        return productName == "" ? null : productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getOvramtit() {
        return ovramtit == "" ? null : ovramtit;
    }

    public void setOvramtit(String ovramtit) {
        this.ovramtit = ovramtit;
    }

    public String getAmount() {
        return amount == "" ? null : amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getScopeBusinPeriod() {
        return scopeBusinPeriod == "" ? null : scopeBusinPeriod;
    }

    public void setScopeBusinPeriod(String scopeBusinPeriod) {
        this.scopeBusinPeriod = scopeBusinPeriod;
    }

    public String getConeno() {
        return coneno == "" ? null : coneno;
    }

    public void setConeno(String coneno) {
        this.coneno = coneno;
    }

    public String getUpdbalcny() {
        return updbalcny == "" ? null : updbalcny;
    }

    public void setUpdbalcny(String updbalcny) {
        this.updbalcny = updbalcny;
    }

    public String getGrantCode() {
        return grantCode == "" ? null : grantCode;
    }

    public void setGrantCode(String grantCode) {
        this.grantCode = grantCode;
    }

    public String getValuedat() {
        return valuedat == "" ? null : valuedat;
    }

    public void setValuedat(String valuedat) {
        this.valuedat = valuedat;
    }

    public String getTrxtime() {
        return trxtime == "" ? null : trxtime;
    }

    public void setTrxtime(String trxtime) {
        this.trxtime = trxtime;
    }

    public String getSubserno() {
        return subserno == "" ? null : subserno;
    }

    public void setSubserno(String subserno) {
        this.subserno = subserno;
    }

    public String getDrdoactn() {
        return drdoactn == "" ? null : drdoactn;
    }

    public void setDrdoactn(String drdoactn) {
        this.drdoactn = drdoactn;
    }

    public String getPhybrno() {
        return phybrno == "" ? null : phybrno;
    }

    public void setPhybrno(String phybrno) {
        this.phybrno = phybrno;
    }

    public String getAfwklfeFeeamt() {
        return afwklfeFeeamt == "" ? null : afwklfeFeeamt;
    }

    public void setAfwklfeFeeamt(String afwklfeFeeamt) {
        this.afwklfeFeeamt = afwklfeFeeamt;
    }

    public String getAfwklfeCurrtype() {
        return afwklfeCurrtype == "" ? null : afwklfeCurrtype;
    }

    public void setAfwklfeCurrtype(String afwklfeCurrtype) {
        this.afwklfeCurrtype = afwklfeCurrtype;
    }

    public String getAfwklfeFeeclass() {
        return afwklfeFeeclass == "" ? null : afwklfeFeeclass;
    }

    public void setAfwklfeFeeclass(String afwklfeFeeclass) {
        this.afwklfeFeeclass = afwklfeFeeclass;
    }

    public String getTaxamt() {
        return taxamt == "" ? null : taxamt;
    }

    public void setTaxamt(String taxamt) {
        this.taxamt = taxamt;
    }

    public String getOfcirate() {
        return ofcirate == "" ? null : ofcirate;
    }

    public void setOfcirate(String ofcirate) {
        this.ofcirate = ofcirate;
    }

    public String getRlvibal() {
        return rlvibal == "" ? null : rlvibal;
    }

    public void setRlvibal(String rlvibal) {
        this.rlvibal = rlvibal;
    }

    public String getFinancePlatform() {
        return financePlatform == "" ? null : financePlatform;
    }

    public void setFinancePlatform(String financePlatform) {
        this.financePlatform = financePlatform;
    }

    public String getListtype() {
        return listtype == "" ? null : listtype;
    }

    public void setListtype(String listtype) {
        this.listtype = listtype;
    }

    public String getNtaxamt() {
        return ntaxamt == "" ? null : ntaxamt;
    }

    public void setNtaxamt(String ntaxamt) {
        this.ntaxamt = ntaxamt;
    }

    public String getUpdbalusd() {
        return updbalusd == "" ? null : updbalusd;
    }

    public void setUpdbalusd(String updbalusd) {
        this.updbalusd = updbalusd;
    }

    public String getPostsdat() {
        return postsdat == "" ? null : postsdat;
    }

    public void setPostsdat(String postsdat) {
        this.postsdat = postsdat;
    }

    public String getTrxdate() {
        return trxdate == "" ? null : trxdate;
    }

    public void setTrxdate(String trxdate) {
        this.trxdate = trxdate;
    }

    public String getDrdoacta() {
        return drdoacta == "" ? null : drdoacta;
    }

    public void setDrdoacta(String drdoacta) {
        this.drdoacta = drdoacta;
    }

    public String getCashexf() {
        return cashexf == "" ? null : cashexf;
    }

    public void setCashexf(String cashexf) {
        this.cashexf = cashexf;
    }

    public String getPayactn() {
        return payactn == "" ? null : payactn;
    }

    public void setPayactn(String payactn) {
        this.payactn = payactn;
    }

    public String getTrxsqns() {
        return trxsqns == "" ? null : trxsqns;
    }

    public void setTrxsqns(String trxsqns) {
        this.trxsqns = trxsqns;
    }

    public String getInamt() {
        return inamt == "" ? null : inamt;
    }

    public void setInamt(String inamt) {
        this.inamt = inamt;
    }

    public String getAccount() {
        return account == "" ? null : account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getRecourse() {
        return recourse == "" ? null : recourse;
    }

    public void setRecourse(String recourse) {
        this.recourse = recourse;
    }

    public String getCurrency() {
        return currency == "" ? null : currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getTrxsqnb() {
        return trxsqnb == "" ? null : trxsqnb;
    }

    public void setTrxsqnb(String trxsqnb) {
        this.trxsqnb = trxsqnb;
    }

    public String getPolicyAttributreClassify() {
        return policyAttributreClassify == "" ? null : policyAttributreClassify;
    }

    public void setPolicyAttributreClassify(String policyAttributreClassify) {
        this.policyAttributreClassify = policyAttributreClassify;
    }

    public String getBizRentalFactoringCode() {
        return bizRentalFactoringCode == "" ? null : bizRentalFactoringCode;
    }

    public void setBizRentalFactoringCode(String bizRentalFactoringCode) {
        this.bizRentalFactoringCode = bizRentalFactoringCode;
    }

    public String getPayacsn() {
        return payacsn == "" ? null : payacsn;
    }

    public void setPayacsn(String payacsn) {
        this.payacsn = payacsn;
    }

    public String getNtaxbal() {
        return ntaxbal == "" ? null : ntaxbal;
    }

    public void setNtaxbal(String ntaxbal) {
        this.ntaxbal = ntaxbal;
    }

    public String getOfamtit() {
        return ofamtit == "" ? null : ofamtit;
    }

    public void setOfamtit(String ofamtit) {
        this.ofamtit = ofamtit;
    }

    public String getPropscale() {
        return propscale == "" ? null : propscale;
    }

    public void setPropscale(String propscale) {
        this.propscale = propscale;
    }

    public String getBusinessTypes() {
        return businessTypes == "" ? null : businessTypes;
    }

    public void setBusinessTypes(String businessTypes) {
        this.businessTypes = businessTypes;
    }

    public String getRevtranf() {
        return revtranf == "" ? null : revtranf;
    }

    public void setRevtranf(String revtranf) {
        this.revtranf = revtranf;
    }

    public String getRlvrate() {
        return rlvrate == "" ? null : rlvrate;
    }

    public void setRlvrate(String rlvrate) {
        this.rlvrate = rlvrate;
    }

    public String getTrxplcs() {
        return trxplcs == "" ? null : trxplcs;
    }

    public void setTrxplcs(String trxplcs) {
        this.trxplcs = trxplcs;
    }

    public String getIncirate() {
        return incirate == "" ? null : incirate;
    }

    public void setIncirate(String incirate) {
        this.incirate = incirate;
    }

    public String getProprat() {
        return proprat == "" ? null : proprat;
    }

    public void setProprat(String proprat) {
        this.proprat = proprat;
    }

    public String getOvrbal() {
        return ovrbal == "" ? null : ovrbal;
    }

    public void setOvrbal(String ovrbal) {
        this.ovrbal = ovrbal;
    }

    public String getProdno() {
        return prodno == "" ? null : prodno;
    }

    public void setProdno(String prodno) {
        this.prodno = prodno;
    }

    public String getPayacta() {
        return payacta == "" ? null : payacta;
    }

    public void setPayacta(String payacta) {
        this.payacta = payacta;
    }

    public String getStatcode() {
        return statcode == "" ? null : statcode;
    }

    public void setStatcode(String statcode) {
        this.statcode = statcode;
    }

    public String getZoneno() {
        return zoneno == "" ? null : zoneno;
    }

    public void setZoneno(String zoneno) {
        this.zoneno = zoneno;
    }

    public String getChnltype() {
        return chnltype == "" ? null : chnltype;
    }

    public void setChnltype(String chnltype) {
        this.chnltype = chnltype;
    }

    public String getRecipbkn() {
        return recipbkn == "" ? null : recipbkn;
    }

    public void setRecipbkn(String recipbkn) {
        this.recipbkn = recipbkn;
    }

    public String getPrinflag() {
        return prinflag == "" ? null : prinflag;
    }

    public void setPrinflag(String prinflag) {
        this.prinflag = prinflag;
    }

    public String getProdgpno() {
        return prodgpno == "" ? null : prodgpno;
    }

    public void setProdgpno(String prodgpno) {
        this.prodgpno = prodgpno;
    }

    public String getChnlno() {
        return chnlno == "" ? null : chnlno;
    }

    public void setChnlno(String chnlno) {
        this.chnlno = chnlno;
    }

    public String getTermnum() {
        return termnum == "" ? null : termnum;
    }

    public void setTermnum(String termnum) {
        this.termnum = termnum;
    }

    public String getRecipbka() {
        return recipbka == "" ? null : recipbka;
    }

    public void setRecipbka(String recipbka) {
        this.recipbka = recipbka;
    }

    public String getVouhno() {
        return vouhno == "" ? null : vouhno;
    }

    public void setVouhno(String vouhno) {
        this.vouhno = vouhno;
    }

    public String getDrcrf() {
        return drcrf == "" ? null : drcrf;
    }

    public void setDrcrf(String drcrf) {
        this.drcrf = drcrf;
    }

    public String getConeorgnum() {
        return coneorgnum == "" ? null : coneorgnum;
    }

    public void setConeorgnum(String coneorgnum) {
        this.coneorgnum = coneorgnum;
    }

    public String getConerat() {
        return conerat == "" ? null : conerat;
    }

    public void setConerat(String conerat) {
        this.conerat = conerat;
    }

    public String getCurrtype() {
        return currtype == "" ? null : currtype;
    }

    public void setCurrtype(String currtype) {
        this.currtype = currtype;
    }

    public String getForecurr() {
        return forecurr == "" ? null : forecurr;
    }

    public void setForecurr(String forecurr) {
        this.forecurr = forecurr;
    }

    public String getTaxbal() {
        return taxbal == "" ? null : taxbal;
    }

    public void setTaxbal(String taxbal) {
        this.taxbal = taxbal;
    }

    public String getCatrflag() {
        return catrflag == "" ? null : catrflag;
    }

    public void setCatrflag(String catrflag) {
        this.catrflag = catrflag;
    }

    public String getUpdtranf() {
        return updtranf == "" ? null : updtranf;
    }

    public void setUpdtranf(String updtranf) {
        this.updtranf = updtranf;
    }

    public String getPropcn() {
        return propcn == "" ? null : propcn;
    }

    public void setPropcn(String propcn) {
        this.propcn = propcn;
    }

    public String getVouhtype() {
        return vouhtype == "" ? null : vouhtype;
    }

    public void setVouhtype(String vouhtype) {
        this.vouhtype = vouhtype;
    }

    public String getProporgnum() {
        return proporgnum == "" ? null : proporgnum;
    }

    public void setProporgnum(String proporgnum) {
        this.proporgnum = proporgnum;
    }

    public String getTaxrate() {
        return taxrate == "" ? null : taxrate;
    }

    public void setTaxrate(String taxrate) {
        this.taxrate = taxrate;
    }

    public String getSolutionAmt() {
        return solutionAmt == "" ? null : solutionAmt;
    }

    public void setSolutionAmt(String solutionAmt) {
        this.solutionAmt = solutionAmt;
    }

    public String getExchrat() {
        return exchrat == "" ? null : exchrat;
    }

    public void setExchrat(String exchrat) {
        this.exchrat = exchrat;
    }

    public String getDebtCode() {
        return debtCode == "" ? null : debtCode;
    }

    public void setDebtCode(String debtCode) {
        this.debtCode = debtCode;
    }

    public String getTphybrno() {
        return tphybrno == "" ? null : tphybrno;
    }

    public void setTphybrno(String tphybrno) {
        this.tphybrno = tphybrno;
    }

    public String getAuthno() {
        return authno == "" ? null : authno;
    }

    public void setAuthno(String authno) {
        this.authno = authno;
    }

    public String getIntrate() {
        return intrate == "" ? null : intrate;
    }

    public void setIntrate(String intrate) {
        this.intrate = intrate;
    }

    public String getCurrint() {
        return currint == "" ? null : currint;
    }

    public void setCurrint(String currint) {
        this.currint = currint;
    }

    public String getMediumid() {
        return mediumid == "" ? null : mediumid;
    }

    public void setMediumid(String mediumid) {
        this.mediumid = mediumid;
    }

    public String getTellerno() {
        return tellerno == "" ? null : tellerno;
    }

    public void setTellerno(String tellerno) {
        this.tellerno = tellerno;
    }

    public String getIncurbal() {
        return incurbal == "" ? null : incurbal;
    }

    public void setIncurbal(String incurbal) {
        this.incurbal = incurbal;
    }

    public String getRlvint() {
        return rlvint == "" ? null : rlvint;
    }

    public void setRlvint(String rlvint) {
        this.rlvint = rlvint;
    }

    public String getInamtit() {
        return inamtit == "" ? null : inamtit;
    }

    public void setInamtit(String inamtit) {
        this.inamtit = inamtit;
    }

    public String getLglockno() {
        return lglockno == "" ? null : lglockno;
    }

    public void setLglockno(String lglockno) {
        this.lglockno = lglockno;
    }

    public String getProjectName() {
        return projectName == "" ? null : projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getPosttime() {
        return posttime == "" ? null : posttime;
    }

    public void setPosttime(String posttime) {
        this.posttime = posttime;
    }

    public String getDeptCode() {
        return deptCode == "" ? null : deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getTrxzno() {
        return trxzno == "" ? null : trxzno;
    }

    public void setTrxzno(String trxzno) {
        this.trxzno = trxzno;
    }

    public String getProtseno() {
        return protseno == "" ? null : protseno;
    }

    public void setProtseno(String protseno) {
        this.protseno = protseno;
    }

    public String getOvramt() {
        return ovramt == "" ? null : ovramt;
    }

    public void setOvramt(String ovramt) {
        this.ovramt = ovramt;
    }

    public String getTermid() {
        return termid == "" ? null : termid;
    }

    public void setTermid(String termid) {
        this.termid = termid;
    }

    public String getNotes() {
        return notes == "" ? null : notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getTaxsum() {
        return taxsum == "" ? null : taxsum;
    }

    public void setTaxsum(String taxsum) {
        this.taxsum = taxsum;
    }

    public String getBankTellName() {
        return bankTellName == "" ? null : bankTellName;
    }

    public void setBankTellName(String bankTellName) {
        this.bankTellName = bankTellName;
    }

    public String getRecipact() {
        return recipact == "" ? null : recipact;
    }

    public void setRecipact(String recipact) {
        this.recipact = recipact;
    }

    public String getUpdbal() {
        return updbal == "" ? null : updbal;
    }

    public void setUpdbal(String updbal) {
        this.updbal = updbal;
    }

    public String getRecipacs() {
        return recipacs == "" ? null : recipacs;
    }

    public void setRecipacs(String recipacs) {
        this.recipacs = recipacs;
    }

    public String getmCurrency() {
        return mCurrency == "" ? null : mCurrency;
    }

    public void setmCurrency(String mCurrency) {
        this.mCurrency = mCurrency;
    }

    public String getRecipacn() {
        return recipacn == "" ? null : recipacn;
    }

    public void setRecipacn(String recipacn) {
        this.recipacn = recipacn;
    }

    public String getPostndat() {
        return postndat == "" ? null : postndat;
    }

    public void setPostndat(String postndat) {
        this.postndat = postndat;
    }

    public String getMedseno() {
        return medseno == "" ? null : medseno;
    }

    public void setMedseno(String medseno) {
        this.medseno = medseno;
    }

    public String getOvrrate() {
        return ovrrate == "" ? null : ovrrate;
    }

    public void setOvrrate(String ovrrate) {
        this.ovrrate = ovrrate;
    }

    public String getNotetype() {
        return notetype == "" ? null : notetype;
    }

    public void setNotetype(String notetype) {
        this.notetype = notetype;
    }

    public String getGrantId() {
        return grantId == "" ? null : grantId;
    }

    public void setGrantId(String grantId) {
        this.grantId = grantId;
    }

    public String getConescale() {
        return conescale == "" ? null : conescale;
    }

    public void setConescale(String conescale) {
        this.conescale = conescale;
    }

    public String getConecn() {
        return conecn == "" ? null : conecn;
    }

    public void setConecn(String conecn) {
        this.conecn = conecn;
    }

    public String getAuthtlno() {
        return authtlno == "" ? null : authtlno;
    }

    public void setAuthtlno(String authtlno) {
        this.authtlno = authtlno;
    }

    public String getTimestmp() {
        return timestmp == "" ? null : timestmp;
    }

    public void setTimestmp(String timestmp) {
        this.timestmp = timestmp;
    }

    public String getIouCode() {
        return iouCode == "" ? null : iouCode;
    }

    public void setIouCode(String iouCode) {
        this.iouCode = iouCode;
    }

    public String getLeasehold() {
        return leasehold == "" ? null : leasehold;
    }

    public void setLeasehold(String leasehold) {
        this.leasehold = leasehold;
    }

    public String getTrxcode() {
        return trxcode == "" ? null : trxcode;
    }

    public void setTrxcode(String trxcode) {
        this.trxcode = trxcode;
    }

    public String getSyndicateLoan() {
        return syndicateLoan == "" ? null : syndicateLoan;
    }

    public void setSyndicateLoan(String syndicateLoan) {
        this.syndicateLoan = syndicateLoan;
    }

    public String getOfcurbal() {
        return ofcurbal == "" ? null : ofcurbal;
    }

    public void setOfcurbal(String ofcurbal) {
        this.ofcurbal = ofcurbal;
    }

    public String getPropno() {
        return propno == "" ? null : propno;
    }

    public void setPropno(String propno) {
        this.propno = propno;
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
        if (!(o instanceof InfAccrual)) return false;
        InfAccrual that = (InfAccrual) o;
        return Objects.equal(getDeptName(), that.getDeptName()) &&
                Objects.equal(getTraneFinanceBusiness(), that.getTraneFinanceBusiness()) &&
                Objects.equal(getListno(), that.getListno()) &&
                Objects.equal(getDrdoacsn(), that.getDrdoacsn()) &&
                Objects.equal(getMediumno(), that.getMediumno()) &&
                Objects.equal(getPtrxsqnb(), that.getPtrxsqnb()) &&
                Objects.equal(getPosttype(), that.getPosttype()) &&
                Objects.equal(getSyndicatedStatus(), that.getSyndicatedStatus()) &&
                Objects.equal(getForeamt(), that.getForeamt()) &&
                Objects.equal(getOfamt(), that.getOfamt()) &&
                Objects.equal(getProdcode(), that.getProdcode()) &&
                Objects.equal(getCmprflag(), that.getCmprflag()) &&
                Objects.equal(getProductName(), that.getProductName()) &&
                Objects.equal(getOvramtit(), that.getOvramtit()) &&
                Objects.equal(getAmount(), that.getAmount()) &&
                Objects.equal(getScopeBusinPeriod(), that.getScopeBusinPeriod()) &&
                Objects.equal(getConeno(), that.getConeno()) &&
                Objects.equal(getUpdbalcny(), that.getUpdbalcny()) &&
                Objects.equal(getGrantCode(), that.getGrantCode()) &&
                Objects.equal(getValuedat(), that.getValuedat()) &&
                Objects.equal(getTrxtime(), that.getTrxtime()) &&
                Objects.equal(getSubserno(), that.getSubserno()) &&
                Objects.equal(getDrdoactn(), that.getDrdoactn()) &&
                Objects.equal(getPhybrno(), that.getPhybrno()) &&
                Objects.equal(getAfwklfeFeeamt(), that.getAfwklfeFeeamt()) &&
                Objects.equal(getAfwklfeCurrtype(), that.getAfwklfeCurrtype()) &&
                Objects.equal(getAfwklfeFeeclass(), that.getAfwklfeFeeclass()) &&
                Objects.equal(getTaxamt(), that.getTaxamt()) &&
                Objects.equal(getOfcirate(), that.getOfcirate()) &&
                Objects.equal(getRlvibal(), that.getRlvibal()) &&
                Objects.equal(getFinancePlatform(), that.getFinancePlatform()) &&
                Objects.equal(getListtype(), that.getListtype()) &&
                Objects.equal(getNtaxamt(), that.getNtaxamt()) &&
                Objects.equal(getUpdbalusd(), that.getUpdbalusd()) &&
                Objects.equal(getPostsdat(), that.getPostsdat()) &&
                Objects.equal(getTrxdate(), that.getTrxdate()) &&
                Objects.equal(getDrdoacta(), that.getDrdoacta()) &&
                Objects.equal(getCashexf(), that.getCashexf()) &&
                Objects.equal(getPayactn(), that.getPayactn()) &&
                Objects.equal(getTrxsqns(), that.getTrxsqns()) &&
                Objects.equal(getInamt(), that.getInamt()) &&
                Objects.equal(getAccount(), that.getAccount()) &&
                Objects.equal(getRecourse(), that.getRecourse()) &&
                Objects.equal(getCurrency(), that.getCurrency()) &&
                Objects.equal(getTrxsqnb(), that.getTrxsqnb()) &&
                Objects.equal(getPolicyAttributreClassify(), that.getPolicyAttributreClassify()) &&
                Objects.equal(getBizRentalFactoringCode(), that.getBizRentalFactoringCode()) &&
                Objects.equal(getPayacsn(), that.getPayacsn()) &&
                Objects.equal(getNtaxbal(), that.getNtaxbal()) &&
                Objects.equal(getOfamtit(), that.getOfamtit()) &&
                Objects.equal(getPropscale(), that.getPropscale()) &&
                Objects.equal(getBusinessTypes(), that.getBusinessTypes()) &&
                Objects.equal(getRevtranf(), that.getRevtranf()) &&
                Objects.equal(getRlvrate(), that.getRlvrate()) &&
                Objects.equal(getTrxplcs(), that.getTrxplcs()) &&
                Objects.equal(getIncirate(), that.getIncirate()) &&
                Objects.equal(getProprat(), that.getProprat()) &&
                Objects.equal(getOvrbal(), that.getOvrbal()) &&
                Objects.equal(getProdno(), that.getProdno()) &&
                Objects.equal(getPayacta(), that.getPayacta()) &&
                Objects.equal(getStatcode(), that.getStatcode()) &&
                Objects.equal(getZoneno(), that.getZoneno()) &&
                Objects.equal(getChnltype(), that.getChnltype()) &&
                Objects.equal(getRecipbkn(), that.getRecipbkn()) &&
                Objects.equal(getPrinflag(), that.getPrinflag()) &&
                Objects.equal(getProdgpno(), that.getProdgpno()) &&
                Objects.equal(getChnlno(), that.getChnlno()) &&
                Objects.equal(getTermnum(), that.getTermnum()) &&
                Objects.equal(getRecipbka(), that.getRecipbka()) &&
                Objects.equal(getVouhno(), that.getVouhno()) &&
                Objects.equal(getDrcrf(), that.getDrcrf()) &&
                Objects.equal(getConeorgnum(), that.getConeorgnum()) &&
                Objects.equal(getConerat(), that.getConerat()) &&
                Objects.equal(getCurrtype(), that.getCurrtype()) &&
                Objects.equal(getForecurr(), that.getForecurr()) &&
                Objects.equal(getTaxbal(), that.getTaxbal()) &&
                Objects.equal(getCatrflag(), that.getCatrflag()) &&
                Objects.equal(getUpdtranf(), that.getUpdtranf()) &&
                Objects.equal(getPropcn(), that.getPropcn()) &&
                Objects.equal(getVouhtype(), that.getVouhtype()) &&
                Objects.equal(getProporgnum(), that.getProporgnum()) &&
                Objects.equal(getTaxrate(), that.getTaxrate()) &&
                Objects.equal(getSolutionAmt(), that.getSolutionAmt()) &&
                Objects.equal(getExchrat(), that.getExchrat()) &&
                Objects.equal(getDebtCode(), that.getDebtCode()) &&
                Objects.equal(getTphybrno(), that.getTphybrno()) &&
                Objects.equal(getAuthno(), that.getAuthno()) &&
                Objects.equal(getIntrate(), that.getIntrate()) &&
                Objects.equal(getCurrint(), that.getCurrint()) &&
                Objects.equal(getMediumid(), that.getMediumid()) &&
                Objects.equal(getTellerno(), that.getTellerno()) &&
                Objects.equal(getIncurbal(), that.getIncurbal()) &&
                Objects.equal(getRlvint(), that.getRlvint()) &&
                Objects.equal(getInamtit(), that.getInamtit()) &&
                Objects.equal(getLglockno(), that.getLglockno()) &&
                Objects.equal(getProjectName(), that.getProjectName()) &&
                Objects.equal(getPosttime(), that.getPosttime()) &&
                Objects.equal(getDeptCode(), that.getDeptCode()) &&
                Objects.equal(getTrxzno(), that.getTrxzno()) &&
                Objects.equal(getProtseno(), that.getProtseno()) &&
                Objects.equal(getOvramt(), that.getOvramt()) &&
                Objects.equal(getTermid(), that.getTermid()) &&
                Objects.equal(getNotes(), that.getNotes()) &&
                Objects.equal(getTaxsum(), that.getTaxsum()) &&
                Objects.equal(getBankTellName(), that.getBankTellName()) &&
                Objects.equal(getRecipact(), that.getRecipact()) &&
                Objects.equal(getUpdbal(), that.getUpdbal()) &&
                Objects.equal(getRecipacs(), that.getRecipacs()) &&
                Objects.equal(getmCurrency(), that.getmCurrency()) &&
                Objects.equal(getRecipacn(), that.getRecipacn()) &&
                Objects.equal(getPostndat(), that.getPostndat()) &&
                Objects.equal(getMedseno(), that.getMedseno()) &&
                Objects.equal(getOvrrate(), that.getOvrrate()) &&
                Objects.equal(getNotetype(), that.getNotetype()) &&
                Objects.equal(getGrantId(), that.getGrantId()) &&
                Objects.equal(getConescale(), that.getConescale()) &&
                Objects.equal(getConecn(), that.getConecn()) &&
                Objects.equal(getAuthtlno(), that.getAuthtlno()) &&
                Objects.equal(getTimestmp(), that.getTimestmp()) &&
                Objects.equal(getIouCode(), that.getIouCode()) &&
                Objects.equal(getLeasehold(), that.getLeasehold()) &&
                Objects.equal(getTrxcode(), that.getTrxcode()) &&
                Objects.equal(getSyndicateLoan(), that.getSyndicateLoan()) &&
                Objects.equal(getOfcurbal(), that.getOfcurbal()) &&
                Objects.equal(getPropno(), that.getPropno()) &&
                Objects.equal(getWorkdate(), that.getWorkdate());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getDeptName(), getTraneFinanceBusiness(), getListno(), getDrdoacsn(), getMediumno(), getPtrxsqnb(), getPosttype(), getSyndicatedStatus(), getForeamt(), getOfamt(), getProdcode(), getCmprflag(), getProductName(), getOvramtit(), getAmount(), getScopeBusinPeriod(), getConeno(), getUpdbalcny(), getGrantCode(), getValuedat(), getTrxtime(), getSubserno(), getDrdoactn(), getPhybrno(), getAfwklfeFeeamt(), getAfwklfeCurrtype(), getAfwklfeFeeclass(), getTaxamt(), getOfcirate(), getRlvibal(), getFinancePlatform(), getListtype(), getNtaxamt(), getUpdbalusd(), getPostsdat(), getTrxdate(), getDrdoacta(), getCashexf(), getPayactn(), getTrxsqns(), getInamt(), getAccount(), getRecourse(), getCurrency(), getTrxsqnb(), getPolicyAttributreClassify(), getBizRentalFactoringCode(), getPayacsn(), getNtaxbal(), getOfamtit(), getPropscale(), getBusinessTypes(), getRevtranf(), getRlvrate(), getTrxplcs(), getIncirate(), getProprat(), getOvrbal(), getProdno(), getPayacta(), getStatcode(), getZoneno(), getChnltype(), getRecipbkn(), getPrinflag(), getProdgpno(), getChnlno(), getTermnum(), getRecipbka(), getVouhno(), getDrcrf(), getConeorgnum(), getConerat(), getCurrtype(), getForecurr(), getTaxbal(), getCatrflag(), getUpdtranf(), getPropcn(), getVouhtype(), getProporgnum(), getTaxrate(), getSolutionAmt(), getExchrat(), getDebtCode(), getTphybrno(), getAuthno(), getIntrate(), getCurrint(), getMediumid(), getTellerno(), getIncurbal(), getRlvint(), getInamtit(), getLglockno(), getProjectName(), getPosttime(), getDeptCode(), getTrxzno(), getProtseno(), getOvramt(), getTermid(), getNotes(), getTaxsum(), getBankTellName(), getRecipact(), getUpdbal(), getRecipacs(), getmCurrency(), getRecipacn(), getPostndat(), getMedseno(), getOvrrate(), getNotetype(), getGrantId(), getConescale(), getConecn(), getAuthtlno(), getTimestmp(), getIouCode(), getLeasehold(), getTrxcode(), getSyndicateLoan(), getOfcurbal(), getPropno(), getWorkdate());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("deptName", deptName)
                .add("traneFinanceBusiness", traneFinanceBusiness)
                .add("listno", listno)
                .add("drdoacsn", drdoacsn)
                .add("mediumno", mediumno)
                .add("ptrxsqnb", ptrxsqnb)
                .add("posttype", posttype)
                .add("syndicatedStatus", syndicatedStatus)
                .add("foreamt", foreamt)
                .add("ofamt", ofamt)
                .add("prodcode", prodcode)
                .add("cmprflag", cmprflag)
                .add("productName", productName)
                .add("ovramtit", ovramtit)
                .add("amount", amount)
                .add("scopeBusinPeriod", scopeBusinPeriod)
                .add("coneno", coneno)
                .add("updbalcny", updbalcny)
                .add("grantCode", grantCode)
                .add("valuedat", valuedat)
                .add("trxtime", trxtime)
                .add("subserno", subserno)
                .add("drdoactn", drdoactn)
                .add("phybrno", phybrno)
                .add("afwklfeFeeamt", afwklfeFeeamt)
                .add("afwklfeCurrtype", afwklfeCurrtype)
                .add("afwklfeFeeclass", afwklfeFeeclass)
                .add("taxamt", taxamt)
                .add("ofcirate", ofcirate)
                .add("rlvibal", rlvibal)
                .add("financePlatform", financePlatform)
                .add("listtype", listtype)
                .add("ntaxamt", ntaxamt)
                .add("updbalusd", updbalusd)
                .add("postsdat", postsdat)
                .add("trxdate", trxdate)
                .add("drdoacta", drdoacta)
                .add("cashexf", cashexf)
                .add("payactn", payactn)
                .add("trxsqns", trxsqns)
                .add("inamt", inamt)
                .add("account", account)
                .add("recourse", recourse)
                .add("currency", currency)
                .add("trxsqnb", trxsqnb)
                .add("policyAttributreClassify", policyAttributreClassify)
                .add("bizRentalFactoringCode", bizRentalFactoringCode)
                .add("payacsn", payacsn)
                .add("ntaxbal", ntaxbal)
                .add("ofamtit", ofamtit)
                .add("propscale", propscale)
                .add("businessTypes", businessTypes)
                .add("revtranf", revtranf)
                .add("rlvrate", rlvrate)
                .add("trxplcs", trxplcs)
                .add("incirate", incirate)
                .add("proprat", proprat)
                .add("ovrbal", ovrbal)
                .add("prodno", prodno)
                .add("payacta", payacta)
                .add("statcode", statcode)
                .add("zoneno", zoneno)
                .add("chnltype", chnltype)
                .add("recipbkn", recipbkn)
                .add("prinflag", prinflag)
                .add("prodgpno", prodgpno)
                .add("chnlno", chnlno)
                .add("termnum", termnum)
                .add("recipbka", recipbka)
                .add("vouhno", vouhno)
                .add("drcrf", drcrf)
                .add("coneorgnum", coneorgnum)
                .add("conerat", conerat)
                .add("currtype", currtype)
                .add("forecurr", forecurr)
                .add("taxbal", taxbal)
                .add("catrflag", catrflag)
                .add("updtranf", updtranf)
                .add("propcn", propcn)
                .add("vouhtype", vouhtype)
                .add("proporgnum", proporgnum)
                .add("taxrate", taxrate)
                .add("solutionAmt", solutionAmt)
                .add("exchrat", exchrat)
                .add("debtCode", debtCode)
                .add("tphybrno", tphybrno)
                .add("authno", authno)
                .add("intrate", intrate)
                .add("currint", currint)
                .add("mediumid", mediumid)
                .add("tellerno", tellerno)
                .add("incurbal", incurbal)
                .add("rlvint", rlvint)
                .add("inamtit", inamtit)
                .add("lglockno", lglockno)
                .add("projectName", projectName)
                .add("posttime", posttime)
                .add("deptCode", deptCode)
                .add("trxzno", trxzno)
                .add("protseno", protseno)
                .add("ovramt", ovramt)
                .add("termid", termid)
                .add("notes", notes)
                .add("taxsum", taxsum)
                .add("bankTellName", bankTellName)
                .add("recipact", recipact)
                .add("updbal", updbal)
                .add("recipacs", recipacs)
                .add("mCurrency", mCurrency)
                .add("recipacn", recipacn)
                .add("postndat", postndat)
                .add("medseno", medseno)
                .add("ovrrate", ovrrate)
                .add("notetype", notetype)
                .add("grantId", grantId)
                .add("conescale", conescale)
                .add("conecn", conecn)
                .add("authtlno", authtlno)
                .add("timestmp", timestmp)
                .add("iouCode", iouCode)
                .add("leasehold", leasehold)
                .add("trxcode", trxcode)
                .add("syndicateLoan", syndicateLoan)
                .add("ofcurbal", ofcurbal)
                .add("propno", propno)
                .add("workdate", workdate)
                .toString();
    }

}
