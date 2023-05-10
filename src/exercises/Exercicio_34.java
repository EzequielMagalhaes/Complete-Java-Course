package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_34 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*EXERCÍCIO
1. Fazer um programa para ler dois números inteiros 'M' e 'N', e depois ler uma matriz de 'M' linhas por 'N' colunas contendo números inteiros,
podendo haver repetições. Em seguida, ler um número inteiro 'X' que pertence à matriz. Para cada ocorrência de 'X', mostrar os valores à esquerda, acima,
à direita e abaixo de 'X', quando houver, conforme exemplo.
*/