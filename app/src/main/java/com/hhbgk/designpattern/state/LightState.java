package com.hhbgk.designpattern.state;

/**
 * 抽象状态(State)角色：定义一个接口，用以封装环境对象中的特定状态所对应的行为
 */
public abstract class LightState {
    protected TrafficLight trafficLight;

    public void setContext(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    public abstract void lightRed();

    public abstract void lightYellow();

    public abstract void lightGreen();
}
