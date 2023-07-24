//	USADO NA CLASSE _73_Set_Testando_Igualdade //
package entities;

import java.util.Objects;

public class Produto5 {
	private String nome;
	private Double preco;
	
	public Produto5() {
	}

	public Produto5(String nome, Double preco) {
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
		Produto5 other = (Produto5) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(preco, other.preco);
	}
}