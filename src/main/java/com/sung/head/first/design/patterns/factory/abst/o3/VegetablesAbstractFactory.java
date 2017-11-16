package com.sung.head.first.design.patterns.factory.abst.o3;

/**
 * Created by sungang on 2017/11/16.
 */
public abstract class VegetablesAbstractFactory implements Factory {


    @Override
    public Fruit getFruit(String fruitType) {
        return null;
    }
    @Override
    public abstract Vegetables getVegetables(String vegetablesType);
}
