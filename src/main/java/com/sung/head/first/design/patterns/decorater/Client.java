package com.sung.head.first.design.patterns.decorater;

import java.util.Scanner;


public class Client {

    public void test() {


    }


    public static void main(String[] args) {
        System.out.println("*************欢迎关顾kd奶茶店*************");
        Drink drink = new Tea(2);

        drink = new IceSogar(drink);
        drink = new RedSogar(drink);
        drink = new Cream(drink);
        drink.markDrinking();

        System.out.println("*************欢迎下次光临*****************");
        System.out.println("*************收账人：kd 总金额：" + drink.getPrice() + "元********");
        //System.out.println(drink.getPrice());
    }
}
