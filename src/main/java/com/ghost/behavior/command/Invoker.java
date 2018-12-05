package com.ghost.behavior.command;

public class Invoker {

    private Command command;
    public void setCommand(Command command)
    {
        this.command=command;
    }

    public void action()
    {
        this.command.execute();
    }

}
