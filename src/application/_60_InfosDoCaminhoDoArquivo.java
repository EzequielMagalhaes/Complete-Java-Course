package application;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class _60_InfosDoCaminhoDoArquivo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um caminho de arquivo: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		System.out.println("getPath: " + path.getPath());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getName: " + path.getName());
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}