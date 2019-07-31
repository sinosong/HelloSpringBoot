package com.hns.learn.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.google.common.base.Objects;
import com.hns.learn.entity.vo.ProductVo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Set;

/**
 * 描述：工作流回显信息
 * @author hannasong
 */

@TableName("BIZ_APPRSUMMARY_INFO")
public class BizApprSummaryInfo extends BaseModel implements Serializable {

	/**
	 * 债项方案id
	 */
	@TableField("DEBT_CODE")
	private String debtCode;
	/**
	 * 项目名称
	 */
	@TableField("PROJECT_NAME")
	private String projectName;
	/**
	 * 柜员id
	 */
	@TableField("BANK_TELL_ID")
	private Long bankTellerId;
	/**
	 * 流程发起时间
	 */
	@TableField("WF_TIME")
	private Date processInitiatTime;
	/**
	 * 效期循环规则
	 */
	@TableField("VALIDITY_CYCLE_GAUGE")
	private Long validityCcycleGauge;
	/**
	 * 方案生效日期
	 */
	@TableField("PG_EFFECTIVE_DATE")
	private Date pgEffectivDate;
	/**
	 * 方案失效日期
	 */
	@TableField("PG_EXPI_DATE")
	private Date pgExpiDate;
	/**
	 * 方案循环标志
	 */
	@TableField("LOOP_FLAG")
	private Long ls;
	/**
	 * 产品规则
	 */
	@TableField("RULE_TYPE")
	private Long ruleType;
	/**
	 * 可办理笔数限制
	 */
	@TableField("LTNOPA")
	private Long ltnopa;
	/**
	 * 可办理笔数
	 */
	@TableField("TDWLN")
	private Long tdwln;
	/**
	 * 方案主币种
	 */
	@TableField("M_CURRENCY")
	private String mpc;
	/**
	 * 方案金额
	 */
	@TableField("SOLUTION_AMT")
	private BigDecimal solutionAmount;

	/**
	 * 方案辅助币种(0无1其他可选币种2等值其他币种)
	 */
	@TableField("A_CURRENCY")
	private String aCurrrency;
	/**
	 * 其他可选币种
	 */
	@TableField("O_CURRENCY")
	private String oc;
	/**
	 * 方案业务期限范围
	 */
	@TableField("SCOPE_BUSIN_PERIOD")
	private Long dopo;
	/**
	 * 方案费率类型
	 */
	@TableField("PROG_RATE_TYPE")
	private Long progRateType;
	/**
	 * 方案费率形式
	 */
	@TableField("SCHEME_RATE_FORM")
	private Long schemeRateForm;
	/**
	 * 方案费率范围最低值
	 */
	@TableField("RATE_RANGE_MIX")
	private BigDecimal rateRangeMix;
	/**
	 * 方案费率范围最高值
	 */
	@TableField("RATE_RANGE_MAX")
	private BigDecimal rateRangeMax;
	/**
	 * 方案费率
	 */
	@TableField("PACKAGE_RATE")
	private BigDecimal packageRate;
	/**
	 * 是否经审批
	 */
	@TableField("APPROVE")
	private Long approve;
	/**
	 * 费率审批机构
	 */
	@TableField("RATE_APPROVAL_ORG")
	private Long raaa;
	/**
	 * 是否存在方案费率折扣
	 */
	@TableField("WHETHER_RATE_DISCOUNT")
	private Long whetherRateDiscount;
	/**
	 * 方案费率折扣
	 */
	@TableField("PROGRAM_RATE_DISCOUNT")
	private BigDecimal programRateDiscount;
	/**
	 * 方案综合报价描述
	 */
	@TableField("DESCRIPTION_PROGRAM_QUOQATE")
	private String descriptionProgramQuoqate;

