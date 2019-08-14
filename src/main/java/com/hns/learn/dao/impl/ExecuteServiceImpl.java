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
            /*
                6.debtCode调整为13位:
                 update BIZ_SIGLE_PRODUCT_RULE s set s.DEBT_CODE = substr(s.DEBT_CODE,0,13);
                7.debtCode调整为13位:
                 update BIZ_GUARANTEE_INFO s set s.DEBT_CODE = substr(s.DEBT_CODE,0,13);
                8.debtCode调整为13位:
                 update BIZ_RENTAL_FACTORING_KEY s set s.DEBT_CODE = substr(s.DEBT_CODE,0,13);
                9.PTS调整方案号、添加客户号及客户名称、修改成为cust中的主键
                 update BIZ_PTS s set s.DEBT_CODE = substr(s.DEBT_CODE,0,13);
                 update BIZ_PTS s
                        set s.CUST_NO = (select m.CUST_NO from BIZ_CUSTOMER m where m.ID_=s.PTYINR),
                            s.CUST_NAME_CN = (select m.CUST_NAME_CN from BIZ_CUSTOMER m where m.ID_=s.PTYINR);
                 update BIZ_PTS p
                        set p.PTYINR = (select c.ID_ from BIZ_CUST c where p.CUST_NO=c.CUST_NO);
               10.BIZ_PRODUCT_LINESTYPE
                 update BIZ_PRODUCT_LINESTYPE s set s.DEBT_CODE = substr(s.DEBT_CODE,0,13);
               11.BIZ_CREDIT_LINES
                 update BIZ_CREDIT_LINES s set s.DEBT_CODE = substr(s.DEBT_CODE,0,13);
               12.BIZ_CONTRACT_COLLATERAL
                 update BIZ_CONTRACT_COLLATERAL s set s.DEBT_CODE = substr(s.DEBT_CODE,0,13);
            */

            /*  调整码表
                update BIZ_GUARANTEE_INFO if
                set TYPE_POINT = 'C101' where TYPE_POINT='3';
                update BIZ_GUARANTEE_INFO if
                set TYPE_POINT = 'C102' where TYPE_POINT='1';
                update BIZ_GUARANTEE_INFO if
                set TYPE_POINT = 'C103' where TYPE_POINT='2';
                update BIZ_GUARANTEE_INFO if
                set TYPE_POINT = 'C104' where TYPE_POINT='5';
                update BIZ_GUARANTEE_INFO if
                set TYPE_POINT = 'C000' where TYPE_POINT='4';

                update BIZ_GUARANTEE_INFO set GUARANTEE_CONTRACT_TYPE = 'UE02' where GUARANTEE_CONTRACT_TYPE='11';
                update BIZ_GUARANTEE_INFO set GUARANTEE_CONTRACT_TYPE = 'UE06' where GUARANTEE_CONTRACT_TYPE='12';
                update BIZ_GUARANTEE_INFO set GUARANTEE_CONTRACT_TYPE = 'UE04' where GUARANTEE_CONTRACT_TYPE='21';
                update BIZ_GUARANTEE_INFO set GUARANTEE_CONTRACT_TYPE = 'UE15' where GUARANTEE_CONTRACT_TYPE='22';
                update BIZ_GUARANTEE_INFO set GUARANTEE_CONTRACT_TYPE = 'UE03' where GUARANTEE_CONTRACT_TYPE='23';
                update BIZ_GUARANTEE_INFO set GUARANTEE_CONTRACT_TYPE = 'UE14' where GUARANTEE_CONTRACT_TYPE='24';
                update BIZ_GUARANTEE_INFO set GUARANTEE_CONTRACT_TYPE = 'UE01' where GUARANTEE_CONTRACT_TYPE='31';
                update BIZ_GUARANTEE_INFO set GUARANTEE_CONTRACT_TYPE = 'UE05' where GUARANTEE_CONTRACT_TYPE='32';
                update BIZ_GUARANTEE_INFO set GUARANTEE_CONTRACT_TYPE = '0001' where GUARANTEE_CONTRACT_TYPE='41';
                update BIZ_GUARANTEE_INFO set GUARANTEE_CONTRACT_TYPE = '0007' where GUARANTEE_CONTRACT_TYPE='42';
                update BIZ_GUARANTEE_INFO set GUARANTEE_CONTRACT_TYPE = '0003' where GUARANTEE_CONTRACT_TYPE='43';
                update BIZ_GUARANTEE_INFO set GUARANTEE_CONTRACT_TYPE = '0002' where GUARANTEE_CONTRACT_TYPE='44';
                update BIZ_GUARANTEE_INFO set GUARANTEE_CONTRACT_TYPE = '0004' where GUARANTEE_CONTRACT_TYPE='45';
                update BIZ_GUARANTEE_INFO set GUARANTEE_CONTRACT_TYPE = 'UE20' where GUARANTEE_CONTRACT_TYPE in ('保证合同','应收账款转让登记协议','担保确认函','回购担保');
                update BIZ_GUARANTEE_INFO set GUARANTEE_CONTRACT_TYPE = null where GUARANTEE_CONTRACT_TYPE='46';

                --删除重复数据
                --合同表
                delete from BIZ_CONTRACT_COLLATERAL where ID_ in
                             ('1074583022757679107','1074583493685743619','1074583162079875075','1075997790760538117',
                              '1074585043095195649','1075997790710206466','1074583161987600386','1074585042960977922',
                              '1074583493601857538','1076062324443516930','1070967264693653507','1070964915631755267','1070965027573534722');
                --担保信息表
                delete from BIZ_GUARANTEE_INFO info where (info.DEBT_CODE,info.WARRANTY_CONTRACT_NUMBER)
                    in (select DEBT_CODE,WARRANTY_CONTRACT_NUMBER from BIZ_GUARANTEE_INFO group by DEBT_CODE,WARRANTY_CONTRACT_NUMBER having count(*) > 1)
                    and rowid not in (select min(rowid) from BIZ_GUARANTEE_INFO group by DEBT_CODE,WARRANTY_CONTRACT_NUMBER having count(*)>1);


            */

            //todo 合同表要通过合同编号 t.WARRANTY_CONTRACT_NUMBER = c.GUAR_NO 做关联，若无相关联的合同表，将会影响押品的引入 包含抵押与质押 以下sql
            // where t.TYPE_POINT in ('C102','C103')
            // and t.GUARANTEE_CONTRACT_TYPE not in(
            //    'UE06','UE14','UE15','MJMCC102','MJM1C103','MJM2C103')



            //byDesign (不处理输入有误的用户信息) 9.修复客户信息（以最新的生产数据为准） 方案主表(PROPOSER_NUM,PROPOSER)、担保信息表(GUARANTOR_CUST_ID,GUARANTOR)、专有信息表中的客户信息(CUST_NO,CUST_NAME,CUST_TATING)
//            dealCustServiceImpl.rebulidMain();
//            dealCustServiceImpl.rebulidBizGuaranteeInfo();
//            dealCustServiceImpl.rebulidBizTheRentFactoring();

            //10.构建pts
            dealPtsServiceImpl.addDebtPts();
            dealPtsServiceImpl.addBizTheRentFactoringPts();
            dealPtsServiceImpl.addBizGuaranteeInfoPts();

            //构建发放条件相关业务表
                // 1.BIZ_GUARANTEE_RESULT（GUARAN_TYPE --> 真正type,新增id存原担保信息id）update BIZ_GUARANTEE_RESULT r set r.GUARAN_TYPE2 = r.GUARAN_TYPE
                // 2.BIZ_CONTRACT_COLLATERAL合同表必须有数据
                // BIZ_CONTRACT_COLLATERAL 表中的 GUAR_ID 是 BIZ_GUARANTEE_RESULT 的 ID



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
