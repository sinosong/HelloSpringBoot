/**
 * 
 */
package com.hns.learn.mapper;

import com.baomidou.mybatisplus.plugins.Page;
import com.hns.learn.entity.BizDebtGrant;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 功能：债项发放申请
 * @author czm 
 * 日期：2018/7/6
 */
@Component
public interface BizDebtGrantMapper extends BaseMapper<BizDebtGrant>{


    /**
     * 流水联查，获取有效状态
     * @param mediumid
     * @return
     */
    List<Map> selEffectGrant(String mediumid);
}
