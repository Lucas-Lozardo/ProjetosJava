package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		///Leitura do arquivo de entrada e criaçáo da pasta onde será inserido o novo arquivo.
		
		///Ler o caminho de entrada do arquivo (incluindo o arquivo)
		System.out.println("Enter file path: ");
		String sourceFileStr = sc.nextLine();
		///Instancia o caminho do arquivo de entrada no File (incluindo o arquivo)
		File sourceFile = new File(sourceFileStr);
		///Instancia numa String o caminho do arquivo de entrada desprezando o arquivo em si.
		String sourceFolderStr = sourceFile.getParent(); 	/// .getParent() = ler o caminho do arquivo de entrada desprezando o arquivo.
		///Criar a nova pasta onde será inserido o arquivo posteriormente
		boolean sucess = new File(sourceFolderStr + "/out").mkdir(); /// .mkdir() = Comando para criar um novo diretóri (a pasta). + "/out" = nome da pasta que será criada.
		System.out.println("Directory created succesfully: " + sucess);
		
		///Criação do novo arquivo que será criado dentro da pasta
		String targetFilerStr = sourceFolderStr + "/out/summary.csv";
		
		///Ler o arquivo, fragmentar e inserir nas variáveis correspondentes as informações obtidas utilizando vetores. (String, Double, Int etc...).
		
		///Ler e armazenar numa String o arquivo do caminho de entrada.
		try(BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){
			///Ler a primeira linha do arquivo ao instancia-lo.
			String itemCsv = br.readLine();
			
			
			///Fragmentar e inserir utilizando vetores
			while(itemCsv != null) {
			String[] fields = itemCsv.split(","); ///.split(",") = fragmentar utilizando como base a vírgula inseriada no arquivo de entrada (origem).
				String name = fields[0];
				double price = Double.parseDouble(fields[1]); ///Double.parseDouble = transformar a String obtida em Double.
				int quantity = Integer.parseInt(fields[2]); ///Integer.parseInt = transformar a String obtida em  Integer.
				
				list.add(new Product(name, price, quantity));
				///Ler a próxima linha.
				itemCsv = br.readLine();
			}
			
			///Escrever no novo arquivo que foi instanciado acima, linha 39.
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFilerStr))){
				
				for(Product item : list) {
					bw.write(item.getName() + ", " + String.format("%.2f", item.total()));
					bw.newLine(); /// newLine() = criar nova linha.
				}
				System.out.println(targetFilerStr + " CREATED");
			}
			catch(IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
		}
		catch(IOException e) {
			System.out.println("Error writing file: " + e.getMessage());
		}
		sc.close();
	}

}
