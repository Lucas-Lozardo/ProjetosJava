package apllication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.service.ContractService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();

		Contract contract = new Contract(number, date, totalValue);

		System.out.print("Entre com o numero de parcelas: ");
		int numberOfInstallments = sc.nextInt();
		System.out.print("Entre com a Taxa de juros: ");
		double tax = sc.nextDouble();

		ContractService contractService = new ContractService();
		contractService.setTax(tax);
		
		contractService.processContract(contract, numberOfInstallments);

		System.out.println("Parcelas:");

		for (Installment installment : contract.getList()) {
			System.out.println(installment + " - " + contractService.getTax());
		}

		sc.close();
	}

}
