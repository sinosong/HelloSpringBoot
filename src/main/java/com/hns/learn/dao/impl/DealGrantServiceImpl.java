package com.hns.learn.dao.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.hns.learn.entity.BizDebtGrant;
import com.hns.learn.mapper.BizDebtGrantMapper;
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
 * @date : Created in 10:55 2019-08-01
 * @description : 处理发放条件数据;
 */
@Component
public class DealGrantServiceImpl {

    @Autowired
    private BizDebtGrantMapper bizDebtGrantMapper;


    /**
     * 更新发放条件数据;
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
    public void updateGrant(){

        List<BizDebtGrant> bizDebtGrantList = bizDebtGrantMapper.selectList(new EntityWrapper<BizDebtGrant>().isNull("VERNUM_"));
        List<BizDebtGrant> grantList = new ArrayList<>();

        for(BizDebtGrant bizDebtGrant : bizDebtGrantList){

            if(bizDebtGrant.getGrantCode().length()==19){
                String debtcode = bizDebtGrant.getDebtCode();
                String grantcode = bizDebtGrant.getGrantCode();
                bizDebtGrant.setDebtCode(StringUtils.substring(debtcode,0,13));
                bizDebtGrant.setGrantCode(StringUtils.substring(grantcode,0,16));
                bizDebtGrant.setVerNum(Integer.parseInt(StringUtils.substring(grantcode,16)));
                bizDebtGrant.setChangeNum(0);
                bizDebtGrant.setSettleStatus(1);
                int umain = bizDebtGrantMapper.updateById(bizDebtGrant);
                if(umain!=1){
                    throw new RuntimeException("update err! table= bizDebtGrant,bizDebtGrant="+bizDebtGrant.toString());
                }
                grantList.add(bizDebtGrant);
            }
        }
        System.out.println(" grantList size()=="+grantList.size()+" list detail==");
        System.out.println(JSON.toJSON(grantList));

    }

}
