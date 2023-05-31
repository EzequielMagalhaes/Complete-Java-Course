package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Produto2;

public class _24_Construtores {
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira os dados do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		int quantidade = sc.nextInt();
		Produto2 produto = new Produto2(nome, preco, quantidade);
		
		System.out.println("===================================================================");
		System.out.println("Dados do produto: " + produto);
		System.out.println("===================================================================");
		System.out.print("Insira o número de produtos para serem adicionados ao estoque: ");
		quantidade = sc.nextInt();
		produto.addProdutos(quantidade);
		System.out.println("===================================================================");
		System.out.println("Dados atualizados: " + produto);
		System.out.print("Insira o número de produtos para serem removidos do estoque: ");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		System.out.println("===================================================================");
		System.out.println("Dados atualizados: " + produto);
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*				CONSTRUTOR
	° É uma operação especial da classe, que executa no momento da instanciação do objeto.
	° Usos comuns:
		- Iniciar valores dos atributos.
		- Permitir ou obrigar que o objeto receba dados / dependências no momento de sua instanciação (injeção de dependência).
	° Se um construtor customizado não for especificado, a classe disponibilizaz o construtor padrão.
		- Produto p = new Produto();
	° É possível especificar mais de um construtor na mesma classe (sobrecarga).
*/