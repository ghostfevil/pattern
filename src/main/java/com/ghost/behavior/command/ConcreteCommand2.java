package com.ghost.behavior.command;

public class ConcreteCommand2 extends Command {

    private Receiver receiver;

    public ConcreteCommand2(Receiver receiver)
    {
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        this.receiver.doSometing();
    }
}
