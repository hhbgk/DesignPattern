package com.hhbgk.designpattern.observer;

/**
 * 抽象观察者(Observer)角色：它是一个抽象类或接口，包含了一个更新自己的抽象方法，当接到具体主题的更改通知时被调用
 */
public interface IObserver {
    void update(float temperature);
}
