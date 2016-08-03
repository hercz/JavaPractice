package unitTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.Hashtable;

import org.junit.Test;

import milk.Milk;
import shop.Shop;

public class MilkUnitTests {

	@Test
	public void testIsThereMilkWhenThereIs() {
		// Arrange
		Milk milkMizo = new Milk(12345L, "Mizo", 1, 0.3, 230, LocalDate.of(2016, 8, 3));
		Shop shop = new Shop("misiShop", "kukutyim utca 20.", "Misi aHegyrol", new Hashtable<Long, Milk>());
		shop.buyMilk(milkMizo);
		// Act
		boolean result = shop.isThereMilk();
		// Assert
		assertTrue(result);
	}

	@Test
	public void testIsThereMilkWhenThereIsNot() {
		// Arrange
		Shop shop = new Shop("misiShop", "kukutyim utca 20.", "Misi aHegyrol", new Hashtable<Long, Milk>());
		// Act
		boolean result = shop.isThereMilk();
		// Assert
		assertFalse(result);
	}

	@Test
	public void testBuyMilkToBuyTwoMilk() {
		// Arrange
		Milk milkMizo = new Milk(12345L, "Mizo", 1, 0.3, 230, LocalDate.of(2016, 8, 3));
		Milk milkParmalat = new Milk(123L, "Parmalat", 1, 0.3, 230, LocalDate.of(2016, 8, 3));
		Shop shop = new Shop("misiShop", "kukutyim utca 20.", "Misi aHegyrol", new Hashtable<Long, Milk>());

		Hashtable<Long, Milk> expectedResult = new Hashtable<Long, Milk>();
		expectedResult.put(milkParmalat.getBarCode(), milkParmalat);
		expectedResult.put(milkMizo.getBarCode(), milkMizo);
		// Act
		shop.buyMilk(milkParmalat);
		shop.buyMilk(milkMizo);
		Hashtable<Long, Milk> result = shop.getMilkBar();
		// Assert
		assertEquals(expectedResult, result);
	}

	@Test
	public void testSellMilkToSellOneMilk() {
		// Arrange
		Milk milkMizo = new Milk(12345L, "Mizo", 1, 0.3, 230, LocalDate.of(2016, 8, 3));
		Milk milkParmalat = new Milk(123L, "Parmalat", 1, 0.3, 230, LocalDate.of(2016, 8, 3));
		Shop shop = new Shop("misiShop", "kukutyim utca 20.", "Misi aHegyrol", new Hashtable<Long, Milk>());
		shop.buyMilk(milkParmalat);
		shop.buyMilk(milkMizo);

		Hashtable<Long, Milk> expectedResult = new Hashtable<Long, Milk>();
		expectedResult.put(milkParmalat.getBarCode(), milkParmalat);
		// Act
		shop.sellMilk(milkMizo);

		Hashtable<Long, Milk> result = shop.getMilkBar();
		// Assert
		assertEquals(expectedResult, result);
	}

}
