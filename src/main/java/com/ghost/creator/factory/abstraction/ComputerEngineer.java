package com.ghost.creator.factory.abstraction;

public class ComputerEngineer {


    private Cpu mCpu=null;

    private Mainboard mMainboard=null;

    public void makeComputer(AbsractFactory af)
    {

        //1.首先要准备好装机所需要的配件

        //2.组装机器

        //3.测试机器

        //4.交付客户

    }

    private void prepareHardware(AbsractFactory af)
    {
        //直接找相应的厂家获取
        this.mCpu=af.createCpu();
        this.mMainboard=af.createMainboard();

        //测试配件是否好用
        this.mCpu.calculate();
        this.mMainboard.installCpu();

    }


}
