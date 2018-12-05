package com.ghost.pattern.behavior.observer;


import com.ghost.behavior.observer.ConcreteObserver;
import com.ghost.behavior.observer.ConcreteSubject;
import com.ghost.behavior.observer.Observer;
import com.ghost.behavior.observer.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Observable;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Client {

    @Test
    public void test()
    {

        Subject subject=new ConcreteSubject();
        Observer obs=new ConcreteObserver();
        subject.addObserver(obs);
        ((ConcreteSubject) subject).doSomething();


    }




}
