package com.sung.head.first.design.patterns.factory.abst.o2;

/**
 * Created by sungang on 2017/11/6.
 */
public class HaierTVFactory implements TVFactory {

    @Override
    public TV productTV() {
        System.out.println("海尔电视机工厂生产海尔电视机。");
        return new HaierTV();
    }
}
