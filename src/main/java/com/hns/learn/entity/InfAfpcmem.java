package com.hns.learn.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.io.Serializable;
import java.util.Date;

/**
 * 贷款合同文件表
 * 
 * @author hannasong
 * @version 1.0
 */
@TableName("INF_AFPCMEM")
public class InfAfpcmem extends BaseModel implements Serializable {

    /** 核心工作日期 */
    @TableField("WORKDATE")
    private Date workdate;
    /** 协议签订地区号 */
    @TableField("CRZONENO")
    private String crzoneno;
    /** 账号 */
    @TableField("MEDIUMID")
    private String mediumid;
    /** 协议编号 */
    @TableField("PROTSENO")
    private String protseno;
    /** 合同状态 */
    @TableField("STATUS")
    private String status;
    /** 是否同币种借据 */
    @TableField("SCURFLAG")
    private String scurflag;
    /** 币种 */
    @TableField("CURRTYPE")
    private String currtype;
    /** 协议名 */
    @TableField("PROALIAS")
    private String proalias;
    /** 产品种类代码 */
    @TableField("PRTYCODE")
    private String prtycode;
    /** 产品序号 */
    @TableField("PRSERNO")
    private String prserno;
    /** 台帐借据编号 */
    @TableField("XDMEMNO")
    private String xdmemno;
    /** 关联其他协议控制 */
    @TableField("ASSPFLAG")
    private String asspflag;
    /** 合同类型 */
    @TableField("CEUSEF")
    private String ceusef;
    /** 公司/个人标识 */
    @TableField("CORPERF")
    private String corperf;
    /** 贷款性质 */
    @TableField("LOANNATU")
    private String loannatu;
    /** 担保方式 */
    @TableField("ASSUREMD")
    private String assuremd;
    /** 银团贷款标志 */
    @TableField("GRLNFLAG")
    private String grlnflag;
    /** 贷款类型 */
    @TableField("LNTYPE")
    private String lntype;
    /** 贷款名称 */
    @TableField("LOANNAME")
    private String loanname;
    /** 正常本金科目 */
    @TableField("SBJCODE1")
    private String sbjcode1;
    /** 逾期本金科目 */
    @TableField("SBJCODE2")
    private String sbjcode2;
    /** 表内欠息科目 */
    @TableField("SBJCODE3")
    private String sbjcode3;
    /** 表外欠息科目 */
    @TableField("SBJCODE4")
    private String sbjcode4;
    /** 减值贷款本金科目 */
    @TableField("SBJCODE5")
    private String sbjcode5;
    /** 减值应收未收利息科目 */
    @TableField("SBJCODE6")
    private String sbjcode6;
    /** 备用 */
    @TableField("SBJCODE7")
    private String sbjcode7;
    /** 备用 */
    @TableField("SBJCODE8")
    private String sbjcode8;
    /** 联名帐户标志 */
    @TableField("GRPACCF")
    private String grpaccf;
    /** 联名办理方式 */
    @TableField("GRPMODE")
    private String grpmode;
    /** 通存标志 */
    @TableField("AUTDEPF")
    private String autdepf;
    /** 通兑标志 */
    @TableField("AUTWITHF")
    private String autwithf;
    /** 是否联机发放标志 */
    @TableField("OLPRFLAG")
    private String olprflag;
    /** 是否允许分次发放标志 */
    @TableField("TATPRF")
    private String tatprf;
    /** 借据集中标志 */
    @TableField("LNCOLLF")
    private String lncollf;
    /** 合同生效日期 */
    @TableField("CRDATE")
    private String crdate;
    /** 合同约定贷款总额 */
    @TableField("PRAMOUNT")
    private String pramount;
    /** 当前可贷金额 */
    @TableField("CURLNAMT")
    private String curlnamt;
    /** 当前累计已归还贷款金额 */
    @TableField("TOTHKAMT")
    private String tothkamt;
    /** 当前累计已发放贷款金额 */
    @TableField("TOTFFAMT")
    private String totffamt;
    /** 当前累计已发放贷款笔数 */
    @TableField("TOTFFNUM")
    private String totffnum;
    /** 发放截止日期 */
    @TableField("PROEDATE")
    private String proedate;
    /** 合同约定贷款到期日期 */
    @TableField("PRMADATE")
    private String prmadate;
    /** 存款账户标志 */
    @TableField("PRAFLAG")
    private String praflag;
    /** 存款账户区分 */
    @TableField("PRACCF")
    private String praccf;
    /** 存款账号 */
    @TableField("PROACCNO")
    private String proaccno;
    /** 存款账户序号 */
    @TableField("PRACCSN")
    private String praccsn;
    /** 质押存单数 */
    @TableField("GAGENO")
    private String gageno;
    /** 质押存单总金额 */
    @TableField("GAGESUM")
    private String gagesum;
    /** 质押存单到期日期 */
    @TableField("EXPDATE")
    private String expdate;
    /** 印花税是否豁免 */
    @TableField("EXFLAG")
    private String exflag;
    /** 印花税豁免限额 */
    @TableField("EXQUOTA")
    private String exquota;
    /** 归属地区号 */
    @TableField("ADZONENO")
    private String adzoneno;
    /** 协议签订日期 */
    @TableField("PRCRDATE")
    private String prcrdate;
    /** 协议签订网点号 */
    @TableField("CRBRNO")
    private String crbrno;
    /** 协议签订柜员号 */
    @TableField("CTELLERN")
    private String ctellern;
    /** 协议最后修改日期 */
    @TableField("PRENDATE")
    private String prendate;
    /** 协议最后修改地区号 */
    @TableField("ENDZONENO")
    private String endzoneno;
    /** 协议最后修改网点号 */
    @TableField("ENDBRNO")
    private String endbrno;
    /** 协议最后修改柜员号 */
    @TableField("ETELLERN")
    private String etellern;
    /** 协议最后调整日 */
    @TableField("LADJDATE")
    private String ladjdate;
    /** 上次初笔日期 */
    @TableField("LTITDATE")
    private String ltitdate;
    /** 最后交易日 */
    @TableField("LTRDDATE")
    private String ltrddate;
    /** 最后客户金融交易日 */
    @TableField("LCTRDDAT")
    private String lctrddat;
    /** 物理网点号 */
    @TableField("PHYBRNO")
    private String phybrno;
    /** 核算网点号 */
    @TableField("ACTBRNO")
    private String actbrno;
    /** 逻辑锁 */
    @TableField("LGLOCKNO")
    private String lglockno;
    /** 是否台账创建 */
    @TableField("CMFLAG")
    private String cmflag;
    /** 已发放最大借据序号 */
    @TableField("MAXSERNO")
    private String maxserno;
    /** 贷款用途 */
    @TableField("USETYPE")
    private String usetype;
    /** 分析代码1 */
    @TableField("FXCODE1")
    private String fxcode1;
    /** 分析代码2 */
    @TableField("FXCODE2")
    private String fxcode2;
    /** 分析代码3 */
    @TableField("FXCODE3")
    private String fxcode3;
    /** 利息费用本金化处理 */
    @TableField("INTPRIF")
    private String intprif;
    /** 正常扣款顺序 */
    @TableField("NGBSQ")
    private String ngbsq;
    /** 逾期扣款顺序 */
    @TableField("OGBSQ")
    private String ogbsq;
    /** 正常计息标志 */
    @TableField("CALINTF")
    private String calintf;
    /** 逾期计息标志 */
    @TableField("OVCALINF")
    private String ovcalinf;
    /** 表内欠息计息标志 */
    @TableField("INCALINF")
    private String incalinf;
    /** 表外欠息计息标志 */
    @TableField("OCALINF")
    private String ocalinf;
    /** 分析代码4 */
    @TableField("FXCODE4")
    private String fxcode4;
    /** 分析代码5 */
    @TableField("FXCODE5")
    private String fxcode5;
    /** 分析代码6 */
    @TableField("FXCODE6")
    private String fxcode6;
    /** 扣款方式 */
    @TableField("GBTYPE")
    private String gbtype;
    /** 减值标志 */
    @TableField("DEFLAG")
    private String deflag;
    /** 减值准备账户区分 */
    @TableField("DEACCF")
    private String deaccf;
    /** 减值准备账号 */
    @TableField("DEACCNO")
    private String deaccno;
    /** 减值准备账户序号 */
    @TableField("DEACCSN")
    private String deaccsn;
    /** 容忍期天数 */
    @TableField("TOLRDAYS")
    private String tolrdays;

