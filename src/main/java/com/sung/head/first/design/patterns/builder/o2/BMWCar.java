package com.sung.head.first.design.patterns.builder.o2;

/**
 * Created by sungang on 2017/11/16.
 */
public class BMWCar extends Car {

    @Override
    protected void tire() {
        System.out.println("宝马轮胎");
    }

    @Override
    protected void engine() {
        System.out.println("宝马引擎");
    }

    @Override
    protected void speaker() {
        System.out.println("宝马车灯");
    }
}
