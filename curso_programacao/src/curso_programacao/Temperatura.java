package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp, X;
		double C, F;
		
		do {
			System.out.println("Digite o tipo de temperatura: (C/F)");
			X = sc.next().charAt(0);
		
			
				if (X=='c') {
				System.out.println("Digite a temperatura em Celsius: ");
				C = sc.nextDouble();
				
				F = (9.0*C)/5.0 + 32.0;
				System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
				
				System.out.println("Deseja repetir? (S/N)");
				resp = sc.next().charAt(0);
				}
				
				else {
					System.out.println("Digite a temperatura em Fahrenheit: ");
					F = sc.nextDouble();
					
					C = (F-32.0)*5.0/9.0;
					System.out.printf("Equivalente em Celsius: %.1f%n", C);
					
					System.out.println("Deseja repetir? (S/N)");
					resp = sc.next().charAt(0);
				}
				
			} while (resp != 'n');
		

		sc.close();
		
		
		 
		
	}

}
