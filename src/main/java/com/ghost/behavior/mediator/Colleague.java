package com.ghost.behavior.mediator;

public abstract class Colleague {

    protected Mediator mMediator;

    public Colleague(Mediator mediator)
    {
        this.mMediator=mediator;
    }

}
