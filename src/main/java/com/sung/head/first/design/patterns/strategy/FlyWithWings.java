package com.sung.head.first.design.patterns.strategy;

/**
 * 这个是飞行行为的实现，给所有会飞行的鸭子使用
 * Created by sungang on 2016/12/25.
 */
public class FlyWithWings implements FlyBehavior {

    public void fly() {
        System.out.println("会飞行的鸭子!!!");
    }
}
