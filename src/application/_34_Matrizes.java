package application;

import java.util.Locale;
import java.util.Scanner;

public class _34_Matrizes {
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o tamanho da matriz:");
		int n = sc.nextInt();
		int [][] matriz = new int [n][n]; // os dois '[][]' são quem determinam que é um array BIdimensional.
		for(int i = 0; i < matriz.length; i++){ // linhas
			for(int j = 0; j < matriz[i].length; j++){ // colunas
				System.out.printf("Insira o valor a ser armazenado na LINHA [%d] COLUNA [%d]:%n",i,j);
				matriz[i][j] = sc.nextInt();
			}
			System.out.println("===================================================================");
		}
		System.out.println("Diagonal principal:"); // a diagonal principal se da sempre com índicese iguais(i=0 e j=0,i=1 e j=1).
		//DIAGONAL PRINCIPAL.
		for(int i = 0; i < n; i++){
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println();
		//CONTADOR DE NEGATIVOS.
		int contador = 0;
		for(int i = 0; i < matriz.length; i++){ // matriz.length é o tamanho do vetor 'n';
			for(int j = 0; j < matriz[i].length; j++){	// matriz.[na linha 'i'].lenght
				if(matriz[i][j] < 0) {
					contador++;
				}
			}
		}
		System.out.println("Números negativos = " + contador);
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*					MATRIZ
*	° Em programação, "Matriz" é o nome dado a arrays bidimensionais.
*		."Vetores de vetores" 
* 	° Array (arranjo) é uma estrutura de dados:
* 		- Homogênea (dados do mesmo tipo).
* 		- Ordenada (elementos acessados por meio de posições).
* 		- Alocada de uma vez só, em um bloco contíguo de memória.
* 	° Vantagens:
* 		- Acesso imediato aos elementos pela sua posição.
* 	° Desvantagens:
* 		- Tamanho fixo.
* 		- Dificuldade para se realizar inserções e deleções.
* 
* 	° Problema exemplo: 
* 		- Fazer um programa para ler um número inteiro 'N' e uma matriz de ordem 'N' contendo números inteiros.
* 		Em seguida, mostrar a diagonal principal e a quantidade de valores negativos da matriz.
*/