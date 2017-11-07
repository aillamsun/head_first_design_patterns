package com.sung.head.first.design.patterns.adapter.o3;

/**
 * 实现一个具体的 adaptee
 * Created by sungang on 2017/11/7.
 */
public class ThreePinSoketAmerica implements ThreePinSoket {


    @Override
    public void chargeWithThreePin() {
        System.out.println("美国标准的三孔的插座");
    }

    // 美国电压是110伏
    @Override
    public int voltage() {
        return 110;
    }
}
