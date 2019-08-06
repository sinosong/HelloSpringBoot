package com.hns.learn.dao.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.hns.learn.entity.BizDebtSummary;
import com.hns.learn.mapper.BizDebtMainMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : hannasong
 * @version : v1.0
 * @date : Created in 10:54 2019-08-01
 * @description : 处理方案相关数据;
 */
@Component
public class DealMainServiceImpl {

    @Autowired
    private BizDebtMainMapper bizDebtMainMapper;



    /**
     * 处理方案的主表数据；update
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
    public void updateDebtMain(){

        List<BizDebtSummary> bizDebtSummaryList = bizDebtMainMapper.selectList(new EntityWrapper<BizDebtSummary>().isNull("VERNUM_"));

        List<BizDebtSummary> debtList = new ArrayList<>();

        for(BizDebtSummary bizDebtSummary : bizDebtSummaryList){

            if(bizDebtSummary.getDebtCode().length()==16){

                String debtcode = bizDebtSummary.getDebtCode();
                bizDebtSummary.setDebtCode(StringUtils.substring(debtcode,0,13));
                bizDebtSummary.setVerNum(Integer.parseInt(StringUtils.substring(debtcode,13)));

                int umain = bizDebtMainMapper.updateById(bizDebtSummary);
                if(umain!=1){
                    throw new RuntimeException("update err! table= bizDebtMain,bizDebtMain="+bizDebtSummary.toString());
                }
                debtList.add(bizDebtSummary);
            }

        }
        System.out.println(" debtList size()=="+debtList.size()+" list detail==");
        System.out.println(JSON.toJSON(debtList));

    }


}
