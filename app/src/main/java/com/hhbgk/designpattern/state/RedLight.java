package com.hhbgk.designpattern.state;

import android.util.Log;

/**
 * 具体状态(Concrete State)角色：实现抽象状态所对应的行为
 */
public class RedLight extends LightState {
    private String tag = getClass().getSimpleName();

    @Override
    public void lightRed() {
        Log.i(tag, "The red light is on!");
    }

    @Override
    public void lightYellow() {
        Log.w(tag, "Wait! The red light is on!");
    }

    @Override
    public void lightGreen() {
        trafficLight.setState(TrafficLight.GREEN_STATE);
        trafficLight.getState().lightGreen();
    }
}
