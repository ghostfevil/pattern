package com.ghost.structure.bridge;

public class ConcreteImplementor1 implements Implementor {
    @Override
    public void doSomething() {
        System.out.println("ConcreteImplementor1 DoSomething");
    }

    @Override
    public void doAnything() {
        System.out.println("ConcreteImplementor1 DoAnything");
    }
}
