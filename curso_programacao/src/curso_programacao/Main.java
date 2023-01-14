package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double x=10.3456;
		
		System.out.println("Hello World!");
		
		System.out.printf("%.2f%n", x);
		/// printf("%.2f", ) Formatacao padrao para 2 casas decimais apos a virgula
		/// %n ou \n quebra de linha
	
		
		System.out.printf("%.2f%n", x);
		
		System.out.println("Resultado = "+x+" metros");
		
		System.out.printf("Resultado = %.2f metros%n", x);
		
		///////////////////////
		
		String nome = "Maria";
		int idade = 32;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d de idade e ganha %.2f reais%n", nome, idade, renda);
		System.out.println();
		
		////////////////////// EXERCICIO 1
		
		String product1 = "Computer";
		String product2 = "Office Desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.println();
		
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		System.out.println();
		
		System.out.printf("Measue: %.8f%n", measure);
		System.out.printf("Rouded: %.3f%n", measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point; %.3f%n", measure);
		
		
		////////////// Entrada de Dados
		
		String k, w;
		int l;
		double z;
		char q;
		
		System.out.println("Digite um nome: ");
		Scanner sc = new Scanner(System.in);
		
		
		
		
		k = sc.next();
		System.out.println("Digite uma letra: ");
		q = sc.next().charAt(0); //// .charAt(0) utilizado para determinar que seja apenas uma letra
		l = sc.nextInt();
		z = sc.nextDouble();
		sc.nextLine(); //// para armazenar a quebra de liha
		w = sc.nextLine(); //// para ler mais de uma palavra
		
		System.out.println("Você digitou: " + k);
		System.out.println(q);
		System.out.println(l);
		System.out.println(z);
		System.out.println(w);
		sc.close();
		
		////////////
		
		
		
		
		
		
	}

}
