package com.ghost.structure.bridge;

public class ConcreteImplementor2 implements Implementor{
    @Override
    public void doSomething() {
        System.out.println("ConcreteImplement2 DoSomething");
    }

    @Override
    public void doAnything() {
        System.out.println("ConcreteImplement2 DoAnything");
    }
}
