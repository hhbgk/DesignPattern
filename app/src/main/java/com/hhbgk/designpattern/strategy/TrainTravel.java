package com.hhbgk.designpattern.strategy;

import android.util.Log;

/**
 * 具体策略(Concrete Strategy)类：实现了抽象策略定义的接口，提供具体的算法实现
 */
public class TrainTravel implements IStrategy {
    @Override
    public void travel() {
        Log.i(getClass().getSimpleName(), "Travel by train");
    }
}
