package com.hns.learn.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: 接口返回结果类
 * @Author: dj
 * @CreateDate: 2018-12-13
 */
@TableName("BIZ_INTERFACE_RESULT")
@SuppressWarnings("serial")
public class BizInterfaceResult extends BaseModel implements Serializable {

    /**
     * 发放条件编号
     */
    @TableField("TRADE_CODE")
    private String tradeCode;

    /**
     * 发放条件编号变更码
     */
    @TableField("TRADE_CODEVERNUM")
    private String tradeCodeVerNum;

    /**
     * 接口名称
     */
    @TableField("INTERFACE_NAME")
    private String interfaceName;

    /**
     * 接口请求时间
     */
    @TableField("REQUEST_TIME")
    private Date requestTime;

    /**
     * 接口请求参数
     */
    @TableField("REQUEST_PARAMS")
    private String requestParams;

    /**
     * 接口响应信息
     */
    @TableField("RESPONSE_INFO")
    private String responseInfo;

    /**
     * 接口响应时间
     */
    @TableField("RESPONSE_TIME")
    private Date responseTime;

    /**
     * 接口响应状态(1成功;0失败)
     */
    @TableField("RESPONSE_STATUS")
    private String responseStatus;

    /**
     * 接口响应错误信息
     */
    @TableField("RESPONSE_ERRORMSG")
    private String responseErrorMsg;

    public String getTradeCode() {
        return tradeCode == "" ? null : tradeCode;
    }

    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode;
    }

    public String getTradeCodeVerNum() {
        return tradeCodeVerNum == "" ? null : tradeCodeVerNum;
    }

    public void setTradeCodeVerNum(String tradeCodeVerNum) {
        this.tradeCodeVerNum = tradeCodeVerNum;
    }

    public String getInterfaceName() {
        return interfaceName == "" ? null : interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    public String getRequestParams() {
        return requestParams == "" ? null : requestParams;
    }

    public void setRequestParams(String requestParams) {
        this.requestParams = requestParams;
    }

    public String getResponseInfo() {
        return responseInfo == "" ? null : responseInfo;
    }

    public void setResponseInfo(String responseInfo) {
        this.responseInfo = responseInfo;
    }

    public Date getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(Date responseTime) {
        this.responseTime = responseTime;
    }

    public String getResponseStatus() {
        return responseStatus == "" ? null : responseStatus;
    }

    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getResponseErrorMsg() {
        return responseErrorMsg == "" ? null : responseErrorMsg;
    }

    public void setResponseErrorMsg(String responseErrorMsg) {
        this.responseErrorMsg = responseErrorMsg;
    }

    public BizInterfaceResult(String tradeCode, String tradeCodeVerNum, String interfaceName, Date requestTime, String requestParams, String responseInfo, Date responseTime, String responseStatus, String responseErrorMsg) {
        this.tradeCode = tradeCode;
        this.tradeCodeVerNum = tradeCodeVerNum;
        this.interfaceName = interfaceName;
        this.requestTime = requestTime;
        this.requestParams = requestParams;
        this.responseInfo = responseInfo;
        this.responseTime = responseTime;
        this.responseStatus = responseStatus;
        this.responseErrorMsg = responseErrorMsg;
    }

    public BizInterfaceResult(Long id , String tradeCode, String tradeCodeVerNum, String interfaceName, Date requestTime, String requestParams) {
        this.setId(id);
        this.tradeCode = tradeCode;
        this.tradeCodeVerNum = tradeCodeVerNum;
        this.interfaceName = interfaceName;
        this.requestTime = requestTime;
        this.requestParams = requestParams;
    }

    public BizInterfaceResult(Long id , String responseInfo, Date responseTime, String responseErrorMsg) {
        this.setId(id);
        this.responseInfo = responseInfo;
        this.responseTime = responseTime;
        this.responseErrorMsg = responseErrorMsg;
    }

    public BizInterfaceResult(Long id , String responseStatus) {
        this.setId(id);
        this.responseStatus = responseStatus;
    }


    public BizInterfaceResult() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BizInterfaceResult)) return false;
        BizInterfaceResult that = (BizInterfaceResult) o;
        return Objects.equal(getTradeCode(), that.getTradeCode()) &&
                Objects.equal(getTradeCodeVerNum(), that.getTradeCodeVerNum()) &&
                Objects.equal(getInterfaceName(), that.getInterfaceName()) &&
                Objects.equal(getRequestTime(), that.getRequestTime()) &&
                Objects.equal(getRequestParams(), that.getRequestParams()) &&
                Objects.equal(getResponseInfo(), that.getResponseInfo()) &&
                Objects.equal(getResponseTime(), that.getResponseTime()) &&
                Objects.equal(getResponseStatus(), that.getResponseStatus()) &&
                Objects.equal(getResponseErrorMsg(), that.getResponseErrorMsg());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getTradeCode(), getTradeCodeVerNum(), getInterfaceName(), getRequestTime(), getRequestParams(), getResponseInfo(), getResponseTime(), getResponseStatus(), getResponseErrorMsg());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("tradeCode", tradeCode)
                .add("tradeCodeVerNum", tradeCodeVerNum)
                .add("interfaceName", interfaceName)
                .add("requestTime", requestTime)
                .add("requestParams", requestParams)
                .add("responseInfo", responseInfo)
                .add("responseTime", responseTime)
                .add("responseStatus", responseStatus)
                .add("responseErrorMsg", responseErrorMsg)
                .toString();
    }
}
