package com.hns.learn.entity.enums;

import com.google.common.base.MoreObjects;

import java.io.Serializable;

/**
 * 枚举项为导出全集；
 *
 * @author hannasong 2019-4-13 07:26:01
 */
public enum AccrualExportEnum implements Serializable {

    AFRLNDTL_ID_(1, "主键", "ID_","STRING"),
    AFRLNDTL_ZONENO(2, "帐户所属地区号", "ZONENO","STRING"),
    AFRLNDTL_PROTSENO(3, "协议编号", "PROTSENO","STRING"),
    AFRLNDTL_SUBSERNO(4, "子协议序号", "SUBSERNO","STRING"),
    AFRLNDTL_WORKDATE(5, "交易发生日期", "WORKDATE","DATE"),
    AFRLNDTL_LISTNO(6, "明细序号", "LISTNO","STRING"),
    AFRLNDTL_LGLOCKNO(7, "逻辑锁记录序号", "LGLOCKNO","STRING"),
    AFRLNDTL_CURRTYPE(8, "币种", "CURRTYPE","STRING"),
    AFRLNDTL_CASHEXF(9, "钞汇标志", "CASHEXF","STRING"),
    AFRLNDTL_TERMNUM(10, "期数", "TERMNUM","STRING"),
    AFRLNDTL_INTRATE(11, "正常利率", "INTRATE","DOUBLE"),
    AFRLNDTL_RLVRATE(12, "展期利率", "RLVRATE","DOUBLE"),
    AFRLNDTL_OVRRATE(13, "逾期利率", "OVRRATE","DOUBLE"),
    AFRLNDTL_INCIRATE(14, "表内欠息复息利率", "INCIRATE","DOUBLE"),
    AFRLNDTL_OFCIRATE(15, "表外欠息复息利率", "OFCIRATE","DOUBLE"),
    AFRLNDTL_TAXRATE(16, "印花税率", "TAXRATE","DOUBLE"),
    AFRLNDTL_CURRINT(17, "正常本金利息发生额", "CURRINT","DOUBLE"),
    AFRLNDTL_RLVINT(18, "展期利息发生额", "RLVINT","DOUBLE"),
    AFRLNDTL_RLVIBAL(19, "展期利息余额", "RLVIBAL","DOUBLE"),
    AFRLNDTL_OVRAMT(20, "逾期本金发生额", "OVRAMT","DOUBLE"),
    AFRLNDTL_OVRBAL(21, "逾期本金余额", "OVRBAL","DOUBLE"),
    AFRLNDTL_OVRAMTIT(22, "逾期本金利息发生额", "OVRAMTIT","DOUBLE"),
    AFRLNDTL_INAMT(23, "表内欠息发生额", "INAMT","DOUBLE"),
    AFRLNDTL_INCURBAL(24, "表内欠息当前余额", "INCURBAL","DOUBLE"),
    AFRLNDTL_INAMTIT(25, "表内欠息利息发生额", "INAMTIT","DOUBLE"),
    AFRLNDTL_OFAMT(26, "表外欠息发生额", "OFAMT","DOUBLE"),
    AFRLNDTL_OFCURBAL(27, "表外欠息当前余额", "OFCURBAL","DOUBLE"),
    AFRLNDTL_OFAMTIT(28, "表外欠息利息发生额", "OFAMTIT","DOUBLE"),
    AFRLNDTL_TAXSUM(29, "印花税", "TAXSUM","DOUBLE"),
    AFRLNDTL_TAXAMT(30, "非豁免印花税发生额", "TAXAMT","DOUBLE"),
    AFRLNDTL_TAXBAL(31, "非豁免印花税余额", "TAXBAL","DOUBLE"),
    AFRLNDTL_NTAXAMT(32, "豁免印花税发生额", "NTAXAMT","DOUBLE"),
    AFRLNDTL_NTAXBAL(33, "豁免印花税余额", "NTAXBAL","DOUBLE"),
    AFRLNDTL_DRDOACTN(34, "放款帐号", "DRDOACTN","STRING"),
    AFRLNDTL_DRDOACSN(35, "放款帐号序号", "DRDOACSN","STRING"),
    AFRLNDTL_DRDOACTA(36, "放款帐号发生额", "DRDOACTA","DOUBLE"),
    AFRLNDTL_PAYACTN(37, "还款账号", "PAYACTN","STRING"),
    AFRLNDTL_PAYACSN(38, "还款账号序号", "PAYACSN","STRING"),
    AFRLNDTL_PAYACTA(39, "还款账号发生额", "PAYACTA","DOUBLE"),
    AFRLNDTL_CREATE_TIME(40, "创建人", "CREATE_TIME","STRING"),
    AFRLNDTL_UPDATE_TIME(41, "创建时间", "UPDATE_TIME","DATE"),
    AFRLNDTL_CREATE_BY(42, "更新人", "CREATE_BY","STRING"),
    AFRLNDTL_UPDATE_BY(43, "更新时间", "UPDATE_BY","DATE"),
    AFRLNDTL_ENABLE_(44, "有效性(1有效；0无效)", "ENABLE_","STRING"),
    AFRLNDTL_REMARK_(45, "备注", "REMARK_","STRING"),

