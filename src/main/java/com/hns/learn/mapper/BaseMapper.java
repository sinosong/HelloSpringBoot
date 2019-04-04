package com.hns.learn.mapper;

import com.hns.learn.entity.BaseModel;
import org.springframework.stereotype.Repository;

public interface BaseMapper<T extends BaseModel> extends com.baomidou.mybatisplus.core.mapper.BaseMapper<T>{}
