package com.hhbgk.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题角色：也叫具体目标类，它实现抽象目标中的通知方法，
 * 当具体主题的内部状态发生改变时，通知所有注册过的观察者对象。
 */
public class Weather implements ISubject {
    private List<IObserver> list = new ArrayList<>();
    private float temperature;

    public void change(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
    @Override
    public void register(IObserver o) {
        list.add(o);
    }

    @Override
    public void remove(IObserver o) {
        list.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (IObserver o : list) {
            o.update(temperature);
        }
    }
}