    AFRCDTL_ID_(46, "主键", "ID_","STRING"),
    AFRCDTL_ZONENO(47, "帐户所属地区号", "ZONENO","STRING"),
    AFRCDTL_PROTSENO(48, "协议编号", "PROTSENO","STRING"),
    AFRCDTL_SUBSERNO(49, "子协议序号", "SUBSERNO","STRING"),
    AFRCDTL_WORKDATE(50, "交易发生日期", "WORKDATE","STRING"),
    AFRCDTL_LISTNO(51, "明细序号", "LISTNO","STRING"),
    AFRCDTL_PRINFLAG(52, "是否内部明细", "PRINFLAG","STRING"),
    AFRCDTL_CMPRFLAG(53, "明细压缩标志", "CMPRFLAG","STRING"),
    AFRCDTL_LGLOCKNO(54, "逻辑锁记录序号", "LGLOCKNO","STRING"),
    AFRCDTL_TRXDATE(55, "交易发生日期(自然日)", "TRXDATE","STRING"),
    AFRCDTL_TRXTIME(56, "交易发生时间", "TRXTIME","STRING"),
    AFRCDTL_TIMESTMP(57, "入账时间戳", "TIMESTMP","STRING"),
    AFRCDTL_POSTNDAT(58, "入帐日期(自然日)", "POSTNDAT","STRING"),
    AFRCDTL_POSTSDAT(59, "入帐日期(系统工作日)", "POSTSDAT","STRING"),
    AFRCDTL_POSTTIME(60, "入帐时间", "POSTTIME","STRING"),
    AFRCDTL_TRXSQNB(61, "大交易序号", "TRXSQNB","STRING"),
    AFRCDTL_PTRXSQNB(62, "原大交易序号", "PTRXSQNB","STRING"),
    AFRCDTL_TRXSQNS(63, "小交易序号", "TRXSQNS","STRING"),
    AFRCDTL_TRXCODE(64, "交易代码", "TRXCODE","STRING"),
    AFRCDTL_VALUEDAT(65, "起息日期", "VALUEDAT","STRING"),
    AFRCDTL_CURRTYPE(66, "币种", "CURRTYPE","STRING"),
    AFRCDTL_CASHEXF(67, "钞汇标志", "CASHEXF","STRING"),
    AFRCDTL_CATRFLAG(68, "现转标志", "CATRFLAG","STRING"),
    AFRCDTL_DRCRF(69, "借贷标志", "DRCRF","STRING"),
    AFRCDTL_AMOUNT(70, "本金发生额", "AMOUNT","DOUBLE"),
    AFRCDTL_UPDBAL(71, "本金期末余额(原币)", "UPDBAL","DOUBLE"),
    AFRCDTL_NOTETYPE(72, "简要注释", "NOTETYPE","STRING"),
    AFRCDTL_NOTES(73, "附言", "NOTES","STRING"),
    AFRCDTL_REVTRANF(74, "反交易标志", "REVTRANF","STRING"),
    AFRCDTL_UPDTRANF(75, "冲正交易标识", "UPDTRANF","STRING"),
    AFRCDTL_POSTTYPE(76, "记帐类型", "POSTTYPE","STRING"),
    AFRCDTL_LISTTYPE(77, "明细性质", "LISTTYPE","STRING"),
    AFRCDTL_RECIPBKN(78, "对方行号", "RECIPBKN","STRING"),
    AFRCDTL_RECIPBKA(79, "对方行名", "RECIPBKA","STRING"),
    AFRCDTL_RECIPACT(80, "对方帐号", "RECIPACT","STRING"),
    AFRCDTL_RECIPACS(81, "对方帐号序号", "RECIPACS","STRING"),
    AFRCDTL_RECIPACN(82, "对方户名", "RECIPACN","STRING"),
    AFRCDTL_EXCHRAT(83, "货币兑换汇率", "EXCHRAT","DOUBLE"),
    AFRCDTL_FORECURR(84, "外币币种", "FORECURR","STRING"),
    AFRCDTL_FOREAMT(85, "外币金额", "FOREAMT","DOUBLE"),
    AFRCDTL_VOUHTYPE(86, "凭证种类", "VOUHTYPE","STRING"),
    AFRCDTL_VOUHNO(87, "凭证号", "VOUHNO","STRING"),
    AFRCDTL_MEDIUMID(88, "介质识别号", "MEDIUMID","STRING"),
    AFRCDTL_MEDIUMNO(89, "介质编号", "MEDIUMNO","STRING"),
    AFRCDTL_MEDSENO(90, "介质下挂协议序号", "MEDSENO","STRING"),
    AFRCDTL_CHNLTYPE(91, "渠道种类", "CHNLTYPE","STRING"),
    AFRCDTL_CHNLNO(92, "渠道编号", "CHNLNO","STRING"),
    AFRCDTL_PRODCODE(93, "产品种类代码", "PRODCODE","STRING"),
    AFRCDTL_PRODNO(94, "产品序号", "PRODNO","STRING"),
    AFRCDTL_PRODGPNO(95, "产品组编号", "PRODGPNO","STRING"),
    AFRCDTL_TRXZNO(96, "交易地区号", "TRXZNO","STRING"),
    AFRCDTL_TPHYBRNO(97, "交易(物理)网点号", "TPHYBRNO","STRING"),
    AFRCDTL_PHYBRNO(98, "帐户物理网点号", "PHYBRNO","STRING"),
    AFRCDTL_TELLERNO(99, "操作柜员号", "TELLERNO","STRING"),
    AFRCDTL_AUTHTLNO(100, "授权柜员号", "AUTHTLNO","STRING"),
    AFRCDTL_AUTHNO(101, "授权号", "AUTHNO","STRING"),
    AFRCDTL_TERMID(102, "终端号", "TERMID","STRING"),
    AFRCDTL_TRXPLCS(103, "交易场所简称", "TRXPLCS","STRING"),
    AFRCDTL_STATCODE(104, "外汇统计代码", "STATCODE","STRING"),
    AFRCDTL_CREATE_TIME(105, "创建人", "CREATE_TIME","STRING"),
    AFRCDTL_UPDATE_TIME(106, "创建时间", "UPDATE_TIME","DATE"),
    AFRCDTL_CREATE_BY(107, "更新人", "CREATE_BY","STRING"),
    AFRCDTL_UPDATE_BY(108, "更新时间", "UPDATE_BY","DATE"),
    AFRCDTL_ENABLE_(109, "有效性(1有效；0无效)", "ENABLE_","STRING"),
    AFRCDTL_REMARK_(110, "备注", "REMARK_","STRING"),

