package com.hhbgk.designpattern.singleton;

/**
 *
 * 静态内部类
 * 利用类加载机制保证实例初始化时只有一个线程
 * 利用静态内部类方式在外部类被加载时并不会立即实例化，而在调用getInstance时才会加载SingletonInstance，从而完成Singleton的实例化
 *
 * 优点：既起到懒加载效果，又解决线程不安全问题，更避免反复进行方法同步，效率高
 * 缺点：无
 * 结论：在实际开发中，推荐使用这种方式
 */
public class StaticInnerClass {
    private StaticInnerClass() {
    }

    private static class SingletonInstance {
        private static final StaticInnerClass INSTANCE = new StaticInnerClass();
    }

    public static StaticInnerClass getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
