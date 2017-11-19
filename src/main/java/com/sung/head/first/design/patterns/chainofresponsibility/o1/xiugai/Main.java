package com.sung.head.first.design.patterns.chainofresponsibility.o1.xiugai;



import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by sungang on 2017/11/19.
 */
public class Main {

    public static void main(String[] args) {

        //
        Random random = new Random();
        List<IWomen> womens = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            womens.add(new Women(random.nextInt(4), "我要区逛街"));
        }
        //
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        //设置请求顺序
        father.setNextHandler(husband);
        husband.setNextHandler(son);

        for(IWomen w : womens){
            father.handlerMessage(w);
        }
    }
}
