package com.sung.head.first.design.patterns.strategy;

/**
 * 橡皮鸭吱吱叫
 * Created by sungang on 2016/12/25.
 */
public class Quack implements QuackBehavior {

    public void quack() {
        System.out.println("橡皮鸭吱吱叫!!!");
    }
}
