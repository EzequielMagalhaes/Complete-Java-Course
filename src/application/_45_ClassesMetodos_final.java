package application;

import java.util.Locale;
import java.util.Scanner;

public class _45_ClassesMetodos_final {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*				CLASSES E MÉTODOS FINAL 
	° Palavra chave: *final*
	
	° Classe:
		- Evita que a classe seja herdada.
			'public final class ContaPoupanca{
			}'
	
	° Método:
		- Evita que o método sob seja sobreposto.
	
*/