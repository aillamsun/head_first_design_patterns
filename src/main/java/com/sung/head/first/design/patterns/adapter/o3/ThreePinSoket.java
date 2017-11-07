package com.sung.head.first.design.patterns.adapter.o3;

/**
 * adaptee(被适配者) ———— 假设在美国某旅馆的墙上，只有一个三孔插座
 * Created by sungang on 2017/11/7.
 */
public interface ThreePinSoket {

    void chargeWithThreePin();

    int voltage();
}
