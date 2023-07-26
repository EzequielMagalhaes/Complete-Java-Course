package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.MyComparator;
import entities.Produto7;

public class _77_Comparator {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Produto7> lista = new ArrayList<>();
		
		lista.add(new Produto7("Tv", 900.0));
		lista.add(new Produto7("Notebook", 1200.0));
		lista.add(new Produto7("Tablet", 400.0));
		
//		Collections.sort(lista);
		lista.sort(new MyComparator());
		
		for(Produto7 p : lista) {
			System.out.println(p);
		}
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*				UMA EXPERIÊNCIA COM O COMPARATOR
	° Suponha uma classe 'Produto' com os atributos 'nome' e 'preço'.
	° Podemos implementar a comparação de produtos por meio da implementação da interface 'Comparable<Produto>'
	° Entretanto, desta forma nossa classe não fica fechada para alteração: se o critério de comparação mudar, precisaremos alterar a classe 'Produto'.
	° Podemos então usar o default method "sort" da interface List:
		default void sort(Comparator<? super E> c).
	° Interface 'Comparator' é uma interface funcional que tem apenas um método ABSTRATO.
*/