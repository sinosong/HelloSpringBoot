/**
 * 
 */
package com.hns.learn.mapper;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.hns.learn.entity.BizMakeLoans;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 功能：放款
 * @author czm 
 * 日期：2018/7/6
 */
@Component
public interface BizMakeLoansMapper extends BaseMapper<BizMakeLoans>{

}
