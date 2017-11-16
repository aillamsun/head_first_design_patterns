package com.sung.head.first.design.patterns.strategy.o1;

/**
 * 不会叫的鸭子
 * Created by sungang on 2016/12/25.
 */
public class MuteQuack implements QuackBehavior {

    public void quack() {
        System.out.println("<< 不会叫的鸭子 >>");
    }
}
