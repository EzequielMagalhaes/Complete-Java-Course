package application;

import java.util.Locale;
import java.util.Scanner;

public class _53_ExcecoesPersonalizadas_Pt2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// 2° MÉTODO - RUIM.
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*PROBLEMA EXEMPLO
1. Fazer um programa para ler os dados de uma reserva de hotel(número do quarto, data de entrada e data de saída) e mostrar os dados da reserva,
inclusive sua duração em dias. Em seguida, ler novas datas de entrada e saída, atualizar a reserva e mostrar novamente a reserva com os dados atualizados.
O programa nã
o deve aceitar dados inválidos para a reserva, conforme as seguintes regras:
	- Alterações de reserva só podem ocorrer para datas futuras.
	- A data de saída deve ser maior que a data de entrada.
*/