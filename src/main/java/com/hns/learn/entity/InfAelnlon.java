package com.hns.learn.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.io.Serializable;
import java.util.Date;

/**
 * 贷款借据信息文件表
 *
 * @author hannasong
 * @version 1.0
 */
@TableName("INF_AELNLON")
public class InfAelnlon extends BaseModel implements Serializable {

    /** 地区号 */
    @TableField("ZONENO")
    private String zoneno;
    /** 核算网点号 */
    @TableField("ACTBRNO")
    private String actbrno;
    /** 物理网点号 */
    @TableField("PHYBRNO")
    private String phybrno;
    /** 贷款帐号 */
    @TableField("ACCNO")
    private String accno;
    /** 借据编号 */
    @TableField("LOANNO")
    private String loanno;
    /** 借据序号 */
    @TableField("LOANSQNO")
    private String loansqno;
    /** 币种 */
    @TableField("CURRTYPE")
    private String currtype;
    /** 状态 */
    @TableField("STATUS")
    private String status;
    /** 帐户名称 */
    @TableField("ACCNAME")
    private String accname;
    /** 填充字段10 */
    @TableField("FILLER10")
    private String filler10;
    /** 正常本金科目 */
    @TableField("SUBCODE1")
    private String subcode1;
    /** 逾期本金科目 */
    @TableField("SUBCODE2")
    private String subcode2;
    /** 表内欠息科目 */
    @TableField("SBJCODE3")
    private String sbjcode3;
    /** 表外欠息科目 */
    @TableField("SBJCODE4")
    private String sbjcode4;
    /** 信息编码 */
    @TableField("INFOCODE")
    private String infocode;
    /** 借据合同号 */
    @TableField("LNMEMNO")
    private String lnmemno;
    /** 贷款类型 */
    @TableField("LOANTYPE")
    private String loantype;
    /** 贷款性质 */
    @TableField("LOANNATU")
    private String loannatu;
    /** 贷款金额 */
    @TableField("LOANBAL")
    private String loanbal;
    /** 起息日期 */
    @TableField("VALUEDAY")
    private String valueday;
    /** 贷款到期日期 */
    @TableField("MATUDATE")
    private String matudate;
    /** 展期到期日期 */
    @TableField("EXHMATUD")
    private String exhmatud;
    /** 使用利率日期 */
    @TableField("RATEVALD")
    private String ratevald;
    /** 变动利率日期 */
    @TableField("RATECHGD")
    private String ratechgd;
    /** 最后计息日 */
    @TableField("LSTCINTD")
    private String lstcintd;
    /** 最后交易日 */
    @TableField("LSTTRAND")
    private String lsttrand;
    /** 昨日余额 */
    @TableField("LSTBAL")
    private String lstbal;
    /** 正常本金余额 */
    @TableField("BALANCE1")
    private String balance1;
    /** 逾期本金余额 */
    @TableField("BALANCE2")
    private String balance2;
    /** 表内欠息余额 */
    @TableField("BALANCE3")
    private String balance3;
    /** 表外欠息余额 */
    @TableField("BALANCE4")
    private String balance4;
    /** 正常计息周期 */
    @TableField("CALINTCL1")
    private String calintcl1;
    /** 正常计息周期单位 */
    @TableField("CALINTCY1")
    private String calintcy1;
    /** 逾期计息周期 */
    @TableField("CALINTCL2")
    private String calintcl2;
    /** 逾期计息周期单位 */
    @TableField("CALINTCY2")
    private String calintcy2;
    /** 正常利率变动方式 */
    @TableField("RATEINCM1")
    private String rateincm1;
    /** 展期利率变动方式 */
    @TableField("RATEINCM2")
    private String rateincm2;
    /** 逾期利率变动方式 */
    @TableField("RATEINCM3")
    private String rateincm3;
    /** 正常利率浮动率 */
    @TableField("FLOARATE")
    private String floarate;
    /** 展期利率浮动率 */
    @TableField("EXHFRATE")
    private String exhfrate;
    /** 逾期利率浮动率 */
    @TableField("FINFRATE")
    private String finfrate;
    /** 正常利率代码 */
    @TableField("RATECODE")
    private String ratecode;
    /** 展期利率代码 */
    @TableField("EXHRCODE")
    private String exhrcode;
    /** 逾期利率代码 */
    @TableField("FINRCODE")
    private String finrcode;
    /** 变动利率代码 */
    @TableField("CHGRCODE")
    private String chgrcode;
    /** 息余 */
    @TableField("DRINT")
    private String drint;
    /** 冲正息余 */
    @TableField("DRALTINT")
    private String draltint;
    /** 调整息余 */
    @TableField("DRADJINT")
    private String dradjint;
    /** 核对积数 */
    @TableField("DRACM")
    private String dracm;
    /** 存款部门 */
    @TableField("DEPDEPAT")
    private String depdepat;
    /** 付息帐号 */
    @TableField("DEPACCNO")
    private String depaccno;
    /** 联行行号/交换号 */
    @TableField("BANKCODE")
    private String bankcode;
    /** 开户柜员 */
    @TableField("OPENTLNO")
    private String opentlno;
    /** 注销柜员 */
    @TableField("CLOSTLNO")
    private String clostlno;
    /** 开户日期 */
    @TableField("OPENDATE")
    private String opendate;
    /** 注销日期 */
    @TableField("CLOSDATE")
    private String closdate;
    /** 客户最后金融交易日 */
    @TableField("CLITLSTD")
    private String clitlstd;
    /** 银行最后调整日 */
    @TableField("LSTMODFD")
    private String lstmodfd;
    /** 委托人客户信息号 */
    @TableField("CINO")
    private String cino;
    /** 利息收入帐户区分 */
    @TableField("TRINACCF")
    private String trinaccf;
    /** 委托人利息收入户 */
    @TableField("TRINACCNO")
    private String trinaccno;
    /** 备用日期 */
    @TableField("EXTRADATE")
    private String extradate;
    /** 备用字段 */
    @TableField("FIELD1")
    private String field1;
    /** 备用字段2 */
    @TableField("FIELD2")
    private String field2;
    /** 公司贷款标志 */
    @TableField("COLNFLAG")
    private String colnflag;
    /** 不良贷款标志 */
    @TableField("BDLNFLAG")
    private String bdlnflag;
    /** 资金积数 */
    @TableField("FDINT")
    private String fdint;
    /** 资金计价周期 */
    @TableField("FDCALINT")
    private String fdcalint;
    /** 资金正常利率代码 */
    @TableField("FDRATECD")
    private String fdratecd;
    /** 资金正常利率浮动点数 */
    @TableField("FDRATDOT")
    private String fdratdot;
    /** 资金不良利率代码 */
    @TableField("FDFINRCD")
    private String fdfinrcd;
    /** 资金不良利率浮动点数 */
    @TableField("FDFINDOT")
    private String fdfindot;
    /** 信用等级 */
    @TableField("CREDIT")
    private String credit;
    /** 贷款期限 */
    @TableField("LOANTERM")
    private String loanterm;
    /** 批量逾期扣款标志 */
    @TableField("BRTNFLAG")
    private String brtnflag;
    /** 核心工作日期 */
    @TableField("WORKDATE")
    private Date workdate;

