package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class curso_programacao {
 
    public static void main(String[] args) {
 
    	  Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);
          
          double n1 = sc.nextDouble();
          double n2 = sc.nextDouble();
          double n3 = sc.nextDouble();
          double n4 = sc.nextDouble();
          
          double media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10;
          
        //////////////  
          if (media*10 - Math.floor(media*10) > 0.5001) {
              media = Math.ceil(media*10)/10;
            }

            else {
               media = Math.floor(media*10)/10;
            }
          
         ///////////// 
          System.out.println("Media: " + media);
          
          

          if (media >= 7.0){
              System.out.println("Aluno aprovado.");
          }
          else if (media >=5.0){
              System.out.println("Aluno em exame.");
              double exame = sc.nextDouble();
              double mediaFinal = (media + exame) / 2;
              System.out.println("Nota do exame: " + exame);
              
              if (mediaFinal >= 5.0){
                 System.out.println("Aluno aprovado.");
              }
              else {
                  System.out.println("Aluno reprovado.");
              }
              System.out.println("Media final: " + mediaFinal);
          }
          else {
              System.out.println("Aluno reprovado.");
          }
          
          sc.close();
    } 
        
}