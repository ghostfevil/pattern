package com.ghost.structure.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/*****
 *
 * 动态代理类主要是需要实现InvocationHandler接口的invoke方法
 *
 *
 */

public class DynamicPurchasing implements InvocationHandler {

    private Object mObj;

    public DynamicPurchasing(Object o)
    {
        this.mObj=o;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result=method.invoke(mObj,args);
        if (method.getName().equals("buy"))
        {
            System.out.println("Liu Wang Shu is buying!");
        }
        return result;
    }
}
