package entities;

public class CompanyAccount extends Account{
	
	private Integer numberOfEmployees;
	
	public CompanyAccount() {
		super();
	}

	public CompanyAccount(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	@Override
	public Double taxesPaid() {
		double taxesPaid = 0.0;
		if( numberOfEmployees <= 10) {
			taxesPaid = super.getAnualIncome() * 0.16;
		}
		else {
			taxesPaid = super.getAnualIncome() * 0.14;
		}
		return taxesPaid;
	}

}
