package com.ghost.pattern.behavior.visitor;

import com.ghost.behavior.visitor.*;
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
        Customer customer1=new Customer("customer1");
        customer1.addOrder(new Order("order1","item1"));
        customer1.addOrder(new Order("order2","item2"));
        customer1.addOrder(new Order("order3","item3"));

        Order order=new Order("order_a");
        order.addItem(new Item("item_a1"));
        order.addItem(new Item("item_a2"));
        order.addItem(new Item("item_a3"));

        Customer customer2=new Customer("customer2");
        customer2.addOrder(order);

        CustomerGroup customers=new CustomerGroup();
        customers.addCustomer(customer1);
        customers.addCustomer(customer2);

        GeneralReport visitor=new GeneralReport();
        customers.accept(visitor);
        visitor.displayResults();


    }


}
