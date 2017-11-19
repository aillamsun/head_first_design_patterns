package com.sung.head.first.design.patterns.chainofresponsibility.o1;

import com.sung.head.first.design.patterns.chainofresponsibility.o1.xiugai.IWomen;

/**
 * Created by sungang on 2017/11/19.
 */
public class Women implements IWomen {

    /**
     * 1 未出嫁
     * 2 出嫁
     * 3 丈夫过世
     */
    private int type = 0;

    /**
     * 具体请示
     */
    private String request = "";

    public Women(int type, String request) {
        this.type = type;
        this.request = request;
    }

    @Override
    public int getType() {
        return type;
    }


    @Override
    public String getRequest() {
        return request;
    }
}
