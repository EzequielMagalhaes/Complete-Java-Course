package application;

import java.util.Locale;
import java.util.Scanner;

public class _47_ClassesAbstratas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*			CLASSES ABSTRATAS
	° São classes que não podem ser instanciadas.
	° É uma forma de garantir herança total: somente subclasses não abstratas podem ser instanciadas, mas nunca a superclasse abstrata.
*/