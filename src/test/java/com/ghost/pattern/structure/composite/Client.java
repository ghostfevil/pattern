package com.ghost.pattern.structure.composite;


import com.ghost.structure.composite.Component;
import com.ghost.structure.composite.Composite;
import com.ghost.structure.composite.Leaf;
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
        Composite root=new Composite("root");
        Component node1=new Leaf("1");
        Component node2=new Composite("2");
        Component node3=new Leaf("3");

        root.add(node1);
        root.add(node2);
        root.add(node3);

        Component node21=new Leaf("21");
        Component node22=new Composite("22");
        node2.add(node21);
        node2.add(node22);

        Component node221=new Leaf("221");
        node22.add(node221);
        root.print();


    }

}
