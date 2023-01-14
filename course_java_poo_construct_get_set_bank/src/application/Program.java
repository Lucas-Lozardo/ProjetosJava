///AUTOR: LOZARDO
///DATA 30/11/22
///EXERCICIO CURSO JAVA POO UDEMY

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char question = sc.next().charAt(0); 
		
			
		if(question == 'y') {
			System.out.println("Enter initial deposit value:");
			double initialDep = sc.nextDouble();
			account = new Account(number,name, initialDep);
		}
		else {
			account = new Account(number,name);
		}
		
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		System.out.println();
		System.out.print("Enter withdraw value: ");
		double removeValue = sc.nextDouble();
		account.removeDeposit(removeValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		sc.close();
	}

}
