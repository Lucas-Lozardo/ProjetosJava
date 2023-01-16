package apllication;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program2 {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"teste11", "teste12", "teste13"};
		String path = "/Documentos DEV/eclipse-workspace/course_java_poo_file2/teste5out.txt";
		
		///criar um novo arquivo ou recriar o arquivo ja existente, deletando o que já havia antes
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			///acrescentar no final de um arquivo já existente, adicionar o "true"
			///try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true)))
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
