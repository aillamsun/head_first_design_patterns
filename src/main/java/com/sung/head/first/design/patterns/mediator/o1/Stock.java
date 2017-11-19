package com.sung.head.first.design.patterns.mediator.o1;

/**
 * 库存管理
 * <p>
 * Created by sungang on 2017/11/19.
 */
public class Stock {

    private static int computer_num = 100;

    /**
     * 增加库存
     *
     * @param num
     */
    public void increase(int num) {
        computer_num += num;
        System.out.println("库存数量为:" + computer_num);
    }

    /**
     * 减少库存
     */
    public void decrease(int num) {
        computer_num -= num;
        System.out.println("库存数量为:" + computer_num);
    }

    /**
     * 获取库存数量
     *
     * @return
     */
    public Integer getStockNum() {
        return computer_num;
    }

    /**
     * 库存压力过大 通知销售人员j尽快销售 和 采购人员不要采购
     */
    public void clearStock() {

        Purchase purchase = new Purchase();
        Sale sale = new Sale();

        System.out.println("清理存货数量为:" + computer_num);

        //要求打折
        sale.offSale();
        //不再采购
        purchase.refuseBuyIBM();
    }
}
