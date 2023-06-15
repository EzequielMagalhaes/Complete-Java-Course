package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class _50_PilhaDeChamadasDeMetodos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		metodo1();
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
	}
	
	public static void metodo1() {
		System.out.println("***INÍCIO DO MÉTODO 1***");
		metodo2();
		System.out.println("***FIM DO MÉTODO 1***");
	}
	
	public static void metodo2() {
		System.out.println("***INÍCIO DO MÉTODO 2***");
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite nomes para serem inseridos no vetor:");
			String [] vect = sc.nextLine().split(" "); //separa o vetor a cada espaço
			System.out.println("Digite qual posição do vetor deseja acessar: ");
			int posicao = sc.nextInt();
			System.out.println(vect[posicao]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida!");
			e.printStackTrace(); //imprime o rastreamento do stack.
			// mostra toda a chamada de métodos que acarretou nessa exceção.
		}
		catch(InputMismatchException e) {
			System.out.println("Input inválido!");
		}
		System.out.println("***FIM DO MÉTODO 2***");
		sc.close();
	}
}
/*				STACK TRACE
*/