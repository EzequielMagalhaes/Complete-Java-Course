package utils;

import java.util.function.Consumer;
import entities.Produto7;

public class AtualizacaoPrecoConsumer implements Consumer<Produto7> {

	
	
	@Override
	public void accept(Produto7 p) {
		p.setPreco(p.getPreco() * 1.1);
	}
}