package com.ghost.pattern.creator.builder;

import com.ghost.creator.builder.Builder;
import com.ghost.creator.builder.Director;
import com.ghost.creator.builder.MoonComputerBuilder;
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

        Builder builder=new MoonComputerBuilder();
        Director director=new Director(builder);
        director.createComputer("i7-6700","华擎玩家至尊","三星DDR4");

    }



}
