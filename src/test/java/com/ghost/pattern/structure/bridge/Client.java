package com.ghost.pattern.structure.bridge;


import com.ghost.structure.bridge.Abstraction;
import com.ghost.structure.bridge.ConcreteImplementor1;
import com.ghost.structure.bridge.Implementor;
import com.ghost.structure.bridge.RefinedAbstraction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/******
 *
 * 桥接模式测试类
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class Client {


    /****
     * 测试方法
     *
     */
    @Test
    public void test()
    {
        Implementor imp=new ConcreteImplementor1();
        Abstraction abs=new RefinedAbstraction(imp);
        abs.request();

    }


}
