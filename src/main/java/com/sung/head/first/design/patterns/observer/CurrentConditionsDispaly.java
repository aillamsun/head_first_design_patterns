package com.sung.head.first.design.patterns.observer;

/**
 * Created by sungang on 2016/12/25.
 */
public class CurrentConditionsDispaly implements Observer, DisplayElenment {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionsDispaly(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }


    public void display() {
        System.out.println("Current conditions : " + temperature + " F degrees and " + humidity + "% humidity " + pressure + "% pressure");
    }
}
