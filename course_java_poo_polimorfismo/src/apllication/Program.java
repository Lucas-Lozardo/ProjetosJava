///AUTOR: LOZARDO
///DATA 07/01/23
///EXERCICIO CURSO JAVA POO UDEMY

package apllication;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char os = sc.next().charAt(0);
		
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hour: ");
			int hour = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if(os=='y' || os=='Y') {
				System.out.print("Additional charge: ");
				double addCharge = sc.nextDouble();
				
				list.add(new OutsourcedEmployee(name, hour, valuePerHour, addCharge));
			}
			else{
				list.add(new Employee(name, hour, valuePerHour));
			}
			
		}
		
		System.out.println("PAYMENTS:");
		for(Employee lista: list) {
			System.out.println(lista.getName() + " - $ " + String.format("%.2f", lista.payment()));
		}
		
		
		
		
		
		
		sc.close();
	}

}
