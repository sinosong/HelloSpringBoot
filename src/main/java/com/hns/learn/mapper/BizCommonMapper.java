package com.hns.learn.mapper;

import com.hns.learn.entity.BizCust;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component
public interface BizCommonMapper extends BaseMapper<BizCust> {

    /**
     * BIZ_CUSTOMER
     * @param params
     * @return
     */
    List<LinkedHashMap> selBizCustomer(@Param("cm") Map<String, Object> params);


}
