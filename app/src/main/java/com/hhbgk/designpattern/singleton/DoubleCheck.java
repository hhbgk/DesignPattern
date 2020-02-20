package com.hhbgk.designpattern.singleton;

/**
 * 双重检查
 * 优点：既起到懒加载效果，又解决线程不安全问题，更避免反复进行方法同步，效率较高
 * 缺点：无
 * 结论：在实际开发中，推荐使用这种方式
 *
 */
public class DoubleCheck {
    private static volatile DoubleCheck instance = null;

    private DoubleCheck() {
    }

    public static DoubleCheck getInstance() {
        if (null == instance) {
            synchronized (DoubleCheck.class) {
                if (null == instance) {
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }

}
