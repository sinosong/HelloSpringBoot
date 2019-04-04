package com.hns.learn.dao.impl;

import com.hns.learn.common.Context;
import com.hns.learn.dao.State;

public class StartState implements State {


    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Start State";
    }

}
