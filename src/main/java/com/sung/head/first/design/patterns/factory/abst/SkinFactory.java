package com.sung.head.first.design.patterns.factory.abst;

/**
 * 界面皮肤工厂接口：抽象工厂
 * <p>
 * Created by sungang on 2017/11/6.
 */
public interface SkinFactory {

    public Button createButton();

    public TextField createTextField();

    public ComboBox createComboBox();
}
