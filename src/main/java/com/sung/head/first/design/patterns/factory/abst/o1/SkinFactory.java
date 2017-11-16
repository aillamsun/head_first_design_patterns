package com.sung.head.first.design.patterns.factory.abst.o1;

/**
 * 界面皮肤工厂接口：抽象工厂
 * <p>
 * Created by sungang on 2017/11/6.
 */
interface SkinFactory {

    Button createButton();

    TextField createTextField();

    ComboBox createComboBox();
}
