package com.hns.learn;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hns.learn.entity.enums.AccrualExportEnum;
import com.hns.learn.entity.enums.FetchOccurredEnum;
import com.hns.learn.mapper.InfAfrlndtlMapper;
import com.hns.learn.util.ExcelUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SQlTest {

    @Autowired
    private InfAfrlndtlMapper infAfrlndtlMapper;

    @Test
    public void SqlTest() {

        Page page = new Page(1,5);
        Map selMap = new HashMap();

//        List<Map> protsenosList =  infAfrlndtlMapper.getEffectiveProtsenos(selMap);

        List bookList = new ArrayList();

//        page.setAsc("WORKDATE", "PROTSENO", "LISTNO");
//        System.out.println(infAfrlndtlMapper.getAccrualList(page,selMap));
//        System.out.println(infAfrlndtlMapper.getComprehensiveProtsenos(page,selMap));


        /*for(Map map : protsenosList){

            System.out.println(infAfrlndtlMapper.getAccrualList(page,selMap));
            System.out.println("*******");

        }
*/
        List list = infAfrlndtlMapper.getAccrualList(page,selMap);
        page.setRecords(list);
        System.out.println(JSON.toJSONString(page));
        System.out.println("--------------------");
        System.out.println("当前页数：" + page.getCurrent());
        System.out.println("每页条数：" + page.getSize());
        System.out.println("总条数：" + page.getTotal());
        System.out.println("查询数据：" + page.getRecords().size());

        System.out.println(JSON.toJSONString(page.getRecords()));




    }

    @Test
    public void exportSQl() {

        String [] strs = {"借据编号",
                "承租人客户编号",
                "承租人客户名称",
                "项目名称",
                "产品名称",
                "交易发生日期",
                "操作类型",
                "币种",
                "本金发生额",
                "本金期末余额 (原币)",
                "本金期末余额 (折人民币)",
                "本金期末余额 (折美元)",
                "正常本金利息发生额",
                "展期利息发生额",
                "展期利息余额",
                "逾期本金发生额",
                "逾期本金余额",
                "逾期本金利息发生额",
                "表内欠息发生额",
                "表内欠息当前余额",
                "表内欠息利息发生额",
                "表外欠息发生额",
                "表外欠息当前余额",
                "表外欠息利息发生额",
                "费用币种",
                "费用类型",
                "费用发生额",
                "正常利率",
                "展期利率",
                "逾期利率",
                "债项方案编号",
                "发放条件编号",
                "所属机构",
                "出租人客户编号",
                "出租人客户名称",
                "交易发生日期（自然日）",
                "交易发生时间",
                "入账时间戳",
                "入帐日期（自然日）",
                "入帐日期（系统工作日）",
                "入帐时间",
                "大交易序号",
                "原大交易序号",
                "小交易序号",
                "交易代码",
                "起息日期",
                "借贷标志",
                "更新后余额",
                "简要注释",
                "附言",
                "反交易标志",
                "冲正交易标识",
                "记帐类型",
                "明细性质",
                "对方帐号",
                "对方帐号序号",
                "对方户名",
                "凭证种类",
                "凭证号",
                "操作柜员号",
                "授权柜员号",
                "放款帐号",
                "放款帐号序号",
                "放款帐号发生额",
                "还款账号",
                "还款账号序号",
                "还款账号发生额",
                "交易（物理）网点号",
                "帐户物理网点号",
                "授权号",
                "终端号",
                "渠道种类",
                "渠道编号",
                "交易地区号"};

        Page page = new Page(1,9999);
        Map selMap = new HashMap();
        List bookList = new ArrayList();

        page.setAsc("WORKDATE", "PROTSENO", "LISTNO");
        List<Map> list =  infAfrlndtlMapper.getAccrualList(page,selMap);

        String[][] centerVal = new String[list.size()][strs.length];

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < strs.length; j++) {
                Map<String,String> map = list.get(i);
                String grantCode = map.get("GRANT_CODE");
                Map baseMessageInfo = infAfrlndtlMapper.getBaseMessageInfo(grantCode);
                map.putAll(baseMessageInfo);

                String name_ = strs[j].toUpperCase();
                String key = AccrualExportEnum.fetchEnum(name_).getName();
                if(FetchOccurredEnum.isBal(key)){
                    String occ = FetchOccurredEnum.getOcc(key);
                    if(new BigDecimal(map.get(occ)).compareTo(BigDecimal.ZERO)!=0){
                        centerVal[i][j] = (String) map.get(key);
                    }
                }else{
                    centerVal[i][j] = (String) map.get(key);
                }
            }
        }
        ExcelUtils.exportExcel(false,strs,centerVal,null,"枚举导出"+DateFormatUtils.format(new Date(),"yyyy-MM-dd-HH-mm-ss"));
//        System.out.println(centerVal);

    }
}
