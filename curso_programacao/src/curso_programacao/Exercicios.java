package curso_programacao;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
	
		int a, b, soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 2 números: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		soma = a + b;
		
		System.out.println("Soma = " + soma);
		
		sc.close();

	}

}
