package com.hhbgk.designpattern.bridge;

/**
 * 定义抽象类，并包含一个对行为实现化对象的引用
 */
public abstract class CarClass {
    String tag = getClass().getSimpleName();
    protected IBrand brand;

    public CarClass(IBrand brand) {
        this.brand = brand;
    }

    public abstract void createCarClass();
}
