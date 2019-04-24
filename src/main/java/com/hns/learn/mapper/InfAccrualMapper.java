package com.hns.learn.mapper;

import com.hns.learn.entity.InfAccrual;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;

@Mapper
@Component(value = "InfAccrualMapper")
public interface InfAccrualMapper extends BaseMapper<InfAccrual> {

    public List<InfAccrual> getAll();


    public List<Map> getAllMap();

}
