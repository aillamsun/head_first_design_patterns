package com.sung.head.first.design.patterns.strategy;

/**
 *
 * Created by sungang on 2016/12/25.
 */
public abstract class Duck {

    protected QuackBehavior quackBehavior;
    protected FlyBehavior flyBehavior;

    public Duck(){}

    public abstract void display();


    public void  performFly(){
        flyBehavior.fly();//委托给行为类
    }

    public void performQuack(){
        quackBehavior.quack();
    }


    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
