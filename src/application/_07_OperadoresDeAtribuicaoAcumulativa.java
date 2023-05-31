package application;

import java.util.Locale;
import java.util.Scanner;

public class _07_OperadoresDeAtribuicaoAcumulativa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Sabendo que em um plano de internet, até 100 min gastos, o usuário só paga R$: 50,00");
		System.out.println("Após os 100 minutos é cobrada uma taxa extra de R$: 2,00 por cada minuto usado. Sabendo disso...");
		System.out.println("Quantos minutos ele usou do plano?");
		int minutos = sc.nextInt();
		double conta = 50.0;
		
		if(minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		System.out.printf("Valor da conta R$: %.2f%n",conta);
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}

/*		OPERADORES DE ATRIBUIÇÃO ACUMULATIVA
 * 
 * a += b || a = a + b
 * a -= b || a = a - b
 * a *= b || a = a * b
 * a /= b || a = a / b
 * a %= b || a = a % b
 * 
*/