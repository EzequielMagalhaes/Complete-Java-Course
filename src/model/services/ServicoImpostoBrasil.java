//	USADO NA CLASSE _61_Interfaces //
package model.services;

public class ServicoImpostoBrasil implements ServicoImposto{
	public double imposto(double quantia) {
		if(quantia <= 100.0) {
			return quantia * 0.2;
		}else {
			return quantia * 0.15;
		}
	}
}