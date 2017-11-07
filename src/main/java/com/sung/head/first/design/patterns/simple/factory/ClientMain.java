package com.sung.head.first.design.patterns.simple.factory;

/**
 *
 * 简单工厂模式
 * Created by sungang on 2017/11/6.
 */
public class ClientMain {

    public static void main(String[] args) {
        Chart chart;
        String type = XMLUtil.getChartType(); //读取配置文件中的参数
        chart = ChartFactory.getChart(type); //创建产品对象
        chart.display();
    }
}
