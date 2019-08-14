package com.hns.learn.mapper;

import com.hns.learn.entity.BizGuaranteeInfo;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author sinosong
 */
@Component
public interface BizGuaranteeInfoMapper extends BaseMapper<BizGuaranteeInfo> {

    /**
     * 获取抵质押类型的担保信息；
     * @return 需要展示引入押品的担保信息 集合
     */
    List<Map<String,String>> queryBizGuaranteeInfos();

    /**
     * 获取全部合同编号； 集合
     */
    List<String> queryBizGuaranteeInfoWarrantyContractNumber();

    /**
     * 根据方案编号查询担保信息
     * @param debtCode
     * @return
     */
    List<BizGuaranteeInfo> findByDebtCode(String debtCode);

    /**
     * 根据方案编号查询担保信息
     * @param debtCode
     * @return
     */
    List<BizGuaranteeInfo> findByDebtCodeAndGuarNo(String debtCode,String guarNo);


    /**
     * 获取担保信息的条数
     * @param debtCode
     * @return
     */
    int getGuarInfoCount(String debtCode);

}
