package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.AluguelCarro;
import model.entities.Veiculo;
import model.services.ServicoAluguel;
import model.services.ServicoImpostoBrasil;

public class _61_Interfaces {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// 1° MÉTODO - RUIM (SEM INTERFACE).
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Insira os dados do aluguel:");
		System.out.println("Modelo do carro: ");
		String modeloCarro = sc.nextLine();
		System.out.println("Retirada (dd/MM/yyyy hh:mm):");
		LocalDateTime inicio = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.println("Retorno (dd/MM/yyyy hh:mm):");
		LocalDateTime fim = LocalDateTime.parse(sc.nextLine(), fmt);
		
		AluguelCarro ac = new AluguelCarro(inicio, fim, new Veiculo(modeloCarro));
		
		System.out.println("Insira o preço por hora: ");
		double precoPorHora = sc.nextDouble();
		System.out.println("Insira o preço por dia: ");
		double precoPorDia = sc.nextDouble();
		
		ServicoAluguel servicoAluguel = new ServicoAluguel(precoPorHora, precoPorDia, new ServicoImpostoBrasil());
		
		servicoAluguel.processoFatura(ac);
		
		System.out.println("-------------------------------------------------------------------");
		System.out.println("FATURA:");
		System.out.println("Pagamento básico: " + ac.getFatura().getPagamentoBasico());
		System.out.println("Imposto: " + ac.getFatura().getImposto());
		System.out.println("Pagamento total: " + ac.getFatura().getPagamentoTotal());
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*				INTERFACES
	° Interface é um tipo que define um conjunto de operações que uma classe deve implementar.
	° A interface estabelece um contrato que a classe deve cumprir.
	° Pra que interfaces?
		- Para criar sistemas com baixo acoplamento e flexíveis.

*AVISO*
	° A partir do Java 8, interfaces podem ter "defaut methods" ou "defender methods".
	° Isso possui implicações conceituais e práticas, que serão discutidas mais à frente neste capitulo.
	
EXERCÍCIO EXEMPLO
1. Uma locadora brasileira de carros cobra um valor por hora para locações de até 12 horas. Porém, se a duração da locação ultrapassar 12 horas,
a locação será cobrada com base em um valor diário. Além do valor da locação, é acrescido no preço o valor do imposto conforme regras do país que,
no caso do Brasil, é 20% para valor até 100.00, ou 15% para valores acima de 100.00. Fazer um programa que lê os dados da locação (modelo do carro,
intante inicial e final da locação),bem como o valor por hora e o valor diário de locação. O programa deve então gerar a nota de pagamento (contendo
valor da locação, valor do imposto e valor total do pagamento) e informar os dados na tela.
*/