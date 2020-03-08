package com.hhbgk.designpattern.factory.factorymethod;

/**
 * 抽象工厂方法类
 */
public abstract class AbstractBrandFactory {

    public abstract AbstractPhone createPhone(String color);
    public abstract <T extends AbstractPhone> T createPhone(Class<T> claz);
}
