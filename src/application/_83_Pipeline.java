package application;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _83_Pipeline {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Integer> lista = Arrays.asList(3, 4, 5, 10, 7);
		
		Stream<Integer> listaPadrao = lista.stream();
		System.out.println("Lista padrão = " + Arrays.toString(listaPadrao.toArray()));
		
		Stream<Integer> st1 = lista.stream().map(x -> x * 10);
		System.out.println("Array multiplicado por 10 = " + Arrays.toString(st1.toArray()));
		
		int soma = lista.stream().reduce(0, (x, y) -> x + y); //Exemplo de pipeline.
		System.out.println("Soma = " + soma);
		
		List<Integer> novaLista = lista.stream() //Exemplo de pipeline.
				.filter(x -> x % 2 == 0)
				.map(x -> x * 10)
				.collect(Collectors.toList());
		System.out.println(Arrays.toString(novaLista.toArray()));
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}