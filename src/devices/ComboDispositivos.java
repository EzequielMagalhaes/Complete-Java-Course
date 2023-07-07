//	USADO NA CLASSE _63_HerancaMultipla //
package devices;

public class ComboDispositivos extends Dispositivo implements Scanner, Impressora {

	public ComboDispositivos(String numeroSerie) {
		super(numeroSerie);
	}

	@Override
	public void imprimir(String doc) {
		System.out.println("Combo de dispositivos imprimindo: " + doc);
	}

	@Override
	public String scan() {
		return "Resultado do combo de dispositivos.";
	}

	@Override
	public void processarDoc(String doc) {
		System.out.println("Combo de dispositivos processando: " + doc);
	}
}