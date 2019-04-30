package com.hns.learn.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.io.Serializable;

/**
 * @author hannasong
 */
@TableName("INF_ACCRUAL")
public class InfAccrual extends BaseModel implements Serializable{

    /** 费用币种 */
    @TableField("AFWKLFE_CURRTYPE")
    private String afwklfeCurrtype;
    /** 费用类型 */
    @TableField("AFWKLFE_FEECLASS")
    private String afwklfeFeeclass;
    /** 费用发生额 */
    @TableField("AFWKLFE_FEEAMT")
    private String afwklfeFeeamt;
    /** 帐户所属地区号 */
    @TableField("ZONENO")
    private String zoneno;
    /** 协议编号 */
    @TableField("PROTSENO")
    private String protseno;
    /** 子协议序号 */
    @TableField("SUBSERNO")
    private String subserno;
    /** 交易发生日期 */
    @TableField("WORKDATE")
    private String workdate;
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
    /** 交易发生日期(自然日) */
    @TableField("TRXDATE")
    private String trxdate;
    /** 交易发生时间 */
    @TableField("TRXTIME")
    private String trxtime;
    /** 入账时间戳 */
    @TableField("TIMESTMP")
    private String timestmp;
    /** 入帐日期(自然日) */
    @TableField("POSTNDAT")
    private String postndat;
    /** 入帐日期(系统工作日) */
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
    /** 本金发生额 */
    @TableField("AMOUNT")
    private String amount;
    /** 本金期末余额(原币) */
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
    /** 交易(物理)网点号 */
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
    /** 期数 */
    @TableField("TERMNUM")
    private String termnum;
    /** 正常利率 */
    @TableField("INTRATE")
    private String intrate;
    /** 展期利率 */
    @TableField("RLVRATE")
    private String rlvrate;
    /** 逾期利率 */
    @TableField("OVRRATE")
    private String ovrrate;
    /** 表内欠息复息利率 */
    @TableField("INCIRATE")
    private String incirate;
    /** 表外欠息复息利率 */
    @TableField("OFCIRATE")
    private String ofcirate;
    /** 印花税率 */
    @TableField("TAXRATE")
    private String taxrate;
    /** 正常本金利息发生额 */
    @TableField("CURRINT")
    private String currint;
    /** 展期利息发生额 */
    @TableField("RLVINT")
    private String rlvint;
    /** 展期利息余额 */
    @TableField("RLVIBAL")
    private String rlvibal;
    /** 逾期本金发生额 */
    @TableField("OVRAMT")
    private String ovramt;
    /** 逾期本金余额 */
    @TableField("OVRBAL")
    private String ovrbal;
    /** 逾期本金利息发生额 */
    @TableField("OVRAMTIT")
    private String ovramtit;
    /** 表内欠息发生额 */
    @TableField("INAMT")
    private String inamt;
    /** 表内欠息当前余额 */
    @TableField("INCURBAL")
    private String incurbal;
    /** 表内欠息利息发生额 */
    @TableField("INAMTIT")
    private String inamtit;
    /** 表外欠息发生额 */
    @TableField("OFAMT")
    private String ofamt;
    /** 表外欠息当前余额 */
    @TableField("OFCURBAL")
    private String ofcurbal;
    /** 表外欠息利息发生额 */
    @TableField("OFAMTIT")
    private String ofamtit;
    /** 印花税 */
    @TableField("TAXSUM")
    private String taxsum;
    /** 非豁免印花税发生额 */
    @TableField("TAXAMT")
    private String taxamt;
    /** 非豁免印花税余额 */
    @TableField("TAXBAL")
    private String taxbal;
    /** 豁免印花税发生额 */
    @TableField("NTAXAMT")
    private String ntaxamt;
    /** 豁免印花税余额 */
    @TableField("NTAXBAL")
    private String ntaxbal;
    /** 放款帐号 */
    @TableField("DRDOACTN")
    private String drdoactn;
    /** 放款帐号序号 */
    @TableField("DRDOACSN")
    private String drdoacsn;
    /** 放款帐号发生额 */
    @TableField("DRDOACTA")
    private String drdoacta;
    /** 还款账号 */
    @TableField("PAYACTN")
    private String payactn;
    /** 还款账号序号 */
    @TableField("PAYACSN")
    private String payacsn;
    /** 还款账号发生额 */
    @TableField("PAYACTA")
    private String payacta;
    /** 信贷员账户 */
    @TableField("ACCOUNT_")
    private String account;
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
    /** 租赁物名称 */
    @TableField("LEASEHOLD")
    private String leasehold;
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
    /** 追索权 */
    @TableField("RECOURSE")
    private String recourse;
    /** 信贷员姓名 */
    @TableField("BANKTELLNAME")
    private String bankTellName;
    /** 租金保理合同编号 */
    @TableField("BIZRENTALFACTORINGCODE")
    private String bizRentalFactoringCode;
    /** 产品种类二级分类 */
    @TableField("BUSINESSTYPES")
    private String businessTypes;
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
    @TableField("FINANCEPLATFORM")
    private String financePlatform;
    /** 发放条件编号 */
    @TableField("GRANTCODE")
    private String grantCode;
    /** 发放条件id */
    @TableField("GRANTID")
    private String grantId;
    /** 借据编号 */
    @TableField("IOUCODE")
    private String iouCode;
    /** 方案主币种 */
    @TableField("MCURRENCY")
    private String mCurrency;
    /** 政策性属性分类 */
    @TableField("POLICYATTRIBUTRECLASSIFY")
    private String policyAttributreClassify;
    /** 产品名称 */
    @TableField("PRODUCTNAME")
    private String productName;
    /** 项目名称 */
    @TableField("PROJECTNAME")
    private String projectName;
    /** 业务期限(天) */
    @TableField("SCOPEBUSINPERIOD")
    private String scopeBusinPeriod;
    /** 方案金额 */
    @TableField("SOLUTIONAMT")
    private String solutionAmt;
    /** 我行银团地位 */
    @TableField("syndicatedStatus")
    private String syndicatedstatus;
    /** 是否与他行银团放款 */
    @TableField("SYNDICATELOAN")
    private String syndicateLoan;
    /** 贸金业务政策性属性 */
    @TableField("TRADE_FINANCE_BUSINESS")
    private String traneFinanceBusiness;
    /** 本金期末余额(折人民币) */
    @TableField("UPDBALCNY")
    private String updbalCNY;
    /** 本金期末余额(折美元) */
    @TableField("UPDBALUSD")
    private String updbalUSD;
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

