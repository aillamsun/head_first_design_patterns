package com.sung.head.first.design.patterns.template.o1;

/**
 * Created by sungang on 2017/11/16.
 */
public abstract class Crawl {

    /**
     * 开始
     */
    abstract void start();

    /**
     * 运行
     */
    abstract void run();

    /**
     * 停止
     */
    abstract void stop();


    /**
     * 模版方法(不会变) 规定行为  子类实现行为
     */
    void startTask(){
        start();
        run();
        start();
    }

}
