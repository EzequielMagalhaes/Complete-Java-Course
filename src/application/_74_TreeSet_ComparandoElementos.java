package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import entities.Produto6;

public class _74_TreeSet_ComparandoElementos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Set<Produto6> set = new TreeSet<>();
		set.add(new Produto6("Tv", 900.0));
		set.add(new Produto6("Notebook", 1200.0));
		set.add(new Produto6("Tablet", 400.0));
		
		for(Produto6 p : set) {
			System.out.println(p);
		}
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*

*/