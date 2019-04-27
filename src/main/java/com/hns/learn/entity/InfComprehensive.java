package com.hns.learn.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
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
    @TableField("GRANT_CODE")
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
    @TableField("SCOPE_BUSIN_PERIOD")
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

    @TableField("MATUDATE")
    private String matudate;
    @TableField("NRATE")
    private String nrate;
    @TableField("OVRBAL")
    private String ovrbal;
    @TableField("OVRBALCNY")
    private String ovrbalcny;
    @TableField("OVRBALUSD")
    private String ovrbalusd;
    @TableField("PRIDAYS")
    private String pridays;

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

    public String getMatudate() {
        return matudate;
    }

    public void setMatudate(String matudate) {
        this.matudate = matudate;
    }

    public String getNrate() {
        return nrate;
    }

    public void setNrate(String nrate) {
        this.nrate = nrate;
    }

    public String getOvrbal() {
        return ovrbal;
    }

    public void setOvrbal(String ovrbal) {
        this.ovrbal = ovrbal;
    }

    public String getOvrbalcny() {
        return ovrbalcny;
    }

    public void setOvrbalcny(String ovrbalcny) {
        this.ovrbalcny = ovrbalcny;
    }

    public String getOvrbalusd() {
        return ovrbalusd;
    }

    public void setOvrbalusd(String ovrbalusd) {
        this.ovrbalusd = ovrbalusd;
    }

    public String getPridays() {
        return pridays;
    }

    public void setPridays(String pridays) {
        this.pridays = pridays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InfComprehensive)) return false;
        InfComprehensive that = (InfComprehensive) o;
        return Objects.equal(getAccount(), that.getAccount()) &&
                Objects.equal(getBankTellName(), that.getBankTellName()) &&
                Objects.equal(getBizRentalFactoringCode(), that.getBizRentalFactoringCode()) &&
                Objects.equal(getBusinessTypes(), that.getBusinessTypes()) &&
                Objects.equal(getCalintf(), that.getCalintf()) &&
                Objects.equal(getConecn(), that.getConecn()) &&
                Objects.equal(getConeno(), that.getConeno()) &&
                Objects.equal(getConeorgnum(), that.getConeorgnum()) &&
                Objects.equal(getConerat(), that.getConerat()) &&
                Objects.equal(getConescale(), that.getConescale()) &&
                Objects.equal(getCurrency(), that.getCurrency()) &&
                Objects.equal(getDebtCode(), that.getDebtCode()) &&
                Objects.equal(getDeptCode(), that.getDeptCode()) &&
                Objects.equal(getDeptName(), that.getDeptName()) &&
                Objects.equal(getDueDate(), that.getDueDate()) &&
                Objects.equal(getFee(), that.getFee()) &&
                Objects.equal(getFinancePlatform(), that.getFinancePlatform()) &&
                Objects.equal(getGrantCode(), that.getGrantCode()) &&
                Objects.equal(getGrantId(), that.getGrantId()) &&
                Objects.equal(getGuaranteeMode(), that.getGuaranteeMode()) &&
                Objects.equal(getIncalinf(), that.getIncalinf()) &&
                Objects.equal(getIouCode(), that.getIouCode()) &&
                Objects.equal(getIssueDate(), that.getIssueDate()) &&
                Objects.equal(getJointTenant(), that.getJointTenant()) &&
                Objects.equal(getLeasehold(), that.getLeasehold()) &&
                Objects.equal(getmCurrency(), that.getmCurrency()) &&
                Objects.equal(getMediumid(), that.getMediumid()) &&
                Objects.equal(getNgbsq(), that.getNgbsq()) &&
                Objects.equal(getNloncurrtype(), that.getNloncurrtype()) &&
                Objects.equal(getOcalinf(), that.getOcalinf()) &&
                Objects.equal(getOgbsq(), that.getOgbsq()) &&
                Objects.equal(getOvcalinf(), that.getOvcalinf()) &&
                Objects.equal(getPolicyAttributreClassify(), that.getPolicyAttributreClassify()) &&
                Objects.equal(getProductName(), that.getProductName()) &&
                Objects.equal(getProjectName(), that.getProjectName()) &&
                Objects.equal(getPropcn(), that.getPropcn()) &&
                Objects.equal(getPropno(), that.getPropno()) &&
                Objects.equal(getProporgnum(), that.getProporgnum()) &&
                Objects.equal(getProprat(), that.getProprat()) &&
                Objects.equal(getPropscale(), that.getPropscale()) &&
                Objects.equal(getProtseno(), that.getProtseno()) &&
                Objects.equal(getRateincm1(), that.getRateincm1()) &&
                Objects.equal(getRecourse(), that.getRecourse()) &&
                Objects.equal(getScopeBusinPeriod(), that.getScopeBusinPeriod()) &&
                Objects.equal(getSolutionAmt(), that.getSolutionAmt()) &&
                Objects.equal(getSyndicateLoan(), that.getSyndicateLoan()) &&
                Objects.equal(getSyndicatedStatus(), that.getSyndicatedStatus()) &&
                Objects.equal(getTotffamt(), that.getTotffamt()) &&
                Objects.equal(getTotffamtCNY(), that.getTotffamtCNY()) &&
                Objects.equal(getTotffamtUSD(), that.getTotffamtUSD()) &&
                Objects.equal(getTothkamt(), that.getTothkamt()) &&
                Objects.equal(getTothkamtCNY(), that.getTothkamtCNY()) &&
                Objects.equal(getTothkamtUSD(), that.getTothkamtUSD()) &&
                Objects.equal(getTraneFinanceBusiness(), that.getTraneFinanceBusiness()) &&
                Objects.equal(getUpdbal(), that.getUpdbal()) &&
                Objects.equal(getUpdbalcny(), that.getUpdbalcny()) &&
                Objects.equal(getUpdbalusd(), that.getUpdbalusd()) &&
                Objects.equal(getValueday(), that.getValueday()) &&
                Objects.equal(getMatudate(), that.getMatudate()) &&
                Objects.equal(getNrate(), that.getNrate()) &&
                Objects.equal(getOvrbal(), that.getOvrbal()) &&
                Objects.equal(getOvrbalcny(), that.getOvrbalcny()) &&
                Objects.equal(getOvrbalusd(), that.getOvrbalusd()) &&
                Objects.equal(getPridays(), that.getPridays());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getAccount(), getBankTellName(), getBizRentalFactoringCode(), getBusinessTypes(), getCalintf(), getConecn(), getConeno(), getConeorgnum(), getConerat(), getConescale(), getCurrency(), getDebtCode(), getDeptCode(), getDeptName(), getDueDate(), getFee(), getFinancePlatform(), getGrantCode(), getGrantId(), getGuaranteeMode(), getIncalinf(), getIouCode(), getIssueDate(), getJointTenant(), getLeasehold(), getmCurrency(), getMediumid(), getNgbsq(), getNloncurrtype(), getOcalinf(), getOgbsq(), getOvcalinf(), getPolicyAttributreClassify(), getProductName(), getProjectName(), getPropcn(), getPropno(), getProporgnum(), getProprat(), getPropscale(), getProtseno(), getRateincm1(), getRecourse(), getScopeBusinPeriod(), getSolutionAmt(), getSyndicateLoan(), getSyndicatedStatus(), getTotffamt(), getTotffamtCNY(), getTotffamtUSD(), getTothkamt(), getTothkamtCNY(), getTothkamtUSD(), getTraneFinanceBusiness(), getUpdbal(), getUpdbalcny(), getUpdbalusd(), getValueday(), getMatudate(), getNrate(), getOvrbal(), getOvrbalcny(), getOvrbalusd(), getPridays());
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
                .add("matudate", matudate)
                .add("nrate", nrate)
                .add("ovrbal", ovrbal)
                .add("ovrbalcny", ovrbalcny)
                .add("ovrbalusd", ovrbalusd)
                .add("pridays", pridays)
                .toString();
    }

}
