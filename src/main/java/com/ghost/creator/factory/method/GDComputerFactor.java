package com.ghost.creator.factory.method;

import com.ghost.creator.factory.simple.Computer;

/****
 * 具体工厂，负责实例化对象
 */
public class GDComputerFactor extends ComputerFactory {
    @Override
    public <T extends Computer> T createComputer(Class<T> clz) {
        Computer computer=null;
        String className=clz.getName();
        try {
            computer=(Computer) Class.forName(className).newInstance();
        }catch (ClassNotFoundException e)
        {

        }catch (IllegalAccessException e1)
        {

        }catch (InstantiationException e3)
        {

        }
        return (T)computer;

    }
}
