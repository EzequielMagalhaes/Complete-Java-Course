package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Produto;

public class _20_ReaproveitamentoEDelegacao_Pt2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("Insira os dados do produto: ");
		System.out.print("Name: ");
		produto.nome = sc.nextLine();
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println(produto.nome + ", " + produto.preco + ", " + produto.quantidade);
		
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
