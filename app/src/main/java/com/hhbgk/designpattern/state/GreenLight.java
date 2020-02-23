package com.hhbgk.designpattern.state;

import android.util.Log;

/**
 * 具体状态(Concrete State)角色：实现抽象状态所对应的行为
 */
public class GreenLight extends LightState {
    private String tag = getClass().getSimpleName();

    @Override
    public void lightRed() {
        Log.w(tag, "Wait! The green light is on!");
    }

    @Override
    public void lightYellow() {
        trafficLight.setState(TrafficLight.YELLOW_STATE);
        trafficLight.getState().lightYellow();
    }

    @Override
    public void lightGreen() {
        Log.i(tag, "The green light is on!");
    }
}
