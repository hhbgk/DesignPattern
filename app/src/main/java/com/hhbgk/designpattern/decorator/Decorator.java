package com.hhbgk.designpattern.decorator;

/**
 * 装饰者类
 */
public class Decorator implements Drink {
    Drink drink = null;
    float price = 0;

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public float getPrice() {
        return 0;
    }
}
