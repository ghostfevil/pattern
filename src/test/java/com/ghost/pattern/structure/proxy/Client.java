package com.ghost.pattern.structure.proxy;


import com.ghost.structure.proxy.IShop;
import com.ghost.structure.proxy.LiuWangShu;
import com.ghost.structure.proxy.Purchasing;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Client {

    @Test
    public void client()
    {

        IShop liuWangShu=new LiuWangShu();
        IShop purchasing=new Purchasing(liuWangShu);
        purchasing.buy();


    }


}
