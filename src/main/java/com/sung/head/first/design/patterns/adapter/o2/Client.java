package com.sung.head.first.design.patterns.adapter.o2;

/**
 * Created by sungang on 2017/11/6.
 */
public class Client {

    public static void main(String[] args) {
        Robot robot = new BirdAdapter();
        robot.cry();
        robot.move();
    }
}
