package com.ghost.creator.factory.abstraction;


/*****
 * 英特尔CPU
 */

public class IntelCpu implements Cpu{



    private int mPins=0;


    public IntelCpu(int pins)
    {
        this.mPins=pins;
    }


    @Override
    public void calculate() {


        System.out.println("Intel Cpu Pins is"+mPins);


    }
}
