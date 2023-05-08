package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

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
		lista.add("Maria"); // [5]		
		lista.add("Leandro"); // [6]		
		lista.add(3,"Gaby"); // [3]
		
		for(String x : lista){
			System.out.println(x);
		}
		System.out.println("O tamanho da lista é : " + lista.size() + " elemento(s)");
		System.out.println("--------------------");
		for(String y : lista){
			System.out.println("Index do(a) " + y + ": " + lista.indexOf(y));
		}
		System.out.println("--------------------");
//		O tipo 'stream()' é um tipo especial do Java 8+ que aceita operações com expressões lambda
		List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList()); 
		for(String z : resultado){
			System.out.println(z);
		}
		System.out.println("São os nomes que começam com : L" );
		System.out.println("--------------------");
//		REMOVER POR COMPARAÇÃO DE VALORES
		lista.remove("Samuel"); // esse "Samuel" é outra instância de string... uma lista é capaz de fazer uma comparação entre strings e pelo valor reconhecer e remover a string da ln.17
//		REMOVER POR INDEX DE POSIÇÃO
		lista.remove(3);
//		REMOVER POR PREDICADO
		lista.removeIf(x -> x.charAt(0) == 'M'); //função lambda, remove todos os nomes começados com "M".
		
		for(String x : lista){
			System.out.println(x);
		}
		System.out.println("O tamanho da nova lista é : " + lista.size() + " elemento(s)");
		System.out.println("--------------------");
		
		for(String y : lista){
			System.out.println("Index do(a) " + y + ": " + lista.indexOf(y));
		}
		System.out.println("--------------------");

//		Pega o primeiro elemento que atende ao predicado(x -> x.charAt(0) == 'N'), se esse elemento não existir ele vai retornar null;
		String nome = lista.stream().filter(x -> x.charAt(0) == 'N').findFirst().orElse(null);
		System.out.println(nome);
		System.out.println("--------------------");
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