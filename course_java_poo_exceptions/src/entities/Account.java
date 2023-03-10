package entities;

import exceptions.BusinessException;

public class Account {

	private Integer name;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
	}

	public Account(Integer name, String holder, Double balance, Double withdrawLimit) {
		this.name = name;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getName() {
		return name;
	}

	public void setName(Integer name) {
		this.name = name;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		validateWithdraw(amount);
		this.balance -= amount;
	}
	
	public void validateWithdraw(Double amount) {
		if(amount > getWithdrawLimit() && amount > getBalance()) {
			throw new BusinessException("Withdraw error: Not enough balance and the amount exceeds withdraw limit");
		}
		if(amount > getWithdrawLimit()) {
			throw new BusinessException("Withdraw error: The amount exceeds withdraw limit");
		}
		if(amount > getBalance()) {
			throw new BusinessException("Withdraw error: Not enough balance");
		}
	}
}
