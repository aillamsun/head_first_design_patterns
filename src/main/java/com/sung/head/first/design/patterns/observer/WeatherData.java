package com.sung.head.first.design.patterns.observer;

import java.util.ArrayList;

/**
 * Created by sungang on 2016/12/25.
 */
public class WeatherData implements Subject {

    //我们添加一个ArrayList 记录所有观察者，此ArrayList是在构造中初始化
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    /**
     * 注册观察者
     *
     * @param o
     */
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * 移除观察者
     *
     * @param o
     */
    public void removeObeserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    /**
     * 通知所有观察者
     */
    public void notifyObserveres() {
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }


    /**
     * 当从气象站得到更新观测值，就通知所有观察者
     */
    public void measurementsChanged() {
        notifyObserveres();
    }

    /**
     *
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }
}
