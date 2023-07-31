package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto7;

public class _79_Consumer {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Produto7> lista = new ArrayList<>();
		lista.add(new Produto7("Tv", 900.00));
		lista.add(new Produto7("Mouse", 50.00));
		lista.add(new Produto7("Tablet", 350.50));
		lista.add(new Produto7("HD Case", 80.90));
		
/*		1° MÉTODO - Definindo uma classe que implementa a interface 'Consumer<>'.
 
		lista.forEach(new AtualizacaoPrecoConsumer());
		lista.forEach(System.out::println); // Usando um 'reference method' para o  fazer um forEach do println.
		
==================================================================================*/
/*		2° MÉTODO - Definindo um 'Reference Method' com método estático.
		
		lista.forEach(Produto7::AtualizacaoPrecoStatic);
		lista.forEach(System.out::println);
		
==================================================================================*/
/*		3° MÉTODO - Definindo um 'Reference Method' com método não estático.
		
		lista.forEach(Produto7::AtualizacaoPrecoNaoStatic);
		lista.forEach(System.out::println);
		
==================================================================================*/
/*		4° MÉTODO - Definindo uma expressão lambda declarada.
		
		double fator = 1.1;
		Consumer<Produto7> cons = p -> { // não precisa, das chaves, mas da pra usá-las afim de organização melhor do código.
			p.setPreco(p.getPreco() * fator);
		};
		
		lista.forEach(cons);
		lista.forEach(System.out::println);
		
==================================================================================*/
//		5° MÉTODO - Definindo uma expressão lambda inline.
		double fator = 1.1;
		
		lista.forEach(p -> p.setPreco(p.getPreco() * fator));
		lista.forEach(System.out::println);
		
//==================================================================================*/
		
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*				CONSUMER
	° Implementação:
	
	public interface Consumer<T>{
		void accept (T t);
	}


	° PROBLEMA EXEMPLO: 
		- Fazer um programa que, a partir de uma lista de produtos, aumente o preço dos produtos em 10%.
*/