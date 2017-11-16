package com.sung.head.first.design.patterns.factory.abst.o1;

/**
 * Created by sungang on 2017/11/6.
 */
public class SpringButton implements Button {

    @Override
    public void display() {
        System.out.println("显示浅绿色按钮。");
    }
}
