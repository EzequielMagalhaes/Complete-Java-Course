//	USADO NA CLASSE _61_Interfaces //
package model.entities;

import java.time.LocalDateTime;

public class AluguelCarro {
	private LocalDateTime inicio;
	private LocalDateTime fim;
	
	private Veiculo veiculo;
	private Fatura fatura;// a fatura não é instanciada no momento do aluguel, por isso o valor da variável é null.
	
	public AluguelCarro() {
	}

	public AluguelCarro(LocalDateTime inicio, LocalDateTime fim, Veiculo veiculo /*, Fatura fatura*/) {
		this.inicio = inicio;
		this.fim = fim;
		this.veiculo = veiculo;
		//this.fatura = fatura;
	}

	public LocalDateTime getInicio() {
		return inicio;
	}

	public void setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
	}

	public LocalDateTime getFim() {
		return fim;
	}

	public void setFim(LocalDateTime fim) {
		this.fim = fim;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}
	
}