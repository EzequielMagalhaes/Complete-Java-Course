package exercises;

import java.util.Locale;
import java.util.Scanner;
public class Exercicios_1_5_SOLVED {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	// 1.
		System.out.printf("EXERCÍCIO 1%n");
		int a;
		System.out.println("Determine o valor de 'a':");
		a = sc.nextInt();
		int b;
		System.out.println("Determine o valor de 'a':");
		b = sc.nextInt();
		int soma = a + b;
		System.out.println("O valor da soma = " + soma);
		System.out.println("==========================================");
	// 2.
		System.out.printf("EXERCÍCIO 2%n");
		double pi = 3.14159;
		double raio;
		System.out.println("Determine o tamanho do raio:");
		raio = sc.nextDouble();
		double area = pi * Math.pow(raio, 2.0);
		System.out.printf("O valor da área = %.2f%n" ,area);
		System.out.println("==========================================");
	// 3.
		System.out.printf("EXERCÍCIO 3%n");
		int w;
		System.out.println("Determine o valor de 'A':");
		w = sc.nextInt();
		int x;
		System.out.println("Determine o valor de 'B':");
		x = sc.nextInt();
		int y;
		System.out.println("Determine o valor de 'C':");
		y = sc.nextInt();
		int z;
		System.out.println("Determine o valor de 'D':");
		z = sc.nextInt();
		int produto = (w * x) - (y * z);
		System.out.println("A diferença entre os produtos = " + produto);
		System.out.println("==========================================");
	// 4.
		System.out.printf("EXERCÍCIO 4%n");
		int funcionarioId;
		double hrsTrabalhadas;
		double vlrHora = 30;
		double salario;
		
		System.out.println("Qual o número de identificação do funcionário?");
		funcionarioId = sc.nextInt();
		System.out.printf("Quantas horas o funcionário '%s' trabalhou?%n", funcionarioId);
		hrsTrabalhadas = sc.nextDouble();
		salario = (hrsTrabalhadas * vlrHora);
		System.out.printf("Por hora, cada funcionário recebe: R$: %.2f%n", vlrHora);
		System.out.printf("Portanto o salário do funcionário '%s' é de R$: %.2f%n", funcionarioId, salario);
		System.out.println("==========================================");
	// 5. 
		System.out.printf("EXERCÍCIO 5%n");
		System.out.printf("Qual o código da primeira peça?%n");
		int codigoPc1;
		codigoPc1 = sc.nextInt();
		System.out.printf("Quantas unidades da peça '%d' possui no pedido?%n",codigoPc1);
		double numeroPc1;
		numeroPc1 = sc.nextDouble();
		System.out.printf("Qual o valor, em reais, de cada peça '%d'?%n",codigoPc1);
		double valorUnitarioPc1;
		valorUnitarioPc1 = sc.nextDouble();
		System.out.printf("Qual o código da segunda peça?%n");
		int codigoPc2;
		codigoPc2 = sc.nextInt();
		System.out.printf("Quantas unidades da peça '%d' possui no pedido?%n",codigoPc2);
		double numeroPc2;
		numeroPc2 = sc.nextDouble();
		System.out.printf("Qual o valor, em reais, de cada peça '%d'?%n",codigoPc2);
		double valorUnitarioPc2;
		valorUnitarioPc2 = sc.nextDouble();
		double soma1 = (numeroPc1 * valorUnitarioPc1);
		double soma2 = (numeroPc2 * valorUnitarioPc2);
		System.out.printf("O total a pagar no primeiro pedido é: %.2f reais%n", soma1);
		System.out.printf("O total a pagar no segundo pedido é: %.2f reais%n", soma2);
		System.out.println("==========================================");
	// 6.
		System.out.printf("EXERCÍCIO 6%n");
		float A;
		System.out.println("Determine o valor de 'A':");
		A = sc.nextInt();
		float B;
		System.out.println("Determine o valor de 'B':");
		B = sc.nextInt();
		float C;
		System.out.println("Determine o valor de 'C':");
		C = sc.nextInt();
		// a) triângulo -> (base * altura) / 2.0
		float triangulo =(float) ((A * C)/2.0);
		System.out.printf("a) Área do triangulo é aproximadamente: %n%.2f%n",triangulo);
		// b) círculo -> pi*raio^2
		// π = 3.14159;
		//float pi = (float)3.14159; -> nao precisa declarar pq ja existe anteriormente 
		//float raio; -> nao precisa declarar pq ja existe anteriormente
		System.out.println("Determine o valor do raio da circunferência:");
		raio = sc.nextFloat();
		float circulo = (float)(pi*Math.pow(raio, 2.0));
		System.out.printf("b) Área do círculo é aproximadamente: %n%.2f%n",circulo);
		// c) trapézio -> ((BsMaior + bsMenor) * altura) / 2.0
		float trapezio = (float)(((A + B)*C)/2.0);
		System.out.printf("c) Área do trapezio é aproximadamente: %n%.2f%n",trapezio);
		// d) quadrado -> lado^2
		float quadrado = (float)(Math.pow(B, 2.0));
		System.out.printf("d) Área do quadrado é aproximadamente: %n%.2f%n",quadrado);
		// e) retângulo -> base * altura
		float retangulo = (float)(A * B);
		System.out.printf("e) Área do retangulo é aproximadamente: %n%.2f%n",retangulo);
		System.out.println("==========================================");
		
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*EXERCÍCIOS
1. Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
*		
2. Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.
Fórmula da área: area = π . raio^2.
Considere o valor de π = 3.14159
*		
3. Fazer um programa para ler quatro valores inteiros A, B, C e D.
A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
*		
4. Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário.
A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
*		
5. Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
*		
6. Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
*/