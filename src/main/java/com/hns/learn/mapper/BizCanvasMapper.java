package com.hns.learn.mapper;

import com.hns.learn.entity.BizCanvas;
import org.apache.ibatis.annotations.Param;

public interface BizCanvasMapper extends BaseMapper<BizCanvas> {

    /**
     * 获取截止日期所对应的最新workdate
     * @param endDate
     * @return
     */
    String getMaxWorkDate(@Param("endDate") String endDate);

}
