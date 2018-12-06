package com.ghost.pattern.structure.decorator;

import com.ghost.structure.decorator.Beverage;
import com.ghost.structure.decorator.HouseBlend;
import com.ghost.structure.decorator.Milk;
import com.ghost.structure.decorator.Mocha;
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
        Beverage beverage=new HouseBlend();
        beverage=new Mocha(beverage);
        beverage=new Milk(beverage);
        System.out.println(beverage.cost());
    }

}
