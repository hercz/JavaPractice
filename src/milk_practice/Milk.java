package milk_practice;

import java.util.Calendar;

public class Milk {
	private String company;
	private int capacity;
	private double drippig;
	private long price;
	private Calendar warrant;

	public Milk(String company, int capacity, double drippig, long price, Calendar warrant) {
		this.company = company;
		this.capacity = capacity;
		this.drippig = drippig;
		this.price = price;
		this.warrant = warrant;
	}

	public String getCompany() {
		return company;
	}

	public double getCapacity() {
		return capacity;
	}

	public double getDrippig() {
		return drippig;
	}

	public double getPrice() {
		return price;
	}

	public Calendar getWarrant() {
		return warrant;
	}

	public boolean isMilkFine() {
		Calendar today = Calendar.getInstance();
		return warrant.after(today);
	}

	@Override
	public String toString() {
		return "Milk [company=" + company + ", capacity=" + capacity + ", drippig=" + drippig + ", price=" + price
				+ ", warrant=" + warrant.getTime() + "]";
	}

}
