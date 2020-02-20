package com.hhbgk.designpattern.builder;

import android.util.Log;

/**
 * 具体建造者
 */
public class ConcreteBuilder extends Builder {
    private String tag = getClass().getSimpleName();

    @Override
    public void buildFrame() {
        car.setFrame("frame");
        Log.i(tag, "build frame");
    }

    @Override
    public void buildTire() {
        car.setTires("tires");
        Log.i(tag, "build tires");
    }

    @Override
    public void buildEngine() {
        car.setEngine("engine");
        Log.i(tag, "build engine");
    }
}
