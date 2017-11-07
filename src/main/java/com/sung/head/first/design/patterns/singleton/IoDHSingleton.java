package com.sung.head.first.design.patterns.singleton;

/**
 *
 * Initialization Demand Holder (IoDH)的技术。在IoDH中，我们在单例类中增加一个静态(static)内部类，在该内部类中创建单例对象
 * 通过使用IoDH，我们既可以实现延迟加载，又可以保证线程安全，不影响系统性能，不失为一种最好的Java语言单例模式实现方式
 * Created by sungang on 2017/11/6.
 */
public class IoDHSingleton {


    private IoDHSingleton() {
    }

    private static class HolderClass {
        private final static IoDHSingleton instance = new IoDHSingleton();
    }


    public static IoDHSingleton getInstance() {
        return HolderClass.instance;
    }

    public static void main(String[] args) {
        IoDHSingleton s1, s2;
        s1 = IoDHSingleton.getInstance();
        s2 = IoDHSingleton.getInstance();
        System.out.println(s1 == s2);
    }
}
