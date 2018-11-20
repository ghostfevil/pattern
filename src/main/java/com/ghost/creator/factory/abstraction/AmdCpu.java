package com.ghost.creator.factory.abstraction;


/*****
 *
 * AMD CPU
 *
 */

public class AmdCpu implements Cpu {



    private int mPins=0;

    public AmdCpu(int pins)
    {

        this.mPins=pins;

    }

    @Override
    public void calculate() {

        System.out.println("Amd Cpu pins is"+mPins);

    }
}
