package com.hns.learn.mapper;

import com.hns.learn.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
public interface SysUserMapper extends BaseMapper<SysUser> {

}
