package com.hns.learn.debtmain;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.toolkit.IdWorker;
import com.hns.learn.App;
import com.hns.learn.entity.BizDebtSummary;
import com.hns.learn.entity.BizTRN;
import com.hns.learn.mapper.BizDebtMainMapper;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class DebtMainTest {

    @Autowired
    private BizDebtMainMapper bizDebtMainMapper;

    @Test
    public void createTrnTest() {

        List<BizDebtSummary> bizDebtSummaryList = bizDebtMainMapper.selectList(new EntityWrapper<BizDebtSummary>());

        List<BizTRN> trnList = new ArrayList<>();

        for(BizDebtSummary bizDebtSummary : bizDebtSummaryList){

//            System.out.println(bizDebtSummary.toString());
            Date date = new Date();
            BizTRN bizTRN = new BizTRN();
            bizTRN.setId(IdWorker.getId());
            bizTRN.setObjtyp("BIZ_DEBT_MAIN");
            bizTRN.setRelflg("Y");
            bizTRN.setRelres("Y");
            bizTRN.setInifrm("DEBOPN");
            bizTRN.setIninam("方案补录");
            bizTRN.setObjinr(bizDebtSummary.getId());
            bizTRN.setOwnref(StringUtils.substring(bizDebtSummary.getDebtCode(),0,13));
            bizTRN.setVerNum(Integer.parseInt(StringUtils.substring(bizDebtSummary.getDebtCode(),13)));
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

//            System.out.println("-------------------------------");
//            System.out.println(bizTRN.toString());
//            System.out.println("-------------------------------");
            trnList.add(bizTRN);
        }
        System.out.println(trnList);

    }
}
