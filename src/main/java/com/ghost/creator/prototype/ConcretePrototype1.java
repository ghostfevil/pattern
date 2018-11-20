package com.ghost.creator.prototype;

/*****
 *
 *
 * 具体可克隆原型，要实现克隆方法
 *
 *
 */

public class ConcretePrototype1 implements Prototype {
    @Override
    public Prototype clone() {
        return new ConcretePrototype1();
    }
}
