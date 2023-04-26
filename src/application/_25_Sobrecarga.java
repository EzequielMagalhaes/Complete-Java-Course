package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto2;

public class _25_Sobrecarga {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto2 p = new Produto2(); // Escolhendo o construtor padrão só para exxemplificar.
		
		System.out.println("Insira os dados do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		Produto2 produto = new Produto2(nome, preco);
		
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
/*			SOBRECARGA
	° É um recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome, porém com diferentes listas de parâmetros.
	
		PROPOSTA DE USO DA SOBRECARGA
	° Criar um construtor opcional, o qual recebe apenas nome e preço do produto. A quantidade e, estoque deste novo produto, por padrão,
	  deverá então ser iniciada com o valor zero.
*/