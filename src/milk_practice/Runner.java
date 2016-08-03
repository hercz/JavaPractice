package milk_practice;

import java.util.Calendar;

public class Runner {

	public static void main(String[] args) {
		Calendar milkWarrant = Calendar.getInstance();
		milkWarrant.set(2017, 10, 10);

		Milk milk = new Milk("Mizo", 1, 0.3, 230, milkWarrant);

		System.out.println(milk);
		System.out.println(milk.isMilkFine());
	}
}
