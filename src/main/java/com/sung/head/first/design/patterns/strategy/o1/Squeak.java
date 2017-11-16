package com.sung.head.first.design.patterns.strategy.o1;

/**
 * 呱呱叫的鸭子
 * Created by sungang on 2016/12/25.
 */
public class Squeak implements QuackBehavior {

    public void quack() {
        System.out.println("呱呱叫的鸭子");
    }
}
