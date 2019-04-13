package com.hns.learn.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hns.learn.entity.InfAfrlndtl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component(value = "InfAfrlndtlMapper")
public interface InfAfrlndtlMapper extends BaseMapper<InfAfrlndtl> {


    List<Map> getEffectiveProtsenos ( @Param("cm") Map<String, Object> param);

    /**
     * @Description: 联查核销表和贷款附表明细表
     * @Param: [param]
     * @return: java.util.Map
     */
    List<Map>  getAccrualList(Page page, @Param("cm")Map<String,Object> param);


}
