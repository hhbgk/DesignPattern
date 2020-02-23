package com.hhbgk.designpattern.strategy;

/**
 * 环境(Context)类：持有一个策略类的引用，最终给客户端调用
 */
public final class Traveler {
    private IStrategy strategy;

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void travelStyle() {
        strategy.travel();
    }
}
