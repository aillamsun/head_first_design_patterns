package com.sung.head.first.design.patterns.mediator.o1.xiugai;

/**
 * Created by sungang on 2017/11/19.
 */
public class Main {

    public static void main(String[] args) {

        AbstractMediator mediator = new Mediator();
        System.out.println("----采购人员采购电脑----");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMComputer(100);

        System.out.println("----销售人员销售电脑----");
        Sale sale = new Sale(mediator);
        sale.sellComputer(1);

        System.out.println("----库房人员清理库存----");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
