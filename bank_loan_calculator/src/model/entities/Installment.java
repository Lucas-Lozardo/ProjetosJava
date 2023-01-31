package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.service.ContractService;

public class Installment {
	
	private LocalDate dueDate;
	private Double amount;
	
	ContractService contractService;
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Installment() {
	}
	
	public Installment(LocalDate dueDate, Double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}


	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return dueDate.format(fmt) + " - " + String.format("%.2f", amount);
	}
}
/*
	Tradução:
		Installment - parcelamento.
		dueDate - Data de Vencimento.
		amount -  montante.
		interest -  juros.
*/