package entities;

public class IndividualAccount extends Account{

	private Double HealthExpenditures;
	
	public IndividualAccount() {
		super();
	}

	public IndividualAccount(String name, Double anualIncome, Double healthIncome) {
		super(name, anualIncome);
		HealthExpenditures = healthIncome;
	}

	public Double getHealthIncome() {
		return HealthExpenditures;
	}

	public void setHealthIncome(Double healthIncome) {
		HealthExpenditures = healthIncome;
	}
	
	@Override
	public Double taxesPaid() {
		double taxesPaid = 0.0;
		if(super.getAnualIncome() < 20000) {
			taxesPaid = super.getAnualIncome() * 0.15 - HealthExpenditures * 0.50;
		}
		else {
			taxesPaid = super.getAnualIncome() * 0.25 - HealthExpenditures * 0.50;
		}
		return taxesPaid;
	}
}
