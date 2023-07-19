//	USADO NA CLASSE _67_GenericsDelimitados //
package entities;

public class Produto4 implements Comparable<Produto4>{
	private String nome;
	private Double preco;
	
	public Produto4(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return nome + ", " + String.format("%.2f", preco);
	}

	@Override
	public int compareTo(Produto4 outro) {
		return preco.compareTo(outro.getPreco());
	}
}