//	USADO NA CLASSE _63_HerancaMultipla //
package devices;

public abstract class Dispositivo {
	public String numeroSerie;
	
	public Dispositivo(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	
	public abstract void processarDoc(String doc);
}