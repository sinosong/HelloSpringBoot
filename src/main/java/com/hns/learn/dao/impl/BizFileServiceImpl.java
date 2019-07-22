package com.hns.learn.dao.impl;

import com.hns.learn.annotation.RedissonLock;
import com.hns.learn.dao.BizFileService;
import com.hns.learn.entity.BizFile;
import com.hns.learn.mapper.BizFileMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BizFileServiceImpl implements BizFileService {

    @Autowired
    public BizFileMapper bizFileMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    @RedissonLock(lockIndex = 0)
    public void subtract(long id){

        BizFile bizFile = bizFileMapper.selectById(id);
        if(bizFile == null){
            throw new RuntimeException("bizFile is null! id_=="+id);
        }
        if(bizFile.getUpdateBy() > 0){
            bizFile.setUpdateBy(bizFile.getUpdateBy() - 1);
            bizFileMapper.updateById(bizFile);
        }else {
         throw new RuntimeException("sold out...");
        }
    }

}
