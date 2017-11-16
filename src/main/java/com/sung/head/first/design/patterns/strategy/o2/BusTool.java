package com.sung.head.first.design.patterns.strategy.o2;

/**
 * Created by sungang on 2017/11/16.
 */
public class BusTool implements ToolStrategy {

    @Override
    public void useTool() {
        System.out.println("使用公交出行!");
    }
}
