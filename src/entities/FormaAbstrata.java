//USADO NA CLASSE _62_Herdar_vs_CumprirContrato//
package entities;
import entities.enums.Cor;

public abstract class FormaAbstrata implements Forma2{
	private Cor cor;

	public FormaAbstrata() {
		super();
	}
	
	public FormaAbstrata(Cor cor) {
		this.cor = cor;
	}
	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
}