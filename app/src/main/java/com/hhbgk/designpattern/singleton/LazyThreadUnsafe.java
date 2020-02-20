package com.hhbgk.designpattern.singleton;

/**
 * 懒汉式(线程不安全)
 * 优点：起到懒加载效果，但适合在单线程下使用
 * 缺点：如果在多线程下，会产生多个实例，线程不安全
 * 结论：在实际开发中，不要使用这种方式
 */
public class LazyThreadUnsafe {
    private static LazyThreadUnsafe instance = null;

    private LazyThreadUnsafe() {
    }

    public static LazyThreadUnsafe getInstance() {
        if (null == instance) {
            instance = new LazyThreadUnsafe();
        }
        return instance;
    }

}
