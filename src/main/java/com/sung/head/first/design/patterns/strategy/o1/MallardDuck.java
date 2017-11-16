package com.sung.head.first.design.patterns.strategy.o1;

/**
 *
 * 绿头鸭
 * Created by sungang on 2016/12/25.
 */
public class MallardDuck extends Duck {


    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("我是一个绿头的鸭子");
    }
}
