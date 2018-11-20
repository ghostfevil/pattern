package com.ghost.pattern.behavior.mediator;


import com.ghost.behavior.mediator.ConcreteColleague1;
import com.ghost.behavior.mediator.ConcreteColleague2;
import com.ghost.behavior.mediator.ConcreteMediator;
import com.ghost.behavior.mediator.Mediator;
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

        Mediator mediator=new ConcreteMediator();
        mediator.setC1(new ConcreteColleague1(mediator));
        mediator.setC2(new ConcreteColleague2(mediator));
        mediator.doSomething1();

    }


}
