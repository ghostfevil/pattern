package com.ghost.pattern.behavior.template;

import com.ghost.behavior.template.Coffee;
import com.ghost.behavior.template.Tea;
import com.ghost.behavior.template.WateringBeverage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Client {

    @Test
    public void  test()
    {
        WateringBeverage coffee=new Coffee();
        coffee.preapreRecipe();
        WateringBeverage tea=new Tea();
        tea.preapreRecipe();

    }

}
