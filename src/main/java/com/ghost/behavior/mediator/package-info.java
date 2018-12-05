/******
 *
 *
 * 中介者模式：定义为用一个中介对象封装一系列的对象交互，中介者使
 * 各个对象不需要显示地相互作用，从而使其耦合松散，而且可以独立改
 * 变他们之间的交互。
 * Mediator:抽象中介者角色
 * ConcreteMediator:具体中介者角色
 * Colleague:同事角色
 * 中介者模式的优点就是减少类的依赖，把原来的一对多的依赖关系变成一对一的依赖，
 * 同事类只依赖中介者，减少了依赖，当然同时也降低了类间的耦合。
 * 中介者模式的缺点就是中介者会膨胀的很大，而且逻辑复杂，原本N个对象直接的相互
 * 依赖关系转化成中介者或同事类的依赖关系。
 * 使用场景：机场调度中心，MVC框架，媒体网关，中介服务等
 */


/**
 * Mediator :中介者，定义一个接口用于与各同事（Colleague）对象通信
 * Colleague :同事，相关对象
 */

//集中相关对象之间复杂的沟通和控制方式。
package com.ghost.behavior.mediator;