package application;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _75_Map {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Map<String,String> cookies = new TreeMap<>();
		cookies.put("developer", "Zekiel");
		cookies.put("email", "zekiel.dev@gmail.com");
		cookies.put("password", "senha123");
		
		cookies.remove("email");
		cookies.put("password", "123senha"); // 'Map' não admite repetição de chaves. Se houver duas chaves com mesmo nome, a segunda irá sobrescrever a primeira.
		
		System.out.println("Contém a chave 'password': " + cookies.containsKey("password"));	
		System.out.println("Email de login: " + cookies.get("email")); // Quando o elemento não existe, o 'Map' retorna 'null'.
		System.out.println("Senha de login: " + cookies.get("password"));
		System.out.println("Tamanho: " + cookies.size());
		
		System.out.println("ALL COOKIES:");
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		
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