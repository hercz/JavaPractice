package milk_practice;

import java.util.Calendar;

public class Milk {
	private String company;
	private double capacity;
	private double drippig;
	private double price;
	private Calendar warrant;

	public Milk(String company, double capacity, double drippig, double price, Calendar warrant) {
		this.company = company;
		this.capacity = capacity;
		this.drippig = drippig;
		this.price = price;
		this.warrant = warrant;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public double getDrippig() {
		return drippig;
	}

	public void setDrippig(double drippig) {
		this.drippig = drippig;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Calendar getWarrant() {
		return warrant;
	}

	public void setWarrant(Calendar warrant) {
		this.warrant = warrant;
	}

	public boolean isMilkTainted() {
		Calendar today = Calendar.getInstance();
		return warrant.before(today);
	}

	@Override
	public String toString() {
		return "Milk [company=" + company + ", capacity=" + capacity + ", drippig=" + drippig + ", price=" + price
				+ ", warrant=" + warrant.getTime() + "]";
	}

}
