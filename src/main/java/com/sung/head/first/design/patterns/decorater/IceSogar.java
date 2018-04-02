package com.sung.head.first.design.patterns.decorater;

public class IceSogar extends drinkDecorator{

	public IceSogar(Drink drink) {
		super(drink);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void markDrinking() {
		// TODO Auto-generated method stub
		super.markDrinking();
		
		System.out.println("	加了冰糖,现在"+getPrice()+"元");
	}
	
	/*public int IceSogarPrice(){
		System.out.println("price"+super.getPrice()+4);
		return super.getPrice()+4;
	}*/


	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		int num =super.getPrice()+3;
		//System.out.println("price="+num);
		return num;
	}

	

}
