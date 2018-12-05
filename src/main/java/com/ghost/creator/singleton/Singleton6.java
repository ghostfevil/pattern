package com.ghost.creator.singleton;

/****
 * 枚举单例
 */
public enum  Singleton6 {

    INSTANCE;
    public void doSomeThing()
    {
        System.out.println(this.toString());
    }

}
