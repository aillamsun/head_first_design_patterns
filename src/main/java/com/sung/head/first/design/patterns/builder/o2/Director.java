package com.sung.head.first.design.patterns.builder.o2;

import java.util.ArrayList;
import java.util.List;

/**
 * 导演
 * Created by sungang on 2017/11/16.
 */
public class Director {

    private List<String> sequences = new ArrayList<>();
    //宝马建造
    private BMWCarBulider bmwCarBulider = new BMWCarBulider();
    private AltoCarBulider altoCarBulider = new AltoCarBulider();

    /**
     * 建造宝马车
     * @return
     */
    public Car createBMWCar(){
        this.sequences.clear();
        sequences.add("tire");
        sequences.add("speaker");
        sequences.add("engine");

        this.bmwCarBulider.setSequence(sequences);

        return this.bmwCarBulider.getCarModel();
    }

    /**
     * 建造奥拓车
     * @return
     */
    public Car createAltoCar(){
        this.sequences.clear();
        sequences.add("speaker");
        sequences.add("engine");
        sequences.add("tire");

        this.altoCarBulider.setSequence(sequences);

        return this.altoCarBulider.getCarModel();
    }
}
