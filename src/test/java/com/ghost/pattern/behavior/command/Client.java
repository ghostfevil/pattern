package com.ghost.pattern.behavior.command;


import com.ghost.behavior.command.*;
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
        Invoker invoker=new Invoker();
        Receiver receiver=new ConcreteReceiver1();
        Command command=new ConcreteCommand1(receiver);

        invoker.setCommand(command);
        invoker.action();

    }

}
