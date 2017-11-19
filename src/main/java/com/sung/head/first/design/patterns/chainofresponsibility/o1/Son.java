package com.sung.head.first.design.patterns.chainofresponsibility.o1;

import com.sung.head.first.design.patterns.chainofresponsibility.o1.xiugai.IWomen;

/**
 * Created by sungang on 2017/11/19.
 */
public class Son implements IHandler {


    @Override
    public void handlerMessage(IWomen women) {
        System.out.println("母亲的请示是:" + women.getRequest());
        System.out.println("儿子答复是:同意");
    }
}
