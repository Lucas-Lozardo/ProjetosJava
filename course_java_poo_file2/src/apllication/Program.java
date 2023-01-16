package apllication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String path = "/Users/lozardomacbook/Documentos DEV/eclipse-workspace/course_java_poo_file2/teste5out.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){

			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
