package com.sung.head.first.design.patterns.factory.abst;

/**
 * Summer皮肤工厂：具体工厂
 * Created by sungang on 2017/11/6.
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }
    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }
    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }

}
