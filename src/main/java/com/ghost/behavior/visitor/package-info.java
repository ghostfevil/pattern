/***
 * 访问者模式：为一个对象结构（比如组合结构）增加能力。
 */

/**
 * Visitor :访问者，为每个ConcreteElement声明一个visit操作。
 * ConcreteVisitor :具体访问者，存储遍历过程中的累计结果。
 * ObjectStructure :对象结构，可以是组合结构，或者是一个集合。
 */

/**
 * 比如我有一个账单，账单有收入、支出两个固定的方法。但是访问账单的人不确定，
 * 有可能一个或者多个。
 * https://www.jianshu.com/p/80b9cd7c0da5
 *
 */

package com.ghost.behavior.visitor;