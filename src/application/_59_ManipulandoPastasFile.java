package application;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class _59_ManipulandoPastasFile {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um caminho de arquivo: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] pastas = path.listFiles(File::isDirectory); //pega apenas pastas.
		System.out.println("PASTAS:");
		for(File pasta : pastas) {
			System.out.println(pasta);
		}
		
		File[] arquivos = path.listFiles(File::isFile); //pega apenas arquivos.
		System.out.println("ARQUIVOS:");
		for(File arquivo : arquivos) {
			System.out.println(arquivo);
		}
		
		boolean sucesso = new File (strPath + "\\Sub Pasta").mkdir(); //cria uma subpasta dentro do caminho, alocado na variável 'strPath'.
		System.out.println("Diretório criado com sucesso: " + sucesso);
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}