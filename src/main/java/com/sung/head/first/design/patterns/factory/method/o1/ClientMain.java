package com.sung.head.first.design.patterns.factory.method;

/**
 * Created by sungang on 2017/11/6.
 */
public class ClientMain {

    public static void main(String[] args) {
        TV tv;
        TVFactory factory;
        factory = (TVFactory) XMLUtil.getBean();
        tv = factory.productTV();
        tv.play();
    }
}
