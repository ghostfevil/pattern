/*****
 * 备忘录模式：在不违反封装的情况下获得对象的内部状态，从而在需要的时候可以将对象恢复到最初状态
 */

/*****
 * Originator :原始对象
 * Caretaker :负责保存好备忘录
 * Menento :备忘录，存储原始对象的状态。备忘录实际上有两个接口，一个是提供给CareTaker的窄接口：它只能
 * 将备忘录传递给其它对象；一个是提供给Originator的宽接口，允许它访问到先前状态所需的所有数据。在理想
 * 情况下只允许Originator访问本备忘录的内部状态
 */

package com.ghost.behavior.memento;