    public InfAccrual() {
    }

    public String getAfwklfeCurrtype() {
        return afwklfeCurrtype;
    }

    public void setAfwklfeCurrtype(String afwklfeCurrtype) {
        this.afwklfeCurrtype = afwklfeCurrtype;
    }

    public String getAfwklfeFeeclass() {
        return afwklfeFeeclass;
    }

    public void setAfwklfeFeeclass(String afwklfeFeeclass) {
        this.afwklfeFeeclass = afwklfeFeeclass;
    }

    public String getAfwklfeFeeamt() {
        return afwklfeFeeamt;
    }

    public void setAfwklfeFeeamt(String afwklfeFeeamt) {
        this.afwklfeFeeamt = afwklfeFeeamt;
    }

    public String getZoneno() {
        return zoneno;
    }

    public void setZoneno(String zoneno) {
        this.zoneno = zoneno;
    }

    public String getProtseno() {
        return protseno;
    }

    public void setProtseno(String protseno) {
        this.protseno = protseno;
    }

    public String getSubserno() {
        return subserno;
    }

    public void setSubserno(String subserno) {
        this.subserno = subserno;
    }

    public String getWorkdate() {
        return workdate;
    }

    public void setWorkdate(String workdate) {
        this.workdate = workdate;
    }

    public String getListno() {
        return listno;
    }

    public void setListno(String listno) {
        this.listno = listno;
    }

    public String getPrinflag() {
        return prinflag;
    }

    public void setPrinflag(String prinflag) {
        this.prinflag = prinflag;
    }

    public String getCmprflag() {
        return cmprflag;
    }

    public void setCmprflag(String cmprflag) {
        this.cmprflag = cmprflag;
    }

    public String getLglockno() {
        return lglockno;
    }

    public void setLglockno(String lglockno) {
        this.lglockno = lglockno;
    }

    public String getTrxdate() {
        return trxdate;
    }

    public void setTrxdate(String trxdate) {
        this.trxdate = trxdate;
    }

