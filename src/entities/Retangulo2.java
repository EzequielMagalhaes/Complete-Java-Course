//USADO NA CLASSE _62_Herdar_vs_CumprirContrato//
package entities;

import entities.enums.Cor;

public class Retangulo2 extends FormaAbstrata {

	private Double largura;
	private Double altura;

	public Retangulo2() {
		super();
	}

	public Retangulo2(Cor cor, Double largura, Double altura) {
		super(cor);
		this.largura = largura;
		this.altura = altura;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return largura * altura;
	}
}