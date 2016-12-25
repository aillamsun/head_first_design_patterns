package com.sung.head.first.design.patterns.strategy;

/**
 * 火箭鸭子
 * Created by sungang on 2016/12/25.
 */
public class RocketPoweredDuck extends Duck {

    public RocketPoweredDuck() {
        flyBehavior = new FlyNoWay();//一开始 我不会飞行
        quackBehavior = new Quack();
    }


    @Override
    public void display() {
        System.out.println("我是一个初始化不会飞行的 火箭鸭子，我需要给自己燃点之后才可以飞行!");
    }
}
