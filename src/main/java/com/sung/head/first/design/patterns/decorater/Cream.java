package com.sung.head.first.design.patterns.decorater;

//ConcreteDecorator（具体装饰类）装饰品，其实本身也是一个drink
public class Cream extends drinkDecorator{

	public Cream(Drink drink) {
		super(drink);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void markDrinking() {
		// TODO Auto-generated method stub
		super.markDrinking();
		System.out.println("	加了奶油糖,现在"+getPrice()+"元");
	}
	

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		int num =super.getPrice()+1;
		//System.out.println("price="+num);
		return num;
	}

}
