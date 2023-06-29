package application;

import java.util.Locale;
import java.util.Scanner;

public class _62_Interfaces_Pt2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// 1° MÉTODO - RUIM (COM INTERFACE).
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*EXERCÍCIO EXEMPLO
1. UMa locadora brasileira de carros cobra um valor por hora para locações de até 12 horas. Porém, se a duração da locação ultrapassar 12 horas,
a locação será cobrada com base em um valor diário. Além do valor da locação, é acrescido no preço o valor do imposto conforme regras do país que,
no caso do Brasil, é 20% para valor até 100.00, ou 15% para valores acima de 100.00. Fazer um programa que lê os dados da locação (modelo do carro,
intante inicial e final da locação),bem como o valor por hora e o valor diário de locação. O programa deve então gerar a nota de pagamento (contendo
valor da locação, valor do imposto e valor total do pagamento) e informar os dados na tela.
*/