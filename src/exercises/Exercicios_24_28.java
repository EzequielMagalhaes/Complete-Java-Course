package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios_24_28 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*EXERCÍCIO
1. Em um banco, para ser cadastrar uma conta bancária, é necessário informar o número da conta, o nome do titular da conta e o valor de depósito inicial
que o titular depositou ao abrir a conta. Este valor de depósito inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar
no momento de abrir sua conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.

IMPORTANTE: uma vez que uma conta bancária foi aberta, o número 
*/