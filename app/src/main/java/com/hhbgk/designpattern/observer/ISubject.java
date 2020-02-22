package com.hhbgk.designpattern.observer;

/**
 * 抽象主题(Subject)角色：也叫抽象目标类，它提供了一个用于保存观察者对象的聚集类和增加、删除观察者对象的方法，
 * 以及通知所有观察者的抽象方法。
 */
public interface ISubject {
    void register(IObserver o);
    void remove(IObserver o);
    void notifyObservers();
}
