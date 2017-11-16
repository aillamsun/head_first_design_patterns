package com.sung.head.first.design.patterns.factory.method.o1;

/**
 * Created by sungang on 2017/11/6.
 */
public class HisenseTVFactory implements TVFactory {

    @Override
    public TV productTV() {
        System.out.println("海信电视机工厂生产海信电视机。");
        return new HisenseTV();
    }
}
