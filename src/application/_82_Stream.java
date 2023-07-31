package application;

import java.util.Locale;
import java.util.Scanner;

public class _82_Stream {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*							STREAM
	° É uma sequência de elementos advinda de uma fonte de dados que oferece suporte a "operações agregadas".
		- Fonte de dados: coleção, array, função de iteração, recurso de Entrada/Saída.
	° Stream é uma solução para processar sequências de dados de forma:
		- Declarativa (iteração interna: escondida do programador).
		- Parallel-friendly (imutável -> thread safe).
		- Sem efeitos colaterais.
		- Sob demanda (lazy evaluation).
	° Acesso sequencial (não há índices).
	° Single-use: só pode ser "usada" uma vez.
		- Se tentar usá a stream de novo, vai gerar uma exceção no programa.
	° Pipeline: operações em streams retornam novas streams. Então é possível criar uma cadeia de operações (fluxo de processamento).
	
					COMO CRIAR UMA STREAM
	° Basta chamar o método stream() ou parallelStream() a partir de qualquer objeto Collection.
	° Outras formas de se criar uma stream incluem:
		- Stream.of
		- Stream.ofNullable
		- Stream.iterate
	
	
					OPERAÇÕES INTERMEDIÁRIAS E TERMINAIS
	° O pipeline é composto por zero ou mais operações intermediárias e uma terminal.
	° Operação intermediária:
		- Produz uma nova streams (encadeamento).
		- Só executa quando uma operação terminal é invocada (lazy evaluation).
	° Operação terminal:
		- Produz um objeto não-stream (coleção ou outro).
		- Determina o fim do processamento da stream.
		
	° Operações intermediárias que da pra usar:
		- filter
		- map
		- flatmap
		- peek
		- distinct
		- sorted
		- skip
		- limit(*) // Na hora que a condição da operação 'shor-circuit' é satisfeita o processamento termina.
		* = short-circuit
	
	° Operações terminais:
		- forEach
		- forEachOrdered
		- toArray
		- reduce
		- collect
		- min
		- max
		- count
		- anyMatch(*)
		- allMatch(*)
		- noneMatch(*)
		- findFirst(*)
		- findAny(*)
		* = short-circuit
*/