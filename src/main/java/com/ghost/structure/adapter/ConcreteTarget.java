package com.ghost.structure.adapter;

public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("If you need any help.Pls call me!");
    }
}
