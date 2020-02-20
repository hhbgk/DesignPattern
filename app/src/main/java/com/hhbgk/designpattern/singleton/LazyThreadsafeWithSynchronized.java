package com.hhbgk.designpattern.singleton;

/**
 * 懒汉式(线程安全，加同步方法)
 * 优点：起到懒加载效果，解决了线程不安全问题
 * 缺点：执行效率变低，其实这个方法只执行一次实例化代码就够了
 * 结论：在实际开发中，不推荐使用这种方式
 */
public class LazyThreadsafeWithSynchronized {
    private static LazyThreadsafeWithSynchronized instance = null;

    private LazyThreadsafeWithSynchronized() {
    }

    public static synchronized LazyThreadsafeWithSynchronized getInstance() {
        if (null == instance) {
            instance = new LazyThreadsafeWithSynchronized();
        }
        return instance;
    }

}
