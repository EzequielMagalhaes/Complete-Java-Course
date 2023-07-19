//	USADO NA CLASSE _66_Generics //
package services;

import java.util.ArrayList;
import java.util.List;

public class ServicoImpressao<G> {
	private List<G> lista = new ArrayList<>();
	
	public void addValor(G valor) {
		lista.add(valor);
	}
	
	public G primeiro() {
		if(lista.isEmpty()) {
			throw new IllegalStateException("Lista vazia!");
		}
		return lista.get(0);
	}
	
	public void print() {
		System.out.print("[");
		if(!lista.isEmpty()) {
			System.out.print(lista.get(0));
		}
		for(int i = 1; i < lista.size(); i++) {
			System.out.print(", " + lista.get(i));
		}
		System.out.println("]");
	}
}