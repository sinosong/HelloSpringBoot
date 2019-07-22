package com.hns.learn.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.google.common.base.MoreObjects;
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
        return bizCode;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public String getURL() {
        return URL;
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
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BizFile bizFile = (BizFile) o;
        return Objects.equal(bizCode, bizFile.bizCode) &&
                Objects.equal(bizType, bizFile.bizType) &&
                Objects.equal(product, bizFile.product) &&
                Objects.equal(fieldName, bizFile.fieldName) &&
                Objects.equal(fileName, bizFile.fileName) &&
                Objects.equal(realName, bizFile.realName) &&
                Objects.equal(fileType, bizFile.fileType) &&
                Objects.equal(issueDate, bizFile.issueDate) &&
                Objects.equal(URL, bizFile.URL) &&
                Objects.equal(size_, bizFile.size_) &&
                Objects.equal(ext, bizFile.ext);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(bizCode, bizType, product, fieldName, fileName, realName, fileType, issueDate, URL, size_, ext);
    }

    @Override
    public String
    toString() {
        return MoreObjects.toStringHelper(this)
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
}

