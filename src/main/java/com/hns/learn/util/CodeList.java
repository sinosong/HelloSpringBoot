package com.hns.learn.util;

import com.alibaba.fastjson.JSONObject;
import com.hns.learn.annotation.CodeLabel;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Component
public class CodeList {

    @CodeLabel(value = "AFRCDTL")
    public JSONObject initAfrcdtl(){

        JSONObject afrcdtlJO = new JSONObject();

        //明细性质LISTTYPE
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

        //简要注释NOTETYPE
        JSONObject noteTypeJO = new JSONObject();
        String [] noteTypeKeys = {"0","1","10","11","12","13","14","15","16","17","18","19","2","20","21","22","23","24","25","26","27",
                "28","29","3","30","32","33","34","35","36","37","38","39","4","40","41","42","43","44","5","6","7","8","9","997","998","999"};
        String [] noteTypeVals = {"打折处理专用","新開戶","歸還貸款本金","歸還貸款利息","反交易","冲正","補賬","ATM轉賬存入/支出(+/-)","ATM現金存入/支出(+/-)",
                "銀聯咭終端機交易（含卡消费等）","匯款","網銀","現金存入/支出(+/-)","利息","收費(含卡年费、小额账户收费、不动户账户收费、透支收费、对账单收费、欠费追缴等）",
                "稅","他行票退票","貸款發放","常行指示（含余额调剂等）","凍結支付","保留支付","承前頁","合併項(+/-)","轉賬存入/支出(+/-)","當前結餘","自动转存明细",
                "本行交換票退票","本行交換票扣賬","贷款转逾期","贷款欠息转表外","贷款逾期本金核销","贷款表内欠息核销","贷款表外欠息核销","他行票存入","归还已核销贷款",
                "贷款欠息转表内","结息","付息","贷款归还","銷戶","薪金自動入賬","批量代收水費","批量代收電費","批量代收通訊費","反交易","承前頁","存折或者对帐单打印代理业务协议表中的代理业务种类简称信息"};
        for (int i = 0; i < noteTypeKeys.length; i++) {
            listTypeJO.put(noteTypeKeys[i],noteTypeVals[i]);
        }


        afrcdtlJO.put("LISTTYPE",listTypeJO);
        afrcdtlJO.put("NOTETYPE",noteTypeJO);
        return afrcdtlJO;
    }

    @CodeLabel(value = "AFWKLFE")
    public JSONObject initAfwklfe(){

        JSONObject afwklfeJO = new JSONObject();
        //费用类型FEECLASS
        JSONObject feeClassJO = new JSONObject();
        String [] feeClassKeys = {"0","1","2"};
        String [] feeClassVals = {"一次性","按周期","不规则"};
        for (int i = 0; i < feeClassKeys.length; i++) {
            feeClassJO.put(feeClassKeys[i],feeClassVals[i]);
        }

        afwklfeJO.put("FEECLASS",feeClassJO);
        return afwklfeJO;
    }

    @Cacheable(value="codeKey")
    public JSONObject initCodeLabel(String tableName){
        try {
            Class clazz  = getClass();
            JSONObject jo = null;
            Method[] methods = clazz.getDeclaredMethods();
            for(Method method : methods){
                if(method.isAnnotationPresent(CodeLabel.class)){
                    CodeLabel label = method.getAnnotation(CodeLabel.class);
                    if(label.value().equals(tableName)){
                        return (JSONObject)method.invoke(this);
                    }
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

}
