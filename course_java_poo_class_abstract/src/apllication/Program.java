///AUTOR: LOZARDO
///DATA 10/01/23
///EXERCICIO CURSO JAVA POO UDEMY


package apllication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.CompanyAccount;
import entities.IndividualAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Account> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		System.out.println();
		for(int i=1;i<=n;i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if(type == 'i' || type == 'I') {
				System.out.print("Health expenditures: ");
				double healthEx = sc.nextDouble();
				
				list.add(new IndividualAccount(name, anualIncome, healthEx));
			}
			else {
				System.out.print("Number of employees: ");
				int empNumber = sc.nextInt();
				
				list.add(new CompanyAccount(name, anualIncome, empNumber));
			}

		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		for(Account acc : list) {
			System.out.println(acc.getName() 
					+ ": $ "
					+ String.format("%.2f", acc.taxesPaid()));
		}
		
		System.out.println();
		double totalTaxes = 0.0;
		for(Account acc : list) {
			totalTaxes += acc.taxesPaid();
		}
		
		System.out.printf("TOTAL TAXES: $ %.2f", totalTaxes);

		sc.close();
	}

}
