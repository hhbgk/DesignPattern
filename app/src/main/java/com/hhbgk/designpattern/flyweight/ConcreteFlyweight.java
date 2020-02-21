package com.hhbgk.designpattern.flyweight;

import android.util.Log;

/**
 * 具体享元角色,实现抽象享元角色中所规定的接口
 */
public class ConcreteFlyweight implements IFlyweight {
    String tag = getClass().getSimpleName();
    private String key;

    public ConcreteFlyweight(String key) {
        this.key = key;
    }

    @Override
    public void move(Coordinate coordinate) {
        Log.i(tag, key + " move to x=" + coordinate.getX()+", y="+coordinate.getY());
    }
}
