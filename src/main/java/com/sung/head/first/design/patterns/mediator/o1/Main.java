package com.sung.head.first.design.patterns.mediator.o1;

/**
 * Created by sungang on 2017/11/19.
 */
public class Main {

    public static void main(String[] args) {


        //采购人员采购电脑
        System.out.println("----采购人员采购电脑----");
        Purchase purchase = new Purchase();
        purchase.buyIBMComputer(100);

        System.out.println("----销售人员销售电脑----");
        Sale sale = new Sale();
        sale.sellIBMComputer(1);

        System.out.println("----库房人员清理库存----");
        Stock stock = new Stock();
        stock.clearStock();
    }
}
