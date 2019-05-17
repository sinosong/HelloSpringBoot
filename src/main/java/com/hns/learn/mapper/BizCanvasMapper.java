package com.hns.learn.mapper;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.hns.learn.entity.BizCanvas;
import com.hns.learn.entity.BizDebtGrant;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component(value = "BizCanvasMapper")
public interface BizCanvasMapper extends BaseMapper<BizCanvas> {

    /**
     * 获取截止日期所对应的最新workdate
     * @param endDate
     * @return
     */
    String getMaxWorkDate(@Param("endDate") String endDate);

    List<Map> selEffectGrant(String mediumid);


    List<Map> selTables(String tableName);

    List<Map> selectGrantInfo(@Param("cm") Map<String, Object> params);

}
