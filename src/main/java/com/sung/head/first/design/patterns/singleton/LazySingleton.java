package com.sung.head.first.design.patterns.singleton;

/**
 * Created by sungang on 2017/11/6.
 */
public class LazySingleton {


    private volatile static LazySingleton instance = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        //第一重判断
        if (instance == null) {
            //锁定代码块
            synchronized (LazySingleton.class) {
                //第二重判断
                if (instance == null) {
                    instance = new LazySingleton(); //创建单例实例
                }
            }
        }
        return instance;
    }
}
