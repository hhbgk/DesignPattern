package com.hhbgk.designpattern.state;

import android.util.Log;

/**
 * 具体状态(Concrete State)角色：实现抽象状态所对应的行为
 */
public class YellowLight extends LightState {
    private String tag = getClass().getSimpleName();
    @Override
    public void lightRed() {
        trafficLight.setState(TrafficLight.GREEN_STATE);
        trafficLight.getState().lightRed();
    }

    @Override
    public void lightYellow() {
        Log.i(tag, "The yellow light is on!");
    }

    @Override
    public void lightGreen() {
        Log.w(tag, "Wait! The yellow light is on!");
    }
}
