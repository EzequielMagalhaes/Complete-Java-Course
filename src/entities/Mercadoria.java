//	USADO NA CLASSE _30_Vetores_Pt2 //
package entities;

public class Mercadoria {
	private String nome;
	private double preco;
	
	public Mercadoria(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
}