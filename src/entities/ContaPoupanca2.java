//	USADO NA CLASSE _47_ClassesAbstratas //
package entities;

public /*final*/ class ContaPoupanca2 extends Conta2{
	private Double taxaJuro;
	
	public ContaPoupanca2() {
		super();
	}

	public ContaPoupanca2(Integer numero, String titular, Double saldo, Double taxaJuro) {
		super(numero, titular, saldo);
		this.taxaJuro = taxaJuro;
	}

	public Double getTaxaJuro() {
		return taxaJuro;
	}

	public void setTaxaJuro(Double taxaJuro) {
		this.taxaJuro = taxaJuro;
	}
	
	public void atualizarSaldo() {
		saldo += saldo * taxaJuro;
	}
	
// Isso é uma sobreposição do método de saque na classe 'Conta'.
	@Override
	public /*final*/ void saqueSaldo(double quantia) {
		saldo -= quantia;
	}
}