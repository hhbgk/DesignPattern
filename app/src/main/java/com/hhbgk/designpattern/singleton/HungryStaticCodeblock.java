package com.hhbgk.designpattern.singleton;

/**
 * 饿汉式(静态代码块)
 * 与饿汉式(静态常量)类似
 */
public class HungryStaticCodeblock {
    private static HungryStaticCodeblock instance;

    static {
        instance = new HungryStaticCodeblock();
    }

    private HungryStaticCodeblock() {
    }

    public static HungryStaticCodeblock getInstance() {
        return instance;
    }

}
