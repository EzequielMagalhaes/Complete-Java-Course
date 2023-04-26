package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Produto;

public class _21_Object_toString {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("Insira os dados do produto: ");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		produto.quantidade = sc.nextInt();
		System.out.println(); // string vazia, só para saltar linha.
		System.out.println("Dados do produto: " + produto); //nem precisa puxar o método 'toString()' , o eclipse já reconhece.
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
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*	'Object' possui os seguintes métodos:
 *		°getClass > retorna o tipo do objeto.
 *		°equals > compara se objeto é igual a outro.
 * 		°hashCode > retorna um código hash do objeto
 *		°toString > converte o objeto para String.
*/