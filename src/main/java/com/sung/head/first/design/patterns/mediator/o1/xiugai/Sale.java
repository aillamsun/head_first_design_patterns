package com.sung.head.first.design.patterns.mediator.o1.xiugai;

import com.sung.head.first.design.patterns.mediator.o1.*;

import java.util.Random;

/**
 * Created by sungang on 2017/11/19.
 */
public class Sale extends AbstractColleague {

    public Sale(AbstractMediator mediator) {
        super(mediator);
    }


    /**
     * 销售电脑
     *
     * @param num
     */
    public void sellComputer(int num) {
        super.mediator.execute("Sale.sell", num);
        System.out.println("销售IBM电脑: " + num + "台");
    }

    /**
     * 0 - 100 0代表没人购买 100代表非常畅销
     */
    public int getSaleStatus() {
        Random random = new Random(System.currentTimeMillis());
        int saleStatus = random.nextInt(100);
        System.out.println("IBM销售情况为:" + saleStatus);
        return saleStatus;

    }

    /**
     * 打折处理
     */
    public void offSale() {
        super.mediator.execute("Sale.offsell");
    }
}
