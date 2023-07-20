//USADO NA CLASSE e _69_TiposCuringa_Delimitados//
package entities;

public class Circulo3 implements Forma2 {

	private double raio;

	public Circulo3() {
	}

	public Circulo3(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(raio, 2); // (valor,expoente)
	}

}