package com.ghost.structure.bridge;

public abstract class Abstraction {


    private Implementor mImp;

    public Abstraction(Implementor imp)
    {
        this.mImp=imp;
    }

    public void request()
    {
        this.mImp.doSomething();
    }

    public Implementor getmImp()
    {
        return mImp;
    }


}
