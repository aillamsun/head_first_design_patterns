package com.sung.head.first.design.patterns.factory.abst.o1;

/**
 * Spring皮肤工厂：具体工厂
 *
 * Created by sungang on 2017/11/6.
 */
public class SpringSkinFactory implements SkinFactory {

    @Override
    public Button createButton() {
        return new SpringButton();
    }
    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }
    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
