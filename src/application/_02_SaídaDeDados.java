package application;

import java.util.Locale;

public class _02_SaídaDeDados {
	public static void main(String[] args) {
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.00;
		System.out.println(x);
		System.out.printf("%.2f%n",x); //duas casas decimais e pula linha;
		System.out.printf("%.4f%n",x); //quatro casas decimais e pula linha;
		
		Locale.setDefault(Locale.US); // para considerar o separador de decimais como ponto, ao invés de vírgula;
		System.out.printf("%.4f%n",x);
		
		System.out.println("RESULTADO = " + x + " metros"); // concatenação;
		System.out.printf("RESULTADO = %.2f metros%n", x); //%.2f% vai ser subtituído por x;
		
		System.out.printf("%s tem %d anos e ganha R$:%.2f reais%n",nome, idade,renda);
		
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
	}
}

/* %s - texto;
 * %d - inteiro;
 * %f - ponto flutuante;
 * %n - quebra de linha;
 */