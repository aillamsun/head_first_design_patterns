package com.sung.head.first.design.patterns.command.o1;

/**
 * Created by sungang on 2017/11/19.
 */
public class Main {


    public static void main(String[] args) {
//        System.out.println("-----客户要求增加一个需求-----");
//        Group group = new RequireGroup();
//        group.find();
//        group.add();
//        group.plan();
//
//        System.out.println("");
//        //暂时客户满足  可过了一段时间 客户要求修改一个页面样式
//        System.out.println("-----客户要求修改一个页面-----");
//        group = new PageGroup();
//        group.find();
//        group.change();
//        group.plan();

        //以此类推 导致处理及其麻烦 修改处理方式

        //定义负责人
        Invoker invoker = new Invoker();
        System.out.println("-----客户要求增加一个需求-----");
        invoker.setCommand(new AddRequirementCommand());
        invoker.action();

        System.out.println("");

        System.out.println("-----客户要求删除一个页面-----");
        invoker.setCommand(new DeletePageCommand());
        invoker.action();

    }
}
