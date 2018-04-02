package gz.kd.Decorater;
//具体构件类，也就是要被装饰的类
public class Tea implements Drink{
	private int price;

	public int getPrice() {
		return price;
	}

	public Tea(int price){
		this.price=price;
	}

	@Override
	public void markDrinking() {
		// TODO Auto-generated method stub
		System.out.println("	制作tea ,现在"+getPrice() +"元");
	}
}
