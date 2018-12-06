package com.ghost.pattern.structure.flyweight;

import com.ghost.structure.flyweight.FlyWeight;
import com.ghost.structure.flyweight.FlyWeightFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Client {

    @Test
    public void test()
    {
        FlyWeightFactory flyWeightFactory=new FlyWeightFactory();
        FlyWeight flyWeight1=flyWeightFactory.getFlyWeight("aa");
        FlyWeight flyWeight2=flyWeightFactory.getFlyWeight("aa");
        System.out.println(flyWeight1);
        flyWeight1.doOperation("x");
        System.out.println(flyWeight2);
        flyWeight2.doOperation("y");
    }

}
