package milk;

import java.time.LocalDate;

public abstract class MilkFactory {

	public static Milk newLongLifeMilk(long barCode, int capacity, String company, LocalDate warrant, double drippig) {
		LongLifeMilk longLifeMilk = new LongLifeMilk(barCode, company, warrant, capacity, drippig);
		return longLifeMilk;
	}

	public static Milk newSemiLongLifeMilk(long barCode, int capacity, String company, LocalDate warrant,
			double drippig) {
		SemiLongLifeMilk semiLongLifeMilk = new SemiLongLifeMilk(barCode, company, warrant, capacity, drippig);
		return semiLongLifeMilk;
	}
}
