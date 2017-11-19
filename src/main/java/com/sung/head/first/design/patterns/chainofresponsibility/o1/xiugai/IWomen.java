package com.sung.head.first.design.patterns.chainofresponsibility.o1;

/**
 *
 *
 * Created by sungang on 2017/11/19.
 */
public interface IWomen {

    /**
     * 获取个人状况
     */
    int getType();

    /**
     * 获得个人请示 你要干什么?
     * @return
     */
    String getRequest();
}
