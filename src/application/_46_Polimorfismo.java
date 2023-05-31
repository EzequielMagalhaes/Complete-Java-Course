package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Conta;
import entities.ContaPoupanca;

public class _46_Polimorfismo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta x = new Conta(1020, "Alex", 1000.0);
		Conta y = new ContaPoupanca(1023, "Maria", 1000.0, 0.01);
		
		x.saqueSaldo(50.0); // 954.0
		y.saqueSaldo(50.0); // 950.0
		
		System.out.println(x.getSaldo());
		System.out.println(y.getSaldo());
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*						POLIMORFISMO
	° Em Programação Orientada a Objetos, polimorfismo é recurso que permite que variáveis de um mesmo tipo mais genérico possam apontar para objetos
de tipos específicos diferentes, tendo assim comportamentos diferentes conforme cada tipo específico.
	° A associação do tipo específico com o tipo genérico é feita em tempo de execução(upcasting).
	° O compilador não sabe para qual tipo específico a chamada do método 'saqueSaldo()' está sendo feita(ele só sabe que são duas variáveis tipo 'Conta').
*/