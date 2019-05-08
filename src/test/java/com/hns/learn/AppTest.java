package com.hns.learn;

import static org.junit.Assert.assertTrue;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.hns.learn.common.Context;
import com.hns.learn.dao.BizCanvasService;
import com.hns.learn.dao.impl.StartState;
import com.hns.learn.dao.impl.StopState;
import com.hns.learn.entity.BizCanvas;
import com.hns.learn.entity.BizDebtGrant;
import com.hns.learn.entity.InfAfrlndtl;
import com.hns.learn.entity.defineAuthor;
import com.hns.learn.mapper.BizCanvasMapper;
import com.hns.learn.mapper.InfAfrlndtlMapper;
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

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
@WebAppConfiguration
public class AppTest {

    protected static  final Logger logger = LogManager.getLogger();

    @Autowired
    private BizCanvasMapper bizCanvasMapper;
    @Autowired
    private BizCanvasService bizCanvasService;
    @Autowired
    private InfAfrlndtlMapper infAfrlndtlMapper;
    @Autowired
    private PlatformTransactionManager txManager;
    @Autowired
    private defineAuthor author;

    @Test
    public void getProperties(){
        System.out.println(author.toString());
    }

    @Test
    public void selCanvas() {

        System.out.println("***********************");
        /*BizCanvas sel = new BizCanvas();
        sel.setId(1120992891767480321L);
        Wrapper<BizCanvas> queryWrapper = new EntityWrapper<>(sel);
        System.out.println("Mapper=="+bizCanvasMapper.selectList(queryWrapper));

        System.out.println("Service=="+bizCanvasService.selectList(queryWrapper));*/
//        Wrapper<BizCanvas> queryWrapper = new QueryWrapper<>(sel);
//        System.out.println("Mapper=="+bizCanvasMapper.selectOne(queryWrapper).toString());
        List<Map> grantMapList =  bizCanvasMapper.selEffectGrant("1360000100001230011");
        if(grantMapList.size()==1){
            BizDebtGrant grant = new JSONObject(grantMapList.get(0)).toJavaObject(BizDebtGrant.class);
            System.out.println(grant.toString());
        }
    }

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void StatePatternDemo() {

        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }

    @Test
    public void testInfAfrlndtl(){
        System.out.println("***********************");

        /*QueryWrapper wrapper = new QueryWrapper<InfAfrlndtl>();
        wrapper.ne("DRDOACTA","0.00");
        wrapper.eq("PROTSENO","100");

        System.out.println(wrapper.getSqlSelect());
        List<InfAfrlndtl> list = infAfrlndtlMapper.selectList(wrapper);
        System.out.println("list=="+list);*/



        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        def.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);
        TransactionStatus status = txManager.getTransaction(def);

        try {
            String today = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date());
//            UpdateWrapper updateWrapper = new UpdateWrapper();
//            updateWrapper.eq("ID_","100");
//            updateWrapper.set("ZONENO",today);
//            int row = infAfrlndtlMapper.update(new InfAfrlndtl(),updateWrapper);
//            logger.info("成功更新了没=="+row);
            if(true){
                logger.error("测试能不能回滚！");
                throw new RuntimeException("测试能不能回滚！");
            }
            txManager.commit(status);
        } catch (Exception e) {
            txManager.rollback(status);
            e.printStackTrace();
        } finally {
            logger.info("end......");
        }


    }
}
