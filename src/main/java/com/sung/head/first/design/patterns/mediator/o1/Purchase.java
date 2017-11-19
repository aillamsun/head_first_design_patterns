package com.sung.head.first.design.patterns.mediator.o1;

/**
 *
 * 采购管理
 *
 * Created by sungang on 2017/11/19.
 */
public class Purchase {


    //采购IBM电脑

    public void buyIBMComputer(int num){

        Stock stock = new Stock();

        Sale sale = new Sale();
        int saleStatus = sale.getSaleStatus();
        if (saleStatus > 80){
            System.out.println("采购IBM电脑：" + num + "台");
            stock.increase(num);
        }else {
            int buyNum = num / 2;
            System.out.println("采购IBM电脑: " + buyNum + "台");
        }
    }

    /**
     * 不再采购
     */
    public void refuseBuyIBM(){
        System.out.println("不再采购IBM电脑");
    }
}
