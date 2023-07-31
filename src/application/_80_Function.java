package application;

import java.util.Locale;
import java.util.Scanner;

public class _80_Function {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*				FUNCTION
	° Implementação: 
	
	public interface Function<T, R> {
		R apply (T t);
	}
	
	° PROBLEMA EXEMPLO:
		- Fazer um programa que, a partir de uma lista de produtos, gere uma nova lista contendo os nomes dos produtos em caixa alta. 
*/