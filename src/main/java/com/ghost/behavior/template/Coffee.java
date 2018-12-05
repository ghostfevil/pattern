package com.ghost.behavior.template;

public class Coffee extends WateringBeverage {
    @Override
    void brew() {
        System.out.println("Coffee brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Coffee add Condiments");
    }
}
