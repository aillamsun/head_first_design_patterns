package gz.kd.Decorater;

import java.util.Scanner;

import org.junit.Test;

public class client {

	@Test
	public void test(){
		System.out.println("*************欢迎关顾kd奶茶店*************");
		Drink drink = new Tea(2);
		
		drink=new IceSogar(drink);
		drink=new RedSogar(drink);
		drink=new Cream(drink);
		drink.markDrinking();

		System.out.println("*************欢迎下次光临*****************");
		System.out.println("*************收账人：kd 总金额："+drink.getPrice()+"元********");
		//System.out.println(drink.getPrice());
		
	}
}
