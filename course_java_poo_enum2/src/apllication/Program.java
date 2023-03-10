///AUTOR: LOZARDO
///DATA 31/12/22
///EXERCICIO CURSO JAVA POO UDEMY

package apllication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow that's awesome!");
		Post p1 = new Post(sdf1.parse("21/06/2018 15:05:44"), 
				"Traveling New Zeland", "I'm going to visit this wonderful country!", 12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		
		Comment d1 = new Comment("Good Night!");
		Comment d2 = new Comment("May the force with you");
		Post p2 = new Post(sdf1.parse("28/07/2018 23:14:19"), "Good night guys",
				"See you tomorrow", 5);
		
		p2.addComment(d1);
		p2.addComment(d2);
		
		System.out.println(p1);
		System.out.println();
		System.out.println(p2);
		
		
		
		sc.close();
	}

}
