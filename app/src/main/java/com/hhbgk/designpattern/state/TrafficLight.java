package com.hhbgk.designpattern.state;

/**
 * 环境(Context)角色：也称为上下文，它定义了客户感兴趣的接口，维护一个当前状态，
 * 并将与状态相关的操作委托给当前状态对象来处理
 */
public class TrafficLight {
    public final static LightState RED_STATE = new RedLight();
    public final static LightState YELLOW_STATE = new YellowLight();
    public final static LightState GREEN_STATE = new GreenLight();
    private LightState state;

    public LightState getState() {
        return state;
    }

    public void setState(LightState state) {
        this.state = state;
        state.setContext(this);
    }

    public void setLightRed() {
        state.lightRed();
    }

    public void setLightYellow() {
        state.lightYellow();
    }

    public void setLightGreen() {
        state.lightGreen();
    }
}
