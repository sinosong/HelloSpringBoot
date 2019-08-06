package com.hns.learn.dao.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.toolkit.IdWorker;
import com.hns.learn.entity.BizApprSummaryInfo;
import com.hns.learn.entity.BizDebtGrant;
import com.hns.learn.entity.BizDebtSummary;
import com.hns.learn.entity.BizTRN;
import com.hns.learn.mapper.BizApprSummaryInfoMapper;
import com.hns.learn.mapper.BizDebtGrantMapper;
import com.hns.learn.mapper.BizDebtMainMapper;
import com.hns.learn.mapper.BizTRNMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author : hannasong
 * @version : v1.0
 * @date : Created in 10:59 2019-08-01
 * @description : 记录流水信息;
 */
@Component
public class DealTrnServiceImpl {

    @Autowired
    private BizDebtMainMapper bizDebtMainMapper;
    @Autowired
    private BizDebtGrantMapper bizDebtGrantMapper;
    @Autowired
    private BizApprSummaryInfoMapper bizApprSummaryInfoMapper;

    @Autowired
    private BizTRNMapper bizTRNMapper;

    /**
     * 生成方案流水；insert
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
    public void createMainTrnAndAppr() {

        List<BizDebtSummary> bizDebtSummaryList = bizDebtMainMapper.selectList(new EntityWrapper<BizDebtSummary>());
        List<BizTRN> trnList = new ArrayList<>();
        List<BizApprSummaryInfo> apprList = new ArrayList<>();

        for(BizDebtSummary bizDebtSummary : bizDebtSummaryList){

            Date date = new Date();
            BizTRN bizTRN = new BizTRN();
            long trnId = IdWorker.getId();
            bizTRN.setId(trnId);
            bizTRN.setObjtyp("BIZ_DEBT_MAIN");
            bizTRN.setRelflg("Y");
            bizTRN.setRelres("Y");
            bizTRN.setInifrm("DEBOPN");
            bizTRN.setIninam("方案补录");
            bizTRN.setObjinr(bizDebtSummary.getId());
            bizTRN.setOwnref(StringUtils.substring(bizDebtSummary.getDebtCode(),0,13));
            if(bizDebtSummary.getVerNum()!=null){
                bizTRN.setVerNum(bizDebtSummary.getVerNum());
            }else{
                if(bizDebtSummary.getDebtCode().length()==16){
                    bizTRN.setVerNum(Integer.parseInt(StringUtils.substring(bizDebtSummary.getDebtCode(),13)));
                }else {
                    throw new RuntimeException("vernum err");
                }
            }
            bizTRN.setIniusr(bizDebtSummary.getCreateBy());
            bizTRN.setBchkeyinr(bizDebtSummary.getInstitutionCode());
            bizTRN.setObjnam(bizDebtSummary.getProjectName());
            bizTRN.setReloricur(bizDebtSummary.getMpc());
            bizTRN.setReloriamt(bizDebtSummary.getSolutionAmount());
            bizTRN.setInidattim(date);
            bizTRN.setCreateTime(date);
            bizTRN.setUpdateTime(date);
            bizTRN.setCreateBy(bizDebtSummary.getBankTellerId());
            bizTRN.setUpdateBy(bizDebtSummary.getBankTellerId());
            bizTRN.setEnable(1);
            bizTRN.setBizStatus(6);
            bizTRN.setProcessStatus(2);
            bizTRN.setVerNum(1);
            bizTRN.setRemark("sinosong");

            int itrn = bizTRNMapper.insert(bizTRN);
            if(itrn!=1){
                throw new RuntimeException("insert err! table= biz_trn,trn="+bizTRN.toString());
            }

            BizApprSummaryInfo bizApprSummaryInfo = new BizApprSummaryInfo();

            bizApprSummaryInfo.setId(IdWorker.getId());
            //项目名称
            bizApprSummaryInfo.setProjectName(bizDebtSummary.getProjectName());
            //申请人名称
            bizApprSummaryInfo.setProposer(bizDebtSummary.getProposer());
            //币种
            bizApprSummaryInfo.setMpc(bizDebtSummary.getMpc());
            //金额
            bizApprSummaryInfo.setSolutionAmount(bizDebtSummary.getSolutionAmount());
            //失效日期
            bizApprSummaryInfo.setPgExpiDate(bizDebtSummary.getPgExpiDate());
            //关联流水
            bizApprSummaryInfo.setTrnInr(bizTRN.getId());
            bizApprSummaryInfo.setDebtCode(bizDebtSummary.getDebtCode());
            bizApprSummaryInfo.setVerNum(bizDebtSummary.getVerNum());

            bizApprSummaryInfo.setaCurrrency(bizDebtSummary.getaCurrrency());
            bizApprSummaryInfo.setApprove(bizDebtSummary.getApprove());
            bizApprSummaryInfo.setBankTellerId(bizDebtSummary.getBankTellerId());
            bizApprSummaryInfo.setBrifBackground(bizDebtSummary.getBrifBackground());
            bizApprSummaryInfo.setBusinessBackgroundBrief(bizDebtSummary.getBusinessBackgroundBrief());
            bizApprSummaryInfo.setDeptName(bizDebtSummary.getDeptName());
            bizApprSummaryInfo.setDescriptionProgramQuoqate(bizDebtSummary.getDescriptionProgramQuoqate());
            bizApprSummaryInfo.setDopo(bizDebtSummary.getDopo());
            bizApprSummaryInfo.setErrNo(bizDebtSummary.getErrNo());
            bizApprSummaryInfo.setGoodsSketch(bizDebtSummary.getGoodsSketch());
            bizApprSummaryInfo.setIdentNumber(bizDebtSummary.getIdentNumber());
            bizApprSummaryInfo.setLs(bizDebtSummary.getLs());
            bizApprSummaryInfo.setLtnopa(bizDebtSummary.getLtnopa());
            bizApprSummaryInfo.setOc(bizDebtSummary.getOc());
            bizApprSummaryInfo.setDeptName(bizDebtSummary.getDeptName());
            bizApprSummaryInfo.setInstitutionCode(bizDebtSummary.getInstitutionCode());
            bizApprSummaryInfo.setPgEffectivDate(bizDebtSummary.getPgEffectivDate());
            bizApprSummaryInfo.setRaaa(bizDebtSummary.getRaaa());
            bizApprSummaryInfo.setSingleBtch(bizDebtSummary.getSingleBtch());
            bizApprSummaryInfo.setCreateTime(bizDebtSummary.getCreateTime());
            bizApprSummaryInfo.setUpdateTime(bizDebtSummary.getUpdateTime());
            bizApprSummaryInfo.setCreateBy(bizDebtSummary.getCreateBy());
            bizApprSummaryInfo.setUpdateBy(bizDebtSummary.getUpdateBy());

            bizApprSummaryInfo.setTransok(bizDebtSummary.getTransok());
            bizApprSummaryInfo.setPolicy(bizDebtSummary.getPolicy());
            bizApprSummaryInfo.setPolicyDescription(bizDebtSummary.getPolicyDescription());
            bizApprSummaryInfo.setPackageRate(bizDebtSummary.getPackageRate());
            bizApprSummaryInfo.setRateRangeMix(bizDebtSummary.getRateRangeMix());
            bizApprSummaryInfo.setRateRangeMax(bizDebtSummary.getRateRangeMax());
            bizApprSummaryInfo.setDescriptionRateRules(bizDebtSummary.getDescriptionRateRules());
            bizApprSummaryInfo.setCreateTime(date);
            bizApprSummaryInfo.setUpdateTime(date);
            bizApprSummaryInfo.setCreateBy(bizDebtSummary.getBankTellerId());
            bizApprSummaryInfo.setUpdateBy(bizDebtSummary.getBankTellerId());
            bizApprSummaryInfo.setEnable(1);
            bizApprSummaryInfo.setRemark("sinosong");

            int iappr = bizApprSummaryInfoMapper.insert(bizApprSummaryInfo);
            if(iappr!=1){
                throw new RuntimeException("insert err! table= BIZ_APPRSUMMARY_INFO,bizApprSummaryInfo="+bizApprSummaryInfo.toString());
            }
            trnList.add(bizTRN);
            apprList.add(bizApprSummaryInfo);
        }
        System.out.println("createGrantTrnAndAppr trnList size()=="+trnList.size()+" list detail==");
        System.out.println(JSON.toJSON(trnList));
        System.out.println("createGrantTrnAndAppr apprList size()=="+apprList.size()+" list detail==");
        System.out.println(JSON.toJSON(apprList));
    }

    /**
     * 生成发放条件流水；insert
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
    public void createGrantTrnAndAppr() {

        List<BizDebtGrant> bizDebtGrantList = bizDebtGrantMapper.selectList(new EntityWrapper<BizDebtGrant>().isNull("IMAGE_DATE"));

        List<BizTRN> trnList = new ArrayList<>();
        List<BizApprSummaryInfo> apprList = new ArrayList<>();

        for(BizDebtGrant bizDebtGrant : bizDebtGrantList){

            Date date = new Date();
            BizTRN bizTRN = new BizTRN();
            long trnId = IdWorker.getId();
            bizTRN.setId(trnId);
            bizTRN.setObjtyp("BIZ_DEBT_GRANT");
            bizTRN.setRelflg("Y");
            bizTRN.setRelres("Y");
            bizTRN.setInifrm("GRAOPN");
            bizTRN.setIninam("条件审批新增");
            bizTRN.setObjinr(bizDebtGrant.getId());
            bizTRN.setOwnref(bizDebtGrant.getGrantCode());
            bizTRN.setVerNum(bizDebtGrant.getVerNum());
            bizTRN.setIniusr(bizDebtGrant.getCreateBy());
            bizTRN.setBchkeyinr(bizDebtGrant.getInstitutionCode());
            bizTRN.setObjnam(bizDebtGrant.getBusinessName()+"进行发放");
            bizTRN.setReloricur(bizDebtGrant.getCurrency());
            bizTRN.setReloriamt(bizDebtGrant.getGrantAmt());
            bizTRN.setInidattim(date);
            bizTRN.setCreateTime(date);
            bizTRN.setUpdateTime(date);
            bizTRN.setCreateBy(bizDebtGrant.getCreateBy());
            bizTRN.setUpdateBy(bizDebtGrant.getUpdateBy());
            bizTRN.setEnable(1);
            bizTRN.setBizStatus(5);
            bizTRN.setProcessStatus(2);
            bizTRN.setVerNum(1);
            bizTRN.setRemark("sinosong");

            List<BizDebtSummary> bizDebtSummaryList = bizDebtMainMapper.selectList(new EntityWrapper<BizDebtSummary>().eq("DEBT_CODE",bizDebtGrant.getDebtCode()));

            if(bizDebtSummaryList.size()!=1){
                throw new RuntimeException("sel debtMain error!");
            }
            BizDebtSummary bizDebtSummary = bizDebtSummaryList.get(0);

            BizApprSummaryInfo bizApprSummaryInfo = new BizApprSummaryInfo();
            bizApprSummaryInfo.setId(IdWorker.getId());
            //项目名称
            bizApprSummaryInfo.setProjectName(bizDebtSummary.getProjectName());
            //申请人名称
            bizApprSummaryInfo.setProposer(bizDebtSummary.getProposer());
            //方案金额
            bizApprSummaryInfo.setSolutionAmount(bizDebtSummary.getSolutionAmount());
            //失效日期
            bizApprSummaryInfo.setPgExpiDate(bizDebtSummary.getPgExpiDate());
            //关联流水
            bizApprSummaryInfo.setTrnInr(trnId);
            //发放变更号
            bizApprSummaryInfo.setVerNum(bizDebtGrant.getVerNum());
            //发放编号
            bizApprSummaryInfo.setGrantCode(bizDebtGrant.getGrantCode());
            //方案业务期限范围
            bizApprSummaryInfo.setDopo(bizDebtSummary.getDopo());
            //经办人
            bizApprSummaryInfo.setCreateBy(bizDebtGrant.getCreateBy());
            bizApprSummaryInfo.setGrantCurrency(bizDebtGrant.getCurrency());
            bizApprSummaryInfo.setGrantAmt(bizDebtGrant.getGrantAmt());
            bizApprSummaryInfo.setGrantScopeBPeriod(Long.parseLong(bizDebtGrant.getScopeBusinPeriod()));
            bizApprSummaryInfo.setBusinessName(bizDebtGrant.getBusinessName());
            bizApprSummaryInfo.setBankTellerId(bizDebtSummary.getBankTellerId());
            bizApprSummaryInfo.setBusiness_Types(bizDebtGrant.getBusinessTypes());
            bizApprSummaryInfo.setInstitutionCode(bizDebtGrant.getInstitutionCode());
            bizApprSummaryInfo.setDebtCodeVernum(bizDebtSummary.getDebtCode()+bizDebtSummary.getVerNumStr());
            bizApprSummaryInfo.setIdentNumber(bizDebtSummary.getIdentNumber());
            bizApprSummaryInfo.setUpdateTime(date);
            bizApprSummaryInfo.setCreateTime(bizDebtGrant.getCreateTime());
            bizApprSummaryInfo.setRemark("sinosong");

            int itrn = bizTRNMapper.insert(bizTRN);
            if(itrn!=1){
                throw new RuntimeException("insert err! table= biz_trn,trn="+bizTRN.toString());
            }
            int iappr = bizApprSummaryInfoMapper.insert(bizApprSummaryInfo);
            if(iappr!=1){
                throw new RuntimeException("insert err! table= iappr,bizApprSummaryInfo="+bizApprSummaryInfo.toString());
            }

            trnList.add(bizTRN);
            apprList.add(bizApprSummaryInfo);
        }
        System.out.println("createGrantTrnAndAppr trnList size()=="+trnList.size()+" list detail==");
        System.out.println(JSON.toJSON(trnList));
        System.out.println("createGrantTrnAndAppr apprList size()=="+apprList.size()+" list detail==");
        System.out.println(JSON.toJSON(apprList));

    }


}
