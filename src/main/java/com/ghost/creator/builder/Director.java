package com.ghost.creator.builder;

public class Director {


    Builder mBuilder=null;
    public Director(Builder builder)
    {
        this.mBuilder=builder;
    }

    public Computer createComputer(String cpu,String mainBoard,String ram)
    {
        this.mBuilder.buildCpu(cpu);
        this.mBuilder.buildMainboard(mainBoard);
        this.mBuilder.buildRam(ram);
        return this.mBuilder.create();
    }


}
