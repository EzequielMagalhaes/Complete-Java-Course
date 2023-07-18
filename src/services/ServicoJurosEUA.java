package services;

public class ServicoJurosEUA implements ServicoJuros{
	private Double taxaJuros;

	public ServicoJurosEUA(Double taxaJuros){
		this.taxaJuros = taxaJuros;
	}
	
	@Override
	public double getTaxaJuros() {
		return taxaJuros;
	}
}