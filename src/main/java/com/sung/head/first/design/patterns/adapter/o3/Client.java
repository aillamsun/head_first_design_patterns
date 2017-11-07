package com.sung.head.first.design.patterns.adapter.o3;

/**
 * Created by sungang on 2017/11/7.
 */
public class Client {

    public static void main(String[] args) {
        // 在中国，用两孔插座充电
        TwoPinSoketChina twoPinSoketChina = new TwoPinSoketChina();
        RongYao myRongYao = new RongYao();
        myRongYao.setTwoPinSoket(twoPinSoketChina);
        myRongYao.chargeRequest();


        // 然后坐飞机去美国旅游，美国某旅馆的墙上有只有一个三孔插座
        ThreePinSoketAmerica threePinSoketAmerica = new ThreePinSoketAmerica();
        testThreePin(threePinSoketAmerica);

        // 幸好我有美国适配器，一头插到三孔插座，另一头转换成二孔插座，就可以给我的荣耀手机充电
        AmericaAdapter americaAdapter = new AmericaAdapter(threePinSoketAmerica);
        testTwoPin(americaAdapter);


        // 在美国，通过美国适配器，用三空插座充电
        myRongYao.setTwoPinSoket(americaAdapter);
        myRongYao.chargeRequest();
    }


    static void testTwoPin(TwoPinSoket twoPinSoket) {
        twoPinSoket.chargeWithTwoPin();
        System.out.println("电压是" + twoPinSoket.voltage() + "伏特\n");
    }

    static void testThreePin(ThreePinSoket threePinSoket) {
        threePinSoket.chargeWithThreePin();
        System.out.println("电压是" + threePinSoket.voltage() + "伏特\n");
    }
}
