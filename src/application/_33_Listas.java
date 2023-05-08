package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class _33_Listas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
//		isso '<>' é o generics, que é uma parametrização da definição de um tipo informando um outro tipo (Integer,String,Double).
		List<String> lista = new ArrayList</*String*/>(); // o generics é opcional dependendo da versão do Java.
		
		lista.add("Ezequiel"); // [0]
		lista.add("Nathália"); // [1]
		lista.add("Samuel"); // [2]
		lista.add("Lyssa"); // [4]
		lista.add(3,"Gaby"); // [3]
		
		lista.remove("Samuel"); // esse "Samuel" é outra instância de string... uma lista é capaz de fazer uma comparação entre strings e pelo valor reconhecer e remover a string da ln.17
		lista.remove(3); // da pra remover através do index de posição.
		
		for(String x : lista){
			System.out.println(x);
		}
		
		System.out.println("O tamanho da lista é : " + lista.size() + " elemento(s)");
		
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*				LISTAS
*	° Lista é uma estrutura de dados:
*		- Homogênea (dados do mesmo tipo) - se um elemtento for do tipo String, vai ser tudo do tipo String...se um elemtento for do tipo Double, vai ser tudo do tipo Double.
* 		- Ordenada (elementos acessados por meio de posições).
* 		- Inicia vazia e seus elementos são alocados sob demanda.
* 		- Cada elemento ocupa um "nó" (ou "nodo") da lista.
* 	° Tipo (interface): List
* 		- Não é uma classe, é uma interface (interface é um tipo que apenas define a especificação das operações).
* 			*Se um tipo é interface, não se pode instanciar esse tipo, é necessária uma classe que implementa essa interface.
* 	° Classes que implementam: ArrayList, LinkedList, etc.
*	° Vantagens:
*		- Tamanho variável.
*		- Facilidade para se realizar inserções e deleções.
*	° Desvantagens:
*		- Acesso sequencial aos elementos. *(se eu quiser usar o elemento 400 de uma lsita com 1000 itens, é necessário percorrer todos os 399 itens da lista para acessar o 400).
*			* Da pra ser otimizada.
*
*			DEMONSTRAÇÃO
*	° Tamanho da lista: size()
*	° Inserir elemento na lista: add(obj), add(int,obj)
*	° Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
*	° Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)
*	° Filtrar lista com base em predicado:
*		Last<Integer> result = list.stream().(x -> x > 4).collect(Collectors.toList())
*	° Encontrar a primeira ocorrência com base em predicado:
*		Integer result = list.stream().(x -> x > 4).findFirst().orElse(null)
*	
*	- Assuntos pendentes:
*		. interface
*		. generics
*		. predicados (lambda)
*/