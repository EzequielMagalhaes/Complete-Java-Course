//USADO NA CLASSE _78_Predicate //
package utils;

import java.util.function.Predicate;


import entities.Produto7;

public class ProdutoPredicate implements Predicate<Produto7>{
	@Override
	public boolean test(Produto7 p) {
		return p.getPreco() >= 100.0;
	}
	
}