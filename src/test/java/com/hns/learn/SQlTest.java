package com.hns.learn;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hns.learn.entity.InfAccrual;
import com.hns.learn.entity.InfComprehensive;
import com.hns.learn.entity.enums.AccrualExportEnum;
import com.hns.learn.entity.enums.FetchOccurredEnum;
import com.hns.learn.mapper.InfAccrualMapper;
import com.hns.learn.mapper.InfAfrlndtlMapper;
import com.hns.learn.mapper.InfComprehensiveMapper;
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

    @Autowired
    private InfAccrualMapper infAccrualMapper;
    @Autowired
    private InfComprehensiveMapper infComprehensiveMapper;

    @Test
    public void toObj() {

        String jStr = "{\n" +
                "\t\"deptName\": \"公司客户部\",\n" +
                "\t\"traneFinanceBusiness\": \"政策性贷款项下贸金业务\",\n" +
                "\t\"LISTNO\": \"0000001\",\n" +
                "\t\"REMARK_\": \"占位\",\n" +
                "\t\"DRDOACSN\": \"00000\",\n" +
                "\t\"MEDIUMNO\": \"1360000130201000011157\",\n" +
                "\t\"PTRXSQNB\": \"00000000000\",\n" +
                "\t\"POSTTYPE\": \"单笔\",\n" +
                "\t\"syndicatedStatus\": \"占位\",\n" +
                "\t\"FOREAMT\": \"0\",\n" +
                "\t\"OFAMT\": \"0\",\n" +
                "\t\"PRODCODE\": \"10202\",\n" +
                "\t\"CMPRFLAG\": \"0\",\n" +
                "\t\"productName\": \"无追索权租金保理\",\n" +
                "\t\"OVRAMTIT\": \"0\",\n" +
                "\t\"AMOUNT\": \"123456789.00\",\n" +
                "\t\"scopeBusinPeriod\": 12,\n" +
                "\t\"coneno\": \"136090000059935\",\n" +
                "\t\"UPDBALCNY\": -7555953.63,\n" +
                "\t\"GRANT_CODE\": \"CRP2019040103002\",\n" +
                "\t\"VALUEDAT\": \"2018-12-16\",\n" +
                "\t\"TRXTIME\": \"16:25:21\",\n" +
                "\t\"SUBSERNO\": \"00001\",\n" +
                "\t\"DRDOACTN\": \"1360000100001239175\",\n" +
                "\t\"PHYBRNO\": \"0001\",\n" +
                "\t\"AFWKLFE_FEEAMT\": \"占位\",\n" +
                "\t\"TAXAMT\": \"0\",\n" +
                "\t\"OFCIRATE\": \"000000000\",\n" +
                "\t\"RLVIBAL\": \"占位\",\n" +
                "\t\"financePlatform\": \"否\",\n" +
                "\t\"LISTTYPE\": \"联机发放\",\n" +
                "\t\"NTAXAMT\": \"0\",\n" +
                "\t\"UPDBALUSD\": -1088252.34,\n" +
                "\t\"POSTSDAT\": \"2018-12-16\",\n" +
                "\t\"TRXDATE\": \"2019-03-13\",\n" +
                "\t\"DRDOACTA\": \"123456789.00\",\n" +
                "\t\"CASHEXF\": \"2\",\n" +
                "\t\"PAYACTN\": \"占位\",\n" +
                "\t\"TRXSQNS\": \"00000\",\n" +
                "\t\"INAMT\": \"0\",\n" +
                "\t\"account_\": \"zls01\",\n" +
                "\t\"recourse\": \"无追索权\",\n" +
                "\t\"currency\": \"CNY\",\n" +
                "\t\"TRXSQNB\": \"00000000056\",\n" +
                "\t\"policyAttributreClassify\": \"一带一路\",\n" +
                "\t\"bizRentalFactoringCode\": \"4545\",\n" +
                "\t\"AFWKLFE_CURRTYPE\": \"占位\",\n" +
                "\t\"UPDATE_BY\": \"1\",\n" +
                "\t\"PAYACSN\": \"00000\",\n" +
                "\t\"NTAXBAL\": \"0\",\n" +
                "\t\"UPDATE_TIME\": \"\",\n" +
                "\t\"OFAMTIT\": \"0\",\n" +
                "\t\"grantCode\": \"CRP2019040103002\",\n" +
                "\t\"propscale\": \"大型\",\n" +
                "\t\"businessTypes\": \"PT0502000000\",\n" +
                "\t\"REVTRANF\": \"否\",\n" +
                "\t\"RLVRATE\": \"000000000\",\n" +
                "\t\"TRXPLCS\": \"占位\",\n" +
                "\t\"INCIRATE\": \"000000000\",\n" +
                "\t\"proprat\": \"A+(14级)\",\n" +
                "\t\"OVRBAL\": \"占位\",\n" +
                "\t\"PRODNO\": \"3922700\",\n" +
                "\t\"PAYACTA\": \"0\",\n" +
                "\t\"STATCODE\": \"0000000\",\n" +
                "\t\"ZONENO\": \"1360\",\n" +
                "\t\"CHNLTYPE\": \"003\",\n" +
                "\t\"RECIPBKN\": \"占位\",\n" +
                "\t\"PRINFLAG\": \"0\",\n" +
                "\t\"PRODGPNO\": \"00000\",\n" +
                "\t\"CHNLNO\": \"136000300001001\",\n" +
                "\t\"TERMNUM\": \"00000\",\n" +
                "\t\"RECIPBKA\": \"占位\",\n" +
                "\t\"VOUHNO\": \"00000000000000000\",\n" +
                "\t\"DRCRF\": \"借\",\n" +
                "\t\"coneorgnum\": \"78718311-0\",\n" +
                "\t\"conerat\": \"A-(14级)\",\n" +
                "\t\"CURRTYPE\": \"JPY\",\n" +
                "\t\"FORECURR\": \"000\",\n" +
                "\t\"TAXBAL\": \"0\",\n" +
                "\t\"tradeFinanceBusiness\": \"政策性贷款项下贸金业务\",\n" +
                "\t\"CATRFLAG\": \"2\",\n" +
                "\t\"UPDTRANF\": \"正常\",\n" +
                "\t\"propcn\": \"客户136090000059973\",\n" +
                "\t\"CREATE_TIME\": 1552508415000,\n" +
                "\t\"VOUHTYPE\": \"000\",\n" +
                "\t\"proporgnum\": \"14291064-0\",\n" +
                "\t\"TAXRATE\": \"000000000\",\n" +
                "\t\"solutionAmt\": 232323,\n" +
                "\t\"ID_\": 2019031416201013,\n" +
                "\t\"EXCHRAT\": \"0\",\n" +
                "\t\"debtCode\": \"CRP2019040103\",\n" +
                "\t\"TPHYBRNO\": \"0001\",\n" +
                "\t\"AUTHNO\": \"占位\",\n" +
                "\t\"INTRATE\": \"000000000\",\n" +
                "\t\"CURRINT\": \"0\",\n" +
                "\t\"INSTITUTION_CODE\": \"1530000\",\n" +
                "\t\"MEDIUMID\": \"1360000100001240839\",\n" +
                "\t\"TELLERNO\": \"01001\",\n" +
                "\t\"ROW_ID\": 1,\n" +
                "\t\"rownum\": 1,\n" +
                "\t\"INCURBAL\": \"占位\",\n" +
                "\t\"RLVINT\": \"0\",\n" +
                "\t\"INAMTIT\": \"0\",\n" +
                "\t\"CREATE_BY\": \"\",\n" +
                "\t\"LGLOCKNO\": \"001\",\n" +
                "\t\"projectName\": \"客户136090000059973 CNY 232,323.00无追索权租金保理项目\",\n" +
                "\t\"POSTTIME\": \"16:25:21\",\n" +
                "\t\"deptCode\": \"1530000\",\n" +
                "\t\"TRXZNO\": \"1360\",\n" +
                "\t\"PROTSENO\": \"136000011020200000692381\",\n" +
                "\t\"OVRAMT\": \"0\",\n" +
                "\t\"TERMID\": \"gui00001\",\n" +
                "\t\"NOTES\": \"占位\",\n" +
                "\t\"IDENT_NUMBER\": \"1360000100001240839\",\n" +
                "\t\"TAXSUM\": \"0\",\n" +
                "\t\"bankTellName\": \"张立霜\",\n" +
                "\t\"RECIPACT\": \"1360000100001239175\",\n" +
                "\t\"UPDBAL\": \"-123456789.00\",\n" +
                "\t\"RECIPACS\": \"00000\",\n" +
                "\t\"mCurrency\": \"CNY\",\n" +
                "\t\"RECIPACN\": \"占位\",\n" +
                "\t\"POSTNDAT\": \"2019-03-13\",\n" +
                "\t\"MEDSENO\": \"00000\",\n" +
                "\t\"OVRRATE\": \"000000000\",\n" +
                "\t\"NOTETYPE\": \"貸款發放\",\n" +
                "\t\"grantId\": 1122055147271749633,\n" +
                "\t\"conescale\": \"大型\",\n" +
                "\t\"ENABLE_\": 1,\n" +
                "\t\"AFWKLFE_FEECLASS\": \"占位\",\n" +
                "\t\"conecn\": \"客户136090000059935\",\n" +
                "\t\"AUTHTLNO\": \"00000\",\n" +
                "\t\"TIMESTMP\": \"2019-03-13-16:25:23:494903\",\n" +
                "\t\"iouCode\": \"MJ201904270424\",\n" +
                "\t\"leasehold\": \"545\",\n" +
                "\t\"TRXCODE\": \"04080\",\n" +
                "\t\"syndicateLoan\": \"是否与他行银团放款\",\n" +
                "\t\"OFCURBAL\": \"占位\",\n" +
                "\t\"propno\": \"136090000059973\",\n" +
                "\t\"WORKDATE\": 1544889600000\n" +
                "}";
        InfAccrual acc = JSON.parseObject(jStr,InfAccrual.class);

        System.out.println(acc.toString());

        infAccrualMapper.insert(acc);
    }

    @Test
    public void AccSqlTest() {

        List<InfAccrual> list = infAccrualMapper.selectList(new QueryWrapper<InfAccrual>());
//        System.out.println(list.get(0));
//        InfAccrual al = list.get(0);
//        System.out.println(al.getZoneno());
//        System.out.println("--------------------------");
//        System.out.println(al.toString());
        System.out.println(infAccrualMapper.getAll());
        System.out.println(infAccrualMapper.getAllMap());

    }

    @Test
    public void ComSqlTest() {

        String js = "{\n" +
                "\t\"deptName\": \"公司客户部\",\n" +
                "\t\"traneFinanceBusiness\": \"非政策性业务\",\n" +
                "\t\"mediumid\": \"1360000100001240963\",\n" +
                "\t\"syndicatedStatus\": \"占位\",\n" +
                "\t\"productName\": \"无追索权租金保理\",\n" +
                "\t\"coneorgnum\": \"占位\",\n" +
                "\t\"rateincm1\": \"固定利率\",\n" +
                "\t\"conerat\": \"占位\",\n" +
                "\t\"tothkamt\": 0.00,\n" +
                "\t\"tradeFinanceBusiness\": \"非政策性业务\",\n" +
                "\t\"propcn\": \"占位\",\n" +
                "\t\"guaranteeMode\": \"-\",\n" +
                "\t\"scopeBusinPeriod\": 12,\n" +
                "\t\"OVCALINF\": \"2\",\n" +
                "\t\"coneno\": \"占位\",\n" +
                "\t\"UPDBALCNY\": -1000.00,\n" +
                "\t\"totffamtUSD\": 144.03,\n" +
                "\t\"jointTenant\": \"-\",\n" +
                "\t\"proporgnum\": \"占位\",\n" +
                "\t\"solutionAmt\": \"占位\",\n" +
                "\t\"debtCode\": \"CRP2019040104001\",\n" +
                "\t\"NGBSQ\": \"费用,正常本金,正常利息,宽限期利息\",\n" +
                "\t\"financePlatform\": \"占位\",\n" +
                "\t\"ROW_ID\": 1,\n" +
                "\t\"rownum\": 1,\n" +
                "\t\"OGBSQ\": \"费用,逾期本金,逾期本金利息,表内欠息,表内欠息复息,表外欠息,表外欠息复息\",\n" +
                "\t\"UPDBALUSD\": -144.03,\n" +
                "\t\"totffamtCNY\": 1000.00,\n" +
                "\t\"projectName\": \"占位\",\n" +
                "\t\"deptCode\": \"1530000\",\n" +
                "\t\"tothkamtCNY\": 0.00,\n" +
                "\t\"account_\": \"占位\",\n" +
                "\t\"INCALINF\": \"2\",\n" +
                "\t\"recourse\": \"无追索权\",\n" +
                "\t\"totffamt\": 1000.00,\n" +
                "\t\"bankTellName\": \"占位\",\n" +
                "\t\"tothkamtUSD\": 0.00,\n" +
                "\t\"UPDBAL\": -1000.00,\n" +
                "\t\"mCurrency\": \"占位\",\n" +
                "\t\"currency\": \"CNY\",\n" +
                "\t\"issueDate\": \"-\",\n" +
                "\t\"policyAttributreClassify\": \"占位\",\n" +
                "\t\"bizRentalFactoringCode\": \"占位\",\n" +
                "\t\"grantId\": 1118766944976646146,\n" +
                "\t\"conescale\": \"占位\",\n" +
                "\t\"FEE\": 0,\n" +
                "\t\"nloncurrtype\": \"156\",\n" +
                "\t\"grantCode\": \"CRP2019040104001004\",\n" +
                "\t\"propscale\": \"占位\",\n" +
                "\t\"businessTypes\": \"PT0502000000\",\n" +
                "\t\"proprat\": \"占位\",\n" +
                "\t\"conecn\": \"占位\",\n" +
                "\t\"iouCode\": \"MJ201904180237\",\n" +
                "\t\"protseno\": \"136000011020200000693853\",\n" +
                "\t\"leasehold\": \"占位\",\n" +
                "\t\"CALINTF\": \"1\",\n" +
                "\t\"valueday\": \"2018-12-16\",\n" +
                "\t\"OCALINF\": \"2\",\n" +
                "\t\"syndicateLoan\": \"是否与他行银团放款\",\n" +
                "\t\"propno\": \"占位\"\n" +
                "}";

        InfComprehensive si = JSON.parseObject(js,InfComprehensive.class);

        infComprehensiveMapper.insert(si);
        System.out.println(si.toString());
    }

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
