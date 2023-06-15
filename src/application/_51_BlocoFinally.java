package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class _51_BlocoFinally {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (FileNotFoundException e){
			System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
			System.out.println("Bloco 'finally' executado com sucesso!");
		}
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
	}
}
/*			BLOCO FINALLY
	° É um bloco que contém código a ser executado independentemente de ter ocorrido ou não uma exceção.
	° Exemplo clássico: fechar um arquivo, conexão com banco de dados ou outro recurso específico ao final do processamento.
*/