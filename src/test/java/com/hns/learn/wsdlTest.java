package com.hns.learn;
import com.hns.learn.entity.ChildTest;
import com.hns.learn.entity.NutritionFacts;
import org.junit.Test;

public class wsdlTest {

    @Test
    public void name() {

        ChildTest c = ChildTest.newChildWithWeight(1);
        System.out.println(c.toString());
    }

    @Test
    public void testNutritionFacts() {

        NutritionFacts cocaCola = new NutritionFacts.Builder(240,8).calories(100).sodium(35).carbohydrate(27).build();

        System.out.println(cocaCola.toString());


    }
}
