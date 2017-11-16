package com.sung.head.first.design.patterns.builder.o2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sungang on 2017/11/16.
 */
public class Main {

    public static void main(String[] args) {


//        BMWCarBulider bulider = new BMWCarBulider();
//        List<String> sequences = new ArrayList<>();
//        sequences.add("tire");
//        sequences.add("speaker");
//        sequences.add("engine");
//
//        bulider.setSequence(sequences);
//
//        Car car = bulider.getCarModel();
//
//        car.display();


        Director director = new Director();
        Car car = director.createBMWCar();
        car.display();


        car = director.createAltoCar();
        car.display();
    }
}