	/**	 * 利率规则描述
	 */
	@TableField("DESCRIPTION_RATE_RULES")
	private String descriptionRateRules;
	/**
	 * 交易背景概况
	 */
	@TableField("BRIF_BACKGROUND")
	private String brifBackground;
	/**
	 * 交易背景
	 */
	@TableField("TRAD_BACKGROUND")
	private String tradBackground;
	/**
	 * 业务背景简述
	 */
	@TableField("BUSINESS_BACKGROUND_BRIEF")
	private String businessBackgroundBrief;
	/**
	 * 货物/服务情况简述
	 */
	@TableField("GOODS_SKETCH")
	private String goodsSketch;
	/**
	 * 政策性属性描述
	 */
	@TableField("POLICY_DESCRIPTION")
	private String policyDescription;
	/**
	 * 是否是政策性
	 */
	@TableField("POLICY")
	private String policy;
	/**
	 * 申请人
	 */
	@TableField("PROPOSER")
	private String proposer;
	/**
	 * 申请人客户号
	 */
	@TableField("PROPOSER_NUM")
	private String proposerNum;
	/**
	 * 是否单笔单批
	 */
	@TableField("SINGLE_BATCH")
	private Long singleBtch;
	/**
	 * 经办机构编码
	 */
	@TableField("INSTITUTION_CODE")
	private String institutionCode;
	/**
	 * 变更前的债项方案id
	 */
	@TableField("DEBT_TRN_CODE")
	private String debtTrnCode;
	/**
	 * 说明：追加介质识别号
	 * 作者：于连奇
	 * 日期：2018/10/10
	 */
	@TableField("IDENT_NUMBER")
	private String identNumber;
	/**
	 * 说明：追加信息码
	 * 作者：于连奇
	 * 日期：2018/10/11
	 */
	@TableField("ERR_NO")
	private String errNo;
	/**
	 * 说明：追加交易状态
	 * 作者：于连奇
	 * 日期：2018/10/22
	 */
	@TableField("TRANSOK")
	private String transok;
	/**
	 * 说明：追加审核流程状态
	 * 作者：于连奇
	 * 日期：2018/10/22
	 */
	@TableField("PROCESS_STATUS")
	private Integer processStatus;
	/**
	 * 说明：历史迁移数据状态
	 * 作者：肖水泉
	 * 日期：2018/10/27
	 */
	@TableField("HISTORY_STATE")
	private String historyState;

	/**
	 * 说明：追加方案状态
	 * 作者：陈志明
	 * 日期：2018/7/12
	 * 1、系统根据该债项方案的审批状态，自动显示；
	 * 2、方案状态：可发放/过期。状态类型，参见方案状态及方案审核状态
	 * 3、灰显，不可修改
	 */
	@TableField("SOLUTION_STATE")
	private Integer solutionState;
	/**
	 * 说明：追加产品名称组合
	 * 作者：陈志明
	 * 日期：2018/7/12
	 */
	@TableField(exist=false)
	private Set<ProductVo> productSet;

	/**
	 * 说明：方案金额字符串
	 * 作者：陈志明
	 * 日期：2018/12/18
	 */
	@TableField(exist=false)
	private String solutionAmountStr;
	/**
	 * 说明：所属机构
	 * 作者：肖水泉
	 * 日期：2018/10/22
	 */
	@TableField(exist=false)
	private String deptName;

	/**
	 * 版本号：记录方案变更版本;
	 */
	@TableField("VERNUM_")
	private Integer verNum;

	@TableField("TRNINR_")
	private Long trnInr;

    /**
     * 发放条件编号
     */
    @TableField("GRANT_CODE")
    private String grantCode;

    /**
     * 业务品种（细类）
     */
    @TableField("BUSINESS_TYPES")
    private String business_Types;

    /**
     * 发放审核通过时间
     */
    @TableField("PASS_DATE")
    private Date passDate;

    /**
     * 发放币种
     */
    @TableField("GRANT_CURRENCY")
    private String grantCurrency;

    /**
     * 发放金额
     */
    @TableField("GRANT_AMT")
    private BigDecimal grantAmt;

    /**
     * 发放业务期限范围
     */
    @TableField("GRANT_SCOPE_B_PERIOD")
    private Long grantScopeBPeriod;


    /**
     * 发放产品名称
     */
    @TableField("BUSINESS_NAME")
    private String businessName;

    /**
     * 方案编号+变更号
     */
    @TableField("DEBT_CODE_VERNUM")
    private String debtCodeVernum;

    public String getDebtCodeVernum() {
        return debtCodeVernum;
    }

