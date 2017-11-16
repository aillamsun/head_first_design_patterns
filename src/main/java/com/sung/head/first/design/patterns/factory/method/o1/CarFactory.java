package com.sung.head.first.design.patterns.factory.method.o2;

import java.util.Optional;

/**
 * Created by sungang on 2017/11/16.
 */
public class CarFactory extends Factory {

    @Override
    public Optional<Car> createCar(String carType) {
        Optional<Car> car = null;
        switch (carType) {
            case "BWM":
                car = Optional.of(new BMWCar());
                break;
            case "Ben":
                car = Optional.of(new BenCar());
                break;
            default:
                car = Optional.empty();
        }
        return car;
    }
}
