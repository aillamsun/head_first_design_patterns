package com.sung.head.first.design.patterns.adapter.o3;

/**
 * 手机类
 * Created by sungang on 2017/11/7.
 */
public class RongYao {

    TwoPinSoket twoPinSoket;

    public void setTwoPinSoket(TwoPinSoket twoPinSoket) {
        this.twoPinSoket = twoPinSoket;
    }


    public void chargeRequest() {
        System.out.println("华为荣耀手机， " + twoPinSoket.voltage() + " 伏特充电中\n");
    }

}
