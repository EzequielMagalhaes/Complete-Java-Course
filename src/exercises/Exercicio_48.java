package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_48 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*EXERCICIO - TEM CORREÇÃO!
1. Fazer um programa para ler os dados de 'N' contribuintes ('N' fornecido pelo usuário), os quais podem ser pessoa física ou pessoa jurídica,
depois mostrar o valor do imposto pago por cada um, bem como o total de imposto arrecadado.

Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica são nome, renda anual e número de funcionários.
As regras para cálculo de impostos são as seguintes:

° PESSOA FÍSICA: pessoas cujas renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com renda de 20000.00 em diante pagam 25% de imposto. 
Se a pessoa teve gastos com saúde, 50% destes gastos são abatidos no imposto.
	EXEMPLO: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto fica : (50000 * 25%) - (2000 * 50%) = 11500.00
° PESSOA JURÍDICA: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10 funcionários, ela paga 14% de imposto.
	EXEMPLO: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica: 400000 * 14% = 56000.00
*/