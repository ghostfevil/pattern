package com.ghost.behavior.observer;

public class ConcreteSubject extends Subject {

    //具体业务
    public void doSomething()
    {

        /***
         * do something
         */

        super.notifyObservers();

    }

}
