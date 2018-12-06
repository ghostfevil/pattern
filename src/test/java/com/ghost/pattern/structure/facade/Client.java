package com.ghost.pattern.structure.facade;

import com.ghost.structure.facade.Facade;
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
        Facade facade=new Facade();
        facade.watchMovie();
    }

}
