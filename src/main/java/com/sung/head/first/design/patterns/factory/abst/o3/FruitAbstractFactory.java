package com.sung.head.first.design.patterns.factory.abst.o3;

/**
 * Created by sungang on 2017/11/16.
 */
public abstract class FruitAbstractFactory implements Factory {


    @Override
    public Vegetables getVegetables(String vegetablesType) {
        return null;
    }
    @Override
    public abstract Fruit getFruit(String fruitType);
}
