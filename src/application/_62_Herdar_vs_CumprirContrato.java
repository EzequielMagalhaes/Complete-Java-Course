package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Circulo;
import entities.Circulo2;
import entities.Forma;
import entities.FormaAbstrata;
import entities.Retangulo;
import entities.Retangulo2;
import entities.enums.Cor;

public class _62_Herdar_vs_CumprirContrato {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("PRIMEIRO MÉTODO (COM CLASSE ABSTRATA, SEM INTERFACE)");
		Forma f1 = new Circulo(Cor.PRETO, 2.0);
		Forma f2 = new Retangulo(Cor.AZUL, 3.0, 4.0);
		System.out.println("Cor do círculo: " + f1.getCor());
		System.out.println("Area do círculo: " + String.format("%.3f", f1.area()));
		System.out.println("Cor do retângulo: " + f2.getCor());
		System.out.println("Area do retângulo: " + String.format("%.3f", f2.area()));
		System.out.println("===================================================================");
		
		System.out.println("SEGUNDO MÉTODO (COM INTERFACE E COM CLASSE ABSTRATA)");
		FormaAbstrata fa1 = new Circulo2(Cor.PRETO, 2.0);
		FormaAbstrata fa2 = new Retangulo2(Cor.AZUL, 3.0, 4.0);
		System.out.println("Cor do círculo: " + fa1.getCor());
		System.out.println("Area do círculo: " + String.format("%.3f", fa1.area()));
		System.out.println("Cor do retângulo: " + fa2.getCor());
		System.out.println("Area do retângulo: " + String.format("%.3f", fa2.area()));
		
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*

*/