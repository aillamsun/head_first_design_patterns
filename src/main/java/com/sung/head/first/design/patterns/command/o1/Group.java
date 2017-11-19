package com.sung.head.first.design.patterns.command.o1;

/**
 * 抽象工作组
 *
 * 其中那个方法都是命令 
 * Created by sungang on 2017/11/19.
 */
public abstract class Group {

    /**
     * 甲乙双方分开办公 如果你想和某个组讨论 需要首先找到改组
     */
    public abstract void find();

    /**
     * 被要求增加功能
     */
    public abstract void add();

    /**
     * 被要求删除功能
     */
    public abstract void delete();

    /**
     * 需求变更
     */
    public abstract void change();

    /**
     * 给出所有变更计划
     */
    public abstract void plan();
}
