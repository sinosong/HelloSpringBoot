package com.hns.learn.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.google.common.base.MoreObjects;

import java.io.Serializable;

/**
 * 综合信息查询
 * @author hannasong
 * @version 1.0
 */
@TableName("INF_COMPREHENSIVE")
public class InfComprehensive extends BaseModel implements Serializable {


    @TableField("ACCOUNT_")
    private String account;
    @TableField("BANK_TELL_NAME")
    private String bankTellName;
    @TableField("BIZ_RENTAL_FACTORING_CODE")
    private String bizRentalFactoringCode;
    @TableField("BUSINESS_TYPES")
    private String businessTypes;
    @TableField("CALINTF")
    private String calintf;
    @TableField("CONECN")
    private String conecn;
    @TableField("CONENO")
    private String coneno;
    @TableField("CONEORGNUM")
    private String coneorgnum;
    @TableField("CONERAT")
    private String conerat;
    @TableField("CONESCALE")
    private String conescale;
    @TableField("CURRENCY")
    private String currency;
    @TableField("DEBTCODE")
    private String debtCode;
    @TableField("DEPTCODE")
    private String deptCode;
    @TableField("DEPTNAME")
    private String deptName;
    @TableField("DUEDATE")
    private String dueDate;
    @TableField("FEE")
    private String fee;
    @TableField("FINANCE_PLATFORM")
    private String financePlatform;
    @TableField("GRANTCODE")
    private String grantCode;
    @TableField("GRANTID")
    private String grantId;
    @TableField("GUARANTEEMODE")
    private String guaranteeMode;
    @TableField("INCALINF")
    private String incalinf;
    @TableField("IOUCODE")
    private String iouCode;
    @TableField("ISSUEDATE")
    private String issueDate;
    @TableField("JOINTTENANT")
    private String jointTenant;
    @TableField("LEASEHOLD")
    private String leasehold;
    @TableField("MCURRENCY")
    private String mCurrency;
    @TableField("MEDIUMID")
    private String mediumid;
    @TableField("NGBSQ")
    private String ngbsq;
    @TableField("NLONCURRTYPE")
    private String nloncurrtype;
    @TableField("OCALINF")
    private String ocalinf;
    @TableField("OGBSQ")
    private String ogbsq;
    @TableField("OVCALINF")
    private String ovcalinf;
    @TableField("POLICY_ATTRIBUTRE_CLASSIFY")
    private String policyAttributreClassify;
    @TableField("PRODUCTNAME")
    private String productName;
    @TableField("PROJECTNAME")
    private String projectName;
    @TableField("PROPCN")
    private String propcn;
    @TableField("PROPNO")
    private String propno;
    @TableField("PROPORGNUM")
    private String proporgnum;
    @TableField("PROPRAT")
    private String proprat;
    @TableField("PROPSCALE")
    private String propscale;
    @TableField("PROTSENO")
    private String protseno;
    @TableField("RATEINCM1")
    private String rateincm1;
    @TableField("RECOURSE")
    private String recourse;
    @TableField("LOANTERM")
    private String scopeBusinPeriod;
    @TableField("SOLUTIONAMT")
    private String solutionAmt;
    @TableField("SYNDICATELOAN")
    private String syndicateLoan;
    @TableField("SYNDICATED_STATUS")
    private String syndicatedStatus;
    @TableField("TOTFFAMT")
    private String totffamt;
    @TableField("TOTFFAMTCNY")
    private String totffamtCNY;
    @TableField("TOTFFAMTUSD")
    private String totffamtUSD;
    @TableField("TOTHKAMT")
    private String tothkamt;
    @TableField("TOTHKAMTCNY")
    private String tothkamtCNY;
    @TableField("TOTHKAMTUSD")
    private String tothkamtUSD;
    @TableField("TRADE_FINANCE_BUSINESS")
    private String traneFinanceBusiness;
    @TableField("UPDBAL")
    private String updbal;
    @TableField("UPDBALCNY")
    private String updbalcny;
    @TableField("UPDBALUSD")
    private String updbalusd;
    @TableField("VALUEDAY")
    private String valueday;

