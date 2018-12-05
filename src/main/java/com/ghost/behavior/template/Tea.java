package com.ghost.behavior.template;

public class Tea extends WateringBeverage {
    @Override
    void brew() {
        System.out.println("Tea brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Tea add condiments");
    }
}
