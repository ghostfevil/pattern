package com.ghost.pattern.behavior.nullable;

import com.ghost.behavior.nullable.AbstractOperation;
import com.ghost.behavior.nullable.NullOperation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Client {

    @Test
    public void test(){
        AbstractOperation operation=new NullOperation();
        operation.request();
    }

}
