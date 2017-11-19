package com.sung.head.first.design.patterns.chainofresponsibility.o1;

import com.sung.head.first.design.patterns.chainofresponsibility.o1.xiugai.IWomen;

/**
 *
 * 处理权接口
 *
 * Created by sungang on 2017/11/19.
 */
public interface IHandler {

    void handlerMessage(IWomen women);
}
