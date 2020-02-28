package com.hhbgk.designpattern.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

public class DynamicProxy {
    private String tag = getClass().getSimpleName();

    /**
     * @param object 声明被代理对象，即目标对象
     * @return 代理对象
     */
    public Object newProxyInstance(Object object) {
        return Proxy.newProxyInstance(
                object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                new ProxyInvocationHandler(object));
    }

    public Object newProxyInstance(Object object, Class<?> clazz) {
        return Proxy.newProxyInstance(
                object.getClass().getClassLoader(),
                new Class<?>[] {clazz},
                new ProxyInvocationHandler(object));
    }
}
