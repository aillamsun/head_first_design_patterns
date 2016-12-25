package com.sung.head.first.design.patterns.strategy;

/**
 * Created by sungang on 2016/12/25.
 */
public class RocketDuckMain {

    public static void main(String[] args) {
        Duck model = new RocketPoweredDuck();

        model.performFly();
        model.display();

        model.setFlyBehavior(new FlyRocketPowered());

        model.performFly();

    }
}
