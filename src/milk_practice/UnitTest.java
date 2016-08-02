package milk_practice;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Test;

public class UnitTest {

	@Test
	public void testIsMilkTaintedForOldWarrant() {

		// Arrange
		Calendar milkWarrant = Calendar.getInstance();
		milkWarrant.set(2010, 10, 10);
		Milk milk = new Milk("Mizo", 1, 0.3, 230, milkWarrant);
		boolean excepted = true;

		// Act
		boolean result = milk.isMilkTainted();
		// Assert
		assertEquals(excepted, result);
	}

	@Test
	public void testIsMilkTaintedForFutureWarrant() {

		// Arrange
		Calendar milkWarrant = Calendar.getInstance();
		milkWarrant.set(2020, 10, 10);
		Milk milk = new Milk("Mizo", 1, 0.3, 230, milkWarrant);
		boolean excepted = false;

		// Act
		boolean result = milk.isMilkTainted();
		// Assert
		assertEquals(excepted, result);
	}

}
