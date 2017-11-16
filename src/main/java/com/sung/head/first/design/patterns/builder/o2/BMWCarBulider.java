package com.sung.head.first.design.patterns.builder.o2;

import java.util.List;

/**
 * Created by sungang on 2017/11/16.
 */
public class BMWCarBulider extends CarBuilder {

    BMWCar car = new BMWCar();

    @Override
    public void setSequence(List<String> sequences) {
        this.car.setSequences(sequences);
    }

    //返回宝马车
    @Override
    public Car getCarModel() {
        return this.car;
    }
}
