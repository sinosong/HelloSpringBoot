package com.hns.learn.mapper;


import com.hns.learn.entity.InfAfwklfe;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public interface InfAfwklfeMapper extends BaseMapper<InfAfwklfe> {

    List<String> getLnFeeNOList(@Param("protseno") String endDate,@Param("dueDate") Date dueDate);

    List<String> getTermnumList(@Param("protseno") String protseno,@Param("lnfeeno") String lnfeeno,@Param("dueDate") Date dueDate);

}
