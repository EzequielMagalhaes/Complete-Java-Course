import java.util.Locale;
import java.util.Scanner;

public class _13_DoWhile {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resposta;
		do {
			System.out.print("Digite a temperatura em Celcius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32; // Fórmula física de Fahrenheit
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.println("Deseja repetir? (s/n)");
			resposta = sc.next().charAt(0);
			if(resposta != 's') {
				System.out.println("Não entendi o comando por favor digite novamente.");
				System.out.println("Deseja repetir? (s/n)");
				resposta = sc.next().charAt(0);
			}
		}while(resposta != 'n');
		
			System.out.println("Programa terminou!");
			System.out.println("Até a próxima =)");
			sc.close();
	}
}

/*		DO WHILE
*	do {
*		condição 1
*		condição 2
*	}while(condição);
*/