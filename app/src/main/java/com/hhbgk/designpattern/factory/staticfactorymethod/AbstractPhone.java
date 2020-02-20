package com.hhbgk.designpattern.factory.staticfactorymethod;

import android.util.Log;

public abstract class AbstractPhone {
    String tag = getClass().getSimpleName();

    public abstract void design();

    protected void produce() {
        Log.i(tag, "Start production");
    }

    protected void sell() {
        Log.i(tag, "Sell products");
    }

    public void start() {
        design();
        produce();
        sell();
    }
}
