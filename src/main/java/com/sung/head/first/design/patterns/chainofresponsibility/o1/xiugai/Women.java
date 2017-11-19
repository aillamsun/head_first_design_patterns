package com.sung.head.first.design.patterns.chainofresponsibility.o1.xiugai;


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

    public Women(int type, String _request) {
        this.type = type;
        this.request = _request;

        switch (type) {
            case 1:
                this.request = "女儿的请求是:" + _request;
                break;
            case 2:
                this.request = "妻子的请求是:" + _request;
                break;
            case 3:
                this.request = "母亲的请求是:" + _request;
                break;
        }
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
