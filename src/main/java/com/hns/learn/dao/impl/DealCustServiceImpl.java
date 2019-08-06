package com.hns.learn.dao.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.hns.learn.entity.BizCust;
import com.hns.learn.entity.BizDebtSummary;
import com.hns.learn.entity.BizGuaranteeInfo;
import com.hns.learn.entity.BizTheRentFactoring;
import com.hns.learn.mapper.BizCustMapper;
import com.hns.learn.mapper.BizDebtMainMapper;
import com.hns.learn.mapper.BizGuaranteeInfoMapper;
import com.hns.learn.mapper.BizTheRentFactoringMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author : hannasong
 * @version : v1.0
 * @date : Created in 11:14 2019-08-06
 * @description : 调整业务表中的客户信息
 */
@Component
@SuppressWarnings({"DuplicatedCode"})
public class DealCustServiceImpl {

    @Autowired
    private BizCustMapper bizCustMapper;
    @Autowired
    private BizDebtMainMapper bizDebtMainMapper;
    @Autowired
    private BizGuaranteeInfoMapper bizGuaranteeInfoMapper;
    @Autowired
    private BizTheRentFactoringMapper bizTheRentFactoringMapper;
    @Autowired
    private PlatformTransactionManager txManager;

    /**
     * 方案主表(PROPOSER_NUM,PROPOSER)
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
    public void rebulidMain(){

        List<BizDebtSummary> bizDebtSummaryList = bizDebtMainMapper.selectList(new EntityWrapper<BizDebtSummary>());
        for(BizDebtSummary bizDebtSummary : bizDebtSummaryList){
            if(bizDebtSummary.getDebtCode().length()==13){
                BizCust cust = bizCustMapper.selectOne(new BizCust(bizDebtSummary.getProposerNum()));
                if(cust!=null){
                    if(!cust.getCustNameCN().equals(bizDebtSummary.getProposer()) && !"-136090000151486-136090000178601-".contains(bizDebtSummary.getProposerNum())){
                        System.out.println(cust.getCustNo()+"=="+bizDebtSummary.getProposer()+"-->"+cust.getCustNameCN());
                        bizDebtSummary.setProposer(cust.getCustNameCN());
                        int uRow = bizDebtMainMapper.updateById(bizDebtSummary);
                        if(uRow!=1){
                            throw new RuntimeException("update err! table= bizDebtMain,bizDebtMain="+bizDebtSummary.toString());
                        }
                    }else {
                        System.out.println("Customer information is consistent...");
                    }
                }else {
                    throw new RuntimeException("BizCust err! table= BizCust,BizCustNo="+bizDebtSummary.getProposerNum());
                }
            }else{
                throw new RuntimeException("BizDebtSummary err! table= bizDebtMain,bizDebtMain="+bizDebtSummary.toString());
            }
        }

    }

    /**
     * 担保信息表(GUARANTOR_CUST_ID,GUARANTOR)
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
    public void rebulidBizGuaranteeInfo(){

        List<BizGuaranteeInfo> bizGuaranteeInfoRuleList = bizGuaranteeInfoMapper.selectList(new EntityWrapper<BizGuaranteeInfo>());
        for(BizGuaranteeInfo bizGuaranteeInfo : bizGuaranteeInfoRuleList){
            if(bizGuaranteeInfo.getDebtCode().length()==13){
                BizCust cust = bizCustMapper.selectOne(new BizCust(bizGuaranteeInfo.getGuarantorCustId()));
                if(cust!=null){
                    bizGuaranteeInfo.setGuarantor(cust.getCustNameCN());
                    int uRow = bizGuaranteeInfoMapper.updateById(bizGuaranteeInfo);
                    if(uRow!=1){
                        throw new RuntimeException("update err! table= bizGuaranteeInfo,bizGuaranteeInfo="+bizGuaranteeInfo.toString());
                    }
                }else {
                    throw new RuntimeException("BizCust err! table= BizCust,BizCustNo="+bizGuaranteeInfo.getGuarantorCustId());
                }
            }else{
                throw new RuntimeException("BizGuaranteeInfo err! table= BIZ_GUARANTEE_INFO,bizGuaranteeInfo="+bizGuaranteeInfo.toString());
            }
        }

    }

    /**
     * 专有信息表中的客户信息(CUST_NO,CUST_NAME,CUST_TATING)
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
    public void rebulidBizTheRentFactoring(){

        List<BizTheRentFactoring> bizTheRentFactoringList = bizTheRentFactoringMapper.selectList(new EntityWrapper<BizTheRentFactoring>());
        for(BizTheRentFactoring bizTheRentFactoring : bizTheRentFactoringList){
            if(bizTheRentFactoring.getDebtCode().length()==13){
                BizCust cust = bizCustMapper.selectOne(new BizCust(bizTheRentFactoring.getCustNo()));
                if(cust!=null){
                    bizTheRentFactoring.setCustName(cust.getCustNameCN());
                    bizTheRentFactoring.setCustTating(cust.getCreditRating());
                    int uRow = bizTheRentFactoringMapper.updateById(bizTheRentFactoring);
                    if(uRow!=1){
                        throw new RuntimeException("update err! table= bizTheRentFactoring,bizTheRentFactoring="+bizTheRentFactoring.toString());
                    }
                }else {
                    throw new RuntimeException("BizCust err! table= BizCust,BizCustNo="+bizTheRentFactoring.getCustNo());
                }
            }else{
                throw new RuntimeException("BizTheRentFactoring err! table= BIZ_RENTAL_FACTORING_KEY,bizTheRentFactoring="+bizTheRentFactoring.toString());
            }
        }

    }

}
