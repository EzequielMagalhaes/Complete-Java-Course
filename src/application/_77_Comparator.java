package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Produto7;

public class _77_Comparator {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Produto7> lista = new ArrayList<>();
		
		lista.add(new Produto7("Tv", 900.0));
		lista.add(new Produto7("Notebook", 1200.0));
		lista.add(new Produto7("Tablet", 400.0));
/*		1° MÉTODO - Definindo uma classe 'Comparator' e chamando-a.
		lista.sort(new MyComparator());
==================================================================================*/
/*		2° MÉTODO - Definindo um 'Comparator' utilizando sintaxe de classe anônima.
		
		Comparator<Produto7> comp = new Comparator<Produto7>() { // 
			@Override
			public int compare(Produto7 p1, Produto7 p2) {
				return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
			}
		};
		lista.sort(comp);
==================================================================================*/
/*		3° MÉTODO - Definindo uma função anônima, 'arrow function', de três maneiras.
 		Expressão lambda com chaves
 		 
		Comparator<Produto7> comp = (p1,p2) -> { 
			return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
		};
		
		// ou //
		Expressão lambda sem chaves
		
		Comparator<Produto7> comp = (p1,p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()); 
		
		// ou //
		Expressão lambda "direto no argumento". */
		
		lista.sort((p1,p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));
		
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