package com.ghost.creator.singleton;

/*****
 * 饿汉式单例
 */
public class Singleton1 {

    private static final Singleton1 instance=new Singleton1();
    /****
     * 私有化构造函数
     */
    private Singleton1()
    {
    }
    public static Singleton1 getInstance()
    {
        return instance;
    }

}
