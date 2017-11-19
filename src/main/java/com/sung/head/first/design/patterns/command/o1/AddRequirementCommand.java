package com.sung.head.first.design.patterns.command.o1;

/**
 * 增加需求的命令
 * Created by sungang on 2017/11/19.
 */
public class AddRequirementCommand extends Command {

    @Override
    public void execute() {

        super.requireGroup.find();
        super.requireGroup.add();
        super.requireGroup.plan();
    }
}
