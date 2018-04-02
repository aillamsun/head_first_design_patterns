package gz.kd.Decorater;

//Decorator抽象装饰类
public class drinkDecorator implements Drink{

	private Drink drink;
	
	public drinkDecorator(Drink drink){
		this.drink = drink;
	}
	
	@Override
	public void markDrinking(){
		drink.markDrinking();
	}
	
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return drink.getPrice();
	}
}
