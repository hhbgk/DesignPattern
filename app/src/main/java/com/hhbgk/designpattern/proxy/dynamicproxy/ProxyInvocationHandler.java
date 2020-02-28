package com.hhbgk.designpattern.proxy.dynamicproxy;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyInvocationHandler implements InvocationHandler {
    private String tag = getClass().getSimpleName();
    // 声明被代理对象，即目标对象
    // 作用：绑定关系
    private Object targetObject;

    public ProxyInvocationHandler(Object subject) {
        targetObject = subject;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        Log.i(tag, "Dynamic proxy start..." );
        Object ret = method.invoke(targetObject, args);
        Log.i(tag, "Dynamic proxy stop...return value=" + ret);
        return ret;
    }
}