    public String getTrxtime() {
        return trxtime;
    }

    public void setTrxtime(String trxtime) {
        this.trxtime = trxtime;
    }

    public String getTimestmp() {
        return timestmp;
    }

    public void setTimestmp(String timestmp) {
        this.timestmp = timestmp;
    }

    public String getPostndat() {
        return postndat;
    }

    public void setPostndat(String postndat) {
        this.postndat = postndat;
    }

    public String getPostsdat() {
        return postsdat;
    }

    public void setPostsdat(String postsdat) {
        this.postsdat = postsdat;
    }

    public String getPosttime() {
        return posttime;
    }

    public void setPosttime(String posttime) {
        this.posttime = posttime;
    }

    public String getTrxsqnb() {
        return trxsqnb;
    }

    public void setTrxsqnb(String trxsqnb) {
        this.trxsqnb = trxsqnb;
    }

    public String getPtrxsqnb() {
        return ptrxsqnb;
    }

    public void setPtrxsqnb(String ptrxsqnb) {
        this.ptrxsqnb = ptrxsqnb;
    }

    public String getTrxsqns() {
        return trxsqns;
    }

    public void setTrxsqns(String trxsqns) {
        this.trxsqns = trxsqns;
    }

    public String getTrxcode() {
        return trxcode;
    }

    public void setTrxcode(String trxcode) {
        this.trxcode = trxcode;
    }

    public String getValuedat() {
        return valuedat;
    }

    public void setValuedat(String valuedat) {
        this.valuedat = valuedat;
    }

    public String getCurrtype() {
        return currtype;
    }

    public void setCurrtype(String currtype) {
        this.currtype = currtype;
    }

    public String getCashexf() {
        return cashexf;
    }

    public void setCashexf(String cashexf) {
        this.cashexf = cashexf;
    }

    public String getCatrflag() {
        return catrflag;
    }

    public void setCatrflag(String catrflag) {
        this.catrflag = catrflag;
    }

    public String getDrcrf() {
        return drcrf;
    }

