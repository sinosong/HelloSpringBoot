package com.hns.learn.mapper;

import com.hns.learn.entity.InfAfpcmem;
import org.apache.ibatis.annotations.Param;

/**
 * 功能：贷款合同文件表
 * @author hannasong
 */
public interface InfAfpcmemMapper extends BaseMapper<InfAfpcmem>{


    /**
     * 获取截止日期所对应的最新workdate
     * @param endDate
     * @return
     */
    String getMaxWorkDate(@Param("endDate") String endDate);

}
