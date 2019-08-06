package com.hns.learn.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author hannasong
 * 押品价值信息表 v1.1
 */
@TableName("GMS_COL_VALUEINFO")
public class GmsColValueinfo extends BaseModel implements Serializable {

    /** 流程标识 */
    @TableField("PROCESSID")
    private String processId;
    /** 岗位标识 */
    @TableField("WORKITEMID")
    private String workitemId;
    /** 押品编号 */
    @TableField("CLTNO")
    private String cltNO;
    /** 我行确认价值 */
    @TableField("CONFAMT")
    private BigDecimal confAmt;
    /** 评估日期 */
    @TableField("CONFIRMDATE")
    private String confirmDate;
    /** 我行确认价值到期日 */
    @TableField("EXPDT")
    private String expDt;
    /** 币种 */
    @TableField("CONFCCYCD")
    private String confCcyCd;
    /** 评估方式 */
    @TableField("ASESTYPECD")
    private String asesTypeCd;

    public GmsColValueinfo() {
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getWorkitemId() {
        return workitemId;
    }

    public void setWorkitemId(String workitemId) {
        this.workitemId = workitemId;
    }

    public String getCltNO() {
        return cltNO;
    }

    public void setCltNO(String cltNO) {
        this.cltNO = cltNO;
    }

    public BigDecimal getConfAmt() {
        return confAmt;
    }

    public void setConfAmt(BigDecimal confAmt) {
        this.confAmt = confAmt;
    }

    public String getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(String confirmDate) {
        this.confirmDate = confirmDate;
    }

    public String getExpDt() {
        return expDt;
    }

    public void setExpDt(String expDt) {
        this.expDt = expDt;
    }

    public String getConfCcyCd() {
        return confCcyCd;
    }

    public void setConfCcyCd(String confCcyCd) {
        this.confCcyCd = confCcyCd;
    }

    public String getAsesTypeCd() {
        return asesTypeCd;
    }

    public void setAsesTypeCd(String asesTypeCd) {
        this.asesTypeCd = asesTypeCd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GmsColValueinfo)) return false;
        GmsColValueinfo that = (GmsColValueinfo) o;
        return Objects.equal(getProcessId(), that.getProcessId()) &&
                Objects.equal(getWorkitemId(), that.getWorkitemId()) &&
                Objects.equal(getCltNO(), that.getCltNO()) &&
                Objects.equal(getConfAmt(), that.getConfAmt()) &&
                Objects.equal(getConfirmDate(), that.getConfirmDate()) &&
                Objects.equal(getExpDt(), that.getExpDt()) &&
                Objects.equal(getConfCcyCd(), that.getConfCcyCd()) &&
                Objects.equal(getAsesTypeCd(), that.getAsesTypeCd());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getProcessId(), getWorkitemId(), getCltNO(), getConfAmt(), getConfirmDate(), getExpDt(), getConfCcyCd(), getAsesTypeCd());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("processId", processId)
                .add("workitemId", workitemId)
                .add("cltNO", cltNO)
                .add("confAmt", confAmt)
                .add("confirmDate", confirmDate)
                .add("expDt", expDt)
                .add("confCcyCd", confCcyCd)
                .add("asesTypeCd", asesTypeCd)
                .toString();
    }
}
