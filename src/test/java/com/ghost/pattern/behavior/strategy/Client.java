package com.ghost.pattern.behavior.strategy;

import com.ghost.behavior.strategy.Duck;
import com.ghost.behavior.strategy.Quack;
import com.ghost.behavior.strategy.Squeak;
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
        Duck duck=new Duck();
        duck.setQuackBehavior(new Squeak());
        duck.performQuack();
        duck.setQuackBehavior(new Quack());
        duck.performQuack();
    }


}
