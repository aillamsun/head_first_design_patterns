package com.sung.head.first.design.patterns.mediator.o1.xiugai;

/**
 * 具体中介者
 * Created by sungang on 2017/11/19.
 */
public class Mediator extends AbstractMediator {

    //中介者 最重要的方法
    @Override
    public void execute(String str, Object... objects) {

        if (str.equals("Purchase.buy")) {//采购电脑
            this.buyIBMComputer((Integer) objects[0]);
        } else if (str.equals("Sale.sell")) {//销售电脑
            this.sellIBMComputer((Integer) objects[0]);
        } else if (str.equals("Sale.offsell")) {//打折销售
            this.offSale();
        } else if (str.equals("Stock.clear")) {//
            this.clearStock();
        }
    }

    /**
     * 采购电脑
     *
     * @param num
     */
    public void buyIBMComputer(int num) {
        int saleStatus = super.sale.getSaleStatus();
        if (saleStatus > 80) {
            System.out.println("采购IBM电脑：" + num + "台");
            stock.increase(num);
        } else {
            int buyNum = num / 2;
            System.out.println("采购IBM电脑: " + buyNum + "台");
        }
    }

    /**
     * 销售电脑
     *
     * @param num
     */
    public void sellIBMComputer(int num) {
        if (super.stock.getStockNum() < num) {
            super.purchase.buyIBMComputer(num);
        }
        super.stock.decrease(num);
    }

    /**
     * 打折处理
     */
    public void offSale() {
        System.out.println("打折销售IBM电脑：" + super.stock.getStockNum() + "台");
    }


    public void clearStock() {
        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }
}
