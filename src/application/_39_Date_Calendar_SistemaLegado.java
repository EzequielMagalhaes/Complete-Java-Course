package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

public class _39_Date_Calendar_SistemaLegado {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date(); //cria data com horário atual.
		Date x2 = new Date(System.currentTimeMillis()); //usa a hora do sistema, converte pra milissegundos e cria a data.
		Date x3 = new Date(0L); //*O número de milissegundos desde a meia noite do dia 1 de janeiro de 1970 GMT(UTC).
		Date x4 = new Date(1000L * 60L * 60L * 5L); // 1 segundo tem 1000 milissegundos * 60L(pra dar um minuto) * 60L(pra dar uma hora) * 5L(para dar a hora desejada, no caso 5h da manhã).
		Date y1 = sdf1.parse("22/05/2023");
		Date y2 = sdf2.parse("22/05/2023 15:37:30");
		Date y3 = Date.from(Instant.parse("2023-05-22T15:37:30Z")); // formatando no formato ISO 8601
		
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("y3: " + y3);
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);		
		System.out.println("x4: " + x4);
		System.out.println("===================================================================");
		System.out.println("y1: " + sdf1.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));		
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("===================================================================");
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));		
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*					DATE E CALENDAR
	° Modelo antigo de fazer operações Data e Hora.
	° Para sistemas legado.
	° Versões do Java anteriores à versão 8.
	
	° Date
		- JAVA DOC -> https://docs.oracle.com/javase/8/docs/api/java/util/Date.html.
		- Representa um INSTANTE.
		- Pacote java.util.
		- Um objeto 'Date' internamente armazena:
			. O número de milissegundos desde a meia noite do dia 1 de janeiro de 1970 GMT(UTC)*.
			. GMT: Greenwich Mean Time(time zone).
			. UTC: Coordinated Universal Time(time standard).
			
	° SimpleDateFormat
		- JAVA DOC -> https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html.
		- Define formatos para conversão entre 'Date' e 'String'.
		- dd/MM/yyyy -> 22/05/2023
		- dd/MM/yyyy HH:mm:ss -> 22/05/2023 15:30:00
				PADRÃO ISO 8601 e classe Instant
		- Formato: yyyy-MM-ddTHH:mm:ssZ
			ex: "2018-06-25T15:42:07Z"
		- Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z");
*/