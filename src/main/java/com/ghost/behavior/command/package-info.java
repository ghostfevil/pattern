/****
 *
 * 命令模式：将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化，对请求排队或者记录请求日志，可以提供命令的撤销或者恢复功能。
 * 命令模式是一种数据驱动的设计模式。请求以命令的形式包裹在对象中，并传递给调用对象。调用对象寻找可以处理该命令的合适对象，并把该命令传
 * 递给相应的对象，该对象执行命令。
 *
 */

package com.ghost.behavior.command;