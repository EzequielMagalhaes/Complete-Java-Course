//	USADO NA CLASSE _45_ClassesMetodos_final //
package entities;

public class ContaPoupancaPlus extends ContaPoupanca { // da erro aqui por causa do 'final'!
	@Override
	public void saqueSaldo(double quantia) { // da erro aqui por causa do modificador 'final'!
		saldo -= quantia + 2.0;
	}
}