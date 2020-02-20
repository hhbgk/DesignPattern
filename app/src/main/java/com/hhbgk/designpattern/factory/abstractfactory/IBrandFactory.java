package com.hhbgk.designpattern.factory.abstractfactory;

/**
 *
 * 抽象工厂类
 * 抽象工厂模式是工厂方法模式的升级版本，工厂方法模式只生产一个等级的产品，而抽象工厂模式可生产多个等级的产品。
 * 如华为不只有手机，还有笔记本电脑、路由器等
 */
public interface IBrandFactory {
    ILaptop createLaptop();
    IMobile createMobile();
}
