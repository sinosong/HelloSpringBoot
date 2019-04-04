package com.hns.learn.dao.impl;

import com.hns.learn.dao.IExecuteService;
import com.hns.learn.mapper.BizCanvasMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

@Service("defaultExecuteService")
@Transactional
public class ExecuteServiceImpl implements IExecuteService {

    @Autowired
    private PlatformTransactionManager txManager;
    @Autowired
    private BizCanvasServiceImpl bizCanvasDao;
    @Autowired
    private BizCanvasMapper bizCanvasMapper;

    @Override
    public void execute() {

        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        def.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);
        TransactionStatus status = txManager.getTransaction(def);

        try {



            txManager.commit(status);
        } catch (Exception e) {
            txManager.rollback(status);
            e.printStackTrace();
        } finally {
            System.out.println("end......");
        }

    }
}
