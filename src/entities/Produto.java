package entities;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;
	
	
	public double totalEmEstoque(){
		return preco * quantidade;
	}
	
	public void addProdutos(int quantidade){ // para diferenciar o atributo da classe (l.6), com o parâmetro do método (l.13).
		this.quantidade += quantidade; 		 // usa o 'this' , que é uma palavra reservada que significa uma autoreferência para o objeto.
	}
	
	public void removerProdutos(int quantidade){
		this.quantidade -= quantidade;
	}
}
