package application;

import java.util.Locale;
import java.util.Scanner;

public class _24_Construtores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*			CONSTRUTOR
*	° É uma operação especial da classe, que executa no momento da instanciação do objeto.
*	° Usos comuns:
*		- Iniciar valores dos atributos.
*		- Permitir ou obrigar que o objeto receba dados / dependências no momento de sua instanciação (injeção de dependência).
*	° Se um construtor customizado não for especificado, a classe disponibilizaz o construtor padrão.
*		- Produto p = new Produto();
*	° É possível especificar mais de um construtor na mesma classe (sobrecarga).
*/