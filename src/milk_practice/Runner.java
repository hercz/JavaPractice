package milk_practice;

import java.time.LocalDate;

public class Runner {

	public static void main(String[] args) {
		Milk milk = new Milk("Mizo", 1, 0.3, 230, LocalDate.of(2016, 8, 3));

		System.out.println(milk);
		System.out.println(milk.isMilkFine());
	}
}
