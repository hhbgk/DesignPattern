package com.hhbgk.designpattern.flyweight;

import android.util.Log;

import java.util.HashMap;

/**
 * 享元工厂角色：负责创建和管理享元角色
 */
public class FlyweightFactory {
    private static FlyweightFactory instance = null;
    private HashMap<String, IFlyweight> flyweightHashMap = new HashMap<>();

    private FlyweightFactory() {}

    public static FlyweightFactory getInstance() {
        if (null == instance) {
            synchronized (FlyweightFactory.class) {
                if (null == instance) {
                    instance = new FlyweightFactory();
                }
            }
        }
        return instance;
    }

    public IFlyweight getFlyWeight(String key) {
        IFlyweight flyweight = flyweightHashMap.get(key);
        if (flyweight == null) {
            flyweight = new ConcreteFlyweight(key);
            flyweightHashMap.put(key, flyweight);
            Log.e("hello", "new object");
        }

        return flyweight;
    }

    public int getFlyweightSize() {
        return flyweightHashMap.size();
    }
}
