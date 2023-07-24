//	USADO NA CLASSE _74_TreeSet_ComparandoElementos //
package entities;

import java.util.Objects;

public class Produto6 implements Comparable<Produto6>{
	private String nome;
	private Double preco;
	
	public Produto6() {
	}

	public Produto6(String nome, Double preco) {
		super();
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
	public int hashCode() {
		return Objects.hash(nome, preco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto6 other = (Produto6) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(preco, other.preco);
	}

	@Override
	public String toString() {
		return "Produto6 [Nome=" + nome + ", Preco=" + preco + "]";
	}

	@Override
	public int compareTo(Produto6 other) {
		return nome.toUpperCase().compareTo(other.getNome().toUpperCase()); //ordenação por ordem alfabética.
	}
	
}