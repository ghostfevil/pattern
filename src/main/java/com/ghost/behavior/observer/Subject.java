package com.ghost.behavior.observer;


import java.util.Vector;

/****
 *
 * 被观察者
 *
 */

public class Subject {

    //Vector和ArrayList没有太大差别，ArrayList是线程异步的，不安全。Vector相反！
    private Vector<Observer> observerVector=new Vector<>();

    public void addObserver(Observer observer)
    {
        this.observerVector.add(observer);
    }

    public void delObserver(Observer observer)
    {
        this.observerVector.remove(observer);
    }

    /****
     * 被观察者通知观察者
     */
    public void notifyObservers()
    {
        for (Observer observer:observerVector)
        {
            observer.update();
        }
    }

}
