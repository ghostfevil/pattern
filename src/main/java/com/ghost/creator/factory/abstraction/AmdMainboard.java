package com.ghost.creator.factory.abstraction;

public class AmdMainboard implements Mainboard{

    private int mCpuHoles=0;

    public AmdMainboard(int cpuHoles)
    {
        this.mCpuHoles=cpuHoles;
    }

    @Override
    public void installCpu() {

        System.out.println("Amd Mainboard's Cpu Holes is "+mCpuHoles);

    }
}
