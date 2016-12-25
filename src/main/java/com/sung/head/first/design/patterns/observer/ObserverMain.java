package com.sung.head.first.design.patterns.observer;

/**
 * 气象站案例
 * Created by sungang on 2016/12/25.
 */
public class ObserverMain {

    public static void main(String[] args) {

        //首先建立一个主题
        WeatherData weatherData = new WeatherData();


        CurrentConditionsDispaly currentConditionsDispaly = new CurrentConditionsDispaly(weatherData);


        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(80,65,30.4f);

    }
}
