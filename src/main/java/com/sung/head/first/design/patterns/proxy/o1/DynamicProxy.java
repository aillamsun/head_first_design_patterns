package com.sung.head.first.design.patterns.proxy.o1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by sungang on 2017/11/19.
 */
public class DynamicProxy<T> {


    public static <T> T newProxyInstance(ClassLoader classLoader, Class<?>[] interfaces, InvocationHandler h) {
        return (T) Proxy.newProxyInstance(classLoader, interfaces, h);
    }
}
