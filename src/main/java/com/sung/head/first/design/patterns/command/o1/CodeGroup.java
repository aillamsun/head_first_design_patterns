package com.sung.head.first.design.patterns.command.o1;

/**
 *
 * 编码小组
 *
 * Created by sungang on 2017/11/19.
 */
public class CodeGroup extends Group{

    @Override
    public void find() {
        System.out.println("找到编码小组");
    }

    @Override
    public void add() {
        System.out.println("客户要求增加一个功能");
    }

    @Override
    public void change() {
        System.out.println("客户要求修改一个功能");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一个功能");
    }

    @Override
    public void plan() {
        System.out.println("客户要求功能变更计划");
    }
}
