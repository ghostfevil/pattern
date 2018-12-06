package com.ghost.structure.flyweight;

public class ConcreteFlyWeight implements FlyWeight {

    private String intrinsicState;

    public ConcreteFlyWeight(String instrinsicState)
    {
        this.intrinsicState=instrinsicState;
    }

    @Override
    public void doOperation(String extrinsicState) {
        System.out.println("Object address:"+System.identityHashCode(this));
        System.out.println("IntrinsicState:"+intrinsicState);
        System.out.println("ExtrinsicState:"+extrinsicState);
    }
}
