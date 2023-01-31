package model.service;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private Double tax;

	public ContractService() {
	}

	public ContractService(Double tax) {
		this.tax = tax;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double interest(Double amount, Integer months) {
		return amount * (tax / 100) * months;
	}

	public void processContract(Contract contract, Integer months) {
		double basicQuota = contract.getTotalValue() / months;
		for (int i = 1; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			double interests = interest(basicQuota, i);
			double quota = basicQuota + interests;
			contract.getList().add(new Installment(dueDate, quota));
		}
	}
}
