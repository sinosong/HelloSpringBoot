package com.hns.learn.mapper;

import com.hns.learn.entity.InfAfrlndtl;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component(value = "InfAfrlndtlMapper")
public interface InfAfrlndtlMapper extends BaseMapper<InfAfrlndtl> {



}
