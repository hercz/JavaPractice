package milk_practice;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class UnitTest {

	@Test
	public void testIsMilkFineForToday() {

		// Arrange
		Milk milk = new Milk("Mizo", 1, 0.3, 230, LocalDate.now());
		boolean excepted = true;

		// Act
		boolean result = milk.isMilkFine();
		// Assert
		assertEquals(excepted, result);
	}

	@Test
	public void testIsMilkFineForOldWarrant() {

		// Arrange
		Milk milk = new Milk("Mizo", 1, 0.3, 230, LocalDate.of(2010, 8, 3));
		boolean excepted = false;

		// Act
		boolean result = milk.isMilkFine();
		// Assert
		assertEquals(excepted, result);
	}

	@Test
	public void testIsMilkFineForFutureWarrant() {

		// Arrange
		Milk milk = new Milk("Mizo", 1, 0.3, 230, LocalDate.of(2017, 8, 3));
		boolean excepted = true;

		// Act
		boolean result = milk.isMilkFine();
		// Assert
		assertEquals(excepted, result);
	}

}
