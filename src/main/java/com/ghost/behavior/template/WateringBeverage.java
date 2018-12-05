package com.ghost.behavior.template;

/***
 * 需要用水冲的饮料
 */
public abstract class WateringBeverage {


    public final void preapreRecipe()
    {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();
    abstract void  addCondiments();

    void boilWater()
    {
        System.out.println("boilWater");
    }

    void pourInCup()
    {
        System.out.println("Pour In Cup");
    }


}
