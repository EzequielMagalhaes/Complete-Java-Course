//USADO NA CLASSE e _62_Herdar_vs_CumprirContrato//
package entities;

import entities.enums.Cor;

public class Circulo2 extends FormaAbstrata {

	private Double raio;

	public Circulo2() {
		super();
	}

	public Circulo2(Cor cor, Double raio) {
		super(cor);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(raio, 2); // (valor,expoente)
	}

}