package com.sung.head.first.design.patterns.command.o1;

/**
 *
 * 美工小组
 *
 * Created by sungang on 2017/11/19.
 */
public class PageGroup extends Group{

    @Override
    public void find() {
        System.out.println("找到美工小组");
    }

    @Override
    public void add() {
        System.out.println("客户要求增加一个页面");
    }

    @Override
    public void change() {
        System.out.println("客户要求修改一个页面");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一个页面");
    }

    @Override
    public void plan() {
        System.out.println("客户要求页面变更计划");
    }
}
