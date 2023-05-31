package application;

import java.util.Locale;
import java.util.Scanner;

public class _15_FuncoesString {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String Original = "abcde FGHIJ ABC abc DEFG    ";
		
		String s1 = Original.toLowerCase();
		String s2 = Original.toUpperCase();
		String s3 = Original.trim();
		String s4 = Original.substring(2); //ponto inicial, lembrando que funciona como um array, onde a primeira letra tem o valor zero.
		String s5 = Original.substring(2, 9); //ponto inicial e ponto final.
		String s6 = Original.replace('a', 'x'); //troca o primeiro parâmetro, pelo segundo.
		String s7 = Original.replace("abc", "xy");
		int i = Original.indexOf("bc"); //onde ocorre a primeira ocorrência de 'bc'.
		int j = Original.lastIndexOf("bc"); //onde ocorre a última ocorrência de 'bc'.
		String phrase = "Potato Apple Lemon";
		String vect[] = phrase.split(" "); //espaço em branco é o separador.
		
		System.out.println("Original: -" + Original + "-");
		System.out.println("toLowerCase: -" + s1 +"-");
		System.out.println("toUpperCase: -" + s2 + "-");
		System.out.println("trim: -" + s3 + "-");
		System.out.println("substring(2): -" + s4 + "-");
		System.out.println("substring(2, 9): -" + s5 + "-");
		System.out.println("replace('a', 'x'): -" + s6 + "-");
		System.out.println("replace('abc', 'xy'): -" + s7 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
		System.out.println("vect[0] = " + vect[0]);
		System.out.println("vect[1] = " + vect[1]);
		System.out.println("vect[2] = " + vect[2]);
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}