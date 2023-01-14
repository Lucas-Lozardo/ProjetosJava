package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Franquia {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 

		int minutos;
		double tarifa, minutoExedido, total;
		
		System.out.println("Quantos minutos foram consumidos: ");
		minutos = sc.nextInt();
		
		tarifa = 50.00;
		
		if (minutos <= 100.00) {
			System.out.printf("Total a pagar: R$ %.2f%n", tarifa);
		}
		else {
			minutoExedido = minutos - 100;
			total = tarifa + minutoExedido * 2;
			
			System.out.printf("Total a pagar: R$ %.2f%n", total);
			
			sc.close();
			
			
		}
	}

}
