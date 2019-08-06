package com.hns.learn.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author hannasong
 * 押品基本信息表 v1.1
 */
@TableName("GMS_COL_COLLBASEINFO")
public class GmsColcollBaseinfo extends BaseModel implements Serializable {

    /** 数据种类标识(1、押品 2、非典型担保及其他保障措施) */
    @TableField("FLAG")
    private String flag;
    /** 押品编号 */
    @TableField("CLTNO")
    private String cltNO;
    /** 押品名称 */
    @TableField("CLTNM")
    private String cltNm;
    /** 押品种类 */
    @TableField("CLTTPCD")
    private String cltTpCd;
    /** 是否为境内押品(0否1是) */
    @TableField("ISTERRITORY")
    private String isTerritory;
    /** 经办人 */
    @TableField("HANDUSERNO")
    private String handUserNo;
    /** 经办机构 */
    @TableField("HANDORGNO")
    private String handOrgNo;
    /** 经办日期(格式:yyyyMMdd) */
    @TableField("HANDDT")
    private String handDt;
    /** 抵押(出质)人名称 */
    @TableField("OWNERNM")
    private String ownerNm;
    /** 抵押(出质)人编号 */
    @TableField("OWNERNO")
    private String ownerNo;
    /** 创建人 */
    @TableField("INPUTUSERNO")
    private String inputUserNo;
    /** 业务来源(1信贷业务2贸金业务3资金业务) */
    @TableField("BUSSOURCECD")
    private String busSourceCd;
    /** 是否共用(0否1是) */
    @TableField("ISSHARING")
    private String isSharing;
    /** 已占用担保金额 */
    @TableField("OCCUGUARAMT")
    private BigDecimal occuGuarAmt;
    /** 已占用担保金额币种 */
    @TableField("OCCUGUARCCYCD")
    private String occuGuarCcyCd;
    /** 可担保余额 */
    @TableField("GUARBALANCE")
    private BigDecimal guarBalance;
    /** 可担保余额币种 */
    @TableField("GUARBALANCECCYCD")
    private String guarBalanceCcyCd;
    /** 可担保总额 */
    @TableField("GUARTOTAL")
    private BigDecimal guarTotal;
    /** 可担保总额币种 */
    @TableField("GUARTOTALCCYCD")
    private String guarTotalCcyCd;
    /** 我行确认价值 */
    @TableField("CONFAMT")
    private BigDecimal confAmt;
    /** 我行确认价值币种 */
    @TableField("CONFCCYCD")
    private String confCcyCd;
    /** 价值确认日期(格式:yyyyMMdd) */
    @TableField("CONFDT")
    private String confDt;
    /** 价值确认日期到期日(格式:yyyyMMdd) */
    @TableField("EXPDT")
    private String expDt;
    /** 首次价值确认日期(格式:yyyyMMdd) */
    @TableField("FIRSTCONFDT")
    private String firstConfDt;
    /** 是否涉及余额抵押(0否1是) */
    @TableField("ISBALANCEMORT")
    private String isBalanceMort;
    /** 抵押顺位 */
    @TableField("MORTORDER")
    private String mortOrder;
    /** 抵质押率上限 */
    @TableField("COLLPLEDLIMIT")
    private BigDecimal collPledLimit;
    /** 押品信息状态(1新建中2生效3失效4待审核5审核中) */
    @TableField("CLTSTATE")
    private String cltState;
    /** 押品类型(1抵押2质押) */
    @TableField("CLTCGYCD")
    private String cltCgyCd;
    /** 非典型担保及其他保障措施编号(01非典型担保02其他保障措施) */
    @TableField("FDXCLTNO")
    private String fdxCltNo;
    /** 具体非典型担保及其他保障措施种类(0101.造船合同权益转让,0102预付款退款保函权益转让,0103.还款准备金账户监管,0104.项目整体资产打包担保,0201.中国出口信用保险,0202.维好协议,0203.购机协议转让,0204.其他权益转让,0205.其他) */
    @TableField("FDXTPCD")
    private String fdxTpCd;
    /** 评估方式(100内部评估200 外部预评估300外部正式评估) */
    @TableField("EVALUATION")
    private String evaluation;
    /** 审批抵质押率(0-1) */
    @TableField("APPROVALLTVRT")
    private BigDecimal approvalLtvRt;
    /** 是否错币 */
    @TableField(exist = false)
    private Long isCcyCd;

    public Long getIsCcyCd() {
        return isCcyCd;
    }

    public void setIsCcyCd(Long isCcyCd) {
        this.isCcyCd = isCcyCd;
    }

