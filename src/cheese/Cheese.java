package cheese;

import java.time.LocalDate;

public class Cheese {
	private double weight;
	private double drippig;
	private Long barCode;
	private String company;
	private LocalDate warrantl;

	public Cheese(double weight, double drippig, Long barCode, String company, LocalDate warrantl) {
		super();
		this.weight = weight;
		this.drippig = drippig;
		this.barCode = barCode;
		this.company = company;
		this.warrantl = warrantl;
	}

	public double getWeight() {
		return weight;
	}

	public double getDrippig() {
		return drippig;
	}

	public Long getBarCode() {
		return barCode;
	}

	public String getCompany() {
		return company;
	}

	public LocalDate getWarrantl() {
		return warrantl;
	}

	public boolean isItFine() {
		return true;
	}

	@Override
	public String toString() {
		return "Cheese [weight=" + weight + ", drippig=" + drippig + ", barCode=" + barCode + ", company=" + company
				+ ", warrantl=" + warrantl + "]";
	}

}
