package com.sung.head.first.design.patterns.factory.method.o2;

import java.util.Optional;

/**
 * Created by sungang on 2017/11/16.
 */
public class Main {


    public static void main(String[] args) {
        Factory factory = new CarFactory();
        Optional<Car> car = factory.createCar("BWM");
        if (car.isPresent()) {
            car.get().run();
        }else {
            System.out.println("找不到Car");
        }
    }
}
