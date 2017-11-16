package com.sung.head.first.design.patterns.strategy.o2;

/**
 *
 * 策略模式
 * Created by sungang on 2017/11/16.
 */
public class Main {

    public static void main(String[] args) {


        ToolContext context = new ToolContext(new AriTool());
        context.travel();

        //换bus
        context.setStrategy(new BusTool());
        context.travel();
    }
}
