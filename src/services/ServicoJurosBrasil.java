//	USADO NA CLASSE _65_DefaultMethods //
package services;

public class ServicoJurosBrasil implements ServicoJuros{
	private Double taxaJuros;

	public ServicoJurosBrasil(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	@Override
	public double getTaxaJuros() {
		return taxaJuros;
	}
}