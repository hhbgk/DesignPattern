package com.hhbgk.designpattern.decorator;

/**
 * 具体的被装饰的对象类
 */
public class ColombianCoffee implements Drink {
    private float price = 6.8f;

    @Override
    public String getDescription() {
        return "Colombian Coffee, price is " + getPrice();
    }

    @Override
    public float getPrice() {
        return price;
    }
}
