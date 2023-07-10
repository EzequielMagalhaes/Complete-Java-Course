package application;

import java.util.Locale;
import java.util.Scanner;

public class _65_DefaultMethods {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*				DEFAULT METHODS
	° A partir do Java 8, interfaces podem conter métodos concretos.
	° A intenção básica é prover implementação padrão para métodos, de modo a evitar:
		- 1) repetição de implementação em toda classe que implemente a interface.
		- 2) a necessidade de se criar classes abstratas para prover reuso da implementação.
	° Outra vantagem: 
		- Manter a retrocompatibilidade com sistemas existentes.
		- Permitir que "interfaces funcionais" (que devem conter apenas um método) possam prover outras operações padrão reutilizáveis.
*/