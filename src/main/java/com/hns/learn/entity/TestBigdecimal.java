package com.hns.learn.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.google.common.base.MoreObjects;

import java.math.BigDecimal;

public class TestBigdecimal {

    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue,deserializeUsing = SimpleVauleSerializer.class)
    private BigDecimal amt;

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("amt", amt)
                .toString();
    }
}
