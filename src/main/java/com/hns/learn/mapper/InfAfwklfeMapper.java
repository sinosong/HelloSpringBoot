package com.hns.learn.mapper;


import com.hns.learn.entity.InfAfwklfe;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface InfAfwklfeMapper extends BaseMapper<InfAfwklfe> {

    List<String> getLnFeeNOList(@Param("protseno") String endDate,@Param("dueDate") Date dueDate);

}
