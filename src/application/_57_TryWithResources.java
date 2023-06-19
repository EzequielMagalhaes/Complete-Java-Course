package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class _57_TryWithResources {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String path = ("c:\\temp\\in.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String linha = br.readLine();
			
			while(linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*				try-with-resources
	° É um bloco try que declara um ou mais recursos, e garante que esses recursos serão fechados ao final do bloco.
	° Disponível a partir do Java 7+

*/