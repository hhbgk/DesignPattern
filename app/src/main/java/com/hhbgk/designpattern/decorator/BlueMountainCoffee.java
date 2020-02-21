package com.hhbgk.designpattern.decorator;

/**
 * 具体的被装饰的对象类
 */
public class BlueMountainCoffee implements Drink {
    private float price = 8.8f;

    @Override
    public String getDescription() {
        return "Blue Mountain Coffee，price is " + price;
    }

    @Override
    public float getPrice() {
        return price;
    }
}
