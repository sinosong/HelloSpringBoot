package com.hns.learn.dao.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.toolkit.IdWorker;
import com.hns.learn.entity.*;
import com.hns.learn.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author : hannasong
 * @version : v1.0
 * @date : Created in 15:14 2019-08-01
 * @description : 构建pts数据
 */
@Component
@SuppressWarnings({"DuplicatedCode"})
public class DealPtsServiceImpl {


    @Autowired
    private BizPTSMapper bizPtsMapper;
    @Autowired
    private BizDebtMainMapper bizDebtMainMapper;
    @Autowired
    private BizDebtGrantMapper bizDebtGrantMapper;
    @Autowired
    private BizCustTeMapper bizCustTeMapper;
    @Autowired
    private BizCustomerMapper bizCustomerMapper;
    @Autowired
    private BizSingleProductRuleMapper bizSingleProductRuleMapper;

    /**
     * INSERT INTO BIZ_PTS (ROL) VALUES ('APPT'); 方案申请人
     * INSERT INTO BIZ_PTS (ROL) VALUES ('LETS'); 用信主体
     * INSERT INTO BIZ_PTS (ROL) VALUES ('CONE'); 承租人
     * INSERT INTO BIZ_PTS (ROL) VALUES ('GUAR'); 担保人
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
    public void addDebtPts(){

        //1.更新BIZ_SIGLE_PRODUCT_RULE 的DEBT_CODE
        //2.将pts中的方案改为BIZ_SIGLE_PRODUCT_RULE

        Date date = new Date();

        List<BizDebtSummary> bizDebtSummaryList = bizDebtMainMapper.selectList(new EntityWrapper<BizDebtSummary>().isNull("VERNUM_"));

//        List<BizDebtSummary> debtList = new ArrayList<>();

        for(BizDebtSummary bizDebtSummary : bizDebtSummaryList){

            String custNo = bizDebtSummary.getProposerNum();

            BizCustTe selTe = bizCustTeMapper.selectOne(new BizCustTe(custNo.trim()));

            if(selTe==null){
                throw new RuntimeException("fetch bizCust error!");
            }else{
                //添加申请人 PTS
                BizPTS bizPts = new BizPTS();
                bizPts.setId(IdWorker.getId());
                bizPts.setBizId(bizDebtSummary.getId_());
                bizPts.setCustNo(bizDebtSummary.getProposerNum());
                bizPts.setCustNameCN(bizDebtSummary.getProposer());
                bizPts.setDebtCode(bizDebtSummary.getDebtCode());
                bizPts.setObjtyp("BIZ_DEBT_MAIN");
                bizPts.setObjinr(bizDebtSummary.getId_());
                bizPts.setRole("APPT");
                bizPts.setPtyinr(selTe.getCustNo());
                bizPts.setCreateTime(date);
                bizPts.setUpdateTime(date);
                bizPts.setCreateBy(bizDebtSummary.getBankTellerId());
                bizPts.setUpdateBy(bizDebtSummary.getBankTellerId());
                bizPts.setEnable(1);
                bizPts.setRemark("sinosong");
                System.out.println(bizPts.toString());
                /*int ip = bizPtsMapper.insert(bizPts);
                if(ip!=1){
                    throw new RuntimeException("insert bizPts error!bizPts="+bizPts.toString());
                }*/

                //添加用信主体 PTS
                String fullDebtCode = bizDebtSummary.getDebtCode()+bizDebtSummary.getVerNumStr();
                List<BizPTS> letsList = bizPtsMapper.selectList(new EntityWrapper<BizPTS>().eq("ROL","LETS").eq("DEBT_CODE",fullDebtCode));
                for (BizPTS let : letsList){
                    BizCustomer cmer = bizCustomerMapper.selectById(let.getObjinr());
                    if(cmer!=null){
                        BizSingleProductRule bizSingleProductRule = bizSingleProductRuleMapper.selectOne(new BizSingleProductRule(bizDebtSummary.getDebtCode()));
                        if(bizSingleProductRule!=null){
                            BizPTS letPts = new BizPTS();
                            letPts.setId(IdWorker.getId());
                            letPts.setBizId(bizDebtSummary.getId_());
                            letPts.setCustNo(let.getCustNo());
                            letPts.setCustNameCN(let.getCustNameCN());
                            letPts.setDebtCode(bizDebtSummary.getDebtCode());
                            letPts.setObjtyp("BIZ_SIGLE_PRODUCT_RULE");
                            letPts.setObjinr(bizSingleProductRule.getId_());
                            letPts.setRole("LETS");
                            letPts.setPtyinr(let.getCustNo());
                            letPts.setCreateTime(date);
                            letPts.setUpdateTime(date);
                            letPts.setCreateBy(bizDebtSummary.getBankTellerId());
                            letPts.setUpdateBy(bizDebtSummary.getBankTellerId());
                            letPts.setEnable(1);
                            letPts.setRemark("sinosong");
                            System.out.println(letPts.toString());
                        }else {
                            throw new RuntimeException("fetch bizSingleProductRule error!");
                        }
                    }else{
                        throw new RuntimeException("fetch BizCustomer error!");
                    }
                }


            }



        }
//        System.out.println(" debtList size()=="+debtList.size()+" list detail==");
//        System.out.println(JSON.toJSON(debtList));


    }

}
