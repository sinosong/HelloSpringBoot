package com.hns.learn.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author : hannasong
 * @version : v1.0
 * @date : Created in 15:40 2019-08-05
 * @description : 单一产品规则
 */
@TableName("BIZ_SIGLE_PRODUCT_RULE")
public class BizSingleProductRule extends BaseModel implements Serializable {

    /**
     * 业务编号
     */
    @TableField("DEBT_CODE")
    private String debtCode;
    /**
     * 产品专有信息表外键
     */
    //@TableField("PROPER_INFO")
    //private Long productInfo;
    /**
     * 产品类型表名
     */
    @TableField("OBJ_TYPE")
    private String objType;
    /**
     * 业务品种（细类）
     */
    @TableField("BUSINESS_TYPE")
    private String businessType;
    /**
     * 可办理笔数限制
     */
    //@TableField("NUM_LIMIT")
    //private Long ltnopa;
    /**
     * 可办理笔数
     */
    //@TableField("DEAL_NUM")
    //private Long tdwln;
    /**
     * 产品主币种
     */
    @TableField("PRODUCT_CURRENCY")
    private String productCurrency;
    /**
     * 产品金额
     */
    @TableField("PRODUCT_AMT")
    private BigDecimal productAmt;
    /**
     * 产品辅助币种
     */
    //@TableField("AIDED_CURRENCY")
    //private Long aidedCurrency;
    /**
     * 其他可选币种
     */
    //@TableField("CURRENCIES_AVAILABLE")
    //private Long currenciesAvailable;
    /**
     * 产品业务期限范围
     */
    //@TableField("SCOPE_BUSI_PERIOD")
    //private Long psp;
    /**
     * 产品费率类型
     */
    //@TableField("PROD_RATE_TYPE")
    //private Long prodRateType;
    /**
     * 产品费率形式
     */
    //@TableField("PROD_RATE_FORM")
    //private Long prodRateForm;
    /**
     * 产品费率
     */
    //@TableField("PROD_RATE")
    //private Long tpRate;
    /**
     * 产品费率范围最低值
     */
    //@TableField("RATE_RANGE_MIN")
    //private Long rateRangeMin;
    /**
     * 产品费率范围最高值
     */
    //@TableField("RATE_RANGE_MAX")
    //private Long rateRangeMax;
    /**
     * 是否经审批
     */
    //@TableField("APPROVED_FLAG")
    //private Long bteaa;
    /**
     * 审批机构
     */
    //@TableField("APPROVED_ORG")
    //private Long eaaa;
    /**
     * 是否存在产品费率折扣
     */
    //@TableField("PRODUCT_RATE_DISCOUNT")
    //private Long productRateDiscount;
    /**
     * 产品费率折扣
     */
    //@TableField("RATE_DISCOUNT")
    //private Long rateDiscount;
    /**
     * 利率规则描述
     */
    //@TableField("INTEREST_RATE_RULES")
    //private String interestRateRules;
    /**
     * 产品生效日期
     */
    //@TableField("PROD_EFFE_DATE")
    //private Date ptEffectiveDate;
    /**
     * 产品失效日期
     */
    //@TableField("PROD_EXPI_DATE")
    //private Date ptExpiDate;
    /**
     * 产品循环标志
     */
    //@TableField("PROD_LOOP")
    //private Long ptLs;
    /**
     * 方案生效日期
     */
    //@TableField("SCHE_EFFE_DATE")
    //private Date pgEffectiveDate;
    /**
     * 方案失效日期
     */
    //@TableField("SCHE_EXPI_DATE")
    //private Date pgExpiDate;
    /**
     * 背景国别
     */
    @TableField("BACKGROUND_NATIONALITY")
    private String backgroundNationality;
    /**
     * 行业投向
     */
    @TableField("INDUSTRY_INVESTMENT")
    private String industryInvestment;

    public String getDebtCode() {
        return debtCode;
    }

    public void setDebtCode(String debtCode) {
        this.debtCode = debtCode;
    }

    public String getObjType() {
        return objType;
    }

    public void setObjType(String objType) {
        this.objType = objType;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getProductCurrency() {
        return productCurrency;
    }

    public void setProductCurrency(String productCurrency) {
        this.productCurrency = productCurrency;
    }

    public BigDecimal getProductAmt() {
        return productAmt;
    }

    public void setProductAmt(BigDecimal productAmt) {
        this.productAmt = productAmt;
    }

    public String getBackgroundNationality() {
        return backgroundNationality;
    }

    public void setBackgroundNationality(String backgroundNationality) {
        this.backgroundNationality = backgroundNationality;
    }

    public String getIndustryInvestment() {
        return industryInvestment;
    }

    public void setIndustryInvestment(String industryInvestment) {
        this.industryInvestment = industryInvestment;
    }

    public BizSingleProductRule(String debtCode) {
        this.debtCode = debtCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BizSingleProductRule that = (BizSingleProductRule) o;
        return Objects.equal(debtCode, that.debtCode) &&
                Objects.equal(objType, that.objType) &&
                Objects.equal(businessType, that.businessType) &&
                Objects.equal(productCurrency, that.productCurrency) &&
                Objects.equal(productAmt, that.productAmt) &&
                Objects.equal(backgroundNationality, that.backgroundNationality) &&
                Objects.equal(industryInvestment, that.industryInvestment);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(debtCode, objType, businessType, productCurrency, productAmt, backgroundNationality, industryInvestment);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("debtCode", debtCode)
                .add("objType", objType)
                .add("businessType", businessType)
                .add("productCurrency", productCurrency)
                .add("productAmt", productAmt)
                .add("backgroundNationality", backgroundNationality)
                .add("industryInvestment", industryInvestment)
                .toString();
    }
}
