//USADO NA CLASSE _77_Comparator e _78_Predicate //
package entities;

public class Produto7 {
	private String nome;
	private Double preco;

	public Produto7(String nome, Double preco) {
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

/* 2° MÉTODO //
	public static boolean produtoPredicateStatic(Produto7 p) {
		return p.getPreco() >= 100.0;
	}
*/
/* 3° MÉTODO //
	public boolean ProdutoPredicateNaoStatic() {
		return preco >= 100.0;
	}
*/
	@Override
	public String toString() {
		return nome + ", " + String.format("%.2f", preco);
	}
}