package com.hhbgk.designpattern.decorator;

/**
 * 具体装饰类
 */
public class Sugar extends Decorator {

    public Sugar(Drink drink) {
        this.drink = drink;
        this.price = 2.0f;
    }

    @Override
    public float getPrice() {
        return drink.getPrice() + price;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + "\n"+ "add sugar " + price;// price表示sugar的价格
    }
}
