package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_33 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}EXERCÍCIO - TEM CORREÇÃO!
/*1. Na contagem de votos de uma eleição, são gerados vários registros de votação contendo o nome do candidato e a quantidade de votos(formato .csv)
que ele obteve em uma urna de votação. Você deve fazer um programa para ler os registros de votação a partir de um arquivo, e daí gerar um relatório 
consolidado com os totais de cada candidato.

CANDIDATOS / VOTOS : 
	Alex Blue, 15
	Maria Green, 22
	Bob Brown, 21
	Alex Blue, 30
	Bob Brown, 15
	Maria Green, 22
	Maria Green, 27
	Bob Brown, 25
	Alex Blue, 31
*/