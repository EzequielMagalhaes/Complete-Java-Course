package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Produto7;

public class _80_Function {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Produto7> lista = new ArrayList<>();
		lista.add(new Produto7("Tv", 900.00));
		lista.add(new Produto7("Mouse", 50.00));
		lista.add(new Produto7("Tablet", 350.50));
		lista.add(new Produto7("HD Case", 80.90));
		
/*		1° MÉTODO - Definindo uma classe que implementa a interface 'Function<>'.

		List <String> nomes = lista.stream().map(new UpperCaseNomeFunction()).collect(Collectors.toList());
		nomes.forEach(System.out::println);	 
		
==================================================================================*/
/*		2° MÉTODO - Definindo um 'Reference Method' com método estático.
		
		List <String> nomes = lista.stream().map(Produto7::UpperCaseNomeStatic).collect(Collectors.toList());
		nomes.forEach(System.out::println);
		
==================================================================================*/
/*		3° MÉTODO - Definindo um 'Reference Method' com método não estático.
		
		List <String> nomes = lista.stream().map(Produto7::UpperCaseNomeNaoStatic).collect(Collectors.toList());
		nomes.forEach(System.out::println);
		
==================================================================================*/
/*		4° MÉTODO - Definindo uma expressão lambda declarada.
		Function<Produto7,String> func = p -> p.getNome().toUpperCase();
		List <String> nomes = lista.stream().map(func).collect(Collectors.toList());
		nomes.forEach(System.out::println);
		
==================================================================================*/
//		5° MÉTODO - Definindo uma expressão lambda inline.
		
		List <String> nomes = lista.stream().map(p -> p.getNome().toUpperCase()).collect(Collectors.toList());
		nomes.forEach(System.out::println);
		
//==================================================================================*/
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*				FUNCTION
	° Implementação: 
	
	public interface Function<T, R> {
		R apply (T t);
	}
	
	° FUNÇÃO 'MAP'
		- A função 'map'(não confundir com a estrutura de dados 'Map') é uma função que aplica uma função a todos elementos de uma stream.
	° Conversões:
		- List para stream : .stream()
		- Stream para List : .collect(Collectors.toList())
	° PROBLEMA EXEMPLO:
		- Fazer um programa que, a partir de uma lista de produtos, gere uma nova lista contendo os nomes dos produtos em caixa alta. 
*/