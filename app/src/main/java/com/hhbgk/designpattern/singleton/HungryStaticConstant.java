package com.hhbgk.designpattern.singleton;

/**
 * 饿汉式(静态常量)
 *
 * 优点：写法简单，在类加载时就完成实例化，避免线程同步问题。
 * 缺点：在类加载时就完成实例化，没有达到懒加载的效果，若始终没用过这个实例，则造成内存浪费。
 * 结论：可用，但可能造成内存浪费。
 */
public class HungryStaticConstant {
    private static final HungryStaticConstant instance = new HungryStaticConstant();

    private HungryStaticConstant() {
    }

    public static HungryStaticConstant getInstance() {
        return instance;
    }
}
