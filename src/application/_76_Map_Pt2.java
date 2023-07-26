package application;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import entities.Produto5; //único import que tem apenas os atributos 'nome' e 'preço'.

public class _76_Map_Pt2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Map<Produto5, Double> stock = new HashMap<>();
		Produto5 p1 = new Produto5("Tv", 900.0);
		Produto5 p2 = new Produto5("Notebook", 1200.0);
		Produto5 p3 = new Produto5("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		Produto5 ps = new Produto5("Tv", 900.0);
		
		System.out.println("Contém a chave 'ps' : " + stock.containsKey(ps));
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}