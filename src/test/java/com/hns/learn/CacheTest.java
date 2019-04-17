package com.hns.learn;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hns.learn.util.CodeListUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
@WebAppConfiguration
public class CacheTest {

    @Autowired
    private CodeListUtils codeListUtils;

    @Test
    public void testRedisJSON() {



    }

    @Cacheable(value = "Afrcdtl")
    public String initAfrcdtl(){

        JSONObject afrcdtlJO = new JSONObject();

        JSONObject listTypeJO = new JSONObject();
        String [] listTypeKeys = {"001","002","003","004","005","006","007","008","009","010","011","012","013","100","104","105","106",
                "107","108","109","110","111","112","113","114","115","116","117","118","119","120","121","122","123","124","125",
                "126","127","128","129","130","131","132","133","134","135"};
        String [] listTypeVals ={"联机发放","批量发放","联机提前归还","联机逾期归还","联机当期归还","批量正常扣款","批量逾期扣款","冲减利息",
                "批量计息","批量转逾期","停息利息收取","贷款费用收取","贷款利息收取","冲销","网内转移","转呆坏帐","呆坏帐核销","归还呆坏帐","转按揭结清",
                "网点卖出","跨地区网点撤并转出,","跨地区网点撤并转入,","批量提前还款","账户合并销户","账户合并入账","联机销户","批量销户","利息资本化",
                "重组发放","借新还旧","其他发放","重组归还","借新还旧","以资抵债","其他归还","产品修改","费用资本化","利息本金化","调整利息",
                "贷款账户拆分销户","贷款账户拆分入账","减值","开立保函","取消保函","贷款售卖","贷款赎回"};

        for (int i = 0; i < listTypeKeys.length; i++) {
            listTypeJO.put(listTypeKeys[i],listTypeVals[i]);
        }

        afrcdtlJO.put("LISTTYPE",listTypeJO);

        return JSON.toJSONString(afrcdtlJO);
    }

    @Test
    public void getCodeLabel(){

        String tableName = "AFRCDTL";
        String columnName = "LISTTYPE";

        System.out.println(codeListUtils.getCodeLabel(tableName,columnName,"001"));
        System.out.println(codeListUtils.getCodeLabel(tableName,columnName,"002"));
        System.out.println(codeListUtils.getCodeLabel(tableName,columnName,"001"));
        System.out.println(codeListUtils.getCodeLabel(tableName,columnName,"001"));
        System.out.println(codeListUtils.getCodeLabel(tableName,columnName,"001"));
        System.out.println(codeListUtils.getCodeLabel(tableName,columnName,"001"));
        System.out.println(codeListUtils.getCodeLabel(tableName,columnName,"001"));
        System.out.println(codeListUtils.getCodeLabel("AFWKLFE","FEECLASS","0"));
        System.out.println(codeListUtils.getCodeLabel("AFWKLFE","FEECLASS","0"));

    }




}
