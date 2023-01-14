package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6_triangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		System.out.println("Digite os valores de A, B e C: ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangulo = A*C / 2.0;
		circulo = 3.14159*C*C;
		trapezio = (A+B) / 2.0*C;
		quadrado = B*B;
		retangulo = A*B;
		
		
		System.out.printf("Triângulo: %.3f%n", triangulo);
		System.out.printf("Circulo: %.3f%n", circulo);
		System.out.printf("Trapézio: %.3f%n", trapezio);
		System.out.printf("Quadrado: %.3f%n" + "Retângulo: %.3f%n", quadrado, retangulo);
		
		sc.close();
	}

}
