import java.util.Locale;
import java.util.Scanner;
public class Exercicios01 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	// 1.
		int a;
		System.out.println("Determine o valor de 'a':");
		a = sc.nextInt();
		int b;
		System.out.println("Determine o valor de 'a':");
		b = sc.nextInt();
		int soma = a + b;
		System.out.println("O valor da soma = " + soma);
		
	// 2.
		double pi = 3.14159;
		double r;
		System.out.println("Determine o tamanho do raio:");
		r = sc.nextDouble();
		double area = pi * Math.pow(r, 2.0);
		System.out.println("O valor da área = " + area);
		
	// 3.
		
		
		
		
		
		
		
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