package com.sung.head.first.design.patterns.chainofresponsibility.o1.xiugai;

/**
 * Created by sungang on 2017/11/19.
 */
public class Son extends Handler {

    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("--------母亲向儿子请示--------");
        System.out.println("母亲的请示是:" + women.getRequest());
        System.out.println("儿子答复是:同意");
    }
}