    public void setDrcrf(String drcrf) {
        this.drcrf = drcrf;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getUpdbal() {
        return updbal;
    }

    public void setUpdbal(String updbal) {
        this.updbal = updbal;
    }

    public String getNotetype() {
        return notetype;
    }

    public void setNotetype(String notetype) {
        this.notetype = notetype;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getRevtranf() {
        return revtranf;
    }

    public void setRevtranf(String revtranf) {
        this.revtranf = revtranf;
    }

    public String getUpdtranf() {
        return updtranf;
    }

    public void setUpdtranf(String updtranf) {
        this.updtranf = updtranf;
    }

    public String getPosttype() {
        return posttype;
    }

    public void setPosttype(String posttype) {
        this.posttype = posttype;
    }

    public String getListtype() {
        return listtype;
    }

    public void setListtype(String listtype) {
        this.listtype = listtype;
    }

    public String getRecipbkn() {
        return recipbkn;
    }

    public void setRecipbkn(String recipbkn) {
        this.recipbkn = recipbkn;
    }

    public String getRecipbka() {
        return recipbka;
    }

    public void setRecipbka(String recipbka) {
        this.recipbka = recipbka;
    }

    public String getRecipact() {
        return recipact;
    }

    public void setRecipact(String recipact) {
        this.recipact = recipact;
    }

    public String getRecipacs() {
        return recipacs;
    }

    public void setRecipacs(String recipacs) {
        this.recipacs = recipacs;
    }

    public String getRecipacn() {
        return recipacn;
    }

    public void setRecipacn(String recipacn) {
        this.recipacn = recipacn;
    }

    public String getExchrat() {
        return exchrat;
    }

    public void setExchrat(String exchrat) {
        this.exchrat = exchrat;
    }

    public String getForecurr() {
        return forecurr;
    }

    public void setForecurr(String forecurr) {
        this.forecurr = forecurr;
    }

    public String getForeamt() {
        return foreamt;
    }

    public void setForeamt(String foreamt) {
        this.foreamt = foreamt;
    }

    public String getVouhtype() {
        return vouhtype;
    }

    public void setVouhtype(String vouhtype) {
        this.vouhtype = vouhtype;
    }

    public String getVouhno() {
        return vouhno;
    }

    public void setVouhno(String vouhno) {
        this.vouhno = vouhno;
    }

    public String getMediumid() {
        return mediumid;
    }

    public void setMediumid(String mediumid) {
        this.mediumid = mediumid;
    }

    public String getMediumno() {
        return mediumno;
    }

    public void setMediumno(String mediumno) {
        this.mediumno = mediumno;
    }

    public String getMedseno() {
        return medseno;
    }

    public void setMedseno(String medseno) {
        this.medseno = medseno;
    }

    public String getChnltype() {
        return chnltype;
    }

    public void setChnltype(String chnltype) {
        this.chnltype = chnltype;
    }

    public String getChnlno() {
        return chnlno;
    }

    public void setChnlno(String chnlno) {
        this.chnlno = chnlno;
    }

    public String getProdcode() {
        return prodcode;
    }

    public void setProdcode(String prodcode) {
        this.prodcode = prodcode;
    }

    public String getProdno() {
        return prodno;
    }

    public void setProdno(String prodno) {
        this.prodno = prodno;
    }

    public String getProdgpno() {
        return prodgpno;
    }

    public void setProdgpno(String prodgpno) {
        this.prodgpno = prodgpno;
    }

    public String getTrxzno() {
        return trxzno;
    }

    public void setTrxzno(String trxzno) {
        this.trxzno = trxzno;
    }

    public String getTphybrno() {
        return tphybrno;
    }

    public void setTphybrno(String tphybrno) {
        this.tphybrno = tphybrno;
    }

    public String getPhybrno() {
        return phybrno;
    }

    public void setPhybrno(String phybrno) {
        this.phybrno = phybrno;
    }

    public String getTellerno() {
        return tellerno;
    }

    public void setTellerno(String tellerno) {
        this.tellerno = tellerno;
    }

    public String getAuthtlno() {
        return authtlno;
    }

    public void setAuthtlno(String authtlno) {
        this.authtlno = authtlno;
    }

    public String getAuthno() {
        return authno;
    }

    public void setAuthno(String authno) {
        this.authno = authno;
    }

    public String getTermid() {
        return termid;
    }

    public void setTermid(String termid) {
        this.termid = termid;
    }

    public String getTrxplcs() {
        return trxplcs;
    }

    public void setTrxplcs(String trxplcs) {
        this.trxplcs = trxplcs;
    }

    public String getStatcode() {
        return statcode;
    }

    public void setStatcode(String statcode) {
        this.statcode = statcode;
    }

    public String getTermnum() {
        return termnum;
    }

    public void setTermnum(String termnum) {
        this.termnum = termnum;
    }

    public String getIntrate() {
        return intrate;
    }

    public void setIntrate(String intrate) {
        this.intrate = intrate;
    }

    public String getRlvrate() {
        return rlvrate;
    }

    public void setRlvrate(String rlvrate) {
        this.rlvrate = rlvrate;
    }

    public String getOvrrate() {
        return ovrrate;
    }

    public void setOvrrate(String ovrrate) {
        this.ovrrate = ovrrate;
    }

    public String getIncirate() {
        return incirate;
    }

    public void setIncirate(String incirate) {
        this.incirate = incirate;
    }

    public String getOfcirate() {
        return ofcirate;
    }

    public void setOfcirate(String ofcirate) {
        this.ofcirate = ofcirate;
    }

    public String getTaxrate() {
        return taxrate;
    }

    public void setTaxrate(String taxrate) {
        this.taxrate = taxrate;
    }

    public String getCurrint() {
        return currint;
    }

    public void setCurrint(String currint) {
        this.currint = currint;
    }

    public String getRlvint() {
        return rlvint;
    }

    public void setRlvint(String rlvint) {
        this.rlvint = rlvint;
    }

    public String getRlvibal() {
        return rlvibal;
    }

    public void setRlvibal(String rlvibal) {
        this.rlvibal = rlvibal;
    }

    public String getOvramt() {
        return ovramt;
    }

    public void setOvramt(String ovramt) {
        this.ovramt = ovramt;
    }

    public String getOvrbal() {
        return ovrbal;
    }

    public void setOvrbal(String ovrbal) {
        this.ovrbal = ovrbal;
    }

    public String getOvramtit() {
        return ovramtit;
    }

    public void setOvramtit(String ovramtit) {
        this.ovramtit = ovramtit;
    }

    public String getInamt() {
        return inamt;
    }

    public void setInamt(String inamt) {
        this.inamt = inamt;
    }

    public String getIncurbal() {
        return incurbal;
    }

    public void setIncurbal(String incurbal) {
        this.incurbal = incurbal;
    }

    public String getInamtit() {
        return inamtit;
    }

    public void setInamtit(String inamtit) {
        this.inamtit = inamtit;
    }

    public String getOfamt() {
        return ofamt;
    }

    public void setOfamt(String ofamt) {
        this.ofamt = ofamt;
    }

    public String getOfcurbal() {
        return ofcurbal;
    }

    public void setOfcurbal(String ofcurbal) {
        this.ofcurbal = ofcurbal;
    }

    public String getOfamtit() {
        return ofamtit;
    }

    public void setOfamtit(String ofamtit) {
        this.ofamtit = ofamtit;
    }

    public String getTaxsum() {
        return taxsum;
    }

    public void setTaxsum(String taxsum) {
        this.taxsum = taxsum;
    }

    public String getTaxamt() {
        return taxamt;
    }

    public void setTaxamt(String taxamt) {
        this.taxamt = taxamt;
    }

    public String getTaxbal() {
        return taxbal;
    }

    public void setTaxbal(String taxbal) {
        this.taxbal = taxbal;
    }

    public String getNtaxamt() {
        return ntaxamt;
    }

    public void setNtaxamt(String ntaxamt) {
        this.ntaxamt = ntaxamt;
    }

    public String getNtaxbal() {
        return ntaxbal;
    }

    public void setNtaxbal(String ntaxbal) {
        this.ntaxbal = ntaxbal;
    }

    public String getDrdoactn() {
        return drdoactn;
    }

    public void setDrdoactn(String drdoactn) {
        this.drdoactn = drdoactn;
    }

    public String getDrdoacsn() {
        return drdoacsn;
    }

    public void setDrdoacsn(String drdoacsn) {
        this.drdoacsn = drdoacsn;
    }

    public String getDrdoacta() {
        return drdoacta;
    }

    public void setDrdoacta(String drdoacta) {
        this.drdoacta = drdoacta;
    }

    public String getPayactn() {
        return payactn;
    }

    public void setPayactn(String payactn) {
        this.payactn = payactn;
    }

    public String getPayacsn() {
        return payacsn;
    }

    public void setPayacsn(String payacsn) {
        this.payacsn = payacsn;
    }

    public String getPayacta() {
        return payacta;
    }

    public void setPayacta(String payacta) {
        this.payacta = payacta;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
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

    public String getLeasehold() {
        return leasehold;
    }

    public void setLeasehold(String leasehold) {
        this.leasehold = leasehold;
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

    public String getRecourse() {
        return recourse;
    }

    public void setRecourse(String recourse) {
        this.recourse = recourse;
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

    public String getIouCode() {
        return iouCode;
    }

    public void setIouCode(String iouCode) {
        this.iouCode = iouCode;
    }

    public String getmCurrency() {
        return mCurrency;
    }

    public void setmCurrency(String mCurrency) {
        this.mCurrency = mCurrency;
    }

    public String getPolicyAttributreClassify() {
        return policyAttributreClassify;
    }

    public void setPolicyAttributreClassify(String policyAttributreClassify) {
        this.policyAttributreClassify = policyAttributreClassify;
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

    public String getSyndicatedstatus() {
        return syndicatedstatus;
    }

    public void setSyndicatedstatus(String syndicatedstatus) {
        this.syndicatedstatus = syndicatedstatus;
    }

    public String getSyndicateLoan() {
        return syndicateLoan;
    }

    public void setSyndicateLoan(String syndicateLoan) {
        this.syndicateLoan = syndicateLoan;
    }

    public String getTraneFinanceBusiness() {
        return traneFinanceBusiness;
    }

    public void setTraneFinanceBusiness(String traneFinanceBusiness) {
        this.traneFinanceBusiness = traneFinanceBusiness;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InfAccrual)) return false;
        InfAccrual that = (InfAccrual) o;
        return Objects.equal(getAfwklfeCurrtype(), that.getAfwklfeCurrtype()) &&
                Objects.equal(getAfwklfeFeeclass(), that.getAfwklfeFeeclass()) &&
                Objects.equal(getAfwklfeFeeamt(), that.getAfwklfeFeeamt()) &&
                Objects.equal(getZoneno(), that.getZoneno()) &&
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
                Objects.equal(getStatcode(), that.getStatcode()) &&
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
                Objects.equal(getPayacta(), that.getPayacta()) &&
                Objects.equal(getAccount(), that.getAccount()) &&
                Objects.equal(getConecn(), that.getConecn()) &&
                Objects.equal(getConeno(), that.getConeno()) &&
                Objects.equal(getConeorgnum(), that.getConeorgnum()) &&
                Objects.equal(getConerat(), that.getConerat()) &&
                Objects.equal(getConescale(), that.getConescale()) &&
                Objects.equal(getCurrency(), that.getCurrency()) &&
                Objects.equal(getLeasehold(), that.getLeasehold()) &&
                Objects.equal(getPropcn(), that.getPropcn()) &&
                Objects.equal(getPropno(), that.getPropno()) &&
                Objects.equal(getProporgnum(), that.getProporgnum()) &&
                Objects.equal(getProprat(), that.getProprat()) &&
                Objects.equal(getPropscale(), that.getPropscale()) &&
                Objects.equal(getRecourse(), that.getRecourse()) &&
                Objects.equal(getBankTellName(), that.getBankTellName()) &&
                Objects.equal(getBizRentalFactoringCode(), that.getBizRentalFactoringCode()) &&
                Objects.equal(getBusinessTypes(), that.getBusinessTypes()) &&
                Objects.equal(getDebtCode(), that.getDebtCode()) &&
                Objects.equal(getDeptCode(), that.getDeptCode()) &&
                Objects.equal(getDeptName(), that.getDeptName()) &&
                Objects.equal(getFinancePlatform(), that.getFinancePlatform()) &&
                Objects.equal(getGrantCode(), that.getGrantCode()) &&
                Objects.equal(getGrantId(), that.getGrantId()) &&
                Objects.equal(getIouCode(), that.getIouCode()) &&
                Objects.equal(getmCurrency(), that.getmCurrency()) &&
                Objects.equal(getPolicyAttributreClassify(), that.getPolicyAttributreClassify()) &&
                Objects.equal(getProductName(), that.getProductName()) &&
                Objects.equal(getProjectName(), that.getProjectName()) &&
                Objects.equal(getScopeBusinPeriod(), that.getScopeBusinPeriod()) &&
                Objects.equal(getSolutionAmt(), that.getSolutionAmt()) &&
                Objects.equal(getSyndicatedstatus(), that.getSyndicatedstatus()) &&
                Objects.equal(getSyndicateLoan(), that.getSyndicateLoan()) &&
                Objects.equal(getTraneFinanceBusiness(), that.getTraneFinanceBusiness()) &&
                Objects.equal(getUpdbalCNY(), that.getUpdbalCNY()) &&
                Objects.equal(getUpdbalUSD(), that.getUpdbalUSD()) &&
                Objects.equal(getPolicyAttributreClassify1(), that.getPolicyAttributreClassify1()) &&
                Objects.equal(getPolicyAttributreClassify2(), that.getPolicyAttributreClassify2()) &&
                Objects.equal(getPolicyAttributreClassify3(), that.getPolicyAttributreClassify3()) &&
                Objects.equal(getPolicyAttributreClassify4(), that.getPolicyAttributreClassify4()) &&
                Objects.equal(getPolicyAttributreClassify5(), that.getPolicyAttributreClassify5()) &&
                Objects.equal(getPolicyAttributreClassify6(), that.getPolicyAttributreClassify6());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getAfwklfeCurrtype(), getAfwklfeFeeclass(), getAfwklfeFeeamt(), getZoneno(), getProtseno(), getSubserno(), getWorkdate(), getListno(), getPrinflag(), getCmprflag(), getLglockno(), getTrxdate(), getTrxtime(), getTimestmp(), getPostndat(), getPostsdat(), getPosttime(), getTrxsqnb(), getPtrxsqnb(), getTrxsqns(), getTrxcode(), getValuedat(), getCurrtype(), getCashexf(), getCatrflag(), getDrcrf(), getAmount(), getUpdbal(), getNotetype(), getNotes(), getRevtranf(), getUpdtranf(), getPosttype(), getListtype(), getRecipbkn(), getRecipbka(), getRecipact(), getRecipacs(), getRecipacn(), getExchrat(), getForecurr(), getForeamt(), getVouhtype(), getVouhno(), getMediumid(), getMediumno(), getMedseno(), getChnltype(), getChnlno(), getProdcode(), getProdno(), getProdgpno(), getTrxzno(), getTphybrno(), getPhybrno(), getTellerno(), getAuthtlno(), getAuthno(), getTermid(), getTrxplcs(), getStatcode(), getTermnum(), getIntrate(), getRlvrate(), getOvrrate(), getIncirate(), getOfcirate(), getTaxrate(), getCurrint(), getRlvint(), getRlvibal(), getOvramt(), getOvrbal(), getOvramtit(), getInamt(), getIncurbal(), getInamtit(), getOfamt(), getOfcurbal(), getOfamtit(), getTaxsum(), getTaxamt(), getTaxbal(), getNtaxamt(), getNtaxbal(), getDrdoactn(), getDrdoacsn(), getDrdoacta(), getPayactn(), getPayacsn(), getPayacta(), getAccount(), getConecn(), getConeno(), getConeorgnum(), getConerat(), getConescale(), getCurrency(), getLeasehold(), getPropcn(), getPropno(), getProporgnum(), getProprat(), getPropscale(), getRecourse(), getBankTellName(), getBizRentalFactoringCode(), getBusinessTypes(), getDebtCode(), getDeptCode(), getDeptName(), getFinancePlatform(), getGrantCode(), getGrantId(), getIouCode(), getmCurrency(), getPolicyAttributreClassify(), getProductName(), getProjectName(), getScopeBusinPeriod(), getSolutionAmt(), getSyndicatedstatus(), getSyndicateLoan(), getTraneFinanceBusiness(), getUpdbalCNY(), getUpdbalUSD(), getPolicyAttributreClassify1(), getPolicyAttributreClassify2(), getPolicyAttributreClassify3(), getPolicyAttributreClassify4(), getPolicyAttributreClassify5(), getPolicyAttributreClassify6());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("afwklfeCurrtype", afwklfeCurrtype)
                .add("afwklfeFeeclass", afwklfeFeeclass)
                .add("afwklfeFeeamt", afwklfeFeeamt)
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
                .add("account", account)
                .add("conecn", conecn)
                .add("coneno", coneno)
                .add("coneorgnum", coneorgnum)
                .add("conerat", conerat)
                .add("conescale", conescale)
                .add("currency", currency)
                .add("leasehold", leasehold)
                .add("propcn", propcn)
                .add("propno", propno)
                .add("proporgnum", proporgnum)
                .add("proprat", proprat)
                .add("propscale", propscale)
                .add("recourse", recourse)
                .add("bankTellName", bankTellName)
                .add("bizRentalFactoringCode", bizRentalFactoringCode)
                .add("businessTypes", businessTypes)
                .add("debtCode", debtCode)
                .add("deptCode", deptCode)
                .add("deptName", deptName)
                .add("financePlatform", financePlatform)
                .add("grantCode", grantCode)
                .add("grantId", grantId)
                .add("iouCode", iouCode)
                .add("mCurrency", mCurrency)
                .add("policyAttributreClassify", policyAttributreClassify)
                .add("productName", productName)
                .add("projectName", projectName)
                .add("scopeBusinPeriod", scopeBusinPeriod)
                .add("solutionAmt", solutionAmt)
                .add("syndicatedstatus", syndicatedstatus)
                .add("syndicateLoan", syndicateLoan)
                .add("traneFinanceBusiness", traneFinanceBusiness)
                .add("updbalCNY", updbalCNY)
                .add("updbalUSD", updbalUSD)
                .add("policyAttributreClassify1", policyAttributreClassify1)
                .add("policyAttributreClassify2", policyAttributreClassify2)
                .add("policyAttributreClassify3", policyAttributreClassify3)
                .add("policyAttributreClassify4", policyAttributreClassify4)
                .add("policyAttributreClassify5", policyAttributreClassify5)
                .add("policyAttributreClassify6", policyAttributreClassify6)
                .toString();
    }
}
