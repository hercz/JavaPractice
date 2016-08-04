package unitTests;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

import milk.LongLifeMilk;
import milk.Milk;

public class UnitTest {

	@Test
	public void testIsMilkFineForToday() {

		// Arrange
		Milk milk = new LongLifeMilk(12345L, "Mizo", LocalDate.now(), 1, 0.3);
		boolean excepted = true;

		// Act
		boolean result = milk.isMilkFine();
		// Assert
		assertEquals(excepted, result);
	}

	@Test
	public void testIsMilkFineForOldWarrant() {

		// Arrange
		Milk milk = new LongLifeMilk(12345L, "Mizo", LocalDate.of(2010, 8, 3), 1, 0.3);
		boolean excepted = false;

		// Act
		boolean result = milk.isMilkFine();
		// Assert
		assertEquals(excepted, result);
	}

	@Test
	public void testIsMilkFineForFutureWarrant() {

		// Arrange
		Milk milk = new LongLifeMilk(12345L, "Mizo", LocalDate.of(2017, 8, 3), 1, 0.3);
		boolean excepted = true;

		// Act
		boolean result = milk.isMilkFine();
		// Assert
		assertEquals(excepted, result);
	}

}
