package exercises;

import java.util.Locale;
import java.util.Scanner;
public class Exercicios_6 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	/*1.
		System.out.printf("EXERCÍCIO 1%n");
		System.out.println("Digite o número inteiro:");
		int num1 = sc.nextInt();
		if(num1 > 0){
			System.out.println("O número é positivo!");
		}else if(num1 == 0){
			System.out.println("O número é zero!");
		}else{
			System.out.println("O número é negativo!");
		}
		System.out.println("==========================================");
	*/
	/*2.
		System.out.printf("EXERCÍCIO 2%n");
		System.out.println("Digite o número inteiro:");
		int num2 = sc.nextInt();
		if(num2 % 2 == 0){
			System.out.println("O número é par!");
		}else{
			System.out.println("O número é ímpar!");
		}
		System.out.println("==========================================");
	*/
	/*3.
		System.out.printf("EXERCÍCIO 3%n");
		System.out.println("Digite o primeiro número inteiro:");
		int A = sc.nextInt();
		System.out.println("Digite o segundo número inteiro:");
		int B = sc.nextInt();
		if(A % B == 0){
			System.out.println("São múltiplos!");
		}else if(B % A == 0){
			System.out.println("São múltiplos!");
		}else{
			System.out.println("Não são múltiplos!");
		}
		System.out.println("==========================================");
	*/
	/*4.
		System.out.printf("EXERCÍCIO 4%n");
		System.out.println("Digite a hora inicial:");
		int hrInicial = sc.nextInt();
		System.out.println("Digite a hora final:");
		int hrFinal = sc.nextInt();
		int duracao;
		if(hrInicial < hrFinal){
			duracao = hrInicial - hrFinal;
		}else{
			duracao = 24 - hrInicial + hrFinal;
		}
		System.out.printf("O jogo durou %d hora(s)%n", duracao);
		System.out.println("==========================================");
	*/
	/*5.
		System.out.printf("EXERCÍCIO 5%n");
		System.out.println("TABELA DE LANCHES");
		System.out.println("CÓDIGO - ESPECIFICAÇÃO - PREÇO");
		System.out.println("1      Cachorro quente   R$: 4.00");
		System.out.println("2      X-Salada		 R$: 4.50");
		System.out.println("3      X-Bacon		 R$: 5.00");
		System.out.println("4      Torrada Simples   R$: 2.00");
		System.out.println("5      Refrigerante   	 R$: 1.50");
		System.out.println("Insira o código do lanche que você deseja:");
		int A = sc.nextInt();
		if(A > 5){
			System.out.println("Favor inserir um código de lanche válido!");
			System.out.printf("EXERCÍCIO 5%n");
			System.out.println("TABELA DE LANCHES");
			System.out.println("CÓDIGO - ESPECIFICAÇÃO - PREÇO");
			System.out.println("1      Cachorro quente   R$: 4.00");
			System.out.println("2      X-Salada		 R$: 4.50");
			System.out.println("3      X-Bacon		 R$: 5.00");
			System.out.println("4      Torrada Simples   R$: 2.00");
			System.out.println("5      Refrigerante   	 R$: 1.50");
			System.out.println("Insira o código do lanche que você deseja:");
			A = sc.nextInt();
			System.out.println("Insira a quantidade desse pedido:");
			int B = sc.nextInt();
			int valorTotal = A * B;
			System.out.printf("O valor total do lanche vai ser: R$: %d reais%n",valorTotal);
		}else{
			System.out.println("Insira a quantidade desse pedido:");
			int B = sc.nextInt();
			int valorTotal = A * B;
			System.out.printf("O valor total do lanche vai ser: R$: %d reais%n",valorTotal);
		}
		System.out.println("==========================================");
	*/
	/*6.
		System.out.printf("EXERCÍCIO 6%n");
		System.out.println("Insira um valor:");
		int A = sc.nextInt();
		if(A > 0 && A < 25){
			System.out.printf("O número %d está entre [0-25]!%n", A);
		}else if(A >= 25 && A < 50){
			System.out.printf("O número %d está entre [25-50]!%n", A);
		}else if(A >= 50 && A < 75){
			System.out.printf("O número %d está entre [50-75]!%n", A);
		}else if(A >= 75 && A <= 100){
			System.out.printf("O número % está entre [75-100]!%n", A);
		}else{
			System.out.println("Fora do intervalo!");
		}
		System.out.println("==========================================");
	*/
	/*7.
		System.out.printf("EXERCÍCIO 7%n");
		System.out.println("Determine um valor para X: ");
		double X = sc.nextDouble();
		System.out.println("Determine um valor para Y: ");
		double Y = sc.nextDouble();
		if(X == 0 && Y == 0){
			System.out.println("Ponto de origem [0] [0]");
		}else if(X == Y){
			System.out.println("Os eixos tem valor igual!");
		}else if(X > Y){
			System.out.println("O eixo X é maior!");
		}else{
			System.out.println("O eixo Y é maior!");
		}
		System.out.println("==========================================");
	*/
	//8.	
		System.out.printf("EXERCÍCIO 8%n");
		
		System.out.println("==========================================");
		
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*EXERCÍCIOS
1. Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
*
2. Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
*
3. Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.
*
4. Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
*
5. Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
*
6. Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
*
7. Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.
*
8. Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
duas casas decimais.
*/