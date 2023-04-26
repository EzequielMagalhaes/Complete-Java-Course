//	NOVA CLASSE PARA DEMONSTRAR O MÉTODO CONSTRUTOR //
package entities;

public class Produto2 {
	public String nome;
	public double preco;
	public int quantidade;
	
	public Produto2(String nome, double preco, int quantidade){
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public double totalEmEstoque(){
		return preco * quantidade;
	}
	
	public void addProdutos(int quantidade){ // para diferenciar o atributo da classe (l.6), com o parâmetro do método (l.13).
		this.quantidade += quantidade; 		 // usa o 'this' , que é uma palavra reservada que significa uma autoreferência para o objeto.
	}
	
	public void removerProdutos(int quantidade){
		this.quantidade -= quantidade;
	}
	
	public String toString(){
		return nome
			+ ", R$: "
			+ String.format("%.2f",preco) //para formatar o resultado final e ficar com duas casas decimais.
			+ ", "
			+ quantidade
			+ " unidades, Total: R$: "
			+ String.format("%.2f",totalEmEstoque());
	}
}