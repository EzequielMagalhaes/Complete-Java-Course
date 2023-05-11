package application;

import java.util.Locale;
import java.util.Scanner;

public class _35_Data_Hora {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*	°Data - [hora] local:
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
*
*/