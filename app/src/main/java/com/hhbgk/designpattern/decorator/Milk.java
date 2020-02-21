package com.hhbgk.designpattern.decorator;

/**
 * 具体装饰者类
 */
public class Milk extends Decorator {

    public Milk(Drink drink) {
        this.drink = drink;
        this.price = 1.0f;
    }

    @Override
    public float getPrice() {
        return drink.getPrice() + price;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + "\n"+ "add milk " + price;// price表示milk的价格
    }
}
