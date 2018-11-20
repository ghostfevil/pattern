package com.ghost.pattern.creator.prototype;


import com.ghost.creator.prototype.ConcretePrototype1;
import com.ghost.creator.prototype.Prototype;
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
        Prototype prototype=new ConcretePrototype1();
        prototype.clone();

    }


}
