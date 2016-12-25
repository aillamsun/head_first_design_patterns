package com.sung.head.first.design.patterns.observer;

/**
 *
 * 这里是我们定义的主题
 *
 * Created by sungang on 2016/12/25.
 */
public interface Subject {

    /**
     * 这两个方法都需要一个观察者作为变量，该观察者是用来注册或者被删除
     * @param o
     */
    void registerObserver(Observer o); //
    void removeObeserver(Observer o);

    /**
     * 当主题状态改变时，这个方法会被调用，以通知所有观察者
     */
    void notifyObserveres();
}
