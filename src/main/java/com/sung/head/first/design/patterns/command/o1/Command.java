package com.sung.head.first.design.patterns.command.o1;

/**
 * 封装所有命令
 * <p>
 * Created by sungang on 2017/11/19.
 */
public abstract class Command {


    //需求小组
    protected RequireGroup requireGroup = new RequireGroup();

    //美工小组
    protected PageGroup pageGroup = new PageGroup();

    //编码小组
    CodeGroup codeGroup = new CodeGroup();

    /**
     * 命令执行函数
     */
    public abstract void execute();
}
