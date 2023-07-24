package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import entities.Produto5;

public class _73_Set_TestandoIgualdade {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Set<Produto5> set = new HashSet<>();
		set.add(new Produto5("Tv", 900.0));
		set.add(new Produto5("Notebook", 1200.0));
		set.add(new Produto5("Tablet", 400.0));
		
		Produto5 prod = new Produto5("Notebook", 1200.0);
		
		System.out.println(set.contains(prod));
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*			COMO AS COLEÇÕES HASH TESTAM IGUALDADE?
	° Se hashCode e equals estiverem implementados:
		- Primeiro hashCode. Se der igual, usa equals para confirmar.
		- Lembre-se: String, Integer, Double,etc. Já possuem equals e hashCode.
		
	° Se equals e hashCode não estiverem implementados:
		- Compara as referências(ponteiros) dos objetos.
*/