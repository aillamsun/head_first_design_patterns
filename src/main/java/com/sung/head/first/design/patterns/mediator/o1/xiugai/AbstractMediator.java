package com.sung.head.first.design.patterns.mediator.o1.xiugai;


/**
 * 抽象中介类
 * Created by sungang on 2017/11/19.
 */
public abstract class AbstractMediator {

    protected Stock stock;
    protected Purchase purchase;
    protected Sale sale;

    public AbstractMediator() {
        stock = new Stock(this);
        purchase = new Purchase(this);
        sale = new Sale(this);
    }

    /**
     * 中介者最重要的方法叫做事件方法 处理多个对象之间的关系
     * @param str
     * @param objects
     */
    abstract void execute(String str, Object... objects);
}
