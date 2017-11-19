package com.sung.head.first.design.patterns.mediator.o1.xiugai;


/**
 * 修改的采购管理
 * Created by sungang on 2017/11/19.
 */
public class Purchase extends AbstractColleague {


    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    //采购IBM电脑

    public void buyIBMComputer(int num) {
        super.mediator.execute("Purchase.buy", num);
    }

    /**
     * 不再采购
     */
    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑");
    }
}
