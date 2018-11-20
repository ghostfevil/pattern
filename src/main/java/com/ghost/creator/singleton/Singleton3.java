package com.ghost.creator.singleton;

/****
 * 懒汉模式（线程安全）
 */
public class Singleton3 {

    private static Singleton3 instance;

    /****
     * 私有化构造函数
     */
    private Singleton3()
    {

    }
    public static synchronized Singleton3 getInstance()
    {
        if (instance==null)
        {
            instance=new Singleton3();
        }
        return instance;
    }


}
