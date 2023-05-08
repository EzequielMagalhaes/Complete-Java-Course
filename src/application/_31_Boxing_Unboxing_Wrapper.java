package application;

import java.util.Locale;
import java.util.Scanner;

public class _31_Boxing_Unboxing_Wrapper {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//	BOXING
//		Objeto do tipo valor;
		int x = 20;
		int a = 20;
//		Objeto do tipo referência;
		Object obj = x;
		System.out.println(x);
		System.out.println(obj);
//	UNBOXING
		int y = (int) obj;
		System.out.println(y);
//	WRAPPER CLASSES
		Integer object = a;
		System.out.println(a);
		int b = object; // nao é mais necessário usar o casting '(int)'.
		System.out.println(b);
		
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*
*	° BOXING:
*		(Encaixotamento)
*		- É o processo de conversão de um objeto tipo valor para um objeto tipo referência.
* 	° UNBOXING:
*		(Encaixotamento)
*		- É o processo de conversão de um objeto tipo referência para um objeto tipo valor compatível.
*	° WRAPPER CLASSES:
*		- São classes equivalentes aos tipos primitivos.
*		- Boxing e Unboxing é natural na linguagem.
*		- Uso comum: campos de entidades em sistemas de informação (IMPORTANTE!)
*			. Pois tipos referência (classes) aceitam valor 'null' e usufruem dos recursos orientados a objeto.
*/