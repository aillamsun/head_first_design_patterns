package com.sung.head.first.design.patterns.builder.o2;

/**
 * Created by sungang on 2017/11/16.
 */
public class AltoCar extends Car{


    @Override
    protected void tire() {
        System.out.println("奥拓轮胎");
    }

    @Override
    protected void engine() {
        System.out.println("奥拓引擎");
    }

    @Override
    protected void speaker() {
        System.out.println("奥拓车灯");
    }
}
