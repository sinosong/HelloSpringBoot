package com.hns.learn;

import static org.junit.Assert.assertTrue;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hns.learn.common.Context;
import com.hns.learn.dao.impl.StartState;
import com.hns.learn.dao.impl.StopState;
import com.hns.learn.entity.BizCanvas;
import com.hns.learn.mapper.BizCanvasMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
@WebAppConfiguration
public class AppTest {

    @Autowired
    private BizCanvasMapper bizCanvasMapper;

    @Test
    public void selCanvas() {

        System.out.println("selCanvas***********************");
        BizCanvas sel = new BizCanvas();
        sel.setId(1120992891767480321L);
        Wrapper<BizCanvas> queryWrapper = new QueryWrapper<>(sel);
        System.out.println("Mapper=="+bizCanvasMapper.selectOne(queryWrapper).toString());
        System.out.println(bizCanvasMapper.getMaxWorkDate(""));

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
}
