package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class _72_Set {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Set<String> set = new HashSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		System.out.println(set.contains("Notebook"));
		
		for(String p : set) {
			System.out.println(p);
		}
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