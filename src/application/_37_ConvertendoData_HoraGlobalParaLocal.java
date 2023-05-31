package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Locale;
import java.util.Scanner;

public class _37_ConvertendoData_HoraGlobalParaLocal {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*for(String s : ZoneId.getAvailableZoneIds()) {// ZoneIds disponíveis para usar se precisar para determinar fusos horários.	
			System.out.println(s);
		}*/
		LocalDate d01 = LocalDate.parse("2023-05-12");
		LocalDateTime d02 = LocalDateTime.parse("2023-05-12T14:35:40");
		Instant d03 = Instant.parse("2023-05-12T14:35:40Z");
		
		// Convertendo a data-hora global para local.
		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		// Testando operações individuais.
		System.out.println("d01 DIA = " + d01.getDayOfMonth());
		System.out.println("d01 MES = " + d01.getMonthValue());
		System.out.println("d01 ANO = " + d01.getYear());
		System.out.println("d02 HORAS = " + d02.getHour());
		System.out.println("d02 MINUTOS = " + d02.getMinute());
		System.out.println("d02 SEGUNDOS = " + d02.getSecond());
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}