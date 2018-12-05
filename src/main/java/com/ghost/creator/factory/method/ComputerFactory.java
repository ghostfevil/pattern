package com.ghost.creator.factory.method;

import com.ghost.creator.factory.simple.Computer;

/***
 * 抽象工厂
 */
public abstract class ComputerFactory {

    public abstract <T extends Computer> T createComputer(Class<T> clz);


}