    public InfAelnlon() {
    }

    public String getZoneno() {
        return zoneno == "" ? null : zoneno;
    }

    public void setZoneno(String zoneno) {
        this.zoneno = zoneno;
    }

    public String getActbrno() {
        return actbrno == "" ? null : actbrno;
    }

    public void setActbrno(String actbrno) {
        this.actbrno = actbrno;
    }

    public String getPhybrno() {
        return phybrno == "" ? null : phybrno;
    }

    public void setPhybrno(String phybrno) {
        this.phybrno = phybrno;
    }

    public String getAccno() {
        return accno == "" ? null : accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public String getLoanno() {
        return loanno == "" ? null : loanno;
    }

    public void setLoanno(String loanno) {
        this.loanno = loanno;
    }

    public String getLoansqno() {
        return loansqno == "" ? null : loansqno;
    }

    public void setLoansqno(String loansqno) {
        this.loansqno = loansqno;
    }

    public String getCurrtype() {
        return currtype == "" ? null : currtype;
    }

    public void setCurrtype(String currtype) {
        this.currtype = currtype;
    }

    public String getStatus() {
        return status == "" ? null : status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAccname() {
        return accname == "" ? null : accname;
    }

    public void setAccname(String accname) {
        this.accname = accname;
    }

    public String getFiller10() {
        return filler10 == "" ? null : filler10;
    }

    public void setFiller10(String filler10) {
        this.filler10 = filler10;
    }

    public String getSubcode1() {
        return subcode1 == "" ? null : subcode1;
    }

    public void setSubcode1(String subcode1) {
        this.subcode1 = subcode1;
    }

    public String getSubcode2() {
        return subcode2 == "" ? null : subcode2;
    }

    public void setSubcode2(String subcode2) {
        this.subcode2 = subcode2;
    }

    public String getSbjcode3() {
        return sbjcode3 == "" ? null : sbjcode3;
    }

    public void setSbjcode3(String sbjcode3) {
        this.sbjcode3 = sbjcode3;
    }

    public String getSbjcode4() {
        return sbjcode4 == "" ? null : sbjcode4;
    }

    public void setSbjcode4(String sbjcode4) {
        this.sbjcode4 = sbjcode4;
    }

    public String getInfocode() {
        return infocode == "" ? null : infocode;
    }

    public void setInfocode(String infocode) {
        this.infocode = infocode;
    }

    public String getLnmemno() {
        return lnmemno == "" ? null : lnmemno;
    }

    public void setLnmemno(String lnmemno) {
        this.lnmemno = lnmemno;
    }

    public String getLoantype() {
        return loantype == "" ? null : loantype;
    }

    public void setLoantype(String loantype) {
        this.loantype = loantype;
    }

    public String getLoannatu() {
        return loannatu == "" ? null : loannatu;
    }

    public void setLoannatu(String loannatu) {
        this.loannatu = loannatu;
    }

    public String getLoanbal() {
        return loanbal == "" ? null : loanbal;
    }

    public void setLoanbal(String loanbal) {
        this.loanbal = loanbal;
    }

    public String getValueday() {
        return valueday == "" ? null : valueday;
    }

    public void setValueday(String valueday) {
        this.valueday = valueday;
    }

    public String getMatudate() {
        return matudate == "" ? null : matudate;
    }

    public void setMatudate(String matudate) {
        this.matudate = matudate;
    }

    public String getExhmatud() {
        return exhmatud == "" ? null : exhmatud;
    }

    public void setExhmatud(String exhmatud) {
        this.exhmatud = exhmatud;
    }

    public String getRatevald() {
        return ratevald == "" ? null : ratevald;
    }

    public void setRatevald(String ratevald) {
        this.ratevald = ratevald;
    }

    public String getRatechgd() {
        return ratechgd == "" ? null : ratechgd;
    }

    public void setRatechgd(String ratechgd) {
        this.ratechgd = ratechgd;
    }

    public String getLstcintd() {
        return lstcintd == "" ? null : lstcintd;
    }

    public void setLstcintd(String lstcintd) {
        this.lstcintd = lstcintd;
    }

    public String getLsttrand() {
        return lsttrand == "" ? null : lsttrand;
    }

    public void setLsttrand(String lsttrand) {
        this.lsttrand = lsttrand;
    }

    public String getLstbal() {
        return lstbal == "" ? null : lstbal;
    }

    public void setLstbal(String lstbal) {
        this.lstbal = lstbal;
    }

    public String getBalance1() {
        return balance1 == "" ? null : balance1;
    }

    public void setBalance1(String balance1) {
        this.balance1 = balance1;
    }

    public String getBalance2() {
        return balance2 == "" ? null : balance2;
    }

    public void setBalance2(String balance2) {
        this.balance2 = balance2;
    }

    public String getBalance3() {
        return balance3 == "" ? null : balance3;
    }

    public void setBalance3(String balance3) {
        this.balance3 = balance3;
    }

    public String getBalance4() {
        return balance4 == "" ? null : balance4;
    }

    public void setBalance4(String balance4) {
        this.balance4 = balance4;
    }

    public String getCalintcl1() {
        return calintcl1 == "" ? null : calintcl1;
    }

    public void setCalintcl1(String calintcl1) {
        this.calintcl1 = calintcl1;
    }

    public String getCalintcy1() {
        return calintcy1 == "" ? null : calintcy1;
    }

    public void setCalintcy1(String calintcy1) {
        this.calintcy1 = calintcy1;
    }

    public String getCalintcl2() {
        return calintcl2 == "" ? null : calintcl2;
    }

    public void setCalintcl2(String calintcl2) {
        this.calintcl2 = calintcl2;
    }

    public String getCalintcy2() {
        return calintcy2 == "" ? null : calintcy2;
    }

    public void setCalintcy2(String calintcy2) {
        this.calintcy2 = calintcy2;
    }

    public String getRateincm1() {
        return rateincm1 == "" ? null : rateincm1;
    }

    public void setRateincm1(String rateincm1) {
        this.rateincm1 = rateincm1;
    }

    public String getRateincm2() {
        return rateincm2 == "" ? null : rateincm2;
    }

    public void setRateincm2(String rateincm2) {
        this.rateincm2 = rateincm2;
    }

    public String getRateincm3() {
        return rateincm3 == "" ? null : rateincm3;
    }

    public void setRateincm3(String rateincm3) {
        this.rateincm3 = rateincm3;
    }

    public String getFloarate() {
        return floarate == "" ? null : floarate;
    }

    public void setFloarate(String floarate) {
        this.floarate = floarate;
    }

    public String getExhfrate() {
        return exhfrate == "" ? null : exhfrate;
    }

    public void setExhfrate(String exhfrate) {
        this.exhfrate = exhfrate;
    }

    public String getFinfrate() {
        return finfrate == "" ? null : finfrate;
    }

    public void setFinfrate(String finfrate) {
        this.finfrate = finfrate;
    }

    public String getRatecode() {
        return ratecode == "" ? null : ratecode;
    }

    public void setRatecode(String ratecode) {
        this.ratecode = ratecode;
    }

    public String getExhrcode() {
        return exhrcode == "" ? null : exhrcode;
    }

    public void setExhrcode(String exhrcode) {
        this.exhrcode = exhrcode;
    }

    public String getFinrcode() {
        return finrcode == "" ? null : finrcode;
    }

    public void setFinrcode(String finrcode) {
        this.finrcode = finrcode;
    }

    public String getChgrcode() {
        return chgrcode == "" ? null : chgrcode;
    }

    public void setChgrcode(String chgrcode) {
        this.chgrcode = chgrcode;
    }

    public String getDrint() {
        return drint == "" ? null : drint;
    }

    public void setDrint(String drint) {
        this.drint = drint;
    }

    public String getDraltint() {
        return draltint == "" ? null : draltint;
    }

    public void setDraltint(String draltint) {
        this.draltint = draltint;
    }

    public String getDradjint() {
        return dradjint == "" ? null : dradjint;
    }

    public void setDradjint(String dradjint) {
        this.dradjint = dradjint;
    }

    public String getDracm() {
        return dracm == "" ? null : dracm;
    }

    public void setDracm(String dracm) {
        this.dracm = dracm;
    }

    public String getDepdepat() {
        return depdepat == "" ? null : depdepat;
    }

    public void setDepdepat(String depdepat) {
        this.depdepat = depdepat;
    }

    public String getDepaccno() {
        return depaccno == "" ? null : depaccno;
    }

    public void setDepaccno(String depaccno) {
        this.depaccno = depaccno;
    }

    public String getBankcode() {
        return bankcode == "" ? null : bankcode;
    }

    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    public String getOpentlno() {
        return opentlno == "" ? null : opentlno;
    }

    public void setOpentlno(String opentlno) {
        this.opentlno = opentlno;
    }

    public String getClostlno() {
        return clostlno == "" ? null : clostlno;
    }

    public void setClostlno(String clostlno) {
        this.clostlno = clostlno;
    }

    public String getOpendate() {
        return opendate == "" ? null : opendate;
    }

    public void setOpendate(String opendate) {
        this.opendate = opendate;
    }

    public String getClosdate() {
        return closdate == "" ? null : closdate;
    }

    public void setClosdate(String closdate) {
        this.closdate = closdate;
    }

    public String getClitlstd() {
        return clitlstd == "" ? null : clitlstd;
    }

    public void setClitlstd(String clitlstd) {
        this.clitlstd = clitlstd;
    }

    public String getLstmodfd() {
        return lstmodfd == "" ? null : lstmodfd;
    }

    public void setLstmodfd(String lstmodfd) {
        this.lstmodfd = lstmodfd;
    }

    public String getCino() {
        return cino == "" ? null : cino;
    }

    public void setCino(String cino) {
        this.cino = cino;
    }

    public String getTrinaccf() {
        return trinaccf == "" ? null : trinaccf;
    }

    public void setTrinaccf(String trinaccf) {
        this.trinaccf = trinaccf;
    }

    public String getTrinaccno() {
        return trinaccno == "" ? null : trinaccno;
    }

    public void setTrinaccno(String trinaccno) {
        this.trinaccno = trinaccno;
    }

    public String getExtradate() {
        return extradate == "" ? null : extradate;
    }

    public void setExtradate(String extradate) {
        this.extradate = extradate;
    }

    public String getField1() {
        return field1 == "" ? null : field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2 == "" ? null : field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getColnflag() {
        return colnflag == "" ? null : colnflag;
    }

    public void setColnflag(String colnflag) {
        this.colnflag = colnflag;
    }

    public String getBdlnflag() {
        return bdlnflag == "" ? null : bdlnflag;
    }

    public void setBdlnflag(String bdlnflag) {
        this.bdlnflag = bdlnflag;
    }

    public String getFdint() {
        return fdint == "" ? null : fdint;
    }

    public void setFdint(String fdint) {
        this.fdint = fdint;
    }

    public String getFdcalint() {
        return fdcalint == "" ? null : fdcalint;
    }

    public void setFdcalint(String fdcalint) {
        this.fdcalint = fdcalint;
    }

    public String getFdratecd() {
        return fdratecd == "" ? null : fdratecd;
    }

    public void setFdratecd(String fdratecd) {
        this.fdratecd = fdratecd;
    }

    public String getFdratdot() {
        return fdratdot == "" ? null : fdratdot;
    }

    public void setFdratdot(String fdratdot) {
        this.fdratdot = fdratdot;
    }

    public String getFdfinrcd() {
        return fdfinrcd == "" ? null : fdfinrcd;
    }

    public void setFdfinrcd(String fdfinrcd) {
        this.fdfinrcd = fdfinrcd;
    }

    public String getFdfindot() {
        return fdfindot == "" ? null : fdfindot;
    }

    public void setFdfindot(String fdfindot) {
        this.fdfindot = fdfindot;
    }

    public String getCredit() {
        return credit == "" ? null : credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getLoanterm() {
        return loanterm == "" ? null : loanterm;
    }

    public void setLoanterm(String loanterm) {
        this.loanterm = loanterm;
    }

    public String getBrtnflag() {
        return brtnflag == "" ? null : brtnflag;
    }

    public void setBrtnflag(String brtnflag) {
        this.brtnflag = brtnflag;
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
        if (!(o instanceof InfAelnlon)) return false;
        InfAelnlon that = (InfAelnlon) o;
        return Objects.equal(getZoneno(), that.getZoneno()) &&
                Objects.equal(getActbrno(), that.getActbrno()) &&
                Objects.equal(getPhybrno(), that.getPhybrno()) &&
                Objects.equal(getAccno(), that.getAccno()) &&
                Objects.equal(getLoanno(), that.getLoanno()) &&
                Objects.equal(getLoansqno(), that.getLoansqno()) &&
                Objects.equal(getCurrtype(), that.getCurrtype()) &&
                Objects.equal(getStatus(), that.getStatus()) &&
                Objects.equal(getAccname(), that.getAccname()) &&
                Objects.equal(getFiller10(), that.getFiller10()) &&
                Objects.equal(getSubcode1(), that.getSubcode1()) &&
                Objects.equal(getSubcode2(), that.getSubcode2()) &&
                Objects.equal(getSbjcode3(), that.getSbjcode3()) &&
                Objects.equal(getSbjcode4(), that.getSbjcode4()) &&
                Objects.equal(getInfocode(), that.getInfocode()) &&
                Objects.equal(getLnmemno(), that.getLnmemno()) &&
                Objects.equal(getLoantype(), that.getLoantype()) &&
                Objects.equal(getLoannatu(), that.getLoannatu()) &&
                Objects.equal(getLoanbal(), that.getLoanbal()) &&
                Objects.equal(getValueday(), that.getValueday()) &&
                Objects.equal(getMatudate(), that.getMatudate()) &&
                Objects.equal(getExhmatud(), that.getExhmatud()) &&
                Objects.equal(getRatevald(), that.getRatevald()) &&
                Objects.equal(getRatechgd(), that.getRatechgd()) &&
                Objects.equal(getLstcintd(), that.getLstcintd()) &&
                Objects.equal(getLsttrand(), that.getLsttrand()) &&
                Objects.equal(getLstbal(), that.getLstbal()) &&
                Objects.equal(getBalance1(), that.getBalance1()) &&
                Objects.equal(getBalance2(), that.getBalance2()) &&
                Objects.equal(getBalance3(), that.getBalance3()) &&
                Objects.equal(getBalance4(), that.getBalance4()) &&
                Objects.equal(getCalintcl1(), that.getCalintcl1()) &&
                Objects.equal(getCalintcy1(), that.getCalintcy1()) &&
                Objects.equal(getCalintcl2(), that.getCalintcl2()) &&
                Objects.equal(getCalintcy2(), that.getCalintcy2()) &&
                Objects.equal(getRateincm1(), that.getRateincm1()) &&
                Objects.equal(getRateincm2(), that.getRateincm2()) &&
                Objects.equal(getRateincm3(), that.getRateincm3()) &&
                Objects.equal(getFloarate(), that.getFloarate()) &&
                Objects.equal(getExhfrate(), that.getExhfrate()) &&
                Objects.equal(getFinfrate(), that.getFinfrate()) &&
                Objects.equal(getRatecode(), that.getRatecode()) &&
                Objects.equal(getExhrcode(), that.getExhrcode()) &&
                Objects.equal(getFinrcode(), that.getFinrcode()) &&
                Objects.equal(getChgrcode(), that.getChgrcode()) &&
                Objects.equal(getDrint(), that.getDrint()) &&
                Objects.equal(getDraltint(), that.getDraltint()) &&
                Objects.equal(getDradjint(), that.getDradjint()) &&
                Objects.equal(getDracm(), that.getDracm()) &&
                Objects.equal(getDepdepat(), that.getDepdepat()) &&
                Objects.equal(getDepaccno(), that.getDepaccno()) &&
                Objects.equal(getBankcode(), that.getBankcode()) &&
                Objects.equal(getOpentlno(), that.getOpentlno()) &&
                Objects.equal(getClostlno(), that.getClostlno()) &&
                Objects.equal(getOpendate(), that.getOpendate()) &&
                Objects.equal(getClosdate(), that.getClosdate()) &&
                Objects.equal(getClitlstd(), that.getClitlstd()) &&
                Objects.equal(getLstmodfd(), that.getLstmodfd()) &&
                Objects.equal(getCino(), that.getCino()) &&
                Objects.equal(getTrinaccf(), that.getTrinaccf()) &&
                Objects.equal(getTrinaccno(), that.getTrinaccno()) &&
                Objects.equal(getExtradate(), that.getExtradate()) &&
                Objects.equal(getField1(), that.getField1()) &&
                Objects.equal(getField2(), that.getField2()) &&
                Objects.equal(getColnflag(), that.getColnflag()) &&
                Objects.equal(getBdlnflag(), that.getBdlnflag()) &&
                Objects.equal(getFdint(), that.getFdint()) &&
                Objects.equal(getFdcalint(), that.getFdcalint()) &&
                Objects.equal(getFdratecd(), that.getFdratecd()) &&
                Objects.equal(getFdratdot(), that.getFdratdot()) &&
                Objects.equal(getFdfinrcd(), that.getFdfinrcd()) &&
                Objects.equal(getFdfindot(), that.getFdfindot()) &&
                Objects.equal(getCredit(), that.getCredit()) &&
                Objects.equal(getLoanterm(), that.getLoanterm()) &&
                Objects.equal(getBrtnflag(), that.getBrtnflag()) &&
                Objects.equal(getWorkdate(), that.getWorkdate());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getZoneno(), getActbrno(), getPhybrno(), getAccno(), getLoanno(), getLoansqno(), getCurrtype(), getStatus(), getAccname(), getFiller10(), getSubcode1(), getSubcode2(), getSbjcode3(), getSbjcode4(), getInfocode(), getLnmemno(), getLoantype(), getLoannatu(), getLoanbal(), getValueday(), getMatudate(), getExhmatud(), getRatevald(), getRatechgd(), getLstcintd(), getLsttrand(), getLstbal(), getBalance1(), getBalance2(), getBalance3(), getBalance4(), getCalintcl1(), getCalintcy1(), getCalintcl2(), getCalintcy2(), getRateincm1(), getRateincm2(), getRateincm3(), getFloarate(), getExhfrate(), getFinfrate(), getRatecode(), getExhrcode(), getFinrcode(), getChgrcode(), getDrint(), getDraltint(), getDradjint(), getDracm(), getDepdepat(), getDepaccno(), getBankcode(), getOpentlno(), getClostlno(), getOpendate(), getClosdate(), getClitlstd(), getLstmodfd(), getCino(), getTrinaccf(), getTrinaccno(), getExtradate(), getField1(), getField2(), getColnflag(), getBdlnflag(), getFdint(), getFdcalint(), getFdratecd(), getFdratdot(), getFdfinrcd(), getFdfindot(), getCredit(), getLoanterm(), getBrtnflag(), getWorkdate());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("zoneno", zoneno)
                .add("actbrno", actbrno)
                .add("phybrno", phybrno)
                .add("accno", accno)
                .add("loanno", loanno)
                .add("loansqno", loansqno)
                .add("currtype", currtype)
                .add("status", status)
                .add("accname", accname)
                .add("filler10", filler10)
                .add("subcode1", subcode1)
                .add("subcode2", subcode2)
                .add("sbjcode3", sbjcode3)
                .add("sbjcode4", sbjcode4)
                .add("infocode", infocode)
                .add("lnmemno", lnmemno)
                .add("loantype", loantype)
                .add("loannatu", loannatu)
                .add("loanbal", loanbal)
                .add("valueday", valueday)
                .add("matudate", matudate)
                .add("exhmatud", exhmatud)
                .add("ratevald", ratevald)
                .add("ratechgd", ratechgd)
                .add("lstcintd", lstcintd)
                .add("lsttrand", lsttrand)
                .add("lstbal", lstbal)
                .add("balance1", balance1)
                .add("balance2", balance2)
                .add("balance3", balance3)
                .add("balance4", balance4)
                .add("calintcl1", calintcl1)
                .add("calintcy1", calintcy1)
                .add("calintcl2", calintcl2)
                .add("calintcy2", calintcy2)
                .add("rateincm1", rateincm1)
                .add("rateincm2", rateincm2)
                .add("rateincm3", rateincm3)
                .add("floarate", floarate)
                .add("exhfrate", exhfrate)
                .add("finfrate", finfrate)
                .add("ratecode", ratecode)
                .add("exhrcode", exhrcode)
                .add("finrcode", finrcode)
                .add("chgrcode", chgrcode)
                .add("drint", drint)
                .add("draltint", draltint)
                .add("dradjint", dradjint)
                .add("dracm", dracm)
                .add("depdepat", depdepat)
                .add("depaccno", depaccno)
                .add("bankcode", bankcode)
                .add("opentlno", opentlno)
                .add("clostlno", clostlno)
                .add("opendate", opendate)
                .add("closdate", closdate)
                .add("clitlstd", clitlstd)
                .add("lstmodfd", lstmodfd)
                .add("cino", cino)
                .add("trinaccf", trinaccf)
                .add("trinaccno", trinaccno)
                .add("extradate", extradate)
                .add("field1", field1)
                .add("field2", field2)
                .add("colnflag", colnflag)
                .add("bdlnflag", bdlnflag)
                .add("fdint", fdint)
                .add("fdcalint", fdcalint)
                .add("fdratecd", fdratecd)
                .add("fdratdot", fdratdot)
                .add("fdfinrcd", fdfinrcd)
                .add("fdfindot", fdfindot)
                .add("credit", credit)
                .add("loanterm", loanterm)
                .add("brtnflag", brtnflag)
                .add("workdate", workdate)
                .toString();
    }
}
