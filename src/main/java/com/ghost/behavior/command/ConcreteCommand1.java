package com.ghost.behavior.command;

public class ConcreteCommand1 extends Command {

    private Receiver receiver;  //关键代码

    public ConcreteCommand1(Receiver receiver)
    {
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        this.receiver.doSometing();
    }
}
