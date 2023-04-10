import java.util.Locale;
import java.util.Scanner;

public class _11_While {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("O programa vai parar quando enviar o valor 'zero' para a variável 'x'");
		System.out.println("Enquanto isso, ele vai somando todos os valores inseridos anteriormente");
		System.out.println("Insira um valor...");
		int x = sc.nextInt();
		int soma = 0;
		
		while( x != 0 ) {
			System.out.println("Número diferente de 'zero' o programa vai continuar, insira um valor...");
			soma += x;
			x = sc.nextInt();
		}
		System.out.println("Programa terminou!");
		System.out.printf("A soma de todos os números é: %d%n",soma);
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*				WHILE
 * - É uma estrutura de controle que repete um bloco de comandos
 * 	enquanto uma condição for verdadeira.
 * 
 * 		Quando usar o WHILE ?
 * - Quando não souber previamente a quantidade de repetiçoes
 *  que será realizada;
 */