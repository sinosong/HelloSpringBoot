package com.hns.learn.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.util.Date;

/**
 * 核心牌价表
 */
@TableName("INF_AFPAEXO")
public class InfAfpaexo extends BaseModel {

    /** 地区号 */
    @TableField("ZONENO")
    private String zoneno;
    /** 币种 */
    @TableField("CURRTYPE")
    private String currtype;
    /** 折本币日终中间价 */
    @TableField("BASERATE")
    private String baserate;
    /** 折美元日终中间价 */
    @TableField("USDVRATE")
    private String usdvrate;
    /** 折人民币日终中间价 */
    @TableField("CNYVRATE")
    private String cnyvrate;
    /** 最后更改日期 */
    @TableField("WORKDATE")
    private Date workdate;

    public InfAfpaexo() {
    }

    public String getZoneno() {
        return zoneno == "" ? null : zoneno;
    }

    public void setZoneno(String zoneno) {
        this.zoneno = zoneno;
    }

    public String getCurrtype() {
        return currtype == "" ? null : currtype;
    }

    public void setCurrtype(String currtype) {
        this.currtype = currtype;
    }

    public String getBaserate() {
        return baserate == "" ? null : baserate;
    }

    public void setBaserate(String baserate) {
        this.baserate = baserate;
    }

    public String getUsdvrate() {
        return usdvrate == "" ? null : usdvrate;
    }

    public void setUsdvrate(String usdvrate) {
        this.usdvrate = usdvrate;
    }

    public String getCnyvrate() {
        return cnyvrate == "" ? null : cnyvrate;
    }

    public void setCnyvrate(String cnyvrate) {
        this.cnyvrate = cnyvrate;
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
        if (!(o instanceof InfAfpaexo)) return false;
        InfAfpaexo that = (InfAfpaexo) o;
        return Objects.equal(getZoneno(), that.getZoneno()) &&
                Objects.equal(getCurrtype(), that.getCurrtype()) &&
                Objects.equal(getBaserate(), that.getBaserate()) &&
                Objects.equal(getUsdvrate(), that.getUsdvrate()) &&
                Objects.equal(getCnyvrate(), that.getCnyvrate()) &&
                Objects.equal(getWorkdate(), that.getWorkdate());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getZoneno(), getCurrtype(), getBaserate(), getUsdvrate(), getCnyvrate(), getWorkdate());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("zoneno", zoneno)
                .add("currtype", currtype)
                .add("baserate", baserate)
                .add("usdvrate", usdvrate)
                .add("cnyvrate", cnyvrate)
                .add("workdate", workdate)
                .toString();
    }
}
