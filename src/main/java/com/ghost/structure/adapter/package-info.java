/*****
 *
 * 适配器模式：将一个类的接口编程客户端期待的另一种接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作。
 * 适配器模式又叫做变压器模式，也叫做包装模式，包装模式不只是这一种，还有装饰模式。
 *  适配器模式使用于这样的场景，两个类很类似而要统一功能。
 *
 *  ########               ###########              ###########
 *  #      ####            ##        #              ####      ##
 *  #         #(A)            #      #（B）            #         # (C)表示的是一个适配层
 *  #      ####            ##        #              ####      ##
 *  ########               ###########              ###########
 *  Target:目标角色
 *  Adaptee:源角色
 *  Adapter:适配器角色
 */

package com.ghost.structure.adapter;