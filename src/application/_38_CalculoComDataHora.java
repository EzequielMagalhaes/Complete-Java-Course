package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class _38_CalculoComDataHora {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		LocalDate d01 = LocalDate.parse("2023-05-18");
		LocalDateTime d02 = LocalDateTime.parse("2023-05-18T14:45:40");
		Instant d03 = Instant.parse("2023-05-18T14:45:40Z");
		
		LocalDate diaPassadoLocalDate = d01.minusDays(5);
		LocalDate semanaProximoLocalDate = d01.plusWeeks(3);
		LocalDate mesProximoLocalDate = d01.plusMonths(2);
		LocalDate anoPassadoLocalDate = d01.minusYears(5);
		System.out.println("===================================================================");
		System.out.println("Data atual = " + d01);
		System.out.println();
		System.out.println("semanaPassadoLocalDate = " + diaPassadoLocalDate);
		System.out.println("semanaProximoLocalDate = " + semanaProximoLocalDate);
		System.out.println("mesProximoLocalDate = " + mesProximoLocalDate);
		System.out.println("anoPassadoLocalDate = " + anoPassadoLocalDate);
		
		LocalDateTime diaPassadoLocalDateTime = d02.minusDays(7);
		LocalDateTime semanaProximoLocalDateTime = d02.plusWeeks(3);
		LocalDateTime mesProximoLocalDateTime = d02.plusMonths(2);
		LocalDateTime anoPassadoLocalDateTime = d02.minusYears(5);
		System.out.println("===================================================================");
		System.out.println("Data atual = " + d02);
		System.out.println();
		System.out.println("diaPassadoLocalDateTime = " + diaPassadoLocalDateTime);
		System.out.println("semanaProximoLocalDateTime = " + semanaProximoLocalDateTime);
		System.out.println("mesProximoLocalDateTime = " + mesProximoLocalDateTime);
		System.out.println("anoPassadoLocalDateTime = " + anoPassadoLocalDateTime);
		
		Instant diaPassadoInstant = d03.minus(7, ChronoUnit.DAYS);
		System.out.println("===================================================================");
		System.out.println("Data atual = " + d03);
		System.out.println();
		System.out.println("diaPassadoInstant = " + diaPassadoInstant);
		System.out.println("===================================================================");
		//CALCULAR DURAÇÃO.
		//'Duration' não aceita o 'LocalDate', precisa converter para 'LocalDateTime'.
		Duration t1 = Duration.between(diaPassadoLocalDate.atStartOfDay(), d01.atStartOfDay());// atTime(HH, mm) horas / minutos -> não é uma boa prática.
		Duration t2 = Duration.between(diaPassadoLocalDateTime, d02);
		Duration t3 = Duration.between(diaPassadoInstant, d03);
		Duration t4 = Duration.between(d03, diaPassadoInstant); // pode inverter a ordem também, mas fica com número negativo.
		System.out.println("O tempo de duração entre as duas datas é de: " + t1.toDays() + " dias.");
		System.out.println("O tempo de duração entre as duas datas é de: " + t2.toDays() + " dias.");
		System.out.println("O tempo de duração entre as duas datas é de: " + t3.toDays() + " dias.");
		System.out.println("O tempo de duração entre as duas datas é de: " + t4.toDays() + " dias.");
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*
Para alterar a data-hora, caso precise de uma data diferente por exemplo, não se altera o dado no objeto, é necessário criar um novo objeto
com essa data-hora atualizada.
*/