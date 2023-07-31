package utils;

import java.util.function.Function;

import entities.Produto7;

public class UpperCaseNomeFunction implements Function<Produto7, String>{

	@Override
	public String apply(Produto7 p) {
		return p.getNome().toUpperCase();
	}

}