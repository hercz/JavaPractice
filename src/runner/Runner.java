package runner;

import java.time.LocalDate;
import java.util.Hashtable;

import milk.LongLifeMilk;
import milk.Milk;
import shop.Shop;

public class Runner {

	public static void main(String[] args) {
		Milk milkMizo = new LongLifeMilk(12345L, "Mizo", LocalDate.of(2016, 8, 3), 1, 0.3);
		Milk milkParmalat = new LongLifeMilk(123L, "Parmalat", LocalDate.of(2016, 8, 3), 1, 0.3);
		Milk milkHerczku = new LongLifeMilk(345L, "Herczku", LocalDate.of(2016, 8, 3), 1, 0.3);

		System.out.println(milkMizo);
		System.out.println(milkMizo.isMilkFine());

		Shop shop = new Shop("misiShop", "kukutyim utca 20.", "Misi aHegyrol", new Hashtable<Long, Milk>());

		System.out.println(shop.isThereMilk());

		shop.buyMilk(milkParmalat);
		shop.buyMilk(milkMizo);
		shop.buyMilk(milkHerczku);
		System.out.println(shop);

		shop.sellMilk(milkParmalat);
		shop.sellMilk(milkMizo);

		System.out.println(shop);
		System.out.println(shop.isThereMilk());
	}
}
