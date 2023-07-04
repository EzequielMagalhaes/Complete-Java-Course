//	USADO NA CLASSE _61_Interfaces //
package model.services;
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
		aluguelCarro.setFatura(new Fatura(50.0,10.0));
	}
}