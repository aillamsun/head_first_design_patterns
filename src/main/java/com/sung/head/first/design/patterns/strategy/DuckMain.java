package com.sung.head.first.design.patterns.strategy;

/**
 * 本案例主要使用了 设计模式中的策略 模式
 * Created by sungang on 2016/12/25.
 */
public class DuckMain {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.performQuack();
        mallard.performFly();
    }
}
