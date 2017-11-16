package com.sung.head.first.design.patterns.factory.abst.o3;

/**
 * Created by sungang on 2017/11/16.
 */
public class Main {

    public static void main(String[] args) {


        //水果
        Factory factory = new FruitFactory();
        Fruit fruit = factory.getFruit("Apple");
        String color = fruit.getColor();
        System.out.println(color);


        //蔬菜
        factory = new VegetablesFactory();
        Vegetables vegetables = factory.getVegetables("Tomato");
        String name = vegetables.getName();
        System.out.println(name);

    }
}


