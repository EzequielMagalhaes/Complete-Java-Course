package application;

import java.util.Locale;
import java.util.Scanner;
import utils.Calculator2;

public class _23_MembrosEstaticos_Pt2{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o raio: ");
		double raio = sc.nextDouble();
		double c = Calculator2.circunferencia(raio);
		double v = Calculator2.volume(raio);
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", Calculator2.PI);
	
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}