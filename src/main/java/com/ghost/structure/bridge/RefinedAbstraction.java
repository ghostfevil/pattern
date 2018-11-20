package com.ghost.structure.bridge;

public class RefinedAbstraction extends Abstraction {

    //覆盖构造函数
    public RefinedAbstraction(Implementor imp) {
        super(imp);
    }

    @Override
    public void request()
    {
        /****
         * 业务逻辑
         */
        super.request();
        super.getmImp().doAnything();
    }

}
