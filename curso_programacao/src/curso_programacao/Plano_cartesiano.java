package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Plano_cartesiano {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int X, Y;
		
		do {
			System.out.println("Digite as coordenadas X/Y: ");
			X = sc.nextInt();
			Y = sc.nextInt();
			
			if (X >0 && Y>0)
			{
				System.out.println("Primeiro quadrante!");
			}
			else if (X<0 && Y>0)
			{
				System.out.println("Segundo quadrante!");
			}
			else if (X<0 && Y<0)
			{
				System.out.println("Terceiro quadrante!");
			}
			else if (X>0 && Y<0)
			{
				System.out.println("Quarto quadrante!");
			}
		} while (X!=0 && Y!=0);	
				
		
		sc.close();
	}

}
