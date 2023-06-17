package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reserva;

public class _52_ExcecoesPersonalizadas {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// 1° MÉTODO - MUITO RUIM.
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Número do quarto: ");
		int numero = sc.nextInt();
		System.out.println("Data de check-in (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.println("Data de check-out (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		
		if(!checkOut.after(checkIn)) {
			System.out.println("Erro na reserva! A data de 'check-out' deve ser posterior à data de 'check-in'");
		}else {
			Reserva reserva = new Reserva(numero, checkIn, checkOut);
			System.out.println("Reserva: " + reserva);
			System.out.println();
			System.out.println("Atualize as datas da reserva: ");
			System.out.println("Data de check-in (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.println("Data de check-out (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			Date agora = new Date();
			if(checkIn.before(agora)||checkOut.before(agora) ) {
				System.out.println("Erro na reserva! As datas de reserva para atualização devem ser datas futuras. ");
			}else if(!checkOut.after(checkIn)) {
				System.out.println("Erro na reserva! A data de 'check-out' deve ser posterior à data de 'check-in'");
			}else {				
				reserva.atualizarDatas(checkIn, checkOut);
				System.out.println("Reserva: " + reserva);
			}
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