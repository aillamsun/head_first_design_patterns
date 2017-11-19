package com.sung.head.first.design.patterns.mediator.o1;

import java.util.Random;

/**
 * 销售管理
 * Created by sungang on 2017/11/19.
 */
public class Sale {

    /**
     * 销售IBM电脑
     *
     * @param num
     */
    public void sellIBMComputer(int num) {

        //访问库存
        Stock stock = new Stock();
        //访问采购
        Purchase purchase = new Purchase();

        if (stock.getStockNum() < num) {//库存数量不够销售
            purchase.buyIBMComputer(num);
        }
        System.out.println("销售IBM：" + num + " 台");

        stock.decrease(num);
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
    public void offSale(){
        Stock stock = new Stock();
        System.out.println("打折销售IBM电脑：" + stock.getStockNum() + "台");
    }
}
