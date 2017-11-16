package com.sung.head.first.design.patterns.factory.abst.o3;

import com.sung.head.first.design.patterns.factory.abst.o3.Apple;
import com.sung.head.first.design.patterns.factory.abst.o3.Banana;
import com.sung.head.first.design.patterns.factory.abst.o3.Fruit;
import com.sung.head.first.design.patterns.factory.abst.o3.FruitAbstractFactory;

/**
 * Created by sungang on 2017/11/16.
 */
public class FruitFactory extends FruitAbstractFactory {

    @Override
    public Fruit getFruit(String fruitType) {
        if ("Apple".equals(fruitType)) {
            return new Apple();
        } else {
            return new Banana();
        }
    }
}
