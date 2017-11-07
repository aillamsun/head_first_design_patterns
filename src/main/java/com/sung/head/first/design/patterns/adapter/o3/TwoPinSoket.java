package com.sung.head.first.design.patterns.adapter.o3;

/**
 * 两孔插座接口（Target）
 * 我的荣耀手机充电器是两个插头，所以需要两个插孔的插座
 * Created by sungang on 2017/11/7.
 */
public interface TwoPinSoket{

        void chargeWithTwoPin();

        int voltage();
}
