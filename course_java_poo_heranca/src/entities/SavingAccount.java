package entities;

public class SavingAccount extends Account {

	private Double interestRate;
	
	public SavingAccount() {
		super();
	}

	public SavingAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	///Sobreposição É a implementação de um método de uma superclasse na subclasse.
	@Override
	public void withDraw(Double amount) {
	    super.withDraw(amount);
		balance -= amount;
	}
}
