package entities;

public class Account {
	
	private int number;
	private String name;
	private double balance;
	
	public Account(int number, String name) {
		this.number = number;
		this.name = name;

	}
	
	public Account(int number, String name, double initialDep) {
		this.number = number;
		this.name = name;
		deposit(initialDep);
		/// ou  senão  this.balance = initialDep;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double ammount) {
		this.balance += ammount;
	}
	
	public void removeDeposit(double ammount) {
		this.balance -= ammount + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
		
	}

}
