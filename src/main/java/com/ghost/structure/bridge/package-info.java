/*******
 *
 * 桥接模式：将抽象部分于实现部分分离，是它们都可以独立地进行变化。
 * 桥接模式的重点在于“解耦”上，如何让它们两者解耦时我们要了解的重点。
 * Android中的window和windowmanager就是使用桥接模式来实现的。
 * Abstraction:抽象化角色。它的主要职责是定义出该角色的行为，同时保存一个对实例化角色的引用，该角色一般是抽象类。
 * Implementor:实现化角色。它是接口或者抽象类，定义角色必需的行为和属性。
 * RefinedAbstraction:修正抽象化角色。它引用实现化角色对抽象化角色进行修正。
 * ConcreteImplementor:具体实现化角色。它实现接口或抽象类的定义的方法和属性。
 *
 *
 */

package com.ghost.structure.bridge;