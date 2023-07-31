/*USADO NAS CLASSES
_77_Comparator
_78_Predicate
_79_Consumer
_80_Function
_81_FuncoesRecebendoFuncoes*/
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
					// PREDICATE //
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
///////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////
	
					// CONSUMER //
/*2° MÉTODO //
	public static void AtualizacaoPrecoStatic(Produto7 p) {
		p.setPreco(p.getPreco() * 1.1);
	}
*/
/* 3° MÉTODO //
	public void AtualizacaoPrecoNaoStatic() {
		preco = preco * 1.1;
	}
*/
	
///////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////
	
					// FUNCTION //
/*2° MÉTODO //
	public static String UpperCaseNomeStatic(Produto7 p) {
		return p.getNome().toUpperCase();
	}
*/
/* 3° MÉTODO //
	public String UpperCaseNomeNaoStatic() {
		return nome.toUpperCase();
	}
*/

	@Override
	public String toString() {
		return nome + ", " + String.format("%.2f", preco);
	}
}