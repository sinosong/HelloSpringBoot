package com.hns.learn.dao.impl;

import com.hns.learn.common.Context;
import com.hns.learn.dao.State;

public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Stop State";
    }

}
