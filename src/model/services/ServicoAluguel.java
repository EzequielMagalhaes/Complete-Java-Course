//	USADO NA CLASSE _61_Interfaces //
package model.services;
import java.time.Duration;

import model.entities.AluguelCarro;
import model.entities.Fatura;

public class ServicoAluguel {
	private Double precoPorDia;
	private Double precoPorHora;
	private ServicoImpostoBrasil servicoImposto;
	
	public ServicoAluguel(Double precoPorDia, Double precoPorHora, ServicoImpostoBrasil servicoImposto) {
		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.servicoImposto = servicoImposto;
	}
	
	public void processoFatura(AluguelCarro aluguelCarro) {
		double minutos = Duration.between(aluguelCarro.getInicio(), aluguelCarro.getFim()).toMinutes(); //duração entre o ínicio e o fim do aluguel (em minutos).
		double horas = minutos / 60.0;
		double pagamentoBasico;
		
		if(horas <= 12.0) {
			pagamentoBasico = precoPorHora * Math.ceil(horas); //Math.ceil -> arredonda os valores fracionados pra cima.
		}else {
			pagamentoBasico = precoPorDia * Math.ceil(horas / 24.0);
		}
		
		double imposto = servicoImposto.imposto(pagamentoBasico);
		
		aluguelCarro.setFatura(new Fatura(pagamentoBasico, imposto));
	}
}