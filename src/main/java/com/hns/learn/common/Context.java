package com.hns.learn.common;

import com.google.common.base.MoreObjects;
import com.hns.learn.dao.State;

public class Context {

    private State state;

    private long num;

    private Long num2;

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public Context(){
        state = null;
    }

    public Long getNum2() {
        return num2;
    }

    public void setNum2(Long num2) {
        this.num2 = num2;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("state", state)
                .add("num", num)
                .add("num2", num2)
                .toString();
    }
}
