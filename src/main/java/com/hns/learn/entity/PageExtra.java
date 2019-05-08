package com.hns.learn.entity;

import com.baomidou.mybatisplus.plugins.Page;
import com.google.common.base.MoreObjects;

import java.util.Map;

/**
 * 带额外参数的分页对象
 * @author hannasong
 * @param <T>
 */
public class PageExtra<T> extends Page<T> {

    private Map extra;

    public PageExtra() {
        super();
    }

    public PageExtra(Map extra) {
        super();
        this.extra = extra;
    }

    public PageExtra(int current, int size, Map extra) {
        super(current, size);
        this.extra = extra;
    }

    public PageExtra(int current, int size, String orderByField, Map extra) {
        super(current, size, orderByField);
        this.extra = extra;
    }

    public PageExtra(int current, int size, String orderByField, boolean isAsc, Map extra) {
        super(current, size, orderByField, isAsc);
        this.extra = extra;
    }

    public Map getExtra() {
        return extra;
    }

    public void setExtra(Map extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {

        return MoreObjects.toStringHelper(this)
                .add("PageExtra==", super.toString())
                .add(",extra", extra)
                .toString();
    }
}
