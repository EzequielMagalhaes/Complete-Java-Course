package application;

import java.util.Locale;
import java.util.Scanner;

public class _44_Heranca {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*					HERANÇA
	° É um tipo de associação que permite que uma classe herde *TODOS* dados e comportamentos de outra.
	° Definições importantes.
	° Vantagens: 
		- Reuso.
		-Polimorfismo.
	° Sintaxe:
		- "class A extends B"
*/