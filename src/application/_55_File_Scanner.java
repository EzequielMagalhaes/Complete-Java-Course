package application;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class _55_File_Scanner {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		File file = new File("c:\\temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e){
			System.out.println("Error" + e.getMessage());
		}
		finally {
			if(sc != null) {				
				sc.close();
			}
		}
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
	}
}
/*

*/