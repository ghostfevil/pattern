package com.ghost.pattern.creator.singleton;

import com.ghost.creator.singleton.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Client {

    @Test
    public void client1()
    {
        Singleton1 singleton1=Singleton1.getInstance();
        System.out.println(singleton1.toString());
    }

    @Test
    public void client2()
    {
        Singleton2 singleton2=Singleton2.getInstance();
        System.out.println(singleton2);
    }

    @Test
    public void client3()
    {
        Singleton3 singleton3=Singleton3.getInstance();
        System.out.println(singleton3.toString());
    }

    @Test
    public void client4()
    {
        Singleton4 singleton4=Singleton4.getInstance();
        System.out.println(singleton4);

    }

    @Test
    public void client5()
    {
        Singleton5 singleton5=Singleton5.getInstance();
        System.out.println(singleton5);
    }

    @Test
    public void client6()
    {
        Singleton6.INSTANCE.doSomeThing();
    }

}
