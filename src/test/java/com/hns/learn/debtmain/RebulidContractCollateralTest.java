package com.hns.learn.debtmain;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.hns.learn.App;
import com.hns.learn.entity.BizContractCollateral;
import com.hns.learn.entity.BizGuaranteeInfo;
import com.hns.learn.mapper.BizContractCollateralMapper;
import com.hns.learn.mapper.BizGuaranteeInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author : hannasong
 * @version : v1.0
 * @date : Created in 15:18 2019-08-12
 * @description : 担保合同数据处理
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class RebulidContractCollateralTest {

    @Autowired
    private BizGuaranteeInfoMapper bizGuaranteeInfoMapper;
    @Autowired
    private BizContractCollateralMapper bizContractCollateralMapper;


    @Test
    public void updateGuarInfo() {

        //拿到担保合同编号不为空的担保信息记录（才能关联，同一方案可能有多个）
        List<Map<String,String>>  bizGuaranteeInfos = bizGuaranteeInfoMapper.queryBizGuaranteeInfos();
        for (Map<String,String> bizGuaranteeInfoMap : bizGuaranteeInfos){
            String warrantyContractNumber = bizGuaranteeInfoMap.get("WARRANTY_CONTRACT_NUMBER");
            String debtCode = bizGuaranteeInfoMap.get("DEBT_CODE");

            int count = bizGuaranteeInfoMapper.getGuarInfoCount(debtCode);

            if(count==1){
                List<BizContractCollateral> bizContractCollateralList = bizContractCollateralMapper.selectList(new EntityWrapper<BizContractCollateral>().eq("DEBT_CODE", debtCode));
                for(BizContractCollateral bizContractCollateral : bizContractCollateralList){
                    List<BizGuaranteeInfo> bizGuaranteeInfoList = bizGuaranteeInfoMapper.findByDebtCode(debtCode);
                    if (bizGuaranteeInfoList.size() != 1) {
                        throw new RuntimeException("required one,but bizGuaranteeInfoList="+bizGuaranteeInfoList);
                    }
                    BizGuaranteeInfo bizGuaranteeInfo = bizGuaranteeInfoList.get(0);
                    bizContractCollateral.setGuarId(bizGuaranteeInfo.getId_());
                    bizContractCollateral.setRemark("sinosong");
//                    System.out.println();
                    //bizContractCollateralMapper.updateById(bizContractCollateral);
                }
            }else if(count>1){
                //多条时，根据debtCode查询合同表
                List<BizContractCollateral> bizContractCollateralList = bizContractCollateralMapper.findByDebtCode(debtCode);
                for(BizContractCollateral bizContractCollateral : bizContractCollateralList){
                    if(warrantyContractNumber.equals(bizContractCollateral.getGuarNo())){
                        //fixme 临时收摊，准备部署环境
                       // bizContractCollateral.setGuarId(bizGuaranteeInfo.getId_());
                        bizContractCollateral.setRemark("sinosong");
                    }
//                    bizContractCollateral.setRemark("sinosong");

                }

            }else{
                System.err.println("异常debtCode=="+debtCode);
            }


        }

    }

    @Test
    public void updateContractCollateral() {


        List<Map<String,String>>  bizGuaranteeInfos = bizGuaranteeInfoMapper.queryBizGuaranteeInfos();
        List<String> errorList  = new ArrayList<String>();
        List<String> warrantyContractNumberList  = bizGuaranteeInfoMapper.queryBizGuaranteeInfoWarrantyContractNumber();

        for (Map<String,String> bizGuaranteeInfoMap : bizGuaranteeInfos){

            String warrantyContractNumber = bizGuaranteeInfoMap.get("WARRANTY_CONTRACT_NUMBER");
            String debtCode = bizGuaranteeInfoMap.get("DEBT_CODE");

            List<BizContractCollateral> bizContractCollaterals = bizContractCollateralMapper.selectList(new EntityWrapper<BizContractCollateral>().eq("GUAR_NO",warrantyContractNumber).eq("DEBT_CODE", debtCode));
            if (bizContractCollaterals.size() == 0) {
//                System.out.println("-=0-");
//                System.out.println(warrantyContractNumber +"---"+ debtCode);
                StringBuffer bf = new StringBuffer();

                //下List为全集，是合同表中存在，担保信息中不存在的数据
                for (BizContractCollateral tmpCC : bizContractCollateralMapper.selectList(new EntityWrapper<BizContractCollateral>().eq("DEBT_CODE", debtCode))) {

//                    System.out.println(JSON.toJSON(tmpCC));
                    if(null!=tmpCC.getGuarNo() && !bf.toString().contains(tmpCC.getGuarNo()) && !warrantyContractNumberList.contains(tmpCC.getGuarNo())){
                        //是这笔方案的合同，但是没有关联上bizGuaranteeInfo
                        bf.append("'"+tmpCC.getGuarNo()+"',");
                    }else{
                        String val = debtCode + "," + warrantyContractNumber;
                        if(!errorList.contains(val)){
                            errorList.add(val);
                        }
                    }
                }
                if (bf.length() > 1) {
                    //根据合同号查询为空，根据方案编号查询出的结果集合
                    System.out.println(bf.substring(0,bf.length()-1));
                    System.out.println();
                }
            } else if (bizContractCollaterals.size() > 1) {
                //TODO 一个担保信息下挂多个合同信息，需要补充合同表中的guar_id
                /*System.out.println("->1-");
                for (BizContractCollateral mc : bizContractCollaterals) {
                System.out.println(JSON.toJSON(mc));
                }*/
            } else {//==1
                //TODO 一对一的正常数据，需要补充guar_id

            }
//            System.out.println(warrantyContractNumber + "---->" + bizContractCollaterals.size());

        }
        Collections.sort(errorList);
        List<String> debtCodeList = new ArrayList<>();
        for (int i = 0; i < errorList.size(); i++) {
            String debtCode = errorList.get(i).split(",")[0];
            if(!debtCodeList.contains(debtCode)){
                debtCodeList.add(debtCode);
            }
        }
        for(String debtCode : debtCodeList){
            //若存在多个担保信息，那么只能报错，无法关联。若只有一笔担保信息，合同直接关联就好
            List<BizGuaranteeInfo> bizGuaranteeInfoList = bizGuaranteeInfoMapper.findByDebtCode(debtCode);
            if(bizGuaranteeInfoList.size()!=1){
                System.err.println(debtCode);
            }
        }
            System.out.println(JSON.toJSON(errorList));
    }
}
