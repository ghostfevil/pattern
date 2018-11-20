package com.ghost.pattern.structure.proxy.dynamic;


import com.ghost.structure.proxy.IShop;
import com.ghost.structure.proxy.LiuWangShu;
import com.ghost.structure.proxy.dynamic.DynamicPurchasing;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Proxy;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Client {


    @Test
    public void client()
    {

        IShop liuWangShu=new LiuWangShu();
        DynamicPurchasing dynamicPurchasing=new DynamicPurchasing(liuWangShu);
        ClassLoader loader=liuWangShu.getClass().getClassLoader();
        IShop purchasing=(IShop)Proxy.newProxyInstance(loader,new Class[]{IShop.class},dynamicPurchasing);
        purchasing.buy();


    }



}
