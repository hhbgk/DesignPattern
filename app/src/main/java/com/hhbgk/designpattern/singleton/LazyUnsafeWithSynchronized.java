package com.hhbgk.designpattern.singleton;

/**
 *
 * 懒汉式(线程不安全，加同步代码块)
 * 与LazyThreadUnsafe方式类似，不要使用
 */
public class LazyUnsafeWithSynchronized {
    private static LazyUnsafeWithSynchronized instance = null;

    private LazyUnsafeWithSynchronized() {
    }

    public static LazyUnsafeWithSynchronized getInstance() {
        if (null == instance) {
            synchronized (LazyUnsafeWithSynchronized.class) {
                instance = new LazyUnsafeWithSynchronized();
            }
        }
        return instance;
    }

}