    BASEINFO_DEBT_CODE(111, "债项方案编号" ,"debtCode" ,"STRING"),
    BASEINFO_GRANT_CODE(112, "发放条件编号" ,"grantCode" ,"STRING"),
    BASEINFO_IOU_CODE(113, "借据编号" ,"iouCode" ,"STRING"),
    BASEINFO_CURRENCY(114, "发放条件币种" ,"currency" ,"STRING"),
    BASEINFO_BUSINESS_TYPES(115, "产品种类二级分类" ,"businessTypes" ,"STRING"),
    BASEINFO_RECOURSE(116, "追索权" ,"recourse" ,"STRING"),
    BASEINFO_M_CURRENCY(117, "方案主币种" ,"mCurrency" ,"STRING"),
    BASEINFO_SOLUTION_AMT(118, "方案金额" ,"solutionAmt" ,"DOUBLE"),
    BASEINFO_PROJECT_NAME(119, "项目名称" ,"projectName" ,"STRING"),
    BASEINFO_ACCOUNT_(120, "信贷员账户" ,"account_" ,"STRING"),
    BASEINFO_USER_NAME(121, "信贷员姓名" ,"bankTellName" ,"STRING"),
    BASEINFO_PRODUCT_NAME(122, "产品名称" ,"productName" ,"STRING"),
    BASEINFO_DEPT_NAME(123, "所属机构" ,"deptName" ,"STRING"),
    BASEINFO_DEPT_CODE(124, "所属机构编号" ,"deptCode" ,"STRING"),
    BASEINFO_CONENO(125, "承租人客户编号" ,"coneno" ,"STRING"),
    BASEINFO_CONECN(126, "承租人客户名称" ,"conecn" ,"STRING"),
    BASEINFO_FINANCE_PLATFORM(127, "承租人是否地方政府融资平台" ,"financePlatform" ,"STRING"),
    BASEINFO_CONESCALE(128, "承租人企业规模" ,"conescale" ,"STRING"),
    BASEINFO_CONEORGNUM(129, "承租人组织机构代码" ,"coneorgnum" ,"STRING"),
    BASEINFO_CONERAT(130, "承租人客户信用等级" ,"conerat" ,"STRING"),
    BASEINFO_PROPNO(131, "出租人客户编号" ,"propno" ,"STRING"),
    BASEINFO_PROPCN(132, "出租人客户名称" ,"propcn" ,"STRING"),
    BASEINFO_PROPSCALE(133, "出租人企业规模" ,"propscale" ,"STRING"),
    BASEINFO_PROPORGNUM(134, "出租人组织机构代码" ,"proporgnum" ,"STRING"),
    BASEINFO_PROPRAT(135, "出租人客户信用等级" ,"proprat" ,"STRING"),
    BASEINFO_TRADE_FINANCE_BUSINESS(136, "贸金业务政策性属性" ,"traneFinanceBusiness" ,"STRING"),
    BASEINFO_POLICY_ATTRIBUTRE_CLASSIFY(137, "政策性属性分类" ,"policyAttributreClassify" ,"STRING"),
    BASEINFO_SYNDICATED_STATUS(138, "我行银团地位" ,"syndicatedStatus" ,"STRING"),
    BASEINFO_SYNDICATELOAN(139, "是否与他行银团放款" ,"syndicateLoan" ,"STRING"),
    BASEINFO_BIZ_RENTAL_FACTORING_CODE(140, "租金保理合同编号" ,"bizRentalFactoringCode" ,"STRING"),
    BASEINFO_LEASEHOLD(141, "租赁物名称" ,"leasehold" ,"STRING"),

