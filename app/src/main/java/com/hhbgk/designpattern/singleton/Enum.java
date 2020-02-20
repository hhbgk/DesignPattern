package com.hhbgk.designpattern.singleton;

/**
 * 枚举
 * <p>
 * 优点：不仅避免多线程同步问题，而且还能防止反序列化重新创建的对象
 * 缺点：未知
 * 结论：在实际开发中，推荐使用这种方式
 */
public enum Enum {
    INSTANCE;

    public void functon() {
    }

}
