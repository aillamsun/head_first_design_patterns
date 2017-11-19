package com.sung.head.first.design.patterns.command.o1;

/**
 * 负责人
 * <p>
 * Created by sungang on 2017/11/19.
 */
public class Invoker {

    //什么具体命令
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }


    public void action() {
        this.command.execute();
    }
}
