//USADO NA CLASSE e _69_TiposCuringa_Delimitados//
package entities;

public class Retangulo3 implements Forma2 {

	private double largura;
	private double altura;

	public Retangulo3() {
	}

	public Retangulo3(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return largura * altura;
	}
}