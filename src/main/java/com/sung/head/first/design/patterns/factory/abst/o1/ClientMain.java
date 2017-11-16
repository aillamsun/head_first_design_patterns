package com.sung.head.first.design.patterns.factory.abst;

/**
 * Created by sungang on 2017/11/6.
 */
public class ClientMain {

    public static void main(String[] args) {
        //使用抽象层定义
        SkinFactory factory = (SkinFactory) XMLUtil.getBean();
        Button bt = factory.createButton();
        TextField tf = factory.createTextField();
        ComboBox cb = factory.createComboBox();
        bt.display();
        tf.display();
        cb.display();
    }
}