    AFPAEXO_UPDBALCNY(142, "本金期末余额(折人民币)", "UPDBALCNY","DOUBLE"),
    AFPAEXO_UPDBALUSD(143, "本金期末余额(折美元)", "UPDBALUSD","DOUBLE"),

    AFWKLFE_CURRTYPE(144, "费用币种", "AFWKLFE_CURRTYPE","STRING"),
    AFWKLFE_FEECLASS(145, "费用类型", "AFWKLFE_FEECLASS","STRING"),
    AFWKLFE_FEEAMT(146, "费用发生额", "AFWKLFE_FEEAMT","DOUBLE"),
    AFPCMEM_NGBSQ(147,"正常扣款顺序","NGBSQ","STRING"),
    AFPCMEM_OGBSQ(148,"逾期扣款顺序","OGBSQ","STRING"),
    AFPCMEM_CALINTF(149,"正常计息标志","CALINTF","STRING"),
    AFPCMEM_OVCALINF(150,"逾期计息标志","OVCALINF","STRING"),
    AFPCMEM_INCALINF(151,"表内欠息计息标志","INCALINF","STRING"),
    AFPCMEM_OCALINF(152,"表外欠息计息标志","OCALINF","STRING"),

    COMPRE_GUARANTEEMODE(154, "担保方式(总)" ,"guaranteeMode" ,"STRING"),
    COMPRE_VALUEDAY(155, "起息日" ,"valueday" ,"STRING"),
    COMPRE_MATUDATE(156, "到期日" ,"matudate" ,"STRING"),
    COMPRE_LOANTERM(157, "业务期限(天)" ,"scopeBusinPeriod" ,"STRING"),
    COMPRE_NLONCURRTYPE(158, "借据币种" ,"nloncurrtype" ,"STRING"),
    COMPRE_TOTFFAMT(159, "发放金额(原币)" ,"totffamt" ,"DOUBLE"),
    COMPRE_TOTFFAMTCNY(160, "发放金额(折人民币)" ,"totffamtCNY" ,"DOUBLE"),
    COMPRE_TOTFFAMTUSD(161, "发放金额(折美元)" ,"totffamtUSD" ,"DOUBLE"),
    COMPRE_UPDBAL(162, "本金期末余额(原币)" ,"UPDBAL" ,"DOUBLE"),
    COMPRE_UPDBALCNY(163, "本金期末余额(折人民币)" ,"UPDBALCNY" ,"DOUBLE"),
    COMPRE_UPDBALUSD(164, "本金期末余额(折美元)" ,"UPDBALUSD" ,"DOUBLE"),
    COMPRE_TOTHKAMT(165, "累计回收本金金额(原币)" ,"tothkamt" ,"DOUBLE"),
    COMPRE_TOTHKAMTCNY(166, "累计回收本金金额(人民币)" ,"tothkamtCNY" ,"DOUBLE"),
    COMPRE_TOTHKAMTUSD(167, "累计回收本金金额(美元)" ,"tothkamtUSD" ,"DOUBLE"),
    COMPRE_OVRBAL(168, "逾期本金余额(原币)" ,"ovrbal" ,"DOUBLE"),
    COMPRE_OVRBALCNY(169, "逾期本金余额(人民币)" ,"ovrbalCNY" ,"DOUBLE"),
    COMPRE_OVRBALUSD(170, "逾期本金余额(美元)" ,"ovrbalUSD" ,"DOUBLE"),
    COMPRE_PRIDAYS(171, "本金逾期天数" ,"PRIDAYS" ,"STRING"),
    COMPRE_RATEINCM1(172, "利率方式" ,"rateincm1" ,"STRING"),
    COMPRE_NRATE(173, "利率" ,"NRATE" ,"DOUBLE"),
    COMPRE_FEE(174, "费用收入" ,"FEE" ,"DOUBLE"),
    COMPRE_ISSUEDATE(175, "审批日期" ,"issueDate" ,"STRING");


    private int index;
    private String name;
    private String key;
    private String type;

    AccrualExportEnum(int index, String name, String key, String type) {
        this.index = index;
        this.name = name;
        this.key = key;
        this.type = type;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("index", index)
                .add("name", name)
                .add("key", key)
                .add("type", type)
                .toString();
    }

    public static AccrualExportEnum fetchEnum(String name) {
        for (AccrualExportEnum c : AccrualExportEnum.values()) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }

    public static AccrualExportEnum fetchEnum(String name, String prefixName) {
        for (AccrualExportEnum c : AccrualExportEnum.values()) {
            if (c.getName().equals(name) && c.name.startsWith(prefixName)) {
                return c;
            }
        }
        return null;
    }

    public static String getType(String name) {
        for (AccrualExportEnum c : AccrualExportEnum.values()) {
            if (c.getName().equals(name)) {
                return c.type;
            }
        }
        return null;
    }

}
