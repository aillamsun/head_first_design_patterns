package com.sung.head.first.design.patterns.simple.factory;

/**
 * 饼状图类：具体产品类
 * Created by sungang on 2017/11/6.
 */
public class PieChart implements Chart {

    public PieChart() {
        System.out.println("创建饼状图！");
    }

    public void display() {
        System.out.println("显示饼状图！");
    }
}
