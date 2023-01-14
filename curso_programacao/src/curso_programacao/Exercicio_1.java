package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int code1, code2, numeroPecas1, numeroPecas2;
		double valorPecas1, valorPecas2, total;
		
		
		
		System.out.println("Digite o código da peça 1: ");
		code1 = sc.nextInt();
		
		System.out.println("Digite o número de peças: ");
		numeroPecas1 = sc.nextInt();
		
		System.out.println("Digite o valor da peça: ");
		valorPecas1 = sc.nextDouble();
		
		
		System.out.println("Digite o código da peça 2: ");
		code2 = sc.nextInt();
		
		System.out.println("Digite o número de peças: ");
		numeroPecas2 = sc.nextInt();
		
		System.out.println("Digite o valor da peça: ");
		valorPecas2 = sc.nextDouble();
		
		
		total = numeroPecas1 * valorPecas1 + numeroPecas2 * valorPecas2;
		
		
		System.out.printf("Valor a ser pago: R$ %.2f%n", total);
		sc.close();
	}

}
