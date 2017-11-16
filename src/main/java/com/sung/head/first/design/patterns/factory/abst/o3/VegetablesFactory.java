package com.sung.head.first.design.patterns.factory.abst.o3;

/**
 * Created by sungang on 2017/11/16.
 */
public class VegetablesFactory extends VegetablesAbstractFactory {


    @Override
    public Vegetables getVegetables(String vegetablesType) {
        if ("Tomato".equals(vegetablesType)) {
            return new Tomato();
        } else {
            return new Cucumber();
        }
    }
}
