package com.hns.learn.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.io.Serializable;
import java.util.Date;

/**
 * @author hannasong
 * 核心跑批记录表
 */
@TableName("INF_TASK_RECORD")
public class InfTaskRecord extends BaseModel implements Serializable {

    /**
     * 上次核心批量日期 yyyy-MM-dd
     */
    @TableField("LASTDATE")
    private String lastDate;
    /**
     * 当次核心批量日期 yyyy-MM-dd
     */
    @TableField("CURRDATE")
    private String currDate;
    /**
     *  分组名称 IBASE4J、BE_DEA
     */
    @TableField("GROUP_NAME")
    private String groupName;
    /**
     * 任务名称 流水=ACCRUAL、综合=COMPREHENSIVE、接口平台:INF9
     */
    @TableField("TASK_NAME")
    private String taskName;
    /**
     * 开始时间
     */
    @TableField("START_TIME")
    private Date startTime;
    /**
     * 结束时间
     */
    @TableField("END_TIME")
    private Date endTime;
    /**
     * 状态 SUCCESS、FAILED
     */
    @TableField("STATUS_")
    private String status;
    /**
     * 插入行数
     */
    @TableField("INSERTROWS")
    private Integer insertrows;

    public InfTaskRecord() {
    }

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public String getCurrDate() {
        return currDate;
    }

    public void setCurrDate(String currDate) {
        this.currDate = currDate;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getInsertrows() {
        return insertrows;
    }

    public void setInsertrows(Integer insertrows) {
        this.insertrows = insertrows;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InfTaskRecord)) return false;
        InfTaskRecord that = (InfTaskRecord) o;
        return Objects.equal(getLastDate(), that.getLastDate()) &&
                Objects.equal(getCurrDate(), that.getCurrDate()) &&
                Objects.equal(getGroupName(), that.getGroupName()) &&
                Objects.equal(getTaskName(), that.getTaskName()) &&
                Objects.equal(getStartTime(), that.getStartTime()) &&
                Objects.equal(getEndTime(), that.getEndTime()) &&
                Objects.equal(getStatus(), that.getStatus()) &&
                Objects.equal(getInsertrows(), that.getInsertrows());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getLastDate(), getCurrDate(), getGroupName(), getTaskName(), getStartTime(), getEndTime(), getStatus(), getInsertrows());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("lastDate", lastDate)
                .add("currDate", currDate)
                .add("groupName", groupName)
                .add("taskName", taskName)
                .add("startTime", startTime)
                .add("endTime", endTime)
                .add("status", status)
                .add("insertrows", insertrows)
                .toString();
    }
}
