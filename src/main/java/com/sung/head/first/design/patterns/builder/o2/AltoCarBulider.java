package com.sung.head.first.design.patterns.builder.o2;

import java.util.List;

/**
 * Created by sungang on 2017/11/16.
 */
public class AltoCarBulider extends CarBuilder {


    AltoCar car = new AltoCar();

    @Override
    public void setSequence(List<String> sequences) {
        this.car.setSequences(sequences);
    }

    @Override
    public Car getCarModel() {
        return this.car;
    }
}
