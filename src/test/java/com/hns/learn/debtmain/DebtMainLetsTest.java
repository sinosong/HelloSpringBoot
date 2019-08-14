package com.hns.learn.debtmain;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.hns.learn.App;
import com.hns.learn.entity.BizCreditLines;
import com.hns.learn.entity.BizCust;
import com.hns.learn.entity.BizPTS;
import com.hns.learn.entity.BizProductLinesType;
import com.hns.learn.mapper.BizCreditLinesMapper;
import com.hns.learn.mapper.BizCustMapper;
import com.hns.learn.mapper.BizPTSMapper;
import com.hns.learn.mapper.BizProductLinesTypeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : hannasong
 * @version : v1.0
 * @date : Created in 15:24 2019-08-09
 * @description : 测试用信相关信息的带出；
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class DebtMainLetsTest {

    @Autowired
    private BizPTSMapper bizPtsMapper;
    @Autowired
    private BizCustMapper bizCustMapper;
    @Autowired
    private BizProductLinesTypeMapper bizProductLinesTypeMapper;
    @Autowired
    private BizCreditLinesMapper bizCreditLinesMapper;

    @Test
    public void getLetsTest() {

        List<BizPTS> bizPTSList = bizPtsMapper.selectList(new EntityWrapper<BizPTS>().eq("ROL","LETS").eq("DEBT_CODE","BJB2018110001"));
        List<BizCust> customersList = new ArrayList<>();
        int count = 0;
        for (BizPTS bizt : bizPTSList) {
            if (bizt.getRole().equals("LETS")) {
                String idCuss = bizt.getPtyinr();
                BizCust cu = bizCustMapper.selectById(bizt.getCustNo());
                //变更版本号
                cu.setDebtCode("BJB2018110001");
                //得到额度类型表
                Map<String, Object> proLinesMap = new HashMap();
                proLinesMap.put("DEBT_CODE", "BJB2018110001");
                proLinesMap.put("CUST_NO",cu.getCustNo());
                List<BizProductLinesType> productLinesTypesList = bizProductLinesTypeMapper.selectByMap(proLinesMap);
                if(productLinesTypesList != null && productLinesTypesList.size() > 0){
                    BizProductLinesType productLinesType = productLinesTypesList.get(count);
                    count++;
                    count = count == productLinesTypesList.size() ? 0 : count;
                    cu.setCreditLinesId(productLinesType.getCreditLinesId().toString());
                    cu.setCreditRatio(productLinesType.getCreditRatio());
                    //cu.setProductLinesTypeId(productLinesType.getId().toString());
                }

                //得到用户主体授信信息表
                Map<String, Object> crelinesMap = new HashMap();
                crelinesMap.put("DEBT_CODE", "BJB2018110001");
                crelinesMap.put("CUST_NO", cu.getCustNo());
                crelinesMap.put("OBJTYP", "BIZ_DEBT_MAIN");
                crelinesMap.put("OBJINR", "1061951431475642369");
                List<BizCreditLines> bizCreditLinesList = bizCreditLinesMapper.selectByMap(crelinesMap);
                //更新版本号
                for (BizCreditLines bizCreditLines : bizCreditLinesList) {
                    bizCreditLines.setDebtCode("BJB2018110001");
                }
                cu.setCreditLinesList(bizCreditLinesList);
                customersList.add(cu);
            }
        }

        System.out.println(JSON.toJSON(customersList));
    }
}
