/**
 * 策略模式：定义一系列算法，封装每个算法，并使它们可以互换。
 */

/***
 * Strategy :接口定义了一个算法簇，它们都实现了behavior方法
 * Context :是使用到该算法簇的类，其中的dosomething()方法会调用behavior()，setStrategy(Strategy)方法
 * 可以动态地改变strategy对象，也就是说能动态地改变Context所使用的算法。
 */
package com.ghost.behavior.strategy;