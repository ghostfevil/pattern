package com.ghost.creator.factory.abstraction;


public class IntelMainboard implements Mainboard {

    private int mCpuHoles=0;

    public IntelMainboard(int cpuHoles)
    {

        this.mCpuHoles=cpuHoles;

    }


    @Override
    public void installCpu() {

        System.out.println("Intel Mainboard's Cpu Holes is "+mCpuHoles);

    }
}
