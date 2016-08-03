package runner;

import java.time.LocalDate;
import java.util.Hashtable;

import milk.Milk;
import shop.Shop;

public class Runner {

	public static void main(String[] args) {
		Milk milkMizo = new Milk(12345L, "Mizo", 1, 0.3, 230, LocalDate.of(2016, 8, 3));
		Milk milkParmalat = new Milk(123L, "Parmalat", 1, 0.3, 230, LocalDate.of(2016, 8, 3));
		Milk milkHerczku = new Milk(345L, "Herczku", 1, 0.3, 230, LocalDate.of(2016, 8, 3));

		System.out.println(milkMizo);
		System.out.println(milkMizo.isMilkFine());

		Shop shop = new Shop("misiShop", "kukutyim utca 20.", "Misi aHegyrol", new Hashtable<Long, Milk>());

		shop.buyMilk(milkParmalat);
		shop.buyMilk(milkMizo);
		shop.buyMilk(milkHerczku);
		System.out.println(shop);

		shop.sellMilk(milkParmalat);
		shop.sellMilk(milkMizo);

		System.out.println(shop);
	}
}
