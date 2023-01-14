package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Notas;

public class NotasFaculdade {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Notas notas = new Notas();
		
		System.out.print("Digite o nome do aluno: ");
		String aluno = sc.nextLine();
		
		System.out.print("Digite a nota do 1 trimestre: ");
		notas.primeiroTrimestre = sc.nextDouble();
		
		System.out.print("Digite a nota do 2 trimestre: ");
		notas.segundoTrimestre = sc.nextDouble();
		
		System.out.print("Digite a nota do 3 trimestre: ");
		notas.terceiroTrimestre = sc.nextDouble();
		
		System.out.println(aluno);
		System.out.printf("Final Grade = %.2f%n", notas.somaNotas());
		
		if (notas.somaNotas()<60) {
			System.out.println("Failed");
			System.out.printf("Missing %.2f points", notas.missingPoints());
		}
		else {
			System.out.println("Pass");
		}
		
		
		
		
		
		
		
		
		sc.close();

	}

}