    public void setDebtCodeVernum(String debtCodeVernum) {
        this.debtCodeVernum = debtCodeVernum;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getGrantCurrency() {
        return grantCurrency;
    }

    public void setGrantCurrency(String grantCurrency) {
        this.grantCurrency = grantCurrency;
    }

    public BigDecimal getGrantAmt() {
        return grantAmt;
    }

    public void setGrantAmt(BigDecimal grantAmt) {
        this.grantAmt = grantAmt;
    }

    public Long getGrantScopeBPeriod() {
        return grantScopeBPeriod;
    }

    public void setGrantScopeBPeriod(Long grantScopeBPeriod) {
        this.grantScopeBPeriod = grantScopeBPeriod;
    }

    public String getBusiness_Types() {
        return business_Types;
    }

    public void setBusiness_Types(String business_Types) {
        this.business_Types = business_Types;
    }

    public Date getPassDate() {
        return passDate;
    }

    public void setPassDate(Date passDate) {
        this.passDate = passDate;
    }

    public String getGrantCode() {
        return grantCode;
    }

    public void setGrantCode(String grantCode) {
        this.grantCode = grantCode;
    }

    public String getDebtCode() {
		return debtCode == "" ? null : debtCode;
	}

	public void setDebtCode(String debtCode) {
		this.debtCode = debtCode;
	}

	public String getProjectName() {
		return projectName == "" ? null : projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Long getBankTellerId() {
		return bankTellerId;
	}

	public void setBankTellerId(Long bankTellerId) {
		this.bankTellerId = bankTellerId;
	}

	public Date getProcessInitiatTime() {
		return processInitiatTime;
	}

	public void setProcessInitiatTime(Date processInitiatTime) {
		this.processInitiatTime = processInitiatTime;
	}

	public Long getValidityCcycleGauge() {
		return validityCcycleGauge;
	}

	public void setValidityCcycleGauge(Long validityCcycleGauge) {
		this.validityCcycleGauge = validityCcycleGauge;
	}

	public Date getPgEffectivDate() {
		return pgEffectivDate;
	}

	public void setPgEffectivDate(Date pgEffectivDate) {
		this.pgEffectivDate = pgEffectivDate;
	}

	public Date getPgExpiDate() {
		return pgExpiDate;
	}

	public void setPgExpiDate(Date pgExpiDate) {
		this.pgExpiDate = pgExpiDate;
	}

	public Long getLs() {
		return ls;
	}

	public void setLs(Long ls) {
		this.ls = ls;
	}

	public Long getRuleType() {
		return ruleType;
	}

	public void setRuleType(Long ruleType) {
		this.ruleType = ruleType;
	}

	public Long getLtnopa() {
		return ltnopa;
	}

	public void setLtnopa(Long ltnopa) {
		this.ltnopa = ltnopa;
	}

	public Long getTdwln() {
		return tdwln;
	}

	public void setTdwln(Long tdwln) {
		this.tdwln = tdwln;
	}

	public String getMpc() {
		return mpc == "" ? null : mpc;
	}

	public void setMpc(String mpc) {
		this.mpc = mpc;
	}

	public BigDecimal getSolutionAmount() {
		return solutionAmount;
	}

	public void setSolutionAmount(BigDecimal solutionAmount) {
		this.solutionAmount = solutionAmount;
	}

	public String getaCurrrency() {
		return aCurrrency == "" ? null : aCurrrency;
	}

	public void setaCurrrency(String aCurrrency) {
		this.aCurrrency = aCurrrency;
	}

	public String getOc() {
		return oc == "" ? null : oc;
	}

	public void setOc(String oc) {
		this.oc = oc;
	}

	public Long getDopo() {
		return dopo;
	}

	public void setDopo(Long dopo) {
		this.dopo = dopo;
	}

	public Long getProgRateType() {
		return progRateType;
	}

	public void setProgRateType(Long progRateType) {
		this.progRateType = progRateType;
	}

	public Long getSchemeRateForm() {
		return schemeRateForm;
	}

	public void setSchemeRateForm(Long schemeRateForm) {
		this.schemeRateForm = schemeRateForm;
	}

	public BigDecimal getRateRangeMix() {
		return rateRangeMix;
	}

	public void setRateRangeMix(BigDecimal rateRangeMix) {
		this.rateRangeMix = rateRangeMix;
	}

	public BigDecimal getRateRangeMax() {
		return rateRangeMax;
	}

	public void setRateRangeMax(BigDecimal rateRangeMax) {
		this.rateRangeMax = rateRangeMax;
	}

	public BigDecimal getPackageRate() {
		return packageRate;
	}

	public void setPackageRate(BigDecimal packageRate) {
		this.packageRate = packageRate;
	}

	public Long getApprove() {
		return approve;
	}

	public void setApprove(Long approve) {
		this.approve = approve;
	}

	public Long getRaaa() {
		return raaa;
	}

	public void setRaaa(Long raaa) {
		this.raaa = raaa;
	}

	public Long getWhetherRateDiscount() {
		return whetherRateDiscount;
	}

	public void setWhetherRateDiscount(Long whetherRateDiscount) {
		this.whetherRateDiscount = whetherRateDiscount;
	}

	public BigDecimal getProgramRateDiscount() {
		return programRateDiscount;
	}

	public void setProgramRateDiscount(BigDecimal programRateDiscount) {
		this.programRateDiscount = programRateDiscount;
	}

	public String getDescriptionProgramQuoqate() {
		return descriptionProgramQuoqate == "" ? null : descriptionProgramQuoqate;
	}

	public void setDescriptionProgramQuoqate(String descriptionProgramQuoqate) {
		this.descriptionProgramQuoqate = descriptionProgramQuoqate;
	}

	public String getDescriptionRateRules() {
		return descriptionRateRules == "" ? null : descriptionRateRules;
	}

	public void setDescriptionRateRules(String descriptionRateRules) {
		this.descriptionRateRules = descriptionRateRules;
	}

	public String getBrifBackground() {
		return brifBackground == "" ? null : brifBackground;
	}

	public void setBrifBackground(String brifBackground) {
		this.brifBackground = brifBackground;
	}

	public String getTradBackground() {
		return tradBackground == "" ? null : tradBackground;
	}

	public void setTradBackground(String tradBackground) {
		this.tradBackground = tradBackground;
	}

	public String getBusinessBackgroundBrief() {
		return businessBackgroundBrief == "" ? null : businessBackgroundBrief;
	}

	public void setBusinessBackgroundBrief(String businessBackgroundBrief) {
		this.businessBackgroundBrief = businessBackgroundBrief;
	}

	public String getGoodsSketch() {
		return goodsSketch == "" ? null : goodsSketch;
	}

	public void setGoodsSketch(String goodsSketch) {
		this.goodsSketch = goodsSketch;
	}

	public String getPolicyDescription() {
		return policyDescription == "" ? null : policyDescription;
	}

	public void setPolicyDescription(String policyDescription) {
		this.policyDescription = policyDescription;
	}

	public String getPolicy() {
		return policy == "" ? null : policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
	}

	public String getProposer() {
		return proposer == "" ? null : proposer;
	}

	public void setProposer(String proposer) {
		this.proposer = proposer;
	}

	public String getProposerNum() {
		return proposerNum == "" ? null : proposerNum;
	}

	public void setProposerNum(String proposerNum) {
		this.proposerNum = proposerNum;
	}

	public Long getSingleBtch() {
		return singleBtch;
	}

	public void setSingleBtch(Long singleBtch) {
		this.singleBtch = singleBtch;
	}

	public String getInstitutionCode() {
		return institutionCode == "" ? null : institutionCode;
	}

	public void setInstitutionCode(String institutionCode) {
		this.institutionCode = institutionCode;
	}

	public String getDebtTrnCode() {
		return debtTrnCode == "" ? null : debtTrnCode;
	}

	public void setDebtTrnCode(String debtTrnCode) {
		this.debtTrnCode = debtTrnCode;
	}

	public String getIdentNumber() {
		return identNumber == "" ? null : identNumber;
	}

	public void setIdentNumber(String identNumber) {
		this.identNumber = identNumber;
	}

	public String getErrNo() {
		return errNo == "" ? null : errNo;
	}

	public void setErrNo(String errNo) {
		this.errNo = errNo;
	}

	public String getTransok() {
		return transok == "" ? null : transok;
	}

	public void setTransok(String transok) {
		this.transok = transok;
	}

	public Integer getProcessStatus() {
		return processStatus;
	}

	public void setProcessStatus(Integer processStatus) {
		this.processStatus = processStatus;
	}

	public String getHistoryState() {
		return historyState == "" ? null : historyState;
	}

	public void setHistoryState(String historyState) {
		this.historyState = historyState;
	}

	public Integer getSolutionState() {
		return solutionState;
	}

	public void setSolutionState(Integer solutionState) {
		this.solutionState = solutionState;
	}

	public Set<ProductVo> getProductSet() {
		return productSet;
	}

	public void setProductSet(Set<ProductVo> productSet) {
		this.productSet = productSet;
	}

	public String getSolutionAmountStr() {
		if(solutionAmount!=null){
			DecimalFormat numberFormat = new DecimalFormat(",###.00");
			return numberFormat.format(solutionAmount);
		}
		return "0";
	}

	public void setSolutionAmountStr(String solutionAmountStr) {
		this.solutionAmountStr = solutionAmountStr;
	}

	public String getDeptName() {
		return deptName == "" ? null : deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Integer getVerNum() {
		return verNum;
	}

	public void setVerNum(Integer verNum) {
		this.verNum = verNum;
	}

    public String getVerNumStr() {
        return String.format("%0" + 3 + "d", verNum);
    }

	public Long getTrnInr() {
		return trnInr;
	}

	public void setTrnInr(Long trnInr) {
		this.trnInr = trnInr;
	}

	public BizApprSummaryInfo() {
    }

    @Override
    public String toString() {
        return "BizApprSummaryInfo{" +
                "debtCode='" + debtCode + '\'' +
                ", projectName='" + projectName + '\'' +
                ", bankTellerId=" + bankTellerId +
                ", processInitiatTime=" + processInitiatTime +
                ", validityCcycleGauge=" + validityCcycleGauge +
                ", pgEffectivDate=" + pgEffectivDate +
                ", pgExpiDate=" + pgExpiDate +
                ", ls=" + ls +
                ", ruleType=" + ruleType +
                ", ltnopa=" + ltnopa +
                ", tdwln=" + tdwln +
                ", mpc='" + mpc + '\'' +
                ", solutionAmount=" + solutionAmount +
                ", aCurrrency='" + aCurrrency + '\'' +
                ", oc='" + oc + '\'' +
                ", dopo=" + dopo +
                ", progRateType=" + progRateType +
                ", schemeRateForm=" + schemeRateForm +
                ", rateRangeMix=" + rateRangeMix +
                ", rateRangeMax=" + rateRangeMax +
                ", packageRate=" + packageRate +
                ", approve=" + approve +
                ", raaa=" + raaa +
                ", whetherRateDiscount=" + whetherRateDiscount +
                ", programRateDiscount=" + programRateDiscount +
                ", descriptionProgramQuoqate='" + descriptionProgramQuoqate + '\'' +
                ", descriptionRateRules='" + descriptionRateRules + '\'' +
                ", brifBackground='" + brifBackground + '\'' +
                ", tradBackground='" + tradBackground + '\'' +
                ", businessBackgroundBrief='" + businessBackgroundBrief + '\'' +
                ", goodsSketch='" + goodsSketch + '\'' +
                ", policyDescription='" + policyDescription + '\'' +
                ", policy='" + policy + '\'' +
                ", proposer='" + proposer + '\'' +
                ", proposerNum='" + proposerNum + '\'' +
                ", singleBtch=" + singleBtch +
                ", institutionCode='" + institutionCode + '\'' +
                ", debtTrnCode='" + debtTrnCode + '\'' +
                ", identNumber='" + identNumber + '\'' +
                ", errNo='" + errNo + '\'' +
                ", transok='" + transok + '\'' +
                ", processStatus=" + processStatus +
                ", historyState='" + historyState + '\'' +
                ", solutionState=" + solutionState +
                ", productSet=" + productSet +
                ", solutionAmountStr='" + solutionAmountStr + '\'' +
                ", deptName='" + deptName + '\'' +
                ", verNum=" + verNum +
                ", trnInr=" + trnInr +
                '}';
    }

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof BizApprSummaryInfo)) return false;
		BizApprSummaryInfo that = (BizApprSummaryInfo) o;
		return Objects.equal(getDebtCode(), that.getDebtCode()) &&
				Objects.equal(getProjectName(), that.getProjectName()) &&
				Objects.equal(getBankTellerId(), that.getBankTellerId()) &&
				Objects.equal(getProcessInitiatTime(), that.getProcessInitiatTime()) &&
				Objects.equal(getValidityCcycleGauge(), that.getValidityCcycleGauge()) &&
				Objects.equal(getPgEffectivDate(), that.getPgEffectivDate()) &&
				Objects.equal(getPgExpiDate(), that.getPgExpiDate()) &&
				Objects.equal(getLs(), that.getLs()) &&
				Objects.equal(getRuleType(), that.getRuleType()) &&
				Objects.equal(getLtnopa(), that.getLtnopa()) &&
				Objects.equal(getTdwln(), that.getTdwln()) &&
				Objects.equal(getMpc(), that.getMpc()) &&
				Objects.equal(getSolutionAmount(), that.getSolutionAmount()) &&
				Objects.equal(getaCurrrency(), that.getaCurrrency()) &&
				Objects.equal(getOc(), that.getOc()) &&
				Objects.equal(getDopo(), that.getDopo()) &&
				Objects.equal(getProgRateType(), that.getProgRateType()) &&
				Objects.equal(getSchemeRateForm(), that.getSchemeRateForm()) &&
				Objects.equal(getRateRangeMix(), that.getRateRangeMix()) &&
				Objects.equal(getRateRangeMax(), that.getRateRangeMax()) &&
				Objects.equal(getPackageRate(), that.getPackageRate()) &&
				Objects.equal(getApprove(), that.getApprove()) &&
				Objects.equal(getRaaa(), that.getRaaa()) &&
				Objects.equal(getWhetherRateDiscount(), that.getWhetherRateDiscount()) &&
				Objects.equal(getProgramRateDiscount(), that.getProgramRateDiscount()) &&
				Objects.equal(getDescriptionProgramQuoqate(), that.getDescriptionProgramQuoqate()) &&
				Objects.equal(getDescriptionRateRules(), that.getDescriptionRateRules()) &&
				Objects.equal(getBrifBackground(), that.getBrifBackground()) &&
				Objects.equal(getTradBackground(), that.getTradBackground()) &&
				Objects.equal(getBusinessBackgroundBrief(), that.getBusinessBackgroundBrief()) &&
				Objects.equal(getGoodsSketch(), that.getGoodsSketch()) &&
				Objects.equal(getPolicyDescription(), that.getPolicyDescription()) &&
				Objects.equal(getPolicy(), that.getPolicy()) &&
				Objects.equal(getProposer(), that.getProposer()) &&
				Objects.equal(getProposerNum(), that.getProposerNum()) &&
				Objects.equal(getSingleBtch(), that.getSingleBtch()) &&
				Objects.equal(getInstitutionCode(), that.getInstitutionCode()) &&
				Objects.equal(getDebtTrnCode(), that.getDebtTrnCode()) &&
				Objects.equal(getIdentNumber(), that.getIdentNumber()) &&
				Objects.equal(getErrNo(), that.getErrNo()) &&
				Objects.equal(getTransok(), that.getTransok()) &&
				Objects.equal(getProcessStatus(), that.getProcessStatus()) &&
				Objects.equal(getHistoryState(), that.getHistoryState()) &&
				Objects.equal(getSolutionState(), that.getSolutionState()) &&
				Objects.equal(getProductSet(), that.getProductSet()) &&
				Objects.equal(getDeptName(), that.getDeptName()) &&
				Objects.equal(getVerNum(), that.getVerNum()) &&
				Objects.equal(getTrnInr(), that.getTrnInr());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getDebtCode(), getProjectName(), getBankTellerId(), getProcessInitiatTime(), getValidityCcycleGauge(), getPgEffectivDate(), getPgExpiDate(), getLs(), getRuleType(), getLtnopa(), getTdwln(), getMpc(), getSolutionAmount(), getaCurrrency(), getOc(), getDopo(), getProgRateType(), getSchemeRateForm(), getRateRangeMix(), getRateRangeMax(), getPackageRate(), getApprove(), getRaaa(), getWhetherRateDiscount(), getProgramRateDiscount(), getDescriptionProgramQuoqate(), getDescriptionRateRules(), getBrifBackground(), getTradBackground(), getBusinessBackgroundBrief(), getGoodsSketch(), getPolicyDescription(), getPolicy(), getProposer(), getProposerNum(), getSingleBtch(), getInstitutionCode(), getDebtTrnCode(), getIdentNumber(), getErrNo(), getTransok(), getProcessStatus(), getHistoryState(), getSolutionState(), getProductSet(), getSolutionAmountStr(), getDeptName(), getVerNum(), getTrnInr());
	}
}