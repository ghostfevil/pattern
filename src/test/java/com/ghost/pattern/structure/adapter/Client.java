package com.ghost.pattern.structure.adapter;


import com.ghost.structure.adapter.Adapter;
import com.ghost.structure.adapter.ConcreteTarget;
import com.ghost.structure.adapter.Target;
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
        Target target=new ConcreteTarget();
        target.request();

        Target target1=new Adapter();
        target1.request();

    }


}
