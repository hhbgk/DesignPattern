package com.hhbgk.designpattern.factory.factorymethod;

import android.util.Log;

/**
 * 抽象产品类
 */
public abstract class AbstractPhone {
    String tag = getClass().getSimpleName();
    String name;

    public AbstractPhone(String name) {
        this.name = name;
    }

    public abstract void design();

    protected void produce() {
        Log.i(tag, "Start production");
    }

    protected void sell() {
        Log.i(tag, "Sell products");
    }

    public void start() {
        Log.w(tag, "start make " + name);
        design();
        produce();
        sell();
    }
}
