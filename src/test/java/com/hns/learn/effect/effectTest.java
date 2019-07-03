package com.hns.learn.effect;

import org.junit.Test;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class effectTest {

    @Test
    public void testDate() {

        Instant now = Instant.now();
        Instant nowBj = Instant.now().plusMillis(TimeUnit.HOURS.toMillis(8));;
        System.out.println("now:"+now);
        System.out.println("nowBj:"+nowBj);
        List list = Arrays.asList("a","b","c");
        System.out.println(list);

    }
}
