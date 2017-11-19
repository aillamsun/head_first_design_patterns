package com.sung.head.first.design.patterns.chainofresponsibility.o1.xiugai;

/**
 * Created by sungang on 2017/11/19.
 */
public abstract class Handler {


    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBABD_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;


    //能处理的级别
    private int level = 0;
    //责任连传递 下一个责任人是谁?
    private Handler nextHandler;


    public Handler(int level){
        this.level = level;
    }


    public final void handlerMessage(IWomen women){
        if (women.getType() == this.level){
            this.response(women);
        }else {
            //如果又后续环节
            if (nextHandler != null){
                this.nextHandler.handlerMessage(women);
            }else {
                System.out.println("没地方请求了，按不同意处理...");
            }
        }
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected abstract void response(IWomen women);
}
