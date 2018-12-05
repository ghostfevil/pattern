package com.ghost.pattern.behavior.memento;

import com.ghost.behavior.memento.CalculationImpl;
import com.ghost.behavior.memento.Calculator;
import com.ghost.behavior.memento.PreviousCalculationToCareTaker;
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

        Calculator calculator=new CalculationImpl();
        calculator.setFirstNumber(10);
        calculator.setSecondNumber(100);

        System.out.println(calculator.getCalculationResult());

        PreviousCalculationToCareTaker memento=calculator.backupLastCalculation();

        calculator.setFirstNumber(17);
        calculator.setSecondNumber(-290);

        System.out.println(calculator.getCalculationResult());

        calculator.restorePreviousCalculation(memento);

        System.out.println(calculator.getCalculationResult());




    }

}
