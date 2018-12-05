package com.ghost.creator.factory.simple;

/****
 *
 * 开发人员在创建的时候就赋予一台计算机
 */
public class Developer {

    private Computer mComputer;

    public Developer(Computer computer)
    {
        this.mComputer=computer;
    }

    public void startWork()
    {
        //STEP 1
        mComputer.start();
    }

}
