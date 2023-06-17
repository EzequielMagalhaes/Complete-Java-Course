package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import model.entities.Reserva3;
import model.exceptions.DomainException;

public class _54_ExcecoesPersonalizadas_Pt3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// 3° MÉTODO - BOA.
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println("Número do quarto: ");
			int numero = sc.nextInt();
			System.out.println("Data de check-in (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.println("Data de check-out (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
		
			Reserva3 reserva = new Reserva3(numero, checkIn, checkOut);
			System.out.println("Reserva: " + reserva);
			System.out.println();
			System.out.println("Atualize as datas da reserva: ");
			System.out.println("Data de check-in (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.println("Data de check-out (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			reserva.atualizarDatas(checkIn, checkOut);
			System.out.println("Reserva: " + reserva);
		}
		catch(ParseException e) {
			System.out.println("Formato de data inválido!");
		}
		catch(DomainException e) {
			System.out.println("Erro na reserva! " + e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Erro inesperado.");
		}
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