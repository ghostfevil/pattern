package com.ghost.creator.singleton;

/****
 * 懒汉模式（线程不安全）
 */
public class Singleton2 {

    private static Singleton2 instance;

    /***
     * 私有化构造函数
     */
    private Singleton2()
    {

    }

    public static Singleton2 getInstance()
    {
        if (instance==null)
        {
            instance=new Singleton2();
        }
        return instance;
    }


}
