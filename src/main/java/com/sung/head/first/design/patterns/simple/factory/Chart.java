package com.sung.head.first.design.patterns.simple.factory;

/**
 *
 * 抽象图表接口：抽象产品类
 *
 * Chart接口充当抽象产品类，其子类HistogramChart、PieChart和LineChart充当具体产品类
 * ChartFactory充当工厂类
 *
 * Created by sungang on 2017/11/6.
 */
public interface Chart {

    void display();
}
