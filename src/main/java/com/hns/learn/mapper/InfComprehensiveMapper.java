package com.hns.learn.mapper;

import com.hns.learn.entity.InfComprehensive;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component(value = "InfComprehensiveMapper")
public interface InfComprehensiveMapper extends BaseMapper<InfComprehensive> {

    public List<InfComprehensive> getAll();


    public List<Map> getAllMap();

}
