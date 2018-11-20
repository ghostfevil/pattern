package com.ghost.creator.factory.simple;

/****
 * 创造计算机的工厂类
 */
public class ComputerFactory {

    private static ComputerFactory mInstance;
    private Computer mComputer=null;

    private ComputerFactory()
    {

    }

    public static ComputerFactory getmInstance()
    {
        if (mInstance==null)
        {
            synchronized (ComputerFactory.class)
            {
                if (mInstance==null)
                {
                    mInstance=new ComputerFactory();

                }
            }
        }
        return mInstance;
    }

    public  Computer createComuter(String type)
    {

        switch (type)
        {
            case "lenovo":
              mComputer=new LenovoComputer();
              break;
            case "hp":
                mComputer=new HpComputer();
                break;
            case "asus":
                mComputer=new AsusComputer();
                break;
        }
        return mComputer;
    }


}
