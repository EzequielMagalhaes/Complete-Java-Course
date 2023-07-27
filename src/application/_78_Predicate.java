package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Produto7;

public class _78_Predicate {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Produto7> lista = new ArrayList<>();
		
		lista.add(new Produto7("Tv", 900.0));
		lista.add(new Produto7("Tablet", 350.0));
		lista.add(new Produto7("Mouse", 50.0));
		lista.add(new Produto7("HD Case", 80.90));

/*		1° MÉTODO - Definindo uma classe que implementa a interface 'Predicate<>'.
		lista.removeIf(new ProdutoPredicate());
		for(Produto7 p : lista) {
			System.out.println(p);
		}
==================================================================================*/
/*		2° MÉTODO - Definindo um 'Reference Method' com método estático.
		lista.removeIf(Produto7::produtoPredicateStatic);
		for(Produto7 p : lista) {
			System.out.println(p);
		}
==================================================================================*/
/*		3° MÉTODO - Definindo um 'Reference M ethod' com método não estático.
		lista.removeIf(Produto7::ProdutoPredicateNaoStatic);
		for(Produto7 p : lista) {
			System.out.println(p);
		}
==================================================================================*/
/*		4° MÉTODO - Definindo uma expressão lambda declarada.
		double min = 100.0;
		
		Predicate<Produto7> pred = p -> p.getPreco() >= min; // Da pra pegar facilmente valores de variáveis.
		
		lista.removeIf(pred);
		for(Produto7 p : lista) {
			System.out.println(p);
		}
==================================================================================*/
//		5° MÉTODO - Definindo uma expressão lambda inline.
		
		double min = 100.0;
		
		lista.removeIf(p -> p.getPreco() >= min);
		for(Produto7 p : lista) {
			System.out.println(p);
		}
//==================================================================================*/
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*				PREDICATE
	° Fazer um programa que, a partir de uma lista de produtos, remova da lista somente aqueles cujo preço mínimo seja 100.
*/