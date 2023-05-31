//	VETORES DO 'TIPO VALOR'	//
package application;

import java.util.Locale;
import java.util.Scanner;

public class _29_Vetores{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o tamanho do vetor:");
		int n = sc.nextInt();
		double [] vect = new double [n]; //abrir e fechar colchetes '[]' indica a declaração de um vetor.
		for(int i = 0; i < n; i++) {
			System.out.printf("Insira a %dª altura:%n",i+1); //'i+1' é só para formatar "corretamente", declarando o primeiro vetor como 1 e não 0.
			vect[i] = sc.nextDouble(); //o vetor vai receber o valor de 'n'.
		}
		double soma = 0;
		for(int i = 0; i < n; i++){
			soma += vect[i];
		}
		double media = soma / n;
		System.out.printf("Altura média: %.2f%n", media);
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*				VETORES
 *	° Vetor, é nome dado a arranjos unidimensionais.
 *	° Arranjo('Array') é uma estrutura de dados:
 *		- Homogênea (dados do mesmo tipo).
 *		- Ordenada (elementos acessados por meio de posições).
 *		- Alocada de uma vez só, em um bloco contíguo de memória.
 *
 *	° Vantagens:
 *		- Acesso imediato aos elementos pela sua posição.
 *
 *	° Desvantagens:
 *		- Tamanho fixo.
 *		- Dificuldade para se realizar inserções e deleções.
 *
 *	° Problema exemplo 1:
 *		- Fazer um programa para ler um número inteiro N e a altura de N pessoas. Armazenar as N alturas em um vetor.
 *		Em seguida, mostrar altura média dessas pessoas.
*/