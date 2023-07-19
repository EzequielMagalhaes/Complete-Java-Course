package application;

import java.security.InvalidParameterException;
import java.util.Locale;
import java.util.Scanner;
import services.ServicoJuros;
import services.ServicoJurosEUA;
//import services.ServicoJurosBrasil;

public class _65_DefaultMethods {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Quantia: ");
			double quantia = sc.nextDouble();
			System.out.println("Mêses: ");
			int meses = sc.nextInt();
			
			ServicoJuros sj = new ServicoJurosEUA(1.0); 
//			ServicoJurosEUA sj = new ServicoJurosEUA(1.0); //1% ao mes
//			ServicoJurosBrasil sj = new ServicoJurosBrasil(2.0); //2% ao mes
			double pagamento = sj.pagamento(quantia, meses);
			
			System.out.println("Pagamento após " + meses + " meses: ");
			System.out.println(String.format("%.2f",pagamento));
		
		}catch(InvalidParameterException e) {
			System.out.println("A quantia de meses não pode ser menor que zero!");
		}
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*				DEFAULT METHODS
	° A partir do Java 8, interfaces podem conter métodos concretos.
	° A intenção básica é prover implementação padrão para métodos, de modo a evitar:
		- 1) repetição de implementação em toda classe que implemente a interface.
		- 2) a necessidade de se criar classes abstratas para prover reuso da implementação.
	° Outra vantagem: 
		- Manter a retrocompatibilidade com sistemas existentes.
		- Permitir que "interfaces funcionais" (que devem conter apenas um método) possam prover outras operações padrão reutilizáveis.
		
	PROBLEMA EXEMPLO
		- Fazer um programa para ler uma quantia e a duração em meses de um empréstimo. Informar o valor a ser pago depois de decorrido o prazo do
		empréstimo , conforme regras de juros do Brasil. A regra de cálculo de juros do Brasil é juro composto padrão de 2% ao mês.
		
	Considerações Importantes:
		- Sim: agora as interfaces podem prover reuso.
		- Sim: agora temos uma forma de herança múltipla
			. Mas o compilador reclama se houver mais de um método com a mesma assinatura, obrigando a sobrescreve-lo.
		- Interfaces ainda são bem diferentes de classes abstratas. Interfaces não possuem recurso tais como construtores e atributos.
*/