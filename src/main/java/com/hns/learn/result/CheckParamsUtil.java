package com.hns.learn.result;

import com.hns.learn.exception.InputParamsException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.io.File;

/**
 * @author hannasong
 * 参数检查类
 */
@Component
public class CheckParamsUtil{

    public Boolean checkParams(String str) throws InputParamsException {

        if(StringUtils.isNotBlank(str)){
            try {
                if(StringUtils.isNotBlank(str)){
                    System.out.println(Float.valueOf(str).floatValue());
                }
            } catch (NumberFormatException cause) {
                throw new InputParamsException("输入的参数不能转化为浮点数！"+" input:"+str,cause);
            }
        }else{
            throw new InputParamsException("输入的参数不能为空！"+" input:"+str);
        }
        return true;
    }

}
