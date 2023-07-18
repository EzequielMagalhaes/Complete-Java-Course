package services;

import java.security.InvalidParameterException;

public interface ServicoJuros {
	double getTaxaJuros();
	
	default double pagamento(double quantia, int meses) {
		if(meses < 1) {			
			throw new InvalidParameterException("A quantia de meses não pode ser menor que zero!");
		}
		return quantia * Math.pow(1.0 + getTaxaJuros() / 100.0, meses);
	}
}