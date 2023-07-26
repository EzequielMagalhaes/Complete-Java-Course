package entities;

import java.util.Comparator;

public class MyComparator implements Comparator <Produto7>{

	@Override
	public int compare(Produto7 p1, Produto7 p2) {
		return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
	}
}
