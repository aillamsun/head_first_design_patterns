package com.sung.head.first.design.patterns.adapter.o3;

/**
 * Created by sungang on 2017/11/7.
 */
public class TwoPinSoketChina implements TwoPinSoket {

    @Override
    public void chargeWithTwoPin() {
        System.out.println("中国标准的两孔的插座");
    }

    @Override
    public int voltage() {
        return 220;
    }
}
