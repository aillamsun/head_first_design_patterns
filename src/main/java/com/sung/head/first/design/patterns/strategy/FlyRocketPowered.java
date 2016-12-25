package com.sung.head.first.design.patterns.strategy;

/**
 * 我是一只像火箭速度飞行的鸭子
 * Created by sungang on 2016/12/25.
 */
public class FlyRocketPowered implements FlyBehavior {

    public void fly() {
        System.out.println("哈哈,燃气一加, 我就一只像火箭速度飞行的鸭子,利用我可以飞行的很快!!!");
    }
}