    public InfComprehensive() {
    }

    public String getAccount() {
        return account == "" ? null : account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getBankTellName() {
        return bankTellName == "" ? null : bankTellName;
    }

    public void setBankTellName(String bankTellName) {
        this.bankTellName = bankTellName;
    }

    public String getBizRentalFactoringCode() {
        return bizRentalFactoringCode == "" ? null : bizRentalFactoringCode;
    }

    public void setBizRentalFactoringCode(String bizRentalFactoringCode) {
        this.bizRentalFactoringCode = bizRentalFactoringCode;
    }

    public String getBusinessTypes() {
        return businessTypes == "" ? null : businessTypes;
    }

    public void setBusinessTypes(String businessTypes) {
        this.businessTypes = businessTypes;
    }

    public String getCalintf() {
        return calintf == "" ? null : calintf;
    }

    public void setCalintf(String calintf) {
        this.calintf = calintf;
    }

    public String getConecn() {
        return conecn == "" ? null : conecn;
    }

    public void setConecn(String conecn) {
        this.conecn = conecn;
    }

    public String getConeno() {
        return coneno == "" ? null : coneno;
    }

    public void setConeno(String coneno) {
        this.coneno = coneno;
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

    public String getConescale() {
        return conescale == "" ? null : conescale;
    }

    public void setConescale(String conescale) {
        this.conescale = conescale;
    }

    public String getCurrency() {
        return currency == "" ? null : currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDebtCode() {
        return debtCode == "" ? null : debtCode;
    }

    public void setDebtCode(String debtCode) {
        this.debtCode = debtCode;
    }

    public String getDeptCode() {
        return deptCode == "" ? null : deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName == "" ? null : deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDueDate() {
        return dueDate == "" ? null : dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getFee() {
        return fee == "" ? null : fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getFinancePlatform() {
        return financePlatform == "" ? null : financePlatform;
    }

    public void setFinancePlatform(String financePlatform) {
        this.financePlatform = financePlatform;
    }

    public String getGrantCode() {
        return grantCode == "" ? null : grantCode;
    }

    public void setGrantCode(String grantCode) {
        this.grantCode = grantCode;
    }

    public String getGrantId() {
        return grantId == "" ? null : grantId;
    }

    public void setGrantId(String grantId) {
        this.grantId = grantId;
    }

    public String getGuaranteeMode() {
        return guaranteeMode == "" ? null : guaranteeMode;
    }

    public void setGuaranteeMode(String guaranteeMode) {
        this.guaranteeMode = guaranteeMode;
    }

    public String getIncalinf() {
        return incalinf == "" ? null : incalinf;
    }

    public void setIncalinf(String incalinf) {
        this.incalinf = incalinf;
    }

    public String getIouCode() {
        return iouCode == "" ? null : iouCode;
    }

    public void setIouCode(String iouCode) {
        this.iouCode = iouCode;
    }

    public String getIssueDate() {
        return issueDate == "" ? null : issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getJointTenant() {
        return jointTenant == "" ? null : jointTenant;
    }

    public void setJointTenant(String jointTenant) {
        this.jointTenant = jointTenant;
    }

    public String getLeasehold() {
        return leasehold == "" ? null : leasehold;
    }

    public void setLeasehold(String leasehold) {
        this.leasehold = leasehold;
    }

    public String getmCurrency() {
        return mCurrency == "" ? null : mCurrency;
    }

    public void setmCurrency(String mCurrency) {
        this.mCurrency = mCurrency;
    }

    public String getMediumid() {
        return mediumid == "" ? null : mediumid;
    }

    public void setMediumid(String mediumid) {
        this.mediumid = mediumid;
    }

    public String getNgbsq() {
        return ngbsq == "" ? null : ngbsq;
    }

    public void setNgbsq(String ngbsq) {
        this.ngbsq = ngbsq;
    }

    public String getNloncurrtype() {
        return nloncurrtype == "" ? null : nloncurrtype;
    }

    public void setNloncurrtype(String nloncurrtype) {
        this.nloncurrtype = nloncurrtype;
    }

    public String getOcalinf() {
        return ocalinf == "" ? null : ocalinf;
    }

    public void setOcalinf(String ocalinf) {
        this.ocalinf = ocalinf;
    }

    public String getOgbsq() {
        return ogbsq == "" ? null : ogbsq;
    }

    public void setOgbsq(String ogbsq) {
        this.ogbsq = ogbsq;
    }

    public String getOvcalinf() {
        return ovcalinf == "" ? null : ovcalinf;
    }

    public void setOvcalinf(String ovcalinf) {
        this.ovcalinf = ovcalinf;
    }

    public String getPolicyAttributreClassify() {
        return policyAttributreClassify == "" ? null : policyAttributreClassify;
    }

    public void setPolicyAttributreClassify(String policyAttributreClassify) {
        this.policyAttributreClassify = policyAttributreClassify;
    }

    public String getProductName() {
        return productName == "" ? null : productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProjectName() {
        return projectName == "" ? null : projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getPropcn() {
        return propcn == "" ? null : propcn;
    }

    public void setPropcn(String propcn) {
        this.propcn = propcn;
    }

    public String getPropno() {
        return propno == "" ? null : propno;
    }

    public void setPropno(String propno) {
        this.propno = propno;
    }

    public String getProporgnum() {
        return proporgnum == "" ? null : proporgnum;
    }

    public void setProporgnum(String proporgnum) {
        this.proporgnum = proporgnum;
    }

    public String getProprat() {
        return proprat == "" ? null : proprat;
    }

    public void setProprat(String proprat) {
        this.proprat = proprat;
    }

    public String getPropscale() {
        return propscale == "" ? null : propscale;
    }

    public void setPropscale(String propscale) {
        this.propscale = propscale;
    }

    public String getProtseno() {
        return protseno == "" ? null : protseno;
    }

    public void setProtseno(String protseno) {
        this.protseno = protseno;
    }

    public String getRateincm1() {
        return rateincm1 == "" ? null : rateincm1;
    }

    public void setRateincm1(String rateincm1) {
        this.rateincm1 = rateincm1;
    }

    public String getRecourse() {
        return recourse == "" ? null : recourse;
    }

    public void setRecourse(String recourse) {
        this.recourse = recourse;
    }

    public String getScopeBusinPeriod() {
        return scopeBusinPeriod == "" ? null : scopeBusinPeriod;
    }

    public void setScopeBusinPeriod(String scopeBusinPeriod) {
        this.scopeBusinPeriod = scopeBusinPeriod;
    }

    public String getSolutionAmt() {
        return solutionAmt == "" ? null : solutionAmt;
    }

    public void setSolutionAmt(String solutionAmt) {
        this.solutionAmt = solutionAmt;
    }

    public String getSyndicateLoan() {
        return syndicateLoan == "" ? null : syndicateLoan;
    }

    public void setSyndicateLoan(String syndicateLoan) {
        this.syndicateLoan = syndicateLoan;
    }

    public String getSyndicatedStatus() {
        return syndicatedStatus == "" ? null : syndicatedStatus;
    }

    public void setSyndicatedStatus(String syndicatedStatus) {
        this.syndicatedStatus = syndicatedStatus;
    }

    public String getTotffamt() {
        return totffamt == "" ? null : totffamt;
    }

    public void setTotffamt(String totffamt) {
        this.totffamt = totffamt;
    }

    public String getTotffamtCNY() {
        return totffamtCNY == "" ? null : totffamtCNY;
    }

    public void setTotffamtCNY(String totffamtCNY) {
        this.totffamtCNY = totffamtCNY;
    }

    public String getTotffamtUSD() {
        return totffamtUSD == "" ? null : totffamtUSD;
    }

    public void setTotffamtUSD(String totffamtUSD) {
        this.totffamtUSD = totffamtUSD;
    }

    public String getTothkamt() {
        return tothkamt == "" ? null : tothkamt;
    }

    public void setTothkamt(String tothkamt) {
        this.tothkamt = tothkamt;
    }

    public String getTothkamtCNY() {
        return tothkamtCNY == "" ? null : tothkamtCNY;
    }

    public void setTothkamtCNY(String tothkamtCNY) {
        this.tothkamtCNY = tothkamtCNY;
    }

    public String getTothkamtUSD() {
        return tothkamtUSD == "" ? null : tothkamtUSD;
    }

    public void setTothkamtUSD(String tothkamtUSD) {
        this.tothkamtUSD = tothkamtUSD;
    }

    public String getTraneFinanceBusiness() {
        return traneFinanceBusiness == "" ? null : traneFinanceBusiness;
    }

    public void setTraneFinanceBusiness(String traneFinanceBusiness) {
        this.traneFinanceBusiness = traneFinanceBusiness;
    }

    public String getUpdbal() {
        return updbal == "" ? null : updbal;
    }

    public void setUpdbal(String updbal) {
        this.updbal = updbal;
    }

    public String getUpdbalcny() {
        return updbalcny == "" ? null : updbalcny;
    }

    public void setUpdbalcny(String updbalcny) {
        this.updbalcny = updbalcny;
    }

    public String getUpdbalusd() {
        return updbalusd == "" ? null : updbalusd;
    }

    public void setUpdbalusd(String updbalusd) {
        this.updbalusd = updbalusd;
    }

    public String getValueday() {
        return valueday == "" ? null : valueday;
    }

    public void setValueday(String valueday) {
        this.valueday = valueday;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("account", account)
                .add("bankTellName", bankTellName)
                .add("bizRentalFactoringCode", bizRentalFactoringCode)
                .add("businessTypes", businessTypes)
                .add("calintf", calintf)
                .add("conecn", conecn)
                .add("coneno", coneno)
                .add("coneorgnum", coneorgnum)
                .add("conerat", conerat)
                .add("conescale", conescale)
                .add("currency", currency)
                .add("debtCode", debtCode)
                .add("deptCode", deptCode)
                .add("deptName", deptName)
                .add("dueDate", dueDate)
                .add("fee", fee)
                .add("financePlatform", financePlatform)
                .add("grantCode", grantCode)
                .add("grantId", grantId)
                .add("guaranteeMode", guaranteeMode)
                .add("incalinf", incalinf)
                .add("iouCode", iouCode)
                .add("issueDate", issueDate)
                .add("jointTenant", jointTenant)
                .add("leasehold", leasehold)
                .add("mCurrency", mCurrency)
                .add("mediumid", mediumid)
                .add("ngbsq", ngbsq)
                .add("nloncurrtype", nloncurrtype)
                .add("ocalinf", ocalinf)
                .add("ogbsq", ogbsq)
                .add("ovcalinf", ovcalinf)
                .add("policyAttributreClassify", policyAttributreClassify)
                .add("productName", productName)
                .add("projectName", projectName)
                .add("propcn", propcn)
                .add("propno", propno)
                .add("proporgnum", proporgnum)
                .add("proprat", proprat)
                .add("propscale", propscale)
                .add("protseno", protseno)
                .add("rateincm1", rateincm1)
                .add("recourse", recourse)
                .add("scopeBusinPeriod", scopeBusinPeriod)
                .add("solutionAmt", solutionAmt)
                .add("syndicateLoan", syndicateLoan)
                .add("syndicatedStatus", syndicatedStatus)
                .add("totffamt", totffamt)
                .add("totffamtCNY", totffamtCNY)
                .add("totffamtUSD", totffamtUSD)
                .add("tothkamt", tothkamt)
                .add("tothkamtCNY", tothkamtCNY)
                .add("tothkamtUSD", tothkamtUSD)
                .add("traneFinanceBusiness", traneFinanceBusiness)
                .add("updbal", updbal)
                .add("updbalcny", updbalcny)
                .add("updbalusd", updbalusd)
                .add("valueday", valueday)
                .toString();
    }
}
