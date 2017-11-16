package com.sung.head.first.design.patterns.strategy.o2;

/**
 * Created by sungang on 2017/11/16.
 */
public class ToolContext {

    //组合关系
    ToolStrategy strategy = null;

    public ToolContext(ToolStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 旅行
     */
    public void travel() {
        //乘坐交通工具
        strategy.useTool();
    }

    public void setStrategy(ToolStrategy strategy) {
        this.strategy = strategy;
    }
}
