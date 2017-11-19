package com.sung.head.first.design.patterns.command.o1;

/**
 * 删除页面命令
 * Created by sungang on 2017/11/19.
 */
public class DeletePageCommand extends Command {

    @Override
    public void execute() {

        super.pageGroup.find();
        super.pageGroup.delete();
        super.pageGroup.plan();
    }
}
