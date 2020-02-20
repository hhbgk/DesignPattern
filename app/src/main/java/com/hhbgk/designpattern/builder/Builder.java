package com.hhbgk.designpattern.builder;

/**
 * 抽象的建造者
 */
public abstract class Builder {
    protected Car car = new Car();

    public abstract void buildFrame();
    public abstract void buildTire();
    public abstract void buildEngine();

    public Car getResult() {
        return car;
    }
}
