package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Produto7;
import model.services.ServicoProduto;

public class _81_FuncoesRecebendoFuncoes {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Produto7> lista = new ArrayList<>();
		lista.add(new Produto7("Tv", 900.00));
		lista.add(new Produto7("Mouse", 50.00));
		lista.add(new Produto7("Tablet", 350.50));
		lista.add(new Produto7("HD Case", 80.90));
		
		ServicoProduto sp = new ServicoProduto();
		double soma = sp.somaFiltrada(lista, p -> p.getNome().charAt(0) == 'T');
		
		System.out.println("A soma dos produtos = " + String.format("%.2f", soma));
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*			Funções que recebem funções como argumento
	° Problema exemplo:
		- Fazer um programa que, a partir de uma lista de produtos, calcule a soma dos preços somente dos produtos cujo nome começa com "T".
*/