package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
//import java.util.HashSet;
//import java.util.TreeSet;
//import java.util.LinkedHashSet;

public class _72_Set {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//EXEMPLO 1
		
//		Set<String> set = new HashSet<>();
//		Set<String> set = new TreeSet<>();
//		Set<String> set = new LinkedHashSet<>();
//		
//		set.add("TV");
//		set.add("Notebook");
//		set.add("Tablet");
//		
//		set.remove("Tablet");
//		set.removeIf(x -> x.charAt(0) == 'T');
//		
//		System.out.println(set.contains("Notebook"));
//		
//		for(String p : set) {
//			System.out.println(p);
//		}
//		
		//EXEMPLO 2 - CONJUNTOS
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		//uniao
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);

		//interceção
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		//diferença
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*				SET
	° Representa um conjunto de elementos(similar ao da Álgebra).
		- Não admite repetições.
		- Elementos são possuem posição.
		- Acesso, inserção e remoção de elementos são rápidos.
		- Oferece operações eficientes de conjunto: interseção, união, diferença.
		- Principais implementações:
			. hashSet -> mais rápido(operações O(1) em tabela hash) e não ordenado.
			. TreeSet -> mais lento(operações O(log(n)) em árvore rubro-negra) e ordenado pelo 'compareTo' do objeto (ou 'Comparator').
			. LinkedHashSet -> velocidade intermediária e elementos na ordem em que são adicionados.
			
	° Aalguns métodos importantes
		- add(obj), remove(obj), contains(obj).
			. Baseado em equals e hashCode.
			. Se equals e hashCode não existir, é usada comparação de ponteiros.
		- clear().
		- size().
		- removeIf(predicate).
		- addAll(other).
			. União: adiciona no conjunto os elementosdo outro conjunto, sem repetição.
		- retainAll(other).
			. Inserção: remove do conjunto os elementos não contidos em 'other'.
		- removeAll(other).
			. Diferença: remove do conjunto os elementos contidos em 'other'.
*/