    public InfAfpcmem() {
    }

    public String getCrzoneno() {
        return crzoneno == "" ? null : crzoneno;
    }

    public void setCrzoneno(String crzoneno) {
        this.crzoneno = crzoneno;
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

    public String getStatus() {
        return status == "" ? null : status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getScurflag() {
        return scurflag == "" ? null : scurflag;
    }

    public void setScurflag(String scurflag) {
        this.scurflag = scurflag;
    }

    public String getCurrtype() {
        return currtype == "" ? null : currtype;
    }

    public void setCurrtype(String currtype) {
        this.currtype = currtype;
    }

    public String getProalias() {
        return proalias == "" ? null : proalias;
    }

    public void setProalias(String proalias) {
        this.proalias = proalias;
    }

    public String getPrtycode() {
        return prtycode == "" ? null : prtycode;
    }

    public void setPrtycode(String prtycode) {
        this.prtycode = prtycode;
    }

    public String getPrserno() {
        return prserno == "" ? null : prserno;
    }

    public void setPrserno(String prserno) {
        this.prserno = prserno;
    }

    public String getXdmemno() {
        return xdmemno == "" ? null : xdmemno;
    }

    public void setXdmemno(String xdmemno) {
        this.xdmemno = xdmemno;
    }

    public String getAsspflag() {
        return asspflag == "" ? null : asspflag;
    }

    public void setAsspflag(String asspflag) {
        this.asspflag = asspflag;
    }

    public String getCeusef() {
        return ceusef == "" ? null : ceusef;
    }

    public void setCeusef(String ceusef) {
        this.ceusef = ceusef;
    }

    public String getCorperf() {
        return corperf == "" ? null : corperf;
    }

    public void setCorperf(String corperf) {
        this.corperf = corperf;
    }

    public String getLoannatu() {
        return loannatu == "" ? null : loannatu;
    }

    public void setLoannatu(String loannatu) {
        this.loannatu = loannatu;
    }

    public String getAssuremd() {
        return assuremd == "" ? null : assuremd;
    }

    public void setAssuremd(String assuremd) {
        this.assuremd = assuremd;
    }

    public String getGrlnflag() {
        return grlnflag == "" ? null : grlnflag;
    }

    public void setGrlnflag(String grlnflag) {
        this.grlnflag = grlnflag;
    }

    public String getLntype() {
        return lntype == "" ? null : lntype;
    }

    public void setLntype(String lntype) {
        this.lntype = lntype;
    }

    public String getLoanname() {
        return loanname == "" ? null : loanname;
    }

    public void setLoanname(String loanname) {
        this.loanname = loanname;
    }

    public String getSbjcode1() {
        return sbjcode1 == "" ? null : sbjcode1;
    }

    public void setSbjcode1(String sbjcode1) {
        this.sbjcode1 = sbjcode1;
    }

    public String getSbjcode2() {
        return sbjcode2 == "" ? null : sbjcode2;
    }

    public void setSbjcode2(String sbjcode2) {
        this.sbjcode2 = sbjcode2;
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

    public String getSbjcode5() {
        return sbjcode5 == "" ? null : sbjcode5;
    }

    public void setSbjcode5(String sbjcode5) {
        this.sbjcode5 = sbjcode5;
    }

    public String getSbjcode6() {
        return sbjcode6 == "" ? null : sbjcode6;
    }

    public void setSbjcode6(String sbjcode6) {
        this.sbjcode6 = sbjcode6;
    }

    public String getSbjcode7() {
        return sbjcode7 == "" ? null : sbjcode7;
    }

    public void setSbjcode7(String sbjcode7) {
        this.sbjcode7 = sbjcode7;
    }

    public String getSbjcode8() {
        return sbjcode8 == "" ? null : sbjcode8;
    }

    public void setSbjcode8(String sbjcode8) {
        this.sbjcode8 = sbjcode8;
    }

    public String getGrpaccf() {
        return grpaccf == "" ? null : grpaccf;
    }

    public void setGrpaccf(String grpaccf) {
        this.grpaccf = grpaccf;
    }

    public String getGrpmode() {
        return grpmode == "" ? null : grpmode;
    }

    public void setGrpmode(String grpmode) {
        this.grpmode = grpmode;
    }

    public String getAutdepf() {
        return autdepf == "" ? null : autdepf;
    }

    public void setAutdepf(String autdepf) {
        this.autdepf = autdepf;
    }

    public String getAutwithf() {
        return autwithf == "" ? null : autwithf;
    }

    public void setAutwithf(String autwithf) {
        this.autwithf = autwithf;
    }

    public String getOlprflag() {
        return olprflag == "" ? null : olprflag;
    }

    public void setOlprflag(String olprflag) {
        this.olprflag = olprflag;
    }

    public String getTatprf() {
        return tatprf == "" ? null : tatprf;
    }

    public void setTatprf(String tatprf) {
        this.tatprf = tatprf;
    }

    public String getLncollf() {
        return lncollf == "" ? null : lncollf;
    }

    public void setLncollf(String lncollf) {
        this.lncollf = lncollf;
    }

    public String getCrdate() {
        return crdate == "" ? null : crdate;
    }

    public void setCrdate(String crdate) {
        this.crdate = crdate;
    }

    public String getPramount() {
        return pramount == "" ? null : pramount;
    }

    public void setPramount(String pramount) {
        this.pramount = pramount;
    }

    public String getCurlnamt() {
        return curlnamt == "" ? null : curlnamt;
    }

    public void setCurlnamt(String curlnamt) {
        this.curlnamt = curlnamt;
    }

    public String getTothkamt() {
        return tothkamt == "" ? null : tothkamt;
    }

    public void setTothkamt(String tothkamt) {
        this.tothkamt = tothkamt;
    }

    public String getTotffamt() {
        return totffamt == "" ? null : totffamt;
    }

    public void setTotffamt(String totffamt) {
        this.totffamt = totffamt;
    }

    public String getTotffnum() {
        return totffnum == "" ? null : totffnum;
    }

    public void setTotffnum(String totffnum) {
        this.totffnum = totffnum;
    }

    public String getProedate() {
        return proedate == "" ? null : proedate;
    }

    public void setProedate(String proedate) {
        this.proedate = proedate;
    }

    public String getPrmadate() {
        return prmadate == "" ? null : prmadate;
    }

    public void setPrmadate(String prmadate) {
        this.prmadate = prmadate;
    }

    public String getPraflag() {
        return praflag == "" ? null : praflag;
    }

    public void setPraflag(String praflag) {
        this.praflag = praflag;
    }

    public String getPraccf() {
        return praccf == "" ? null : praccf;
    }

    public void setPraccf(String praccf) {
        this.praccf = praccf;
    }

    public String getProaccno() {
        return proaccno == "" ? null : proaccno;
    }

    public void setProaccno(String proaccno) {
        this.proaccno = proaccno;
    }

    public String getPraccsn() {
        return praccsn == "" ? null : praccsn;
    }

    public void setPraccsn(String praccsn) {
        this.praccsn = praccsn;
    }

    public String getGageno() {
        return gageno == "" ? null : gageno;
    }

    public void setGageno(String gageno) {
        this.gageno = gageno;
    }

    public String getGagesum() {
        return gagesum == "" ? null : gagesum;
    }

    public void setGagesum(String gagesum) {
        this.gagesum = gagesum;
    }

    public String getExpdate() {
        return expdate == "" ? null : expdate;
    }

    public void setExpdate(String expdate) {
        this.expdate = expdate;
    }

    public String getExflag() {
        return exflag == "" ? null : exflag;
    }

    public void setExflag(String exflag) {
        this.exflag = exflag;
    }

    public String getExquota() {
        return exquota == "" ? null : exquota;
    }

    public void setExquota(String exquota) {
        this.exquota = exquota;
    }

    public String getAdzoneno() {
        return adzoneno == "" ? null : adzoneno;
    }

    public void setAdzoneno(String adzoneno) {
        this.adzoneno = adzoneno;
    }

    public String getPrcrdate() {
        return prcrdate == "" ? null : prcrdate;
    }

    public void setPrcrdate(String prcrdate) {
        this.prcrdate = prcrdate;
    }

    public String getCrbrno() {
        return crbrno == "" ? null : crbrno;
    }

    public void setCrbrno(String crbrno) {
        this.crbrno = crbrno;
    }

    public String getCtellern() {
        return ctellern == "" ? null : ctellern;
    }

    public void setCtellern(String ctellern) {
        this.ctellern = ctellern;
    }

    public String getPrendate() {
        return prendate == "" ? null : prendate;
    }

    public void setPrendate(String prendate) {
        this.prendate = prendate;
    }

    public String getEndzoneno() {
        return endzoneno == "" ? null : endzoneno;
    }

    public void setEndzoneno(String endzoneno) {
        this.endzoneno = endzoneno;
    }

    public String getEndbrno() {
        return endbrno == "" ? null : endbrno;
    }

    public void setEndbrno(String endbrno) {
        this.endbrno = endbrno;
    }

    public String getEtellern() {
        return etellern == "" ? null : etellern;
    }

    public void setEtellern(String etellern) {
        this.etellern = etellern;
    }

    public String getLadjdate() {
        return ladjdate == "" ? null : ladjdate;
    }

    public void setLadjdate(String ladjdate) {
        this.ladjdate = ladjdate;
    }

    public String getLtitdate() {
        return ltitdate == "" ? null : ltitdate;
    }

    public void setLtitdate(String ltitdate) {
        this.ltitdate = ltitdate;
    }

    public String getLtrddate() {
        return ltrddate == "" ? null : ltrddate;
    }

    public void setLtrddate(String ltrddate) {
        this.ltrddate = ltrddate;
    }

    public String getLctrddat() {
        return lctrddat == "" ? null : lctrddat;
    }

    public void setLctrddat(String lctrddat) {
        this.lctrddat = lctrddat;
    }

    public String getPhybrno() {
        return phybrno == "" ? null : phybrno;
    }

    public void setPhybrno(String phybrno) {
        this.phybrno = phybrno;
    }

    public String getActbrno() {
        return actbrno == "" ? null : actbrno;
    }

    public void setActbrno(String actbrno) {
        this.actbrno = actbrno;
    }

    public String getLglockno() {
        return lglockno == "" ? null : lglockno;
    }

    public void setLglockno(String lglockno) {
        this.lglockno = lglockno;
    }

    public String getCmflag() {
        return cmflag == "" ? null : cmflag;
    }

    public void setCmflag(String cmflag) {
        this.cmflag = cmflag;
    }

    public String getMaxserno() {
        return maxserno == "" ? null : maxserno;
    }

    public void setMaxserno(String maxserno) {
        this.maxserno = maxserno;
    }

    public String getUsetype() {
        return usetype == "" ? null : usetype;
    }

    public void setUsetype(String usetype) {
        this.usetype = usetype;
    }

    public String getFxcode1() {
        return fxcode1 == "" ? null : fxcode1;
    }

    public void setFxcode1(String fxcode1) {
        this.fxcode1 = fxcode1;
    }

    public String getFxcode2() {
        return fxcode2 == "" ? null : fxcode2;
    }

    public void setFxcode2(String fxcode2) {
        this.fxcode2 = fxcode2;
    }

    public String getFxcode3() {
        return fxcode3 == "" ? null : fxcode3;
    }

    public void setFxcode3(String fxcode3) {
        this.fxcode3 = fxcode3;
    }

    public String getIntprif() {
        return intprif == "" ? null : intprif;
    }

    public void setIntprif(String intprif) {
        this.intprif = intprif;
    }

    public String getNgbsq() {
        return ngbsq == "" ? null : ngbsq;
    }

    public void setNgbsq(String ngbsq) {
        this.ngbsq = ngbsq;
    }

    public String getOgbsq() {
        return ogbsq == "" ? null : ogbsq;
    }

    public void setOgbsq(String ogbsq) {
        this.ogbsq = ogbsq;
    }

    public String getCalintf() {
        return calintf == "" ? null : calintf;
    }

    public void setCalintf(String calintf) {
        this.calintf = calintf;
    }

    public String getOvcalinf() {
        return ovcalinf == "" ? null : ovcalinf;
    }

    public void setOvcalinf(String ovcalinf) {
        this.ovcalinf = ovcalinf;
    }

    public String getIncalinf() {
        return incalinf == "" ? null : incalinf;
    }

    public void setIncalinf(String incalinf) {
        this.incalinf = incalinf;
    }

    public String getOcalinf() {
        return ocalinf == "" ? null : ocalinf;
    }

    public void setOcalinf(String ocalinf) {
        this.ocalinf = ocalinf;
    }

    public String getFxcode4() {
        return fxcode4 == "" ? null : fxcode4;
    }

    public void setFxcode4(String fxcode4) {
        this.fxcode4 = fxcode4;
    }

    public String getFxcode5() {
        return fxcode5 == "" ? null : fxcode5;
    }

    public void setFxcode5(String fxcode5) {
        this.fxcode5 = fxcode5;
    }

    public String getFxcode6() {
        return fxcode6 == "" ? null : fxcode6;
    }

    public void setFxcode6(String fxcode6) {
        this.fxcode6 = fxcode6;
    }

    public String getGbtype() {
        return gbtype == "" ? null : gbtype;
    }

    public void setGbtype(String gbtype) {
        this.gbtype = gbtype;
    }

    public String getDeflag() {
        return deflag == "" ? null : deflag;
    }

    public void setDeflag(String deflag) {
        this.deflag = deflag;
    }

    public String getDeaccf() {
        return deaccf == "" ? null : deaccf;
    }

    public void setDeaccf(String deaccf) {
        this.deaccf = deaccf;
    }

    public String getDeaccno() {
        return deaccno == "" ? null : deaccno;
    }

    public void setDeaccno(String deaccno) {
        this.deaccno = deaccno;
    }

    public String getDeaccsn() {
        return deaccsn == "" ? null : deaccsn;
    }

    public void setDeaccsn(String deaccsn) {
        this.deaccsn = deaccsn;
    }

    public String getTolrdays() {
        return tolrdays == "" ? null : tolrdays;
    }

    public void setTolrdays(String tolrdays) {
        this.tolrdays = tolrdays;
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
        if (!(o instanceof InfAfpcmem)) return false;
        InfAfpcmem that = (InfAfpcmem) o;
        return Objects.equal(getCrzoneno(), that.getCrzoneno()) &&
                Objects.equal(getMediumid(), that.getMediumid()) &&
                Objects.equal(getProtseno(), that.getProtseno()) &&
                Objects.equal(getStatus(), that.getStatus()) &&
                Objects.equal(getScurflag(), that.getScurflag()) &&
                Objects.equal(getCurrtype(), that.getCurrtype()) &&
                Objects.equal(getProalias(), that.getProalias()) &&
                Objects.equal(getPrtycode(), that.getPrtycode()) &&
                Objects.equal(getPrserno(), that.getPrserno()) &&
                Objects.equal(getXdmemno(), that.getXdmemno()) &&
                Objects.equal(getAsspflag(), that.getAsspflag()) &&
                Objects.equal(getCeusef(), that.getCeusef()) &&
                Objects.equal(getCorperf(), that.getCorperf()) &&
                Objects.equal(getLoannatu(), that.getLoannatu()) &&
                Objects.equal(getAssuremd(), that.getAssuremd()) &&
                Objects.equal(getGrlnflag(), that.getGrlnflag()) &&
                Objects.equal(getLntype(), that.getLntype()) &&
                Objects.equal(getLoanname(), that.getLoanname()) &&
                Objects.equal(getSbjcode1(), that.getSbjcode1()) &&
                Objects.equal(getSbjcode2(), that.getSbjcode2()) &&
                Objects.equal(getSbjcode3(), that.getSbjcode3()) &&
                Objects.equal(getSbjcode4(), that.getSbjcode4()) &&
                Objects.equal(getSbjcode5(), that.getSbjcode5()) &&
                Objects.equal(getSbjcode6(), that.getSbjcode6()) &&
                Objects.equal(getSbjcode7(), that.getSbjcode7()) &&
                Objects.equal(getSbjcode8(), that.getSbjcode8()) &&
                Objects.equal(getGrpaccf(), that.getGrpaccf()) &&
                Objects.equal(getGrpmode(), that.getGrpmode()) &&
                Objects.equal(getAutdepf(), that.getAutdepf()) &&
                Objects.equal(getAutwithf(), that.getAutwithf()) &&
                Objects.equal(getOlprflag(), that.getOlprflag()) &&
                Objects.equal(getTatprf(), that.getTatprf()) &&
                Objects.equal(getLncollf(), that.getLncollf()) &&
                Objects.equal(getCrdate(), that.getCrdate()) &&
                Objects.equal(getPramount(), that.getPramount()) &&
                Objects.equal(getCurlnamt(), that.getCurlnamt()) &&
                Objects.equal(getTothkamt(), that.getTothkamt()) &&
                Objects.equal(getTotffamt(), that.getTotffamt()) &&
                Objects.equal(getTotffnum(), that.getTotffnum()) &&
                Objects.equal(getProedate(), that.getProedate()) &&
                Objects.equal(getPrmadate(), that.getPrmadate()) &&
                Objects.equal(getPraflag(), that.getPraflag()) &&
                Objects.equal(getPraccf(), that.getPraccf()) &&
                Objects.equal(getProaccno(), that.getProaccno()) &&
                Objects.equal(getPraccsn(), that.getPraccsn()) &&
                Objects.equal(getGageno(), that.getGageno()) &&
                Objects.equal(getGagesum(), that.getGagesum()) &&
                Objects.equal(getExpdate(), that.getExpdate()) &&
                Objects.equal(getExflag(), that.getExflag()) &&
                Objects.equal(getExquota(), that.getExquota()) &&
                Objects.equal(getAdzoneno(), that.getAdzoneno()) &&
                Objects.equal(getPrcrdate(), that.getPrcrdate()) &&
                Objects.equal(getCrbrno(), that.getCrbrno()) &&
                Objects.equal(getCtellern(), that.getCtellern()) &&
                Objects.equal(getPrendate(), that.getPrendate()) &&
                Objects.equal(getEndzoneno(), that.getEndzoneno()) &&
                Objects.equal(getEndbrno(), that.getEndbrno()) &&
                Objects.equal(getEtellern(), that.getEtellern()) &&
                Objects.equal(getLadjdate(), that.getLadjdate()) &&
                Objects.equal(getLtitdate(), that.getLtitdate()) &&
                Objects.equal(getLtrddate(), that.getLtrddate()) &&
                Objects.equal(getLctrddat(), that.getLctrddat()) &&
                Objects.equal(getPhybrno(), that.getPhybrno()) &&
                Objects.equal(getActbrno(), that.getActbrno()) &&
                Objects.equal(getLglockno(), that.getLglockno()) &&
                Objects.equal(getCmflag(), that.getCmflag()) &&
                Objects.equal(getMaxserno(), that.getMaxserno()) &&
                Objects.equal(getUsetype(), that.getUsetype()) &&
                Objects.equal(getFxcode1(), that.getFxcode1()) &&
                Objects.equal(getFxcode2(), that.getFxcode2()) &&
                Objects.equal(getFxcode3(), that.getFxcode3()) &&
                Objects.equal(getIntprif(), that.getIntprif()) &&
                Objects.equal(getNgbsq(), that.getNgbsq()) &&
                Objects.equal(getOgbsq(), that.getOgbsq()) &&
                Objects.equal(getCalintf(), that.getCalintf()) &&
                Objects.equal(getOvcalinf(), that.getOvcalinf()) &&
                Objects.equal(getIncalinf(), that.getIncalinf()) &&
                Objects.equal(getOcalinf(), that.getOcalinf()) &&
                Objects.equal(getFxcode4(), that.getFxcode4()) &&
                Objects.equal(getFxcode5(), that.getFxcode5()) &&
                Objects.equal(getFxcode6(), that.getFxcode6()) &&
                Objects.equal(getGbtype(), that.getGbtype()) &&
                Objects.equal(getDeflag(), that.getDeflag()) &&
                Objects.equal(getDeaccf(), that.getDeaccf()) &&
                Objects.equal(getDeaccno(), that.getDeaccno()) &&
                Objects.equal(getDeaccsn(), that.getDeaccsn()) &&
                Objects.equal(getTolrdays(), that.getTolrdays()) &&
                Objects.equal(getWorkdate(), that.getWorkdate());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCrzoneno(), getMediumid(), getProtseno(), getStatus(), getScurflag(), getCurrtype(), getProalias(), getPrtycode(), getPrserno(), getXdmemno(), getAsspflag(), getCeusef(), getCorperf(), getLoannatu(), getAssuremd(), getGrlnflag(), getLntype(), getLoanname(), getSbjcode1(), getSbjcode2(), getSbjcode3(), getSbjcode4(), getSbjcode5(), getSbjcode6(), getSbjcode7(), getSbjcode8(), getGrpaccf(), getGrpmode(), getAutdepf(), getAutwithf(), getOlprflag(), getTatprf(), getLncollf(), getCrdate(), getPramount(), getCurlnamt(), getTothkamt(), getTotffamt(), getTotffnum(), getProedate(), getPrmadate(), getPraflag(), getPraccf(), getProaccno(), getPraccsn(), getGageno(), getGagesum(), getExpdate(), getExflag(), getExquota(), getAdzoneno(), getPrcrdate(), getCrbrno(), getCtellern(), getPrendate(), getEndzoneno(), getEndbrno(), getEtellern(), getLadjdate(), getLtitdate(), getLtrddate(), getLctrddat(), getPhybrno(), getActbrno(), getLglockno(), getCmflag(), getMaxserno(), getUsetype(), getFxcode1(), getFxcode2(), getFxcode3(), getIntprif(), getNgbsq(), getOgbsq(), getCalintf(), getOvcalinf(), getIncalinf(), getOcalinf(), getFxcode4(), getFxcode5(), getFxcode6(), getGbtype(), getDeflag(), getDeaccf(), getDeaccno(), getDeaccsn(), getTolrdays(), getWorkdate());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("crzoneno", crzoneno)
                .add("mediumid", mediumid)
                .add("protseno", protseno)
                .add("status", status)
                .add("scurflag", scurflag)
                .add("currtype", currtype)
                .add("proalias", proalias)
                .add("prtycode", prtycode)
                .add("prserno", prserno)
                .add("xdmemno", xdmemno)
                .add("asspflag", asspflag)
                .add("ceusef", ceusef)
                .add("corperf", corperf)
                .add("loannatu", loannatu)
                .add("assuremd", assuremd)
                .add("grlnflag", grlnflag)
                .add("lntype", lntype)
                .add("loanname", loanname)
                .add("sbjcode1", sbjcode1)
                .add("sbjcode2", sbjcode2)
                .add("sbjcode3", sbjcode3)
                .add("sbjcode4", sbjcode4)
                .add("sbjcode5", sbjcode5)
                .add("sbjcode6", sbjcode6)
                .add("sbjcode7", sbjcode7)
                .add("sbjcode8", sbjcode8)
                .add("grpaccf", grpaccf)
                .add("grpmode", grpmode)
                .add("autdepf", autdepf)
                .add("autwithf", autwithf)
                .add("olprflag", olprflag)
                .add("tatprf", tatprf)
                .add("lncollf", lncollf)
                .add("crdate", crdate)
                .add("pramount", pramount)
                .add("curlnamt", curlnamt)
                .add("tothkamt", tothkamt)
                .add("totffamt", totffamt)
                .add("totffnum", totffnum)
                .add("proedate", proedate)
                .add("prmadate", prmadate)
                .add("praflag", praflag)
                .add("praccf", praccf)
                .add("proaccno", proaccno)
                .add("praccsn", praccsn)
                .add("gageno", gageno)
                .add("gagesum", gagesum)
                .add("expdate", expdate)
                .add("exflag", exflag)
                .add("exquota", exquota)
                .add("adzoneno", adzoneno)
                .add("prcrdate", prcrdate)
                .add("crbrno", crbrno)
                .add("ctellern", ctellern)
                .add("prendate", prendate)
                .add("endzoneno", endzoneno)
                .add("endbrno", endbrno)
                .add("etellern", etellern)
                .add("ladjdate", ladjdate)
                .add("ltitdate", ltitdate)
                .add("ltrddate", ltrddate)
                .add("lctrddat", lctrddat)
                .add("phybrno", phybrno)
                .add("actbrno", actbrno)
                .add("lglockno", lglockno)
                .add("cmflag", cmflag)
                .add("maxserno", maxserno)
                .add("usetype", usetype)
                .add("fxcode1", fxcode1)
                .add("fxcode2", fxcode2)
                .add("fxcode3", fxcode3)
                .add("intprif", intprif)
                .add("ngbsq", ngbsq)
                .add("ogbsq", ogbsq)
                .add("calintf", calintf)
                .add("ovcalinf", ovcalinf)
                .add("incalinf", incalinf)
                .add("ocalinf", ocalinf)
                .add("fxcode4", fxcode4)
                .add("fxcode5", fxcode5)
                .add("fxcode6", fxcode6)
                .add("gbtype", gbtype)
                .add("deflag", deflag)
                .add("deaccf", deaccf)
                .add("deaccno", deaccno)
                .add("deaccsn", deaccsn)
                .add("tolrdays", tolrdays)
                .add("workdate", workdate)
                .toString();
    }
}
