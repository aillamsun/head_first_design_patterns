package com.sung.head.first.design.patterns.factory.method.o1;

/**
 * Created by sungang on 2017/11/6.
 */
public class ClientMain {

    public static void main(String[] args) {
        TVFactory factory = (TVFactory) XMLUtil.getBean();
        TV tv = factory.productTV();
        tv.play();
    }
}
