package com.hns.learn.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
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

    /** 统计截止日期 */
    @TableField("DUEDATE")
    private String dueDate;
    /** 正常计息标志 */
    @TableField("CALINTF")
    private String calintf;
    /** 费用收入 */
    @TableField("FEE")
    private String fee;
    /** 表内欠息计息标志 */
    @TableField("INCALINF")
    private String incalinf;
    /** 正常扣款顺序 */
    @TableField("NGBSQ")
    private String ngbsq;
    /** 表外欠息计息标志 */
    @TableField("OCALINF")
    private String ocalinf;
    /** 逾期扣款顺序 */
    @TableField("OGBSQ")
    private String ogbsq;
    /** 逾期计息标志 */
    @TableField("OVCALINF")
    private String ovcalinf;
    /** 本金期末余额(原币) */
    @TableField("UPDBAL")
    private String updbal;
    /** 本金期末余额(折人民币) */
    @TableField("UPDBALCNY")
    private String updbalCNY;
    /** 本金期末余额(折美元) */
    @TableField("UPDBALUSD")
    private String updbalUSD;
    /** 信贷员账户 */
    @TableField("ACCOUNT_")
    private String account;
    /** 信贷员姓名 */
    @TableField("BANK_TELL_NAME")
    private String bankTellName;
    /** 租金保理合同编号 */
    @TableField("BIZ_RENTAL_FACTORING_CODE")
    private String bizRentalFactoringCode;
    /** 产品种类二级分类 */
    @TableField("BUSINESS_TYPES")
    private String businessTypes;
    /** 承租人客户名称 */
    @TableField("CONECN")
    private String conecn;
    /** 承租人客户编号 */
    @TableField("CONENO")
    private String coneno;
    /** 承租人组织机构代码 */
    @TableField("CONEORGNUM")
    private String coneorgnum;
    /** 承租人客户信用等级 */
    @TableField("CONERAT")
    private String conerat;
    /** 承租人企业规模 */
    @TableField("CONESCALE")
    private String conescale;
    /** 发放条件币种 */
    @TableField("CURRENCY")
    private String currency;
    /** 债项方案编号 */
    @TableField("DEBTCODE")
    private String debtCode;
    /** 所属机构编号 */
    @TableField("DEPTCODE")
    private String deptCode;
    /** 所属机构 */
    @TableField("DEPTNAME")
    private String deptName;
    /** 承租人是否地方政府融资平台 */
    @TableField("FINANCE_PLATFORM")
    private String financePlatform;
    /** 发放条件编号 */
    @TableField("GRANT_CODE")
    private String grantCode;
    /** 发放条件ID */
    @TableField("GRANTID")
    private String grantId;
    /** 担保方式(总) */
    @TableField("GUARANTEEMODE")
    private String guaranteeMode;
    /** 借据编号 */
    @TableField("IOUCODE")
    private String iouCode;
    /** 审批日期 */
    @TableField("ISSUEDATE")
    private String issueDate;
    /** 是否联合承租 */
    @TableField("JOINTTENANT")
    private String jointTenant;
    /** 租赁物名称 */
    @TableField("LEASEHOLD")
    private String leasehold;
    /** 方案主币种 */
    @TableField("MCURRENCY")
    private String mCurrency;
    /** 介质识别号 */
    @TableField("MEDIUMID")
    private String mediumid;
    /** 借据币种 */
    @TableField("NLONCURRTYPE")
    private String nloncurrtype;
    /** 政策性属性分类 已过时 */
    @TableField("POLICY_ATTRIBUTRE_CLASSIFY")
    private String policyAttributreClassify;
    /** 是否一带一路 */
    @TableField("POLICY_ATTRIBUTRE_CLASSIFY1")
    private String policyAttributreClassify1;
    /** 是否国际产能和装备制造合作 */
    @TableField("POLICY_ATTRIBUTRE_CLASSIFY2")
    private String policyAttributreClassify2;
    /** 是否重大装备出口和高新技术出口 */
    @TableField("POLICY_ATTRIBUTRE_CLASSIFY3")
    private String policyAttributreClassify3;
    /** 是否对外承包工程和境外投资 */
    @TableField("POLICY_ATTRIBUTRE_CLASSIFY4")
    private String policyAttributreClassify4;
    /** 是否能源、资源类 */
    @TableField("POLICY_ATTRIBUTRE_CLASSIFY5")
    private String policyAttributreClassify5;
    /** 是否中国制造2025 */
    @TableField("POLICY_ATTRIBUTRE_CLASSIFY6")
    private String policyAttributreClassify6;
    /** 产品名称 */
    @TableField("PRODUCTNAME")
    private String productName;
    /** 项目名称 */
    @TableField("PROJECTNAME")
    private String projectName;
    /** 出租人客户名称 */
    @TableField("PROPCN")
    private String propcn;
    /** 出租人客户编号 */
    @TableField("PROPNO")
    private String propno;
    /** 出租人组织机构代码 */
    @TableField("PROPORGNUM")
    private String proporgnum;
    /** 出租人客户信用等级 */
    @TableField("PROPRAT")
    private String proprat;
    /** 出租人企业规模 */
    @TableField("PROPSCALE")
    private String propscale;
    /** 协议编号 */
    @TableField("PROTSENO")
    private String protseno;
    /** 利率方式 */
    @TableField("RATEINCM1")
    private String rateincm1;
    /** 追索权 */
    @TableField("RECOURSE")
    private String recourse;
    /** 业务期限(天) */
    @TableField("SCOPE_BUSIN_PERIOD")
    private String scopeBusinPeriod;
    /** 方案金额 */
    @TableField("SOLUTIONAMT")
    private String solutionAmt;
    /** 是否与他行银团放款 */
    @TableField("SYNDICATELOAN")
    private String syndicateLoan;
    /** 我行银团地位 */
    @TableField("SYNDICATED_STATUS")
    private String syndicatedStatus;
    /** 发放金额(原币) */
    @TableField("TOTFFAMT")
    private String totffamt;
    /** 发放金额(折人民币) */
    @TableField("TOTFFAMTCNY")
    private String totffamtCNY;
    /** 发放金额(折美元) */
    @TableField("TOTFFAMTUSD")
    private String totffamtUSD;
    /** 累计回收本金金额(原币) */
    @TableField("TOTHKAMT")
    private String tothkamt;
    /** 累计回收本金金额(人民币) */
    @TableField("TOTHKAMTCNY")
    private String tothkamtCNY;
    /** 累计回收本金金额(美元) */
    @TableField("TOTHKAMTUSD")
    private String tothkamtUSD;
    /** 贸金业务政策性属性 */
    @TableField("TRADE_FINANCE_BUSINESS")
    private String traneFinanceBusiness;
    /** 起息日 */
    @TableField("VALUEDAY")
    private String valueday;
    /** 到期日 */
    @TableField("MATUDATE")
    private String matudate;
    /** 利率 */
    @TableField("NRATE")
    private String nrate;
    /** 逾期本金余额(原币) */
    @TableField("OVRBAL")
    private String ovrbal;
    /** 逾期本金余额(人民币) */
    @TableField("OVRBALCNY")
    private String ovrbalCNY;
    /** 逾期本金余额(美元) */
    @TableField("OVRBALUSD")
    private String ovrbalUSD;
    /** 本金逾期天数 */
    @TableField("PRIDAYS")
    private String pridays;

    public InfComprehensive() {
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getCalintf() {
        return calintf;
    }

    public void setCalintf(String calintf) {
        this.calintf = calintf;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getIncalinf() {
        return incalinf;
    }

    public void setIncalinf(String incalinf) {
        this.incalinf = incalinf;
    }

    public String getNgbsq() {
        return ngbsq;
    }

    public void setNgbsq(String ngbsq) {
        this.ngbsq = ngbsq;
    }

    public String getOcalinf() {
        return ocalinf;
    }

    public void setOcalinf(String ocalinf) {
        this.ocalinf = ocalinf;
    }

    public String getOgbsq() {
        return ogbsq;
    }

    public void setOgbsq(String ogbsq) {
        this.ogbsq = ogbsq;
    }

    public String getOvcalinf() {
        return ovcalinf;
    }

    public void setOvcalinf(String ovcalinf) {
        this.ovcalinf = ovcalinf;
    }

    public String getUpdbal() {
        return updbal;
    }

    public void setUpdbal(String updbal) {
        this.updbal = updbal;
    }

    public String getUpdbalCNY() {
        return updbalCNY;
    }

    public void setUpdbalCNY(String updbalCNY) {
        this.updbalCNY = updbalCNY;
    }

    public String getUpdbalUSD() {
        return updbalUSD;
    }

    public void setUpdbalUSD(String updbalUSD) {
        this.updbalUSD = updbalUSD;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getBankTellName() {
        return bankTellName;
    }

    public void setBankTellName(String bankTellName) {
        this.bankTellName = bankTellName;
    }

    public String getBizRentalFactoringCode() {
        return bizRentalFactoringCode;
    }

    public void setBizRentalFactoringCode(String bizRentalFactoringCode) {
        this.bizRentalFactoringCode = bizRentalFactoringCode;
    }

    public String getBusinessTypes() {
        return businessTypes;
    }

    public void setBusinessTypes(String businessTypes) {
        this.businessTypes = businessTypes;
    }

    public String getConecn() {
        return conecn;
    }

    public void setConecn(String conecn) {
        this.conecn = conecn;
    }

    public String getConeno() {
        return coneno;
    }

    public void setConeno(String coneno) {
        this.coneno = coneno;
    }

    public String getConeorgnum() {
        return coneorgnum;
    }

    public void setConeorgnum(String coneorgnum) {
        this.coneorgnum = coneorgnum;
    }

    public String getConerat() {
        return conerat;
    }

    public void setConerat(String conerat) {
        this.conerat = conerat;
    }

    public String getConescale() {
        return conescale;
    }

    public void setConescale(String conescale) {
        this.conescale = conescale;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDebtCode() {
        return debtCode;
    }

    public void setDebtCode(String debtCode) {
        this.debtCode = debtCode;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getFinancePlatform() {
        return financePlatform;
    }

    public void setFinancePlatform(String financePlatform) {
        this.financePlatform = financePlatform;
    }

    public String getGrantCode() {
        return grantCode;
    }

    public void setGrantCode(String grantCode) {
        this.grantCode = grantCode;
    }

    public String getGrantId() {
        return grantId;
    }

    public void setGrantId(String grantId) {
        this.grantId = grantId;
    }

    public String getGuaranteeMode() {
        return guaranteeMode;
    }

    public void setGuaranteeMode(String guaranteeMode) {
        this.guaranteeMode = guaranteeMode;
    }

    public String getIouCode() {
        return iouCode;
    }

    public void setIouCode(String iouCode) {
        this.iouCode = iouCode;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getJointTenant() {
        return jointTenant;
    }

    public void setJointTenant(String jointTenant) {
        this.jointTenant = jointTenant;
    }

    public String getLeasehold() {
        return leasehold;
    }

    public void setLeasehold(String leasehold) {
        this.leasehold = leasehold;
    }

    public String getmCurrency() {
        return mCurrency;
    }

    public void setmCurrency(String mCurrency) {
        this.mCurrency = mCurrency;
    }

    public String getMediumid() {
        return mediumid;
    }

    public void setMediumid(String mediumid) {
        this.mediumid = mediumid;
    }

    public String getNloncurrtype() {
        return nloncurrtype;
    }

    public void setNloncurrtype(String nloncurrtype) {
        this.nloncurrtype = nloncurrtype;
    }

    public String getPolicyAttributreClassify() {
        return policyAttributreClassify;
    }

    public void setPolicyAttributreClassify(String policyAttributreClassify) {
        this.policyAttributreClassify = policyAttributreClassify;
    }

    public String getPolicyAttributreClassify1() {
        return policyAttributreClassify1;
    }

    public void setPolicyAttributreClassify1(String policyAttributreClassify1) {
        this.policyAttributreClassify1 = policyAttributreClassify1;
    }

    public String getPolicyAttributreClassify2() {
        return policyAttributreClassify2;
    }

    public void setPolicyAttributreClassify2(String policyAttributreClassify2) {
        this.policyAttributreClassify2 = policyAttributreClassify2;
    }

    public String getPolicyAttributreClassify3() {
        return policyAttributreClassify3;
    }

    public void setPolicyAttributreClassify3(String policyAttributreClassify3) {
        this.policyAttributreClassify3 = policyAttributreClassify3;
    }

    public String getPolicyAttributreClassify4() {
        return policyAttributreClassify4;
    }

    public void setPolicyAttributreClassify4(String policyAttributreClassify4) {
        this.policyAttributreClassify4 = policyAttributreClassify4;
    }

    public String getPolicyAttributreClassify5() {
        return policyAttributreClassify5;
    }

    public void setPolicyAttributreClassify5(String policyAttributreClassify5) {
        this.policyAttributreClassify5 = policyAttributreClassify5;
    }

    public String getPolicyAttributreClassify6() {
        return policyAttributreClassify6;
    }

    public void setPolicyAttributreClassify6(String policyAttributreClassify6) {
        this.policyAttributreClassify6 = policyAttributreClassify6;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getPropcn() {
        return propcn;
    }

    public void setPropcn(String propcn) {
        this.propcn = propcn;
    }

    public String getPropno() {
        return propno;
    }

    public void setPropno(String propno) {
        this.propno = propno;
    }

    public String getProporgnum() {
        return proporgnum;
    }

    public void setProporgnum(String proporgnum) {
        this.proporgnum = proporgnum;
    }

    public String getProprat() {
        return proprat;
    }

    public void setProprat(String proprat) {
        this.proprat = proprat;
    }

    public String getPropscale() {
        return propscale;
    }

    public void setPropscale(String propscale) {
        this.propscale = propscale;
    }

    public String getProtseno() {
        return protseno;
    }

    public void setProtseno(String protseno) {
        this.protseno = protseno;
    }

    public String getRateincm1() {
        return rateincm1;
    }

    public void setRateincm1(String rateincm1) {
        this.rateincm1 = rateincm1;
    }

    public String getRecourse() {
        return recourse;
    }

    public void setRecourse(String recourse) {
        this.recourse = recourse;
    }

    public String getScopeBusinPeriod() {
        return scopeBusinPeriod;
    }

    public void setScopeBusinPeriod(String scopeBusinPeriod) {
        this.scopeBusinPeriod = scopeBusinPeriod;
    }

    public String getSolutionAmt() {
        return solutionAmt;
    }

    public void setSolutionAmt(String solutionAmt) {
        this.solutionAmt = solutionAmt;
    }

    public String getSyndicateLoan() {
        return syndicateLoan;
    }

    public void setSyndicateLoan(String syndicateLoan) {
        this.syndicateLoan = syndicateLoan;
    }

    public String getSyndicatedStatus() {
        return syndicatedStatus;
    }

    public void setSyndicatedStatus(String syndicatedStatus) {
        this.syndicatedStatus = syndicatedStatus;
    }

    public String getTotffamt() {
        return totffamt;
    }

    public void setTotffamt(String totffamt) {
        this.totffamt = totffamt;
    }

    public String getTotffamtCNY() {
        return totffamtCNY;
    }

    public void setTotffamtCNY(String totffamtCNY) {
        this.totffamtCNY = totffamtCNY;
    }

    public String getTotffamtUSD() {
        return totffamtUSD;
    }

    public void setTotffamtUSD(String totffamtUSD) {
        this.totffamtUSD = totffamtUSD;
    }

    public String getTothkamt() {
        return tothkamt;
    }

    public void setTothkamt(String tothkamt) {
        this.tothkamt = tothkamt;
    }

    public String getTothkamtCNY() {
        return tothkamtCNY;
    }

    public void setTothkamtCNY(String tothkamtCNY) {
        this.tothkamtCNY = tothkamtCNY;
    }

    public String getTothkamtUSD() {
        return tothkamtUSD;
    }

    public void setTothkamtUSD(String tothkamtUSD) {
        this.tothkamtUSD = tothkamtUSD;
    }

    public String getTraneFinanceBusiness() {
        return traneFinanceBusiness;
    }

    public void setTraneFinanceBusiness(String traneFinanceBusiness) {
        this.traneFinanceBusiness = traneFinanceBusiness;
    }

    public String getValueday() {
        return valueday;
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

    public String getOvrbalCNY() {
        return ovrbalCNY;
    }

    public void setOvrbalCNY(String ovrbalCNY) {
        this.ovrbalCNY = ovrbalCNY;
    }

    public String getOvrbalUSD() {
        return ovrbalUSD;
    }

    public void setOvrbalUSD(String ovrbalUSD) {
        this.ovrbalUSD = ovrbalUSD;
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
        return Objects.equal(getDueDate(), that.getDueDate()) &&
                Objects.equal(getCalintf(), that.getCalintf()) &&
                Objects.equal(getFee(), that.getFee()) &&
                Objects.equal(getIncalinf(), that.getIncalinf()) &&
                Objects.equal(getNgbsq(), that.getNgbsq()) &&
                Objects.equal(getOcalinf(), that.getOcalinf()) &&
                Objects.equal(getOgbsq(), that.getOgbsq()) &&
                Objects.equal(getOvcalinf(), that.getOvcalinf()) &&
                Objects.equal(getUpdbal(), that.getUpdbal()) &&
                Objects.equal(getUpdbalCNY(), that.getUpdbalCNY()) &&
                Objects.equal(getUpdbalUSD(), that.getUpdbalUSD()) &&
                Objects.equal(getAccount(), that.getAccount()) &&
                Objects.equal(getBankTellName(), that.getBankTellName()) &&
                Objects.equal(getBizRentalFactoringCode(), that.getBizRentalFactoringCode()) &&
                Objects.equal(getBusinessTypes(), that.getBusinessTypes()) &&
                Objects.equal(getConecn(), that.getConecn()) &&
                Objects.equal(getConeno(), that.getConeno()) &&
                Objects.equal(getConeorgnum(), that.getConeorgnum()) &&
                Objects.equal(getConerat(), that.getConerat()) &&
                Objects.equal(getConescale(), that.getConescale()) &&
                Objects.equal(getCurrency(), that.getCurrency()) &&
                Objects.equal(getDebtCode(), that.getDebtCode()) &&
                Objects.equal(getDeptCode(), that.getDeptCode()) &&
                Objects.equal(getDeptName(), that.getDeptName()) &&
                Objects.equal(getFinancePlatform(), that.getFinancePlatform()) &&
                Objects.equal(getGrantCode(), that.getGrantCode()) &&
                Objects.equal(getGrantId(), that.getGrantId()) &&
                Objects.equal(getGuaranteeMode(), that.getGuaranteeMode()) &&
                Objects.equal(getIouCode(), that.getIouCode()) &&
                Objects.equal(getIssueDate(), that.getIssueDate()) &&
                Objects.equal(getJointTenant(), that.getJointTenant()) &&
                Objects.equal(getLeasehold(), that.getLeasehold()) &&
                Objects.equal(getmCurrency(), that.getmCurrency()) &&
                Objects.equal(getMediumid(), that.getMediumid()) &&
                Objects.equal(getNloncurrtype(), that.getNloncurrtype()) &&
                Objects.equal(getPolicyAttributreClassify(), that.getPolicyAttributreClassify()) &&
                Objects.equal(getPolicyAttributreClassify1(), that.getPolicyAttributreClassify1()) &&
                Objects.equal(getPolicyAttributreClassify2(), that.getPolicyAttributreClassify2()) &&
                Objects.equal(getPolicyAttributreClassify3(), that.getPolicyAttributreClassify3()) &&
                Objects.equal(getPolicyAttributreClassify4(), that.getPolicyAttributreClassify4()) &&
                Objects.equal(getPolicyAttributreClassify5(), that.getPolicyAttributreClassify5()) &&
                Objects.equal(getPolicyAttributreClassify6(), that.getPolicyAttributreClassify6()) &&
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
                Objects.equal(getValueday(), that.getValueday()) &&
                Objects.equal(getMatudate(), that.getMatudate()) &&
                Objects.equal(getNrate(), that.getNrate()) &&
                Objects.equal(getOvrbal(), that.getOvrbal()) &&
                Objects.equal(getOvrbalCNY(), that.getOvrbalCNY()) &&
                Objects.equal(getOvrbalUSD(), that.getOvrbalUSD()) &&
                Objects.equal(getPridays(), that.getPridays());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getDueDate(), getCalintf(), getFee(), getIncalinf(), getNgbsq(), getOcalinf(), getOgbsq(), getOvcalinf(), getUpdbal(), getUpdbalCNY(), getUpdbalUSD(), getAccount(), getBankTellName(), getBizRentalFactoringCode(), getBusinessTypes(), getConecn(), getConeno(), getConeorgnum(), getConerat(), getConescale(), getCurrency(), getDebtCode(), getDeptCode(), getDeptName(), getFinancePlatform(), getGrantCode(), getGrantId(), getGuaranteeMode(), getIouCode(), getIssueDate(), getJointTenant(), getLeasehold(), getmCurrency(), getMediumid(), getNloncurrtype(), getPolicyAttributreClassify(), getPolicyAttributreClassify1(), getPolicyAttributreClassify2(), getPolicyAttributreClassify3(), getPolicyAttributreClassify4(), getPolicyAttributreClassify5(), getPolicyAttributreClassify6(), getProductName(), getProjectName(), getPropcn(), getPropno(), getProporgnum(), getProprat(), getPropscale(), getProtseno(), getRateincm1(), getRecourse(), getScopeBusinPeriod(), getSolutionAmt(), getSyndicateLoan(), getSyndicatedStatus(), getTotffamt(), getTotffamtCNY(), getTotffamtUSD(), getTothkamt(), getTothkamtCNY(), getTothkamtUSD(), getTraneFinanceBusiness(), getValueday(), getMatudate(), getNrate(), getOvrbal(), getOvrbalCNY(), getOvrbalUSD(), getPridays());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("dueDate", dueDate)
                .add("calintf", calintf)
                .add("fee", fee)
                .add("incalinf", incalinf)
                .add("ngbsq", ngbsq)
                .add("ocalinf", ocalinf)
                .add("ogbsq", ogbsq)
                .add("ovcalinf", ovcalinf)
                .add("updbal", updbal)
                .add("updbalCNY", updbalCNY)
                .add("updbalUSD", updbalUSD)
                .add("account", account)
                .add("bankTellName", bankTellName)
                .add("bizRentalFactoringCode", bizRentalFactoringCode)
                .add("businessTypes", businessTypes)
                .add("conecn", conecn)
                .add("coneno", coneno)
                .add("coneorgnum", coneorgnum)
                .add("conerat", conerat)
                .add("conescale", conescale)
                .add("currency", currency)
                .add("debtCode", debtCode)
                .add("deptCode", deptCode)
                .add("deptName", deptName)
                .add("financePlatform", financePlatform)
                .add("grantCode", grantCode)
                .add("grantId", grantId)
                .add("guaranteeMode", guaranteeMode)
                .add("iouCode", iouCode)
                .add("issueDate", issueDate)
                .add("jointTenant", jointTenant)
                .add("leasehold", leasehold)
                .add("mCurrency", mCurrency)
                .add("mediumid", mediumid)
                .add("nloncurrtype", nloncurrtype)
                .add("policyAttributreClassify", policyAttributreClassify)
                .add("policyAttributreClassify1", policyAttributreClassify1)
                .add("policyAttributreClassify2", policyAttributreClassify2)
                .add("policyAttributreClassify3", policyAttributreClassify3)
                .add("policyAttributreClassify4", policyAttributreClassify4)
                .add("policyAttributreClassify5", policyAttributreClassify5)
                .add("policyAttributreClassify6", policyAttributreClassify6)
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
                .add("valueday", valueday)
                .add("matudate", matudate)
                .add("nrate", nrate)
                .add("ovrbal", ovrbal)
                .add("ovrbalCNY", ovrbalCNY)
                .add("ovrbalUSD", ovrbalUSD)
                .add("pridays", pridays)
                .toString();
    }
}