    public GmsColcollBaseinfo() {
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCltNO() {
        return cltNO;
    }

    public void setCltNO(String cltNO) {
        this.cltNO = cltNO;
    }

    public String getCltNm() {
        return cltNm;
    }

    public void setCltNm(String cltNm) {
        this.cltNm = cltNm;
    }

    public String getCltTpCd() {
        return cltTpCd;
    }

    public void setCltTpCd(String cltTpCd) {
        this.cltTpCd = cltTpCd;
    }

    public String getIsTerritory() {
        return isTerritory;
    }

    public void setIsTerritory(String isTerritory) {
        this.isTerritory = isTerritory;
    }

    public String getHandUserNo() {
        return handUserNo;
    }

    public void setHandUserNo(String handUserNo) {
        this.handUserNo = handUserNo;
    }

    public String getHandOrgNo() {
        return handOrgNo;
    }

    public void setHandOrgNo(String handOrgNo) {
        this.handOrgNo = handOrgNo;
    }

    public String getHandDt() {
        return handDt;
    }

    public void setHandDt(String handDt) {
        this.handDt = handDt;
    }

    public String getOwnerNm() {
        return ownerNm;
    }

    public void setOwnerNm(String ownerNm) {
        this.ownerNm = ownerNm;
    }

    public String getOwnerNo() {
        return ownerNo;
    }

    public void setOwnerNo(String ownerNo) {
        this.ownerNo = ownerNo;
    }

    public String getInputUserNo() {
        return inputUserNo;
    }

    public void setInputUserNo(String inputUserNo) {
        this.inputUserNo = inputUserNo;
    }

    public String getBusSourceCd() {
        return busSourceCd;
    }

    public void setBusSourceCd(String busSourceCd) {
        this.busSourceCd = busSourceCd;
    }

    public String getIsSharing() {
        return isSharing;
    }

    public void setIsSharing(String isSharing) {
        this.isSharing = isSharing;
    }

    public BigDecimal getOccuGuarAmt() {
        return occuGuarAmt;
    }

    public void setOccuGuarAmt(BigDecimal occuGuarAmt) {
        this.occuGuarAmt = occuGuarAmt;
    }

    public String getOccuGuarCcyCd() {
        return occuGuarCcyCd;
    }

    public void setOccuGuarCcyCd(String occuGuarCcyCd) {
        this.occuGuarCcyCd = occuGuarCcyCd;
    }

    public BigDecimal getGuarBalance() {
        return guarBalance;
    }

    public void setGuarBalance(BigDecimal guarBalance) {
        this.guarBalance = guarBalance;
    }

    public String getGuarBalanceCcyCd() {
        return guarBalanceCcyCd;
    }

    public void setGuarBalanceCcyCd(String guarBalanceCcyCd) {
        this.guarBalanceCcyCd = guarBalanceCcyCd;
    }

    public BigDecimal getGuarTotal() {
        return guarTotal;
    }

    public void setGuarTotal(BigDecimal guarTotal) {
        this.guarTotal = guarTotal;
    }

    public String getGuarTotalCcyCd() {
        return guarTotalCcyCd;
    }

    public void setGuarTotalCcyCd(String guarTotalCcyCd) {
        this.guarTotalCcyCd = guarTotalCcyCd;
    }

    public BigDecimal getConfAmt() {
        return confAmt;
    }

    public void setConfAmt(BigDecimal confAmt) {
        this.confAmt = confAmt;
    }

    public String getConfCcyCd() {
        return confCcyCd;
    }

    public void setConfCcyCd(String confCcyCd) {
        this.confCcyCd = confCcyCd;
    }

    public String getConfDt() {
        return confDt;
    }

    public void setConfDt(String confDt) {
        this.confDt = confDt;
    }

    public String getExpDt() {
        return expDt;
    }

    public void setExpDt(String expDt) {
        this.expDt = expDt;
    }

    public String getFirstConfDt() {
        return firstConfDt;
    }

    public void setFirstConfDt(String firstConfDt) {
        this.firstConfDt = firstConfDt;
    }

    public String getIsBalanceMort() {
        return isBalanceMort;
    }

    public void setIsBalanceMort(String isBalanceMort) {
        this.isBalanceMort = isBalanceMort;
    }

    public String getMortOrder() {
        return mortOrder;
    }

    public void setMortOrder(String mortOrder) {
        this.mortOrder = mortOrder;
    }

    public BigDecimal getCollPledLimit() {
        return collPledLimit;
    }

    public void setCollPledLimit(BigDecimal collPledLimit) {
        this.collPledLimit = collPledLimit;
    }

    public String getCltState() {
        return cltState;
    }

    public void setCltState(String cltState) {
        this.cltState = cltState;
    }

    public String getCltCgyCd() {
        return cltCgyCd;
    }

    public void setCltCgyCd(String cltCgyCd) {
        this.cltCgyCd = cltCgyCd;
    }

    public String getFdxCltNo() {
        return fdxCltNo;
    }

    public void setFdxCltNo(String fdxCltNo) {
        this.fdxCltNo = fdxCltNo;
    }

    public String getFdxTpCd() {
        return fdxTpCd;
    }

    public void setFdxTpCd(String fdxTpCd) {
        this.fdxTpCd = fdxTpCd;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    public BigDecimal getApprovalLtvRt() {
        return approvalLtvRt;
    }

    public void setApprovalLtvRt(BigDecimal approvalLtvRt) {
        this.approvalLtvRt = approvalLtvRt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GmsColcollBaseinfo)) return false;
        GmsColcollBaseinfo that = (GmsColcollBaseinfo) o;
        return Objects.equal(getFlag(), that.getFlag()) &&
                Objects.equal(getCltNO(), that.getCltNO()) &&
                Objects.equal(getCltNm(), that.getCltNm()) &&
                Objects.equal(getCltTpCd(), that.getCltTpCd()) &&
                Objects.equal(getIsTerritory(), that.getIsTerritory()) &&
                Objects.equal(getHandUserNo(), that.getHandUserNo()) &&
                Objects.equal(getHandOrgNo(), that.getHandOrgNo()) &&
                Objects.equal(getHandDt(), that.getHandDt()) &&
                Objects.equal(getOwnerNm(), that.getOwnerNm()) &&
                Objects.equal(getOwnerNo(), that.getOwnerNo()) &&
                Objects.equal(getInputUserNo(), that.getInputUserNo()) &&
                Objects.equal(getBusSourceCd(), that.getBusSourceCd()) &&
                Objects.equal(getIsSharing(), that.getIsSharing()) &&
                Objects.equal(getOccuGuarAmt(), that.getOccuGuarAmt()) &&
                Objects.equal(getOccuGuarCcyCd(), that.getOccuGuarCcyCd()) &&
                Objects.equal(getGuarBalance(), that.getGuarBalance()) &&
                Objects.equal(getGuarBalanceCcyCd(), that.getGuarBalanceCcyCd()) &&
                Objects.equal(getGuarTotal(), that.getGuarTotal()) &&
                Objects.equal(getGuarTotalCcyCd(), that.getGuarTotalCcyCd()) &&
                Objects.equal(getConfAmt(), that.getConfAmt()) &&
                Objects.equal(getConfCcyCd(), that.getConfCcyCd()) &&
                Objects.equal(getConfDt(), that.getConfDt()) &&
                Objects.equal(getExpDt(), that.getExpDt()) &&
                Objects.equal(getFirstConfDt(), that.getFirstConfDt()) &&
                Objects.equal(getIsBalanceMort(), that.getIsBalanceMort()) &&
                Objects.equal(getMortOrder(), that.getMortOrder()) &&
                Objects.equal(getCollPledLimit(), that.getCollPledLimit()) &&
                Objects.equal(getCltState(), that.getCltState()) &&
                Objects.equal(getCltCgyCd(), that.getCltCgyCd()) &&
                Objects.equal(getFdxCltNo(), that.getFdxCltNo()) &&
                Objects.equal(getFdxTpCd(), that.getFdxTpCd()) &&
                Objects.equal(getEvaluation(), that.getEvaluation()) &&
                Objects.equal(getIsCcyCd(), that.getIsCcyCd()) &&
                Objects.equal(getApprovalLtvRt(), that.getApprovalLtvRt());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getFlag(), getCltNO(), getCltNm(), getIsCcyCd(),getCltTpCd(), getIsTerritory(), getHandUserNo(), getHandOrgNo(), getHandDt(), getOwnerNm(), getOwnerNo(), getInputUserNo(), getBusSourceCd(), getIsSharing(), getOccuGuarAmt(), getOccuGuarCcyCd(), getGuarBalance(), getGuarBalanceCcyCd(), getGuarTotal(), getGuarTotalCcyCd(), getConfAmt(), getConfCcyCd(), getConfDt(), getExpDt(), getFirstConfDt(), getIsBalanceMort(), getMortOrder(), getCollPledLimit(), getCltState(), getCltCgyCd(), getFdxCltNo(), getFdxTpCd(), getEvaluation(), getApprovalLtvRt());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("flag", flag)
                .add("cltNO", cltNO)
                .add("cltNm", cltNm)
                .add("cltTpCd", cltTpCd)
                .add("isTerritory", isTerritory)
                .add("handUserNo", handUserNo)
                .add("handOrgNo", handOrgNo)
                .add("handDt", handDt)
                .add("ownerNm", ownerNm)
                .add("ownerNo", ownerNo)
                .add("inputUserNo", inputUserNo)
                .add("busSourceCd", busSourceCd)
                .add("isSharing", isSharing)
                .add("occuGuarAmt", occuGuarAmt)
                .add("occuGuarCcyCd", occuGuarCcyCd)
                .add("guarBalance", guarBalance)
                .add("guarBalanceCcyCd", guarBalanceCcyCd)
                .add("guarTotal", guarTotal)
                .add("guarTotalCcyCd", guarTotalCcyCd)
                .add("confAmt", confAmt)
                .add("confCcyCd", confCcyCd)
                .add("confDt", confDt)
                .add("expDt", expDt)
                .add("firstConfDt", firstConfDt)
                .add("isBalanceMort", isBalanceMort)
                .add("mortOrder", mortOrder)
                .add("collPledLimit", collPledLimit)
                .add("cltState", cltState)
                .add("cltCgyCd", cltCgyCd)
                .add("fdxCltNo", fdxCltNo)
                .add("fdxTpCd", fdxTpCd)
                .add("evaluation", evaluation)
                .add("approvalLtvRt", approvalLtvRt)
                .add("isCcyCd", isCcyCd)
                .toString();
    }
}
