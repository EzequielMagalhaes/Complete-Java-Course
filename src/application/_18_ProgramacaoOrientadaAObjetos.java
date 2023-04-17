package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class _18_ProgramacaoOrientadaAObjetos{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle(); // Instanciando o objeto X
		y = new Triangle(); // Instanciando o objeto Y
		System.out.println("Determine as TRÊS medidas do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c= sc.nextDouble();
		System.out.println("Determine as TRÊS medidas do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		System.out.printf("Area do triangulo X: %.4f%n", areaX);
		System.out.printf("Area do triangulo Y: %.4f%n", areaY);
		if(areaX > areaY) {
			System.out.println("A maior área é a do: 'X'");
		}else if(areaX == areaY){
			System.out.println("A área dos triângulos é igual !");
		}else{
			System.out.println("A maior área é a do: 'Y'");
		}
		
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}