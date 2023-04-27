package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Produto3;

public class _26_Encapsulamento {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira os dados do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		Produto3 produto = new Produto3();
		
		produto.setNome("Computador");
		System.out.println("Nome atualizado: " + produto.getNome());
		produto.setPreco(1200.00);
		System.out.println("Preço atualizado: " + produto.getPreco());
		
		System.out.println();
		System.out.println("Dados do produto: " + produto);
		System.out.println();
		System.out.print("Insira o número de produtos para serem adicionados ao estoque: ");
		int quantidade = sc.nextInt();
		produto.addProdutos(quantidade);
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		System.out.print("Insira o número de produtos para serem removidos do estoque: ");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		System.out.println();
		
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