package com.ghost.pattern.behavior.iterator;

import com.ghost.behavior.iterator.Aggregate;
import com.ghost.behavior.iterator.ConcreteAggregate;
import com.ghost.behavior.iterator.Iterator;
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

        Aggregate aggregate=new ConcreteAggregate();
        Iterator<Integer> iterator=aggregate.createIterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }

}
