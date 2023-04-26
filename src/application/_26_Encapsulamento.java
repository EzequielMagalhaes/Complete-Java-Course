package application;

import java.util.Locale;
import java.util.Scanner;

public class _26_Encapsulamento {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*				ENCAPSULAMENTO
*	° É um princípioque consiste em esconder detalhes de implementação de uma classe, expondo apenas operações seguras 
*	e que mantenham os objetos em um estado consistente.
*
*	° REGRA DE OURO 
*		- O objeto deve sempre estar em um estado consistente e a própria classe deve garantir isso.
*	° REGRA GERAL BÁSICA
*		- Um objeto NÃO deve expor nenhum atributo(modificador de acesso 'private').
*		- Os atributos devem ser acessados por meio de métodos 'get' e 'set'.
*/