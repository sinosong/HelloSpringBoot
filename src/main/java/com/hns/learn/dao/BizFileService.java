package com.hns.learn.dao;

import java.util.concurrent.CountDownLatch;

public interface BizFileService {


    /**
     *  size - 1；
     * @param id
     */
    void subtract(long id, CountDownLatch countDownLatcher);

}
