package com.sung.head.first.design.patterns.strategy.o1;

/**
 * 这个是给不会飞行的鸭子使用
 * Created by sungang on 2016/12/25.
 */
public class FlyNoWay implements FlyBehavior {

    public void fly() {
        System.out.println("不会飞行的鸭子!!!");
    }
}
