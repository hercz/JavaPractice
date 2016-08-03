package milk_practice;

import java.time.LocalDate;

public class Milk {
	private String company;
	private int capacity;
	private double drippig;
	private long price;
	private LocalDate warrant;

	public Milk(String company, int capacity, double drippig, long price, LocalDate warrant) {
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

	public LocalDate getWarrant() {
		return warrant;
	}

	public boolean isMilkFine() {
		LocalDate yesterday = LocalDate.now().minusDays(1);
		return warrant.isAfter(yesterday);
	}

	@Override
	public String toString() {
		return "Milk [company=" + company + ", capacity=" + capacity + ", drippig=" + drippig + ", price=" + price
				+ ", warrant=" + warrant + "]";
	}

}
