package com.hns.learn;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.hns.learn.entity.InfAccrual;
import com.hns.learn.entity.InfTaskRecord;
import com.hns.learn.mapper.InfAccrualMapper;
import com.hns.learn.mapper.InfTaskRecordMapper;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
@WebAppConfiguration
public class SqlTest01 {

    private static final Logger logger = LogManager.getLogger(SqlTest01.class);


    @Autowired
    private PlatformTransactionManager txManager;
    @Autowired
    private InfTaskRecordMapper infTaskRecordMapper;
    @Autowired
    private InfAccrualMapper infAccrualMapper;

    @Test
    public void fetchAccrual() {

        //查询接口日志表，将未处理的记录流水更新到自己的表中
        //查询系统上次跑批的日期 IBASE4J.currdate  mjCurrDate
        // -->  拿到接口平台跑批日期：BE_DEA+INF9+SUCCESS+(currdate > mjCurrDate)
        // -->  每个workdate一条，按顺序处理数据

        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        def.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);
        TransactionStatus status = txManager.getTransaction(def);
        try {

            //
            Wrapper lastMjWrapper = new EntityWrapper<InfTaskRecord>();
            lastMjWrapper.eq("GROUP_NAME","IBASE4J").eq("TASK_NAME","ACCRUAL").eq("STATUS_","SUCCESS").orderBy("CURRDATE",false);
            List<InfTaskRecord> recTmpList = infTaskRecordMapper.selectPage(new Page<InfTaskRecord>(1,1),lastMjWrapper);

            if(recTmpList.size() > 0){
                InfTaskRecord lastRec = recTmpList.get(0);
                String lastCurrDateStr = lastRec.getCurrDate();
                Date lastCurrDate = null;
                Date currDate = null;
                String currDateStr = null;
                try {
                    lastCurrDate = DateUtils.parseDate(lastCurrDateStr,"yyyy-MM-dd");
                    //自然日加一，若今天不存在跑批，则停滞等待
                    currDate = DateUtils.addDays(lastCurrDate,1);
                    currDateStr = DateFormatUtils.format(currDate,"yyyy-MM-dd");
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                //获取下个跑批日成功的记录
                Wrapper deaWrapper = new EntityWrapper<InfTaskRecord>();
                deaWrapper.eq("GROUP_NAME","BE_DEA").eq("STATUS_","SUCCESS").eq("TASK_NAME","INF9").eq("CURRDATE",currDateStr);
                List<InfTaskRecord> addList = infTaskRecordMapper.selectList(deaWrapper);
                if(addList.size()==1){
                    long startTime=System.currentTimeMillis();
                    InfTaskRecord deaCurrRec = addList.get(0);
                    //构造记录
                    InfTaskRecord insertRec = new InfTaskRecord();
                    insertRec.setStartTime(new Date());
                    insertRec.setCurrDate(currDateStr);
                    insertRec.setLastDate(lastCurrDateStr);
                    Map<String, Object> param = new HashMap<>(2);
                    param.put("beginDate",currDateStr);
                    param.put("endDate",currDateStr);
                    //获取流水记录
                    List<Map> accrualList = infTaskRecordMapper.getAccrualList(new Page(1,9999),param);
                    int ins = 0;
                    for(Map tempMap : accrualList){
                        ins += infAccrualMapper.insert(new JSONObject(tempMap).toJavaObject(InfAccrual.class));
                    }
                    insertRec.setGroupName("IBASE4J");
                    insertRec.setTaskName("ACCRUAL");
                    insertRec.setInsertrows(accrualList.size());
                    if(ins == accrualList.size()){
                        insertRec.setStatus("SUCCESS");
                        Date endDate = new Date();
                        insertRec.setEndTime(endDate);
                        insertRec.setCreateTime(endDate);
                        int ires = infTaskRecordMapper.insert(insertRec);
                        if(ires==1){
                            System.out.println("***************************************************************");
                            System.out.println("surpirse!");
                            txManager.commit(status);
                        }else{
                            logger.error("INTERFACE ERROR:insert error:table=InfAccrual Param = insertRec="+insertRec.toString());
                        }
                    }
                    long endTime=System.currentTimeMillis();
                    logger.info("程序运行时间： "+(endTime - startTime)+"ms");
                }else{
                    //不存在自然日 +1 的数据，不跑批
                    logger.error("INTERFACE ERROR:required One:table=InfTaskRecord Param = GROUP_NAME=IBASE4J&&TASK_NAME=ACCRUAL&&CURRDATE="+currDate);
                }

            }else{
                logger.error("INTERFACE ERROR:required One:table=InfTaskRecord Param = GROUP_NAME=IBASE4J&&TASK_NAME=ACCRUAL");
            }

        } catch (Exception es) {
            txManager.rollback(status);
            es.printStackTrace();
            throw new RuntimeException("save debtMain error! reason=="+es.getMessage());
        }
    }
}
