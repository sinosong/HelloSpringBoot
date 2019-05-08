package com.hns.learn.mapper;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.hns.learn.entity.InfComprehensive;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component(value = "InfComprehensiveMapper")
public interface InfComprehensiveMapper extends BaseMapper<InfComprehensive> {

    public List<InfComprehensive> getAll(Pagination page, @Param("cm")Map<String,Object> param);


    public List<Map> getAllMap();

}
