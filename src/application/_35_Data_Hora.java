package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class _35_Data_Hora {
//	JAVADOC DO DATETIME FORMATTER
//	https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatterBuilder.html
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now(); // vai gerar a data-hora no horário de Londres.
		
		LocalDate d04 = LocalDate.parse("2023-05-11"); // '.parse()' server para formatar no formato ISO-8601.
		LocalDateTime d05 = LocalDateTime.parse("2023-05-11T14:35:40");
		Instant d06 = Instant.parse("2023-05-11T14:35:40Z");
		Instant d07 = Instant.parse("2023-05-11T14:35:40-03:00");
		
		LocalDate d08 = LocalDate.parse("11/05/2023",formato1); // instanciando com um formato customizado. 
		LocalDateTime d09 = LocalDateTime.parse("11/05/2023 14:52", formato2); // o expressão pode ser colocada na mesma linha ao invés da variável 'formato2'.
		LocalDate d10 = LocalDate.of(2023, 05, 11);
		LocalDateTime d11 = LocalDateTime.of(2023, 05, 11, 15, 9);
		
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*			INSTANCIANDO DATA-HORA (JAVA 8+)
*	°Data-Hora local
*		- LocalDate
*		- LocalDateTime
*	°Data-Hora global
*		- Instant
*	°Duração
*		- Duration
*	°Outros
*		- Zoneld
* 		- ChronoUnit
* 
*	°Data - [hora] local:
*		- Padrão ISO 8601:
*			. 2022-07-21T14:52:09.0473
*			. Ano - Mes - Dia [T]ime Hora : Minutos : Segundos.Fração de Segundos.
*		- Ano-Mês-Dia-[Hora] sem fuso horário.
*		- [Hora] opcional.
*		- Quando o momento exato não interessa a pessoas de outro fuso horário. Uso comum: sistemas de região única, Excel.
*			.Data de nascimento: "15/06/2001"
*
*	° Data - Hora Global:
*		- Padrão ISO 8601:
*			. 2022-07-21T14:52:09.254935Z
*			. Ano - Mes - Dia T(time) Hora : Minutos : Segundos.Fração de Segundos Zulu Time(mesmo hora de UTC).
*			. 2022-07-03T14:52:09-03:00
*			. Ano - Mes - Dia T(time) Hora : Minutos : Segundos -(menos) Fuso horário.
*		- Ano-Mês-Dia-Hora com fuso horário.
*		- Quando o momento exato interessa a pessoas de outro fuso horário. Uso comum: sistemas multi-região, web.
*			.Quando será o sorteio? "21/08/2022 às 20h(horário de São Paulo)"
*			.Quando o comentário foi postado? "há 17 minutos"
*			.Quando foi realizada a venda? "13/08/2022 às 15:32 (horário de São Paulo)"
*			.Início e fim do evento? "21/07/2022 às 14h até 16h (horário de São Paulo)"
*
*	° Duração:
*		- tempo decorrido entre duas data-horas.
*
*	° Timezone ( Fuso horário )
*		- GMT - Greenwich Mean Time
*			. Horário de Londres.
*			. Horário padrão UTC - Coordinated Universal Time.
*			. Também chamado de "Z" time, ou Zulu time.
*		- Outros fusos horários são relativos ao GMT/UTC:
*			. São Paulo: GMT-3.
*			. Manaus: GMT-4.
*			. Portugal: GMT+1.
*		- Muitas linguagens/tecnologias usam nomes para as timezones:
*			. "US/Pacific".
*			. "America/Sao_Paulo"
*			. etc.
*
*	° Instanciação:
*		- (agora) -> Data-Hora.
*		- Texto ISO 8601 -> Data-Hora.
*		- Texto formatado customizado -> Data-Hora
*		- Dia,Mês, Ano [Horário] -> Data-Hora local.
*
*	° Formatação
*		- Data-Hora -> Texto ISO 8601.
*		- Data-Hora -> Texto formatado customizado.
*
*	° Obter dados de uma Data-Hora local
*		- Data-Hora local -> Dia, Mês, Ano, Horário.
*
*	° Converter Data-Hora global para local
*		- Data-Hora global, timezone(sistema local) -> Data-Hora local.
*
*	° Cálculos com Data-Hora
*		- Data-Hora +/- tempo -> Data-Hora.
*		- Data-Hora 1, Data-Hora 2 -> Duração.
*/