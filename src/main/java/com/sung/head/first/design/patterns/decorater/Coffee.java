package com.sung.head.first.design.patterns.decorater;

//具体构件类，也就是要被装饰的类
public class Coffee implements Drink{

	private int price;

	public int getPrice() {
		return price;
	}

	public Coffee(int price){
		this.price=price;
	}

	@Override
	public void markDrinking() {
		// TODO Auto-generated method stub
		System.out.println("	制作Coffee ,现在"+getPrice() +"元");
	}
}
