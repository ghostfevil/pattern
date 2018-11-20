package com.ghost.pattern.creator.factory.method;


import com.ghost.creator.factory.method.ComputerFactory;
import com.ghost.creator.factory.method.GDComputerFactor;
import com.ghost.creator.factory.simple.Computer;
import com.ghost.creator.factory.simple.HpComputer;
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

        ComputerFactory computerFactory=new GDComputerFactor();
        Computer computer=computerFactory.createComputer(HpComputer.class);
        computer.start();



    }



}
