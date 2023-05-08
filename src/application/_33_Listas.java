package application;

import java.util.Locale;
import java.util.Scanner;

public class _33_Listas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*			LISTAS
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
*/