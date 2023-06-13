package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios_12 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	/*BONUS	
		int y = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print(i + ",");
			y = y + 5;
			System.out.println(y);
		}
	*/
	/*1
		System.out.print("Digite um número inteiro entre 1 e 1000: ");
        int valor = sc.nextInt();
        for (int i = 1; i <= valor; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    */
	/*2
		System.out.print("Digite a quantidade de valores a serem lidos: ");
        int quantidadeValores = sc.nextInt();

        int dentroIntervalo = 0;
        int foraIntervalo = 0;

        for (int i = 0; i < quantidadeValores; i++) {
            System.out.print("Digite um valor inteiro: ");
            int valor = sc.nextInt();

            if (valor >= 10 && valor <= 20) {
                dentroIntervalo++;
            } else {
                foraIntervalo++;
            }
        }
        System.out.println("Valores dentro do intervalo[10 <> 20]: " + dentroIntervalo);
        System.out.println("Valores fora do intervalo[10 <> 20]: " + foraIntervalo);
    */
	/*3
		System.out.println("Digite a quantidade de testes que serão feitos: ");
		int quantidadeTeste = sc.nextInt();
		
		for(int i = 0; i < quantidadeTeste; i++) {
			System.out.println("Digite os 3 valores do caso de teste #" + (i+1) + ":");
			System.out.println("Valor 1:");
			int valor1 = sc.nextInt();
			System.out.println("Valor 2:");
			int valor2 = sc.nextInt();
			System.out.println("Valor 3:");
			int valor3 = sc.nextInt();
			
			int mediaPonderada = (valor1 * 2 + valor2 * 3 + valor3 * 5) / 10;
			System.out.println("A media ponderada do caso de teste #" + (i+1) + ":");
			System.out.println(mediaPonderada);
		}
	*/
	//4
		 System.out.print("Digite o número de pares a serem lidos: ");
	        int quantidadePares = sc.nextInt();
	        
	        for (int i = 0; i < quantidadePares; i++) {
	            System.out.println("Digite o par de números #" + (i+1) + ":");
	            System.out.print("Número 1: ");
	            int numero1 = sc.nextInt();
	            
	            System.out.print("Número 2: ");
	            int numero2 = sc.nextInt();
	            
	            if (numero2 != 0) {
	                int divisao = numero1 / numero2;
	                System.out.println("Resultado da divisão: " + divisao);
	            } else {
	                System.out.println("Divisão impossível! Denominador é igual a zero.");
	            }
	        }
		
	//5
	
	//6	
	
	//7
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}

/*		EXERCÍCIOS
1. Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
*
2. Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
*
3. Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
*
4. Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
*
5. Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
*
6. Ler um número inteiro N e calcular todos os seus divisores.
*
7. Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.
*/