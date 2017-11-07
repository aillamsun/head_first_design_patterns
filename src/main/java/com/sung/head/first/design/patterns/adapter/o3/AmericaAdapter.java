package com.sung.head.first.design.patterns.adapter.o3;

/**
 * Created by sungang on 2017/11/7.
 */
public class AmericaAdapter implements TwoPinSoket {

    //组合三孔插座(adaptee)
    private ThreePinSoket threePinSoket;


    public AmericaAdapter(ThreePinSoket threePinSoket) {
        this.threePinSoket = threePinSoket;
    }

    @Override
    public void chargeWithTwoPin() {
        threePinSoket.chargeWithThreePin();
    }

    @Override
    public int voltage() {
        //* 2 适配器把电压从 110V 升到 220V
        return threePinSoket.voltage() * 2;
    }
}
