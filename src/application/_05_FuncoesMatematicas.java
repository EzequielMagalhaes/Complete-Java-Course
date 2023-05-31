package application;

import java.util.Scanner;

public class _05_FuncoesMatematicas {
	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de: " + (-y) + " = " + A);
		System.out.println("Valor absoluto de: " + z + " = " + B);
		
					// BHASKARA //
		double delta;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Determine o valor de 'a':");
		a=sc.nextDouble();
		System.out.println("Determine o valor de 'b':");
		b=sc.nextDouble();
		System.out.println("Determine o valor de 'c':");
		c=sc.nextDouble();
		
		delta = Math.pow(b, 2.0) - (4*a*c);
		
		if (delta < 0) {
			  System.out.println("A equação não tem raízes reais.");
			} else {
			  x1 = (-b + Math.sqrt(delta)) / (2.0*a);
			  x2 = (-b - Math.sqrt(delta)) / (2.0*a);
			  System.out.println("O valor de x1 = " + x1);
			  System.out.println("O valor de x2 = " + x2);
			}
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}

/*
 *	A = Math.sqrt(x) -> Variável 'A' recebe a raiz quadrada de 'x';
 *	A = Math.pow(x, y) -> Variável 'A' recebe o resultado de 'x' elevado a 'y';
 *  A = Math.abs(x) -> Variável 'A' recebe o valor absoluto de 'x'; // módulo de |x|
 */