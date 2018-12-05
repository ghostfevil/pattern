package com.ghost.pattern.behavior.interpretor;

import com.ghost.behavior.interpreter.Expression;
import com.ghost.behavior.interpreter.SimpleExpressionTree;
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
        Expression define= SimpleExpressionTree.buildInterpreterTree();
        String context1="D A";
        String contect2="A B";
        System.out.println(define.interpret(context1));
        System.out.println(define.interpret(contect2));
    }


}
