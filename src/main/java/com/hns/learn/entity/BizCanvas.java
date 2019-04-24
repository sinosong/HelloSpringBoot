package com.hns.learn.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.google.common.base.MoreObjects;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.Date;

@TableName("BIZ_CANVAS")
@XmlRootElement(name = "BizCanvas")
public class BizCanvas extends BaseModel implements Serializable {

    //查询编号
    @TableField("BIZ_CODE")
    private String bizCode;

    //债项事前录入A、债项补录B、审批过程录入S、发放审核F三种
    @TableField("TYPE_")
    private String type;

    //存事中的taskid，补录给1好了，发放审核编号
    @TableField("EXTRA_")
    private String extra;

    //页码,可用于排序
    @TableField("NUM_")
    private Integer num;

    //文件名
    @TableField("FILENAME_")
    private String filename;

    /**
     * 版本号：记录方案变更版本;
     */
    @TableField("VERNUM_")
    private Integer verNum;

    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date cdate;

    public BizCanvas() {
    }

    public BizCanvas(String bizCode, String type, String extra, Date cdate) {
        this.bizCode = bizCode;
        this.type = type;
        this.extra = extra;
        this.cdate = cdate;
    }

    public String getBizCode() {
        return bizCode;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Integer getVerNum() {
        return verNum;
    }

    public void setVerNum(Integer verNum) {
        this.verNum = verNum;
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("bizCode", bizCode)
                .add("type", type)
                .add("extra", extra)
                .add("num", num)
                .add("filename", filename)
                .add("verNum", verNum)
                .add("cdate", cdate)
                .toString();
    }
}
