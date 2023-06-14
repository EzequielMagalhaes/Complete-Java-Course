package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Conta2;
import entities.ContaEmpresarial2;
import entities.ContaPoupanca2;


public class _47_ClassesAbstratas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		Conta2 conta1 = new Conta2(1001, "Alex", 1000.0); //não pode instanciar pois a classe é abstrata
//		Conta2 conta2 = new ContaPoupanca2(1002, "Maria", 1000.0, 0.01);
//		Conta2 conta3 = new ContaEmpresarial2(1003, "Bob", 1000.0, 0.01);
		
		List<Conta2> lista = new ArrayList<>();
		lista.add(new ContaPoupanca2(1001, "Maria", 500.0, 0.01));
		lista.add(new ContaEmpresarial2(1002, "Bob", 1000.0, 400.0));
		lista.add(new ContaPoupanca2(1003, "Anna", 300.0, 0.01));
		lista.add(new ContaEmpresarial2(1004, "Alex", 500.0, 500.0));
		
		//MOSTAR SALDO TOTAL DAS CONTAS//
		double soma = 0.0;
		for(Conta2 conta : lista) {
			soma += conta.getSaldo();
		}
		System.out.printf("Saldo total: %.2f%n",soma);
		
		//SOMAR +10 EM CADA CONTA E MOSTRAR SALDO ATUALIZADO//
		for(Conta2 conta : lista) {
			conta.depositoSaldo(10);
		}
		for(Conta2 conta : lista) {
			System.out.printf("Saldo atualizado da conta %d: %.2f%n", conta.getNumero(),conta.getSaldo());
		}
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*			CLASSES ABSTRATAS
	° São classes que não podem ser instanciadas.
	° É uma forma de garantir herança total: somente subclasses não abstratas podem ser instanciadas, mas nunca a superclasse abstrata.
*/