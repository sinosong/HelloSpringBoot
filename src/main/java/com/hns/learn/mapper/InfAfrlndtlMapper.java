package com.hns.learn.mapper;

import com.baomidou.mybatisplus.plugins.Page;
import com.hns.learn.entity.InfAfrlndtl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component(value = "InfAfrlndtlMapper")
public interface InfAfrlndtlMapper extends BaseMapper<InfAfrlndtl> {


    List<Map> getEffectiveProtsenos(@Param("cm") Map<String, Object> param);

    /**
     * @Description: 联查核销表和贷款附表明细表
     * @Param: [param]
     * @return: java.util.Map
     */
    List<Map>  getAccrualList(Page page, @Param("cm") Map<String, Object> param);


    /**
     * @Description: 租金保理流水基础信息查询
     * @Param: [grantCode]
     * @return: java.util.Map
     */
    Map getBaseMessageInfo(@Param("grantCode") String grantCode);

    /**
     * @Description: 起息日区间内有效的协议号和介质识别号集合
     * @Param: [param] beginDate、endDate、grantCode（发放编号）、deptCode
     * @return: List
     */
    List<Map> getComprehensiveProtsenos(Page page, @Param("cm") Map<String, Object> param);


}
