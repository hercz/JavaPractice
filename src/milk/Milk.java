package milk;

import java.time.LocalDate;

import food.Food;

public abstract class Milk extends Food {

	public static final int LITER = 1000;
	public static final int FELLITER = 500;
	public static final int POHAR = 200;
	public static final double ZSIROS = 2.8;
	public static final double FELZSIROS = 1.5;

	private int capacity;
	private double drippig;

	public Milk(Long barCode, String company, LocalDate warrant, int capacity, double drippig) {
		super(barCode, company, warrant);
		this.capacity = capacity;
		this.drippig = drippig;
	}

	public double getCapacity() {
		return capacity;
	}

	public double getDrippig() {
		return drippig;
	}

	@Override
	public String toString() {
		return "Milk [barCode=" + barCode + ", company=" + company + ", capacity=" + capacity + ", drippig=" + drippig
				+ ", warrant=" + warrant + "]";
	}
}
