package com.ghost.structure.facade;

public class Facade {

    protected SubSystem subSystem=new SubSystem();

    public void watchMovie()
    {
        subSystem.turnOnTv();
        subSystem.setCD("a movie");
        subSystem.startWatching();
    }

}
