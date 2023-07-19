package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class _58_FileWriter_BufferedWriter {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] linhas = new String [] {"Bom dia" , "Boa tarde", "Boa noite"};
		String path = "C:\\temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){ //(path, true)-> com o true ele apenas acrescenta as linhas ao arquivo, sem destruí-lo e recriá-lo.
			for(String linha : linhas ) {
				bw.write(linha);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Arquivo criado com sucesso!");
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*
	° File Writer(stream de escrita de caracteres em de arquivos).
		- JAVADOC-> https://docs.oracle.com/javase/8/docs/api/java/io/FileWriter.html
		- Cria / recria o arquivo: new FileWriter(path).
		- Acrescenta ao arquivo existente: new FileWriter(path,true).
	° Buffered Writer(mais rápido).
		- JAVADOC-> https://docs.oracle.com/javase/8/docs/api/java/io/BufferedWriter.html
*/