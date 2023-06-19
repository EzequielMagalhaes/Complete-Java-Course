package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class _56_FileReader_BufferedReader {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String path = ("c:\\temp\\in.txt");
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			String linha = br.readLine();
			
			while(linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {
				if(br != null)
					br.close();
				if(fr != null)
					fr.close();
				}
			catch(IOException e){
				e.printStackTrace();
			}
		}
	
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*

*/