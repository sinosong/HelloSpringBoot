package com.hns.learn.mapper;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.hns.learn.entity.InfAccrual;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;

@Mapper
@Component(value = "InfAccrualMapper")
public interface InfAccrualMapper extends BaseMapper<InfAccrual> {

    public List<InfAccrual> getAll();


    public List<Map> getAllMap();

    /**
     * @Description: 联查核销表和贷款附表明细表
     * @Param: [param]
     * @return: java.util.Map
     */
    List<Map>  getAccrualList(Pagination page, @Param("cm")Map<String,Object> param);

}
