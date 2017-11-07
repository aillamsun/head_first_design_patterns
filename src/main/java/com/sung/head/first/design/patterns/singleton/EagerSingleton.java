package com.sung.head.first.design.patterns.singleton;

/**
 * 饿汉式单例类是实现起来最简单的单例类
 * Created by sungang on 2017/11/6.
 */
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
