package com.hns.learn.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.google.common.base.Objects;

import java.io.Serializable;
import java.util.Date;


@TableName("BIZ_FILE")
public class BizFile extends BaseModel implements Serializable {

    @TableField("BIZ_CODE")
    private String bizCode;

    @TableField("BIZ_TYPE")
    private String bizType;

    @TableField("PRODUCT_")
    private String product;

    @TableField("FIELD_NAME")
    private String fieldName;

    @TableField("FILE_NAME")
    private String fileName;

    @TableField("REAL_NAME")
    private String realName;

    @TableField("FILE_TYPE")
    private String fileType;

    @TableField("ISSUEDATE")
    private Date issueDate;

    @TableField("URL_")
    private String URL;

    @TableField("FILE_SIZE")
    private Long size_;

    @TableField("EXT_")
    private String ext;


    public BizFile() {
    }

    public String getBizCode() {
        return bizCode == "" ? null : bizCode;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

    public String getBizType() {
        return bizType == "" ? null : bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public String getProduct() {
        return product == "" ? null : product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getFieldName() {
        return fieldName == "" ? null : fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFileName() {
        return fileName == "" ? null : fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getRealName() {
        return realName == "" ? null : realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Date getIssueDate() { return issueDate; }

    public void setIssueDate(Date issueDate) { this.issueDate = issueDate; }

    public String getFileType() {
        return fileType == "" ? null : fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getURL() {
        return URL == "" ? null : URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public Long getSize_() {
        return size_;
    }

    public void setSize_(Long size_) {
        this.size_ = size_;
    }

    public String getExt() {
        return ext == "" ? null : ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this)
                .add("bizCode", bizCode)
                .add("bizType", bizType)
                .add("product", product)
                .add("fieldName", fieldName)
                .add("fileName", fileName)
                .add("realName", realName)
                .add("fileType", fileType)
                .add("issueDate", issueDate)
                .add("URL", URL)
                .add("size_", size_)
                .add("ext", ext)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BizFile)) return false;
        BizFile bizFile = (BizFile) o;
        return Objects.equal(getBizCode(), bizFile.getBizCode()) &&
                Objects.equal(getBizType(), bizFile.getBizType()) &&
                Objects.equal(getProduct(), bizFile.getProduct()) &&
                Objects.equal(getFieldName(), bizFile.getFieldName()) &&
                Objects.equal(getFileName(), bizFile.getFileName()) &&
                Objects.equal(getRealName(), bizFile.getRealName()) &&
                Objects.equal(getFileType(), bizFile.getFileType()) &&
                Objects.equal(getIssueDate(), bizFile.getIssueDate()) &&
                Objects.equal(getURL(), bizFile.getURL()) &&
                Objects.equal(getSize_(), bizFile.getSize_()) &&
                Objects.equal(getExt(), bizFile.getExt());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getBizCode(), getBizType(), getProduct(), getFieldName(), getFileName(), getRealName(), getFileType(),getIssueDate(), getURL(), getSize_(), getExt());
    }
}

