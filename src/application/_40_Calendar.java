package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class _40_Calendar {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2023-05-22T15:59:40Z"));
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4); //acrescenta à data do calendário, 4 horas.
		int minutos = cal.get(Calendar.MINUTE);
		int mes = 1 + cal.get(Calendar.MONTH); //funciona como um array, ou seja, janeiro é o mes "zero".
		d = cal.getTime();
				
		System.out.println("Minutos: "+ minutos);
		System.out.println("Mes: "+ mes);
		System.out.println(sdf.format(d));
		
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}