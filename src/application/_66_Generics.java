package application;

import java.util.Locale;
import java.util.Scanner;

import services.ServicoImpressao;

public class _66_Generics {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ServicoImpressao<Integer> si = new ServicoImpressao<>();
		System.out.println("Quantos valores? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int valor = sc.nextInt();
			si.addValor(valor);
		}
		si.print();
		System.out.println("Primeiro número: " + si.primeiro());
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*				GENERICS
	° Generics permitem que classes, interfaces e métodos possam ser parametrizados por tipo. Seus benefícios são:
		- Reuso.
		- Type safety.
		- Performance.
	Uso comum: coleções.
	
	List<String> lista = new ArrayList<>();
	lista.add("Maria");
	String nome = lista.get(0);
	
	PROBLEMA EXEMPLO
		- Deseja-se fazer um programa que leia uma quantidade N, e depois N números inteiros. Ao final, imprima esses números de forma organizada
	conforme exemplo. Em seguida, informar qual foi o primeiro valor informado.
*/