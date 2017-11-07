package com.sung.head.first.design.patterns.simple.factory;

/**
 * 柱状图类：具体产品类
 * Created by sungang on 2017/11/6.
 */
public class HistogramChart implements Chart {


    public HistogramChart() {
        System.out.println("创建柱状图！");
    }
    @Override
    public void display() {
        System.out.println("显示柱状图！");
    }
}
