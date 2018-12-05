package com.ghost.behavior.mediator;

public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod2()
    {
        System.out.println("Concrete Colleague 2 Self Method...");
    }

    public void depMethod2()
    {
        System.out.println("Concrete Colleague 2 Dep Method...");
    }

}
