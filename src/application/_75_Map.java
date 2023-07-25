package application;

import java.util.Locale;
import java.util.Scanner;

public class _75_Map {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*					MAP<Key,Value>
	° É uma coleção de pares chave / valor.
		- Não admite repetições do objeto chave.
		- Os elementos são indexados pelo objeto chave (não possuem posição).
		- Acesso, inserção e remoção de elementos são rápidos.
		
	° Uso comum: cookies, local storage, qualquer modelo chave-valor.

	° Principais implementações
		- hashSet -> mais rápido(operações O(1) em tabela hash) e não ordenado.
		- TreeSet -> mais lento(operações O(log(n)) em árvore rubro-negra) e ordenado pelo 'compareTo' do objeto (ou 'Comparator').
		- LinkedHashSet -> velocidade intermediária e elementos na ordem em que são adicionados.
		
	° Alguns métodos importantes
		- put(key, value), remove(key), containsKey(key), get(key).
			. Baseado em equals e hashCode.
			. Se equals e hashCode não existir, é usada comparação de ponteiros.
		- clear().
		- size().
		- keySet() -> retorna um Set.
		- values() -> retorna um Collection<V>.
*/