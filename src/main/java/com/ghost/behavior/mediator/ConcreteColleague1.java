package com.ghost.behavior.mediator;

public class ConcreteColleague1 extends Colleague {


    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }


    public void selfMethod1()
    {
        System.out.println("Concrete Colleague 1 Self Method...");
    }

    public void depMethod()
    {
        System.out.println("Concrete Colleague 1 Dep Method...");
    }

}
