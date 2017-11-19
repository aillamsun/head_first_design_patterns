package com.sung.head.first.design.patterns.mediator.o1.xiugai;

/**
 * 抽象同事类
 * Created by sungang on 2017/11/19.
 */
public abstract class AbstractColleague {

    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
