package com.sung.head.first.design.patterns.chainofresponsibility.o1.xiugai;

/**
 * Created by sungang on 2017/11/19.
 */
public class Father extends Handler {

    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("--------女儿向父亲请示--------");
        System.out.println("女儿的请示是:" + women.getRequest());
        System.out.println("父亲答复是:同意");
    }
}
