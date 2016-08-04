package food;

import java.time.LocalDate;

public abstract class Food {
	protected Long barCode;
	protected String company;
	protected LocalDate warrant;

	public Food(Long barCode, String company, LocalDate warrant) {
		super();
		this.barCode = barCode;
		this.company = company;
		this.warrant = warrant;
	}

	public Long getBarCode() {
		return barCode;
	}

	public String getCompany() {
		return company;
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
		return "Food [barCode=" + barCode + ", company=" + company + ", warrant=" + warrant + "]";
	}

}
