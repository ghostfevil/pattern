package com.ghost.pattern.creator.factory.abstraction;


import com.ghost.creator.factory.abstraction.AbsractFactory;
import com.ghost.creator.factory.abstraction.ComputerEngineer;
import com.ghost.creator.factory.abstraction.IntelFactory;
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

        ComputerEngineer computerEngineer=new ComputerEngineer();
        AbsractFactory af=new IntelFactory();
        computerEngineer.makeComputer(af);

    }


}
