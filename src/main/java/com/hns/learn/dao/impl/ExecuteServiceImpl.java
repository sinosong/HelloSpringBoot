package com.hns.learn.dao.impl;

import com.hns.learn.dao.IExecuteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service("defaultExecuteService")
public class ExecuteServiceImpl implements IExecuteService {

    protected static  final Logger logger = LogManager.getLogger();

    @Autowired
    private PlatformTransactionManager txManager;
    @Autowired
    private DealMainServiceImpl dealMainServiceImpl;
    @Autowired
    private DealTrnServiceImpl dealTrnServiceImpl;
    @Autowired
    private DealGrantServiceImpl dealGrantServiceImpl;
    @Autowired
    private DealPtsServiceImpl dealPtsServiceImpl;

    @Override
    public void execute() {

        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        def.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);
        TransactionStatus status = txManager.getTransaction(def);

        try {

            //1.处理方案的主表数据；update
            dealMainServiceImpl.updateDebtMain();

            //2.生成方案流水；insert
            dealTrnServiceImpl.createMainTrnAndAppr();

            //3.更新发放条件数据; update
            dealGrantServiceImpl.updateGrant();

            //4.生成发放条件流水；insert
            dealTrnServiceImpl.createGrantTrnAndAppr();

            //5.将 bizCust表中的主键调整为客户号 update BIZ_CUST c set c.ID_ = c.CUST_NO;

            //TODO 最先执行
            //6.debtCode调整为13位: update BIZ_SIGLE_PRODUCT_RULE s set s.DEBT_CODE = substr(s.DEBT_CODE,0,13);
            //7.debtCode调整为13位: update BIZ_GUARANTEE_INFO s set s.DEBT_CODE = substr(s.DEBT_CODE,0,13);
            //8.debtCode调整为13位: update BIZ_RENTAL_FACTORING_KEY s set s.DEBT_CODE = substr(s.DEBT_CODE,0,13);

            //byDesign (不处理输入有误的用户信息) 9.修复客户信息（以最新的生产数据为准） 方案主表(PROPOSER_NUM,PROPOSER)、担保信息表(GUARANTOR_CUST_ID,GUARANTOR)、专有信息表中的客户信息(CUST_NO,CUST_NAME,CUST_TATING)
//            dealCustServiceImpl.rebulidMain();
//            dealCustServiceImpl.rebulidBizGuaranteeInfo();
//            dealCustServiceImpl.rebulidBizTheRentFactoring();
            //10.构建pts




//            txManager.commit(status);

        } catch (Exception e) {
//            txManager.rollback(status);
            e.printStackTrace();
        } finally {
            System.out.println("end......");
            txManager.rollback(status);

        }

    }
}
