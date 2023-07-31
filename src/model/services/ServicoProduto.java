package model.services;

import java.util.List;
import java.util.function.Predicate;
import entities.Produto7;

public class ServicoProduto {
	public double somaFiltrada(List<Produto7> lista, Predicate<Produto7> criterio) { //uma função, recebendo outra função lambda como argumento.
		double soma = 0.0;
		
		for (Produto7 p : lista) {
			if(criterio.test(p)) {
				soma += p.getPreco();
			}
		}
		return soma;
	}
}