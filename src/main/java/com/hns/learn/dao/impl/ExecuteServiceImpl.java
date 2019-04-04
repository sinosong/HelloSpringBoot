package com.hns.learn.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hns.learn.dao.IExecuteService;
import com.hns.learn.entity.BizCanvas;
import com.hns.learn.mapper.BizCanvasMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("defaultExecuteService")
@Transactional
public class ExecuteServiceImpl implements IExecuteService {

    @Autowired
    private BizCanvasServiceImpl bizCanvasDao;
    @Autowired
    private BizCanvasMapper bizCanvasMapper;

    @Override
    public void execute() {

        System.out.println("execute***********************");
        BizCanvas sel = new BizCanvas();
        sel.setId(1120992891767480321L);
        Wrapper<BizCanvas> queryWrapper = new QueryWrapper<>(sel);
//        BizCanvas res =bizCanvasDao.getOne(queryWrapper);
        System.out.println("Mapper=="+bizCanvasMapper.selectOne(queryWrapper).toString());
        System.out.println("Dao=="+bizCanvasDao.getOne(queryWrapper).toString());

    }
}
