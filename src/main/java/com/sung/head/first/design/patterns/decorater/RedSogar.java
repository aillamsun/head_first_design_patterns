package gz.kd.Decorater;

public class RedSogar extends drinkDecorator{

	public RedSogar(Drink drink) {
		super(drink);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void markDrinking() {
		// TODO Auto-generated method stub
		super.markDrinking();
		System.out.println("	加了红糖,现在"+getPrice()+"元");
	}

	/*public int RedSogarPrice(){
		System.out.println("price"+super.getPrice()+3);
		return super.getPrice()+3;
	}*/

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		int num =super.getPrice()+2;
		//System.out.println("price="+num);
		return num;
	}
}
