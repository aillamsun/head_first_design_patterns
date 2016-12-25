package com.sung.head.first.design.patterns.observer;

/**
 * 所有气象站组件都实现此观察者接口。这样，主题在需要通知观察者时，有了一个共同的接口
 * Created by sungang on 2016/12/25.
 */
public interface Observer {

    /**
     * 所有观察者都必须实现update()方法，以实现观察者接口，在这里
     * 我们把值传入观察者中
     * @param temp
     * @param humidity
     * @param pressure
     */
    void update(float temp,float humidity,float pressure);
}
