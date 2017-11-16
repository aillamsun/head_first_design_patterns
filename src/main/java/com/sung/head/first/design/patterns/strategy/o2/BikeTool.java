package com.sung.head.first.design.patterns.strategy.o2;

/**
 * Created by sungang on 2017/11/16.
 */
public class BikeTool implements ToolStrategy {

    @Override
    public void useTool() {
        System.out.println("自行车出行!");
    }
}
