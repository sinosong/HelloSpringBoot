package com.hns.learn.mapper;

import com.hns.learn.entity.BizContractCollateral;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author sinosong
 */
@Component
public interface BizContractCollateralMapper extends BaseMapper<BizContractCollateral> {

    /**
     * 根据方案编号查询合同信息
     * @param debtCode
     * @return
     */
    List<BizContractCollateral> findByDebtCode(String debtCode);

}
