package com.ghost.pattern.behavior.chain;

import com.ghost.behavior.chain.*;
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

        Handler handler1=new ConcreteHandler1(null);
        Handler handler2=new ConcreteHandler2(handler1);

        Request request1=new Request(RequestType.TYPE1,"request1");
        handler2.handleRequest(request1);
        Request request2=new Request(RequestType.TYPE2,"request2");
        handler2.handleRequest(request2);



    }


}
