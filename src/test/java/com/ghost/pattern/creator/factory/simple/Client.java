package com.ghost.pattern.creator.factory.simple;

import com.ghost.creator.factory.simple.ComputerFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Client {

    @Test
    public void client()
    {
        ComputerFactory.getmInstance().createComuter("hp").start();
    }


}
