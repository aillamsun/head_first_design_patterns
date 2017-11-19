package com.sung.head.first.design.patterns.chainofresponsibility.o1.xiugai;

/**
 * Created by sungang on 2017/11/19.
 */
public class Husband extends Handler {


    public Husband() {
        super(Handler.HUSBABD_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("--------妻子向丈夫请示--------");
        System.out.println("妻子的请示是:" + women.getRequest());
        System.out.println("丈夫的答复是:同意");
    }
}
