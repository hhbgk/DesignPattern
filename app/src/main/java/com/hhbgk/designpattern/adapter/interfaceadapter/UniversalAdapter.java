package com.hhbgk.designpattern.adapter.interfaceadapter;

/**
 * 当不需要全部实现接口所提供的方法时，可先设计一个抽象类来实现接口，并为该接口中每个方法提供默认实现(空方法)，
 * 那么该抽象类的子类可有选择地覆盖父类的某些方法来实现需求。
 */
public abstract class UniversalAdapter implements IAdapter {
    @Override
    public int request5V() {
        return 5;
    }

    @Override
    public int request10V() {
        return 10;
    }

    @Override
    public int request12V() {
        return 12;
    }

    @Override
    public int request20V() {
        return 20;
    }
}
