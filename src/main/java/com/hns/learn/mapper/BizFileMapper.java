package com.hns.learn.mapper;

import com.hns.learn.entity.BizFile;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface BizFileMapper extends BaseMapper<BizFile> {

}
