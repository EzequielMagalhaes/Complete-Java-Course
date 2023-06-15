package application;

import java.util.Locale;
import java.util.Scanner;

public class _49_Excecao_Try_Catch {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*					EXCEÇÕES
	° Uma exceção é qualquer condição de erro ou comportamento inesperado encontrado por um programa em execução.
	° Em java, uma exceção é um objeto herdado da classe:
		- java.lang.Exception - o compilador obriga a tratar ou propagar.
		- java.lang.RuntimeException - o compilador não obriga a tratar ou propagar.
	° Quando lançada, uma exceção é propagada na pilha de chamadas de métodos em execução, até que seja capturada(tratada) ou o programa encerre.
		
	PORQUE EXCEÇÕES?
	° O modelo de tratamento de exceções permite que erros sejam tratados de forma consistente e flexível, usando boas práticas.
	° Vantagens:
		- Delega a lógica do erro para a classe responsável por conhecer as regras que podem ocasionar o erro.
		- Trata de forma organizada (inclusive hierárquica) exceções de tipos diferentes.
		- A exceção pode carregar dados quaisquer.
		
					ESTRUTURA try-catch
	° Bloco try:
		- Contém o código que representa a execução normal do trecho de código que *pode* acarretar em uma exceção.
	° Bloco catch:
		- Contém o código a ser executado caso uma exceção ocorra.
		- Deve ser especificado o tipo da exceção a ser tratada (upcasting é permitido).
*/