package apllication;

import java.io.File;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter a folder path: ");
			String strPath = sc.nextLine();
			
			File path = new File(strPath);
			///Localização de pastas nos diretórios
			File[] folders = path.listFiles(File :: isDirectory);
			System.out.println("FOLDERS: ");
			for(File folder : folders) {
				System.out.println(folder);
			}
			
			///Localização de arquivos nos diretórios
			File[] files = path.listFiles(File :: isFile);
			System.out.println("FILES: ");
			for(File folder : files) {
				System.out.println(folder);
			}
			
			///Criação de subpastas no diretório
			boolean sucess = new File(strPath + "/subdir").mkdir();
			System.out.println("Directory created succesfully: " + sucess);
			sc.close();
			
			///Informações do caminho do arquivo
			
			///Nome do arquivo
			System.out.println("getName: " + path.getName());
			///Caminho do arquivo
			System.out.println("getParent: " + path.getParent());
			///Caminho e nome do arquivo
			System.out.println("getPath: " + path.getPath());
			
	}

}
