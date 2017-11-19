package com.sung.head.first.design.patterns.chainofresponsibility.o1;

import com.sung.head.first.design.patterns.chainofresponsibility.o1.xiugai.IWomen;
import com.sung.head.first.design.patterns.chainofresponsibility.o1.xiugai.Women;

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
        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();
        for (IWomen w : womens) {

            if (1 == w.getType()) {
                System.out.println("--------女儿向父亲请示--------");
                father.handlerMessage(w);
            } else if (2 == w.getType()) {
                System.out.println("--------妻子向丈夫请示--------");
                husband.handlerMessage(w);
            } else if (3 == w.getType()) {
                System.out.println("--------母亲向儿子请示--------");
                son.handlerMessage(w);
            }else {

            }
        }

    }
}
