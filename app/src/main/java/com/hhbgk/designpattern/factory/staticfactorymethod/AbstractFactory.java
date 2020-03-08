package com.hhbgk.designpattern.factory.staticfactorymethod;

public abstract class AbstractFactory {
    public abstract <T extends AbstractPhone> T createPhone(Class<T> c);
}
