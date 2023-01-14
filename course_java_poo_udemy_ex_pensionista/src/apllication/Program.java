///AUTOR: LOZARDO
///DATA 04/12/22
///EXERCICIO CURSO JAVA POO UDEMY

package apllication;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println();
			System.out.printf("Rent # " + (i+1) + ":\n");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			/// Rent rent = new Rent(name, email);
			///vect [room] = rent;
			/// simplificando abaixo
			vect [room] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for(int i=0; i<10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		
		
		sc.close();

	}

}
