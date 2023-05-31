package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class _36_ConvertendoData_HoraParaTexto {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		LocalDate d01 = LocalDate.parse("2023-05-12"); // '.parse()' server para formatar no formato ISO-8601.
		LocalDateTime d02 = LocalDateTime.parse("2023-05-12T14:35:40");
		Instant d03 = Instant.parse("2023-05-12T14:35:40Z");
		
		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter formato3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); //considera o fuso horário do sistema do usuário.
		DateTimeFormatter formato4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter formato5 = DateTimeFormatter.ISO_INSTANT; // como não foi especificado nenhum fuso horário ele usa por padrão o UTC.
				
		//IMPRIMINDO DE MANEIRA CUSTOMIZADA.
		System.out.println("d01 = " + d01.format(formato1));
		System.out.println("d01 = " + formato1.format(d01)); // mesmo resultado, só inverti a ordem do objeto 'formato1'.
		System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); // não precisa instanciar objeto, da pra colocar a operação toda.
		
		System.out.println("d02 = " + d02.format(formato1));
		System.out.println("d02 = " + d02.format(formato2));
		
		// Quando for Instant tem que formatar o pattern especificando o fuso horário.
		System.out.println("d03 = " + formato3.format(d03)); // Instant não tem o método '.format()', por isso faz a chamada do objeto 'formato3' passando o 'd03' como parâmetro.
		
		// Testando formatações prontas do JavaDoc
		System.out.println("d02 = " + d02.format(formato4));
		System.out.println("d03 = " + formato5.format(d03));
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}