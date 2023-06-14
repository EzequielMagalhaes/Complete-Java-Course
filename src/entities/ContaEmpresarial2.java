//USADO NA CLASSE _47_ClassesAbstratas //
package entities;
//classe 'ContaEmpresarial' vai ter todos os dados e comportamentos da 'Conta'.
public class ContaEmpresarial2 extends Conta2{
private Double limiteEmprestimo;

public ContaEmpresarial2() {
	super();
}

public ContaEmpresarial2(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
	super(numero, titular, saldo);
	this.limiteEmprestimo = limiteEmprestimo;
}

public Double getlimiteEmprestimo() {
	return limiteEmprestimo;
}

public void setlimiteEmprestimo(Double limiteEmprestimo) {
	this.limiteEmprestimo = limiteEmprestimo;
}

public void Emprestimo(double quantia) {
	if(quantia <= limiteEmprestimo) {			
		saldo += quantia - 10.0;
	}
}

@Override
public void saqueSaldo(double quantia) {
	super.saqueSaldo(quantia);
	saldo -= 2.0;
}
}