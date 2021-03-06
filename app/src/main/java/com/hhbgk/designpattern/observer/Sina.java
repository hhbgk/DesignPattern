package com.hhbgk.designpattern.observer;

import android.util.Log;

/**
 * 具体观察者角色：实现抽象观察者中定义的抽象方法，以便在得到目标的更改通知时更新自身的状态。
 */
public class Sina implements IObserver {
    @Override
    public void update(float temperature) {
        Log.w(getClass().getSimpleName(), "Sina weather temperature:" + temperature);
    }
}
