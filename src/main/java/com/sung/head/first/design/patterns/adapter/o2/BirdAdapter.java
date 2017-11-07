package com.sung.head.first.design.patterns.adapter.o2;

/**
 * Created by sungang on 2017/11/6.
 */
public class BirdAdapter extends Bird implements Robot {

    @Override
    public void cry() {
        System.out.print("机器人模仿：");
        super.tweedle();
    }

    @Override
    public void move() {
        System.out.print("机器人模仿：");
        super.fly();
    }
}
