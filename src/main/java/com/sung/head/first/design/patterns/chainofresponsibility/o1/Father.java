package com.sung.head.first.design.patterns.chainofresponsibility.o1;

import com.sung.head.first.design.patterns.chainofresponsibility.o1.xiugai.IWomen;

/**
 * 父亲类
 * Created by sungang on 2017/11/19.
 */
public class Father implements IHandler {

    @Override
    public void handlerMessage(IWomen women) {
        System.out.println("女儿的请示是:" + women.getRequest());
        System.out.println("父亲答复是:同意");
    }